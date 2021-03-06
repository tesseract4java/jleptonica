package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\pix.h:537</i><br>
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
public class FPixa extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * number of fpix in ptr array<br>
     * C type : l_int32
     */
    @Field(0)
    public int n() {
        return this.io.getIntField(this, 0);
    }

    /**
     * number of fpix in ptr array<br>
     * C type : l_int32
     */
    @Field(0)
    public FPixa n(int n) {
        this.io.setIntField(this, 0, n);
        return this;
    }

    /**
     * number of fpix ptrs allocated<br>
     * C type : l_int32
     */
    @Field(1)
    public int nalloc() {
        return this.io.getIntField(this, 1);
    }

    /**
     * number of fpix ptrs allocated<br>
     * C type : l_int32
     */
    @Field(1)
    public FPixa nalloc(int nalloc) {
        this.io.setIntField(this, 1, nalloc);
        return this;
    }

    /**
     * reference count (1 if no clones)<br>
     * C type : l_uint32
     */
    @Field(2)
    public int refcount() {
        return this.io.getIntField(this, 2);
    }

    /**
     * reference count (1 if no clones)<br>
     * C type : l_uint32
     */
    @Field(2)
    public FPixa refcount(int refcount) {
        this.io.setIntField(this, 2, refcount);
        return this;
    }

    /**
     * the array of ptrs to fpix<br>
     * C type : FPix**
     */
    @Field(3)
    public Pointer<Pointer<FPix>> fpix() {
        return this.io.getPointerField(this, 3);
    }

    /**
     * the array of ptrs to fpix<br>
     * C type : FPix**
     */
    @Field(3)
    public FPixa fpix(Pointer<Pointer<FPix>> fpix) {
        this.io.setPointerField(this, 3, fpix);
        return this;
    }

    public FPixa() {
        super();
    }

    public FPixa(Pointer pointer) {
        super(pointer);
    }
}
