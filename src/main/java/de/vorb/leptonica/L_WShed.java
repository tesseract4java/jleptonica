package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * watershed.h<br>
 * Simple data structure to hold watershed data.<br>
 * All data here is owned by the L_WShed and must be freed.<br>
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\watershed.h:37</i><br>
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
public class L_WShed extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * clone of input 8 bpp pixs<br>
     * C type : Pix*
     */
    @Field(0)
    public Pointer<Pix> pixs() {
        return this.io.getPointerField(this, 0);
    }

    /**
     * clone of input 8 bpp pixs<br>
     * C type : Pix*
     */
    @Field(0)
    public L_WShed pixs(Pointer<Pix> pixs) {
        this.io.setPointerField(this, 0, pixs);
        return this;
    }

    /**
     * clone of input 1 bpp seed (marker) pixm<br>
     * C type : Pix*
     */
    @Field(1)
    public Pointer<Pix> pixm() {
        return this.io.getPointerField(this, 1);
    }

    /**
     * clone of input 1 bpp seed (marker) pixm<br>
     * C type : Pix*
     */
    @Field(1)
    public L_WShed pixm(Pointer<Pix> pixm) {
        this.io.setPointerField(this, 1, pixm);
        return this;
    }

    /**
     * minimum depth allowed for a watershed<br>
     * C type : l_int32
     */
    @Field(2)
    public int mindepth() {
        return this.io.getIntField(this, 2);
    }

    /**
     * minimum depth allowed for a watershed<br>
     * C type : l_int32
     */
    @Field(2)
    public L_WShed mindepth(int mindepth) {
        this.io.setIntField(this, 2, mindepth);
        return this;
    }

    /**
     * 16 bpp label pix<br>
     * C type : Pix*
     */
    @Field(3)
    public Pointer<Pix> pixlab() {
        return this.io.getPointerField(this, 3);
    }

    /**
     * 16 bpp label pix<br>
     * C type : Pix*
     */
    @Field(3)
    public L_WShed pixlab(Pointer<Pix> pixlab) {
        this.io.setPointerField(this, 3, pixlab);
        return this;
    }

    /**
     * scratch pix for computing wshed regions<br>
     * C type : Pix*
     */
    @Field(4)
    public Pointer<Pix> pixt() {
        return this.io.getPointerField(this, 4);
    }

    /**
     * scratch pix for computing wshed regions<br>
     * C type : Pix*
     */
    @Field(4)
    public L_WShed pixt(Pointer<Pix> pixt) {
        this.io.setPointerField(this, 4, pixt);
        return this;
    }

    /**
     * line ptrs for pixs<br>
     * C type : void**
     */
    @Field(5)
    public Pointer<Pointer<?>> lines8() {
        return this.io.getPointerField(this, 5);
    }

    /**
     * line ptrs for pixs<br>
     * C type : void**
     */
    @Field(5)
    public L_WShed lines8(Pointer<Pointer<?>> lines8) {
        this.io.setPointerField(this, 5, lines8);
        return this;
    }

    /**
     * line ptrs for pixm<br>
     * C type : void**
     */
    @Field(6)
    public Pointer<Pointer<?>> linem1() {
        return this.io.getPointerField(this, 6);
    }

    /**
     * line ptrs for pixm<br>
     * C type : void**
     */
    @Field(6)
    public L_WShed linem1(Pointer<Pointer<?>> linem1) {
        this.io.setPointerField(this, 6, linem1);
        return this;
    }

    /**
     * line ptrs for pixlab<br>
     * C type : void**
     */
    @Field(7)
    public Pointer<Pointer<?>> linelab32() {
        return this.io.getPointerField(this, 7);
    }

    /**
     * line ptrs for pixlab<br>
     * C type : void**
     */
    @Field(7)
    public L_WShed linelab32(Pointer<Pointer<?>> linelab32) {
        this.io.setPointerField(this, 7, linelab32);
        return this;
    }

    /**
     * line ptrs for pixt<br>
     * C type : void**
     */
    @Field(8)
    public Pointer<Pointer<?>> linet1() {
        return this.io.getPointerField(this, 8);
    }

    /**
     * line ptrs for pixt<br>
     * C type : void**
     */
    @Field(8)
    public L_WShed linet1(Pointer<Pointer<?>> linet1) {
        this.io.setPointerField(this, 8, linet1);
        return this;
    }

    /**
     * result: 1 bpp pixa of watersheds<br>
     * C type : Pixa*
     */
    @Field(9)
    public Pointer<Pixa> pixad() {
        return this.io.getPointerField(this, 9);
    }

    /**
     * result: 1 bpp pixa of watersheds<br>
     * C type : Pixa*
     */
    @Field(9)
    public L_WShed pixad(Pointer<Pixa> pixad) {
        this.io.setPointerField(this, 9, pixad);
        return this;
    }

    /**
     * pta of initial seed pixels<br>
     * C type : Pta*
     */
    @Field(10)
    public Pointer<Pta> ptas() {
        return this.io.getPointerField(this, 10);
    }

    /**
     * pta of initial seed pixels<br>
     * C type : Pta*
     */
    @Field(10)
    public L_WShed ptas(Pointer<Pta> ptas) {
        this.io.setPointerField(this, 10, ptas);
        return this;
    }

    /**
     * numa of seed indicators; 0 if completed<br>
     * C type : Numa*
     */
    @Field(11)
    public Pointer<Numa> nasi() {
        return this.io.getPointerField(this, 11);
    }

    /**
     * numa of seed indicators; 0 if completed<br>
     * C type : Numa*
     */
    @Field(11)
    public L_WShed nasi(Pointer<Numa> nasi) {
        this.io.setPointerField(this, 11, nasi);
        return this;
    }

    /**
     * numa of initial seed heights<br>
     * C type : Numa*
     */
    @Field(12)
    public Pointer<Numa> nash() {
        return this.io.getPointerField(this, 12);
    }

    /**
     * numa of initial seed heights<br>
     * C type : Numa*
     */
    @Field(12)
    public L_WShed nash(Pointer<Numa> nash) {
        this.io.setPointerField(this, 12, nash);
        return this;
    }

    /**
     * numa of initial minima heights<br>
     * C type : Numa*
     */
    @Field(13)
    public Pointer<Numa> namh() {
        return this.io.getPointerField(this, 13);
    }

    /**
     * numa of initial minima heights<br>
     * C type : Numa*
     */
    @Field(13)
    public L_WShed namh(Pointer<Numa> namh) {
        this.io.setPointerField(this, 13, namh);
        return this;
    }

    /**
     * result: numa of watershed levels<br>
     * C type : Numa*
     */
    @Field(14)
    public Pointer<Numa> nalevels() {
        return this.io.getPointerField(this, 14);
    }

    /**
     * result: numa of watershed levels<br>
     * C type : Numa*
     */
    @Field(14)
    public L_WShed nalevels(Pointer<Numa> nalevels) {
        this.io.setPointerField(this, 14, nalevels);
        return this;
    }

    /**
     * number of seeds (markers)<br>
     * C type : l_int32
     */
    @Field(15)
    public int nseeds() {
        return this.io.getIntField(this, 15);
    }

    /**
     * number of seeds (markers)<br>
     * C type : l_int32
     */
    @Field(15)
    public L_WShed nseeds(int nseeds) {
        this.io.setIntField(this, 15, nseeds);
        return this;
    }

    /**
     * number of minima different from seeds<br>
     * C type : l_int32
     */
    @Field(16)
    public int nother() {
        return this.io.getIntField(this, 16);
    }

    /**
     * number of minima different from seeds<br>
     * C type : l_int32
     */
    @Field(16)
    public L_WShed nother(int nother) {
        this.io.setIntField(this, 16, nother);
        return this;
    }

    /**
     * lut for pixel indices<br>
     * C type : l_int32*
     */
    @Field(17)
    public Pointer<Integer> lut() {
        return this.io.getPointerField(this, 17);
    }

    /**
     * lut for pixel indices<br>
     * C type : l_int32*
     */
    @Field(17)
    public L_WShed lut(Pointer<Integer> lut) {
        this.io.setPointerField(this, 17, lut);
        return this;
    }

    /**
     * back-links into lut, for updates<br>
     * C type : Numa**
     */
    @Field(18)
    public Pointer<Pointer<Numa>> links() {
        return this.io.getPointerField(this, 18);
    }

    /**
     * back-links into lut, for updates<br>
     * C type : Numa**
     */
    @Field(18)
    public L_WShed links(Pointer<Pointer<Numa>> links) {
        this.io.setPointerField(this, 18, links);
        return this;
    }

    /**
     * size of links array<br>
     * C type : l_int32
     */
    @Field(19)
    public int arraysize() {
        return this.io.getIntField(this, 19);
    }

    /**
     * size of links array<br>
     * C type : l_int32
     */
    @Field(19)
    public L_WShed arraysize(int arraysize) {
        this.io.setIntField(this, 19, arraysize);
        return this;
    }

    /**
     * set to 1 for debug output<br>
     * C type : l_int32
     */
    @Field(20)
    public int debug() {
        return this.io.getIntField(this, 20);
    }

    /**
     * set to 1 for debug output<br>
     * C type : l_int32
     */
    @Field(20)
    public L_WShed debug(int debug) {
        this.io.setIntField(this, 20, debug);
        return this;
    }

    public L_WShed() {
        super();
    }

    public L_WShed(Pointer pointer) {
        super(pointer);
    }
}
