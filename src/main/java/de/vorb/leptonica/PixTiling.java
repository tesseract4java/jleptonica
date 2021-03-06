package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * -------------------------------------------------------------------------*<br>
 * Pix tiling *<br>
 * -------------------------------------------------------------------------<br>
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\pix.h:503</i><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a
 * href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("leptonica")
public class PixTiling extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * input pix (a clone)<br>
     * C type : Pix*
     */
    @Field(0)
    public Pointer<Pix> pix() {
        return this.io.getPointerField(this, 0);
    }

    /**
     * input pix (a clone)<br>
     * C type : Pix*
     */
    @Field(0)
    public PixTiling pix(Pointer<Pix> pix) {
        this.io.setPointerField(this, 0, pix);
        return this;
    }

    /**
     * number of tiles horizontally<br>
     * C type : l_int32
     */
    @Field(1)
    public int nx() {
        return this.io.getIntField(this, 1);
    }

    /**
     * number of tiles horizontally<br>
     * C type : l_int32
     */
    @Field(1)
    public PixTiling nx(int nx) {
        this.io.setIntField(this, 1, nx);
        return this;
    }

    /**
     * number of tiles vertically<br>
     * C type : l_int32
     */
    @Field(2)
    public int ny() {
        return this.io.getIntField(this, 2);
    }

    /**
     * number of tiles vertically<br>
     * C type : l_int32
     */
    @Field(2)
    public PixTiling ny(int ny) {
        this.io.setIntField(this, 2, ny);
        return this;
    }

    /**
     * tile width<br>
     * C type : l_int32
     */
    @Field(3)
    public int w() {
        return this.io.getIntField(this, 3);
    }

    /**
     * tile width<br>
     * C type : l_int32
     */
    @Field(3)
    public PixTiling w(int w) {
        this.io.setIntField(this, 3, w);
        return this;
    }

    /**
     * tile height<br>
     * C type : l_int32
     */
    @Field(4)
    public int h() {
        return this.io.getIntField(this, 4);
    }

    /**
     * tile height<br>
     * C type : l_int32
     */
    @Field(4)
    public PixTiling h(int h) {
        this.io.setIntField(this, 4, h);
        return this;
    }

    /**
     * overlap on left and right<br>
     * C type : l_int32
     */
    @Field(5)
    public int xoverlap() {
        return this.io.getIntField(this, 5);
    }

    /**
     * overlap on left and right<br>
     * C type : l_int32
     */
    @Field(5)
    public PixTiling xoverlap(int xoverlap) {
        this.io.setIntField(this, 5, xoverlap);
        return this;
    }

    /**
     * overlap on top and bottom<br>
     * C type : l_int32
     */
    @Field(6)
    public int yoverlap() {
        return this.io.getIntField(this, 6);
    }

    /**
     * overlap on top and bottom<br>
     * C type : l_int32
     */
    @Field(6)
    public PixTiling yoverlap(int yoverlap) {
        this.io.setIntField(this, 6, yoverlap);
        return this;
    }

    /**
     * strip for paint; default is TRUE<br>
     * C type : l_int32
     */
    @Field(7)
    public int strip() {
        return this.io.getIntField(this, 7);
    }

    /**
     * strip for paint; default is TRUE<br>
     * C type : l_int32
     */
    @Field(7)
    public PixTiling strip(int strip) {
        this.io.setIntField(this, 7, strip);
        return this;
    }

    public PixTiling() {
        super();
    }

    public PixTiling(Pointer pointer) {
        super(pointer);
    }
}
