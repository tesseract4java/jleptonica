package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\array.h:55</i><br>
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
public class Numa extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * size of allocated number array<br>
     * C type : l_int32
     */
    @Field(0)
    public int nalloc() {
        return this.io.getIntField(this, 0);
    }

    /**
     * size of allocated number array<br>
     * C type : l_int32
     */
    @Field(0)
    public Numa nalloc(int nalloc) {
        this.io.setIntField(this, 0, nalloc);
        return this;
    }

    /**
     * number of numbers saved<br>
     * C type : l_int32
     */
    @Field(1)
    public int n() {
        return this.io.getIntField(this, 1);
    }

    /**
     * number of numbers saved<br>
     * C type : l_int32
     */
    @Field(1)
    public Numa n(int n) {
        this.io.setIntField(this, 1, n);
        return this;
    }

    /**
     * reference count (1 if no clones)<br>
     * C type : l_int32
     */
    @Field(2)
    public int refcount() {
        return this.io.getIntField(this, 2);
    }

    /**
     * reference count (1 if no clones)<br>
     * C type : l_int32
     */
    @Field(2)
    public Numa refcount(int refcount) {
        this.io.setIntField(this, 2, refcount);
        return this;
    }

    /**
     * x value assigned to array[0]<br>
     * C type : l_float32
     */
    @Field(3)
    public float startx() {
        return this.io.getFloatField(this, 3);
    }

    /**
     * x value assigned to array[0]<br>
     * C type : l_float32
     */
    @Field(3)
    public Numa startx(float startx) {
        this.io.setFloatField(this, 3, startx);
        return this;
    }

    /**
     * change in x value as i --> i + 1<br>
     * C type : l_float32
     */
    @Field(4)
    public float delx() {
        return this.io.getFloatField(this, 4);
    }

    /**
     * change in x value as i --> i + 1<br>
     * C type : l_float32
     */
    @Field(4)
    public Numa delx(float delx) {
        this.io.setFloatField(this, 4, delx);
        return this;
    }

    /**
     * number array<br>
     * C type : l_float32*
     */
    @Field(5)
    public Pointer<Float> array() {
        return this.io.getPointerField(this, 5);
    }

    /**
     * number array<br>
     * C type : l_float32*
     */
    @Field(5)
    public Numa array(Pointer<Float> array) {
        this.io.setPointerField(this, 5, array);
        return this;
    }

    public Numa() {
        super();
    }

    public Numa(Pointer pointer) {
        super(pointer);
    }
}
