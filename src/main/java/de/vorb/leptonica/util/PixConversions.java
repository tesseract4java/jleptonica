package de.vorb.leptonica.util;

import java.awt.Point;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.nio.ByteBuffer;
import java.util.Hashtable;

import org.bridj.Pointer;

import de.vorb.leptonica.LibLept;
import de.vorb.leptonica.Pix;

/**
 * Functions for converting between various image formats.
 * 
 * @author Paul Vorbach
 */
public class PixConversions {
    private PixConversions() {
    }

    /**
     * Converts a BufferedImage to an instance of Pix.
     * 
     * @param img
     * @return
     */
    public static Pointer<Pix> img2pix(BufferedImage img) {
        final int width = img.getWidth();
        final int height = img.getHeight();
        final int depth;
        final int spp;

        switch (img.getType()) {
        case BufferedImage.TYPE_BYTE_BINARY:
            depth = 1;
            spp = 1;
            break;
        case BufferedImage.TYPE_BYTE_GRAY:
            depth = 8;
            spp = 1;
            break;
        default:
            // if the given image is neither binary or grayscale, convert it to
            // grayscale
            final ColorConvertOp op = new ColorConvertOp(
                    ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
            final BufferedImage gray = new BufferedImage(img.getWidth(),
                    img.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
            op.filter(img, gray);

            // replace input image with grayscale version
            img = gray;

            depth = 8;
            spp = 1;
        }

        final Pointer<Pix> ppix = LibLept.pixCreate(width, height,
                depth);

        // set samples per pixel
        LibLept.pixSetSpp(ppix, spp);

        // calculate words (ints) per line
        final int wpl = (width * depth + 31) / 32; // words (ints) per line
        LibLept.pixSetWpl(ppix, wpl);

        // get the raw bytes of the image
        final DataBufferByte dataBuf =
                (DataBufferByte) img.getData().getDataBuffer();
        final ByteBuffer bytes = ByteBuffer.wrap(dataBuf.getData());

        final Pointer<Integer> pixData = LibLept.pixGetData(ppix);
        // convert the raw bytes to pix data
        setBytesToPix(pixData, bytes, width, height, depth, wpl);

        return ppix;
    }

    private static void setBytesToPix(Pointer<Integer> pixData,
            final ByteBuffer bytes, final int width, final int height,
            final int depth, final int wpl) {
        // placeholders for bulk byte transfer
        final byte[] bulk;
        final int bulkSize;

        switch (depth) {
        case 1:
            final int misalignment = width % 32;
            final boolean misaligned = misalignment != 0;
            final int lastMisalignedByte = 3 - (misalignment - 1) / 8;

            bulkSize = (misaligned ? wpl - 1 : wpl) * 4;

            bulk = new byte[bulkSize];
            for (int y = 0; y < height; ++y, pixData = pixData.next(wpl)) {
                bytes.get(bulk);

                // reorder the bytes
                for (int b = 0; b < bulkSize; b += 4) {
                    final byte b0 = bulk[b];
                    final byte b1 = bulk[b + 1];
                    bulk[b] = (byte) bulk[b + 3];
                    bulk[b + 1] = (byte) bulk[b + 2];
                    bulk[b + 2] = (byte) b1;
                    bulk[b + 3] = (byte) b0;
                }

                pixData.setBytes(bulk);

                if (!misaligned)
                    continue;

                final Pointer<Integer> lastIntOfLine = pixData.next(bulkSize / 4);
                for (int b = 3; b >= lastMisalignedByte; --b) {
                    lastIntOfLine.setByteAtIndex(b, (byte) bytes.get());
                }
            }
            break;
        case 8:
            bulkSize = wpl * 4;
            bulk = new byte[bulkSize];
            for (int y = 0; y < height; ++y, pixData = pixData.next(wpl)) {
                bytes.get(bulk);

                // reorder the bytes
                for (int b = 0; b < bulkSize; b += 4) {
                    final byte b0 = bulk[b];
                    final byte b1 = bulk[b + 1];
                    bulk[b] = bulk[b + 3];
                    bulk[b + 1] = bulk[b + 2];
                    bulk[b + 2] = b1;
                    bulk[b + 3] = b0;
                }

                pixData.setBytes(bulk);
            }
            break;
        default:
            bulk = new byte[0];
        }
    }

    public static BufferedImage pix2img(Pointer<Pix> ppix) {
        final Pix pix = ppix.get();

        final byte[] buf = convertPixToBytes(pix.data(), pix.w(), pix.h(),
                pix.d(), pix.wpl());

        final DataBufferByte dataBuf = new DataBufferByte(buf, buf.length);

        // ... and a writable raster
        final WritableRaster raster = Raster.createPackedRaster(dataBuf,
                pix.w(), pix.h(), pix.d(), new Point(0, 0));

        // determine the color model
        // This is partially taken from java.awt.image.BufferedImage
        final ColorModel cm;

        switch (pix.d()) {
        case 1:
            final byte[] arr = { (byte) 0x00, (byte) 0xFF };

            cm = new IndexColorModel(1, 2, arr, arr, arr);
            break;
        case 8:
            final ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
            int[] nBits = { 8 };
            cm = new ComponentColorModel(cs, nBits, false, true,
                    Transparency.OPAQUE,
                    DataBuffer.TYPE_INT);
            break;
        default:
            throw new IllegalArgumentException(
                    "Only binary and grayscale images allowed.");
        }

        // create and return the buffered image
        return new BufferedImage(cm, raster, false,
                new Hashtable<Object, Object>());
    }

    private static byte[] convertPixToBytes(Pointer<Integer> pixData,
            final int width, final int height, final int depth, final int wpl) {
        // size of the underlying byte[]
        final int bufSize = wpl * height * 4;

        final byte[] bufData = new byte[bufSize];

        final ByteBuffer buf = ByteBuffer.wrap(bufData);

        final int misalignment = width % 32;
        final boolean misaligned = misalignment != 0;
        final int lastMisalignedByte = 3 - (misalignment - 1) / 8;

        // if the pix is misaligned, skip the last int
        final int bulkSize = (misaligned ? wpl - 1 : wpl) * 4;

        // copy over data
        for (int y = 0; y < height; ++y, pixData = pixData.next(wpl)) {
            final byte[] bulk = pixData.getBytes(bulkSize);

            // reorder the bytes
            for (int b = 0; b < bulkSize; b += 4) {
                final byte b0 = bulk[b];
                final byte b1 = bulk[b + 1];
                bulk[b] = bulk[b + 3];
                bulk[b + 1] = bulk[b + 2];
                bulk[b + 2] = b1;
                bulk[b + 3] = b0;
            }

            buf.put(bulk, 0, bulkSize);

            if (!misaligned) {
                continue;
            }

            // append the last int of a line
            final byte[] lastIntOfLine = pixData.next(wpl - 1).getBytes(4);
            for (int b = 3; b >= lastMisalignedByte; --b) {
                buf.put(lastIntOfLine[b]);
            }
        }

        return bufData;
    }
}
