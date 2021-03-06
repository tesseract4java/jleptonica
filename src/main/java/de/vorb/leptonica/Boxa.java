package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\pix.h:441</i><br>
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
public class Boxa extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * number of box in ptr array<br>
     * C type : l_int32
     */
    @Field(0)
    public int n() {
        return this.io.getIntField(this, 0);
    }

    /**
     * number of box in ptr array<br>
     * C type : l_int32
     */
    @Field(0)
    public Boxa n(int n) {
        this.io.setIntField(this, 0, n);
        return this;
    }

    /**
     * number of box ptrs allocated<br>
     * C type : l_int32
     */
    @Field(1)
    public int nalloc() {
        return this.io.getIntField(this, 1);
    }

    /**
     * number of box ptrs allocated<br>
     * C type : l_int32
     */
    @Field(1)
    public Boxa nalloc(int nalloc) {
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
    public Boxa refcount(int refcount) {
        this.io.setIntField(this, 2, refcount);
        return this;
    }

    /**
     * box ptr array<br>
     * C type : Box**
     */
    @Field(3)
    public Pointer<Pointer<Box>> box() {
        return this.io.getPointerField(this, 3);
    }

    /**
     * box ptr array<br>
     * C type : Box**
     */
    @Field(3)
    public Boxa box(Pointer<Pointer<Box>> box) {
        this.io.setPointerField(this, 3, box);
        return this;
    }

    public Boxa() {
        super();
    }

    public Boxa(Pointer pointer) {
        super(pointer);
    }
}
