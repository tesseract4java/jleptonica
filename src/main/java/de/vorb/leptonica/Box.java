package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * -------------------------------------------------------------------------*<br>
 * Basic rectangle and rectangle arrays *<br>
 * -------------------------------------------------------------------------<br>
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\pix.h:430</i><br>
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
public class Box extends StructObject {
    static {
        BridJ.register();
    }

    /** C type : l_int32 */
    @Field(0)
    public int x() {
        return this.io.getIntField(this, 0);
    }

    /** C type : l_int32 */
    @Field(0)
    public Box x(int x) {
        this.io.setIntField(this, 0, x);
        return this;
    }

    /** C type : l_int32 */
    @Field(1)
    public int y() {
        return this.io.getIntField(this, 1);
    }

    /** C type : l_int32 */
    @Field(1)
    public Box y(int y) {
        this.io.setIntField(this, 1, y);
        return this;
    }

    /** C type : l_int32 */
    @Field(2)
    public int w() {
        return this.io.getIntField(this, 2);
    }

    /** C type : l_int32 */
    @Field(2)
    public Box w(int w) {
        this.io.setIntField(this, 2, w);
        return this;
    }

    /** C type : l_int32 */
    @Field(3)
    public int h() {
        return this.io.getIntField(this, 3);
    }

    /** C type : l_int32 */
    @Field(3)
    public Box h(int h) {
        this.io.setIntField(this, 3, h);
        return this;
    }

    /**
     * reference count (1 if no clones)<br>
     * C type : l_uint32
     */
    @Field(4)
    public int refcount() {
        return this.io.getIntField(this, 4);
    }

    /**
     * reference count (1 if no clones)<br>
     * C type : l_uint32
     */
    @Field(4)
    public Box refcount(int refcount) {
        this.io.setIntField(this, 4, refcount);
        return this;
    }

    public Box() {
        super();
    }

    public Box(Pointer pointer) {
        super(pointer);
    }
}
