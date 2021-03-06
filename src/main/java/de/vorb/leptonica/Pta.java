package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * -------------------------------------------------------------------------*<br>
 * Array of points *<br>
 * -------------------------------------------------------------------------<br>
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\pix.h:464</i><br>
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
public class Pta extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * actual number of pts<br>
     * C type : l_int32
     */
    @Field(0)
    public int n() {
        return this.io.getIntField(this, 0);
    }

    /**
     * actual number of pts<br>
     * C type : l_int32
     */
    @Field(0)
    public Pta n(int n) {
        this.io.setIntField(this, 0, n);
        return this;
    }

    /**
     * size of allocated arrays<br>
     * C type : l_int32
     */
    @Field(1)
    public int nalloc() {
        return this.io.getIntField(this, 1);
    }

    /**
     * size of allocated arrays<br>
     * C type : l_int32
     */
    @Field(1)
    public Pta nalloc(int nalloc) {
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
    public Pta refcount(int refcount) {
        this.io.setIntField(this, 2, refcount);
        return this;
    }

    /**
     * arrays of floats<br>
     * C type : l_float32*
     */
    @Field(3)
    public Pointer<Float> x() {
        return this.io.getPointerField(this, 3);
    }

    /**
     * arrays of floats<br>
     * C type : l_float32*
     */
    @Field(3)
    public Pta x(Pointer<Float> x) {
        this.io.setPointerField(this, 3, x);
        return this;
    }

    /**
     * arrays of floats<br>
     * C type : l_float32*
     */
    @Field(4)
    public Pointer<Float> y() {
        return this.io.getPointerField(this, 4);
    }

    /**
     * arrays of floats<br>
     * C type : l_float32*
     */
    @Field(4)
    public Pta y(Pointer<Float> y) {
        this.io.setPointerField(this, 4, y);
        return this;
    }

    public Pta() {
        super();
    }

    public Pta(Pointer pointer) {
        super(pointer);
    }
}
