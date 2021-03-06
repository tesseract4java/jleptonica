package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * -------------------------------------------------------------------------*<br>
 * Kernel *<br>
 * -------------------------------------------------------------------------<br>
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\morph.h:84</i><br>
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
public class L_Kernel extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * kernel height<br>
     * C type : l_int32
     */
    @Field(0)
    public int sy() {
        return this.io.getIntField(this, 0);
    }

    /**
     * kernel height<br>
     * C type : l_int32
     */
    @Field(0)
    public L_Kernel sy(int sy) {
        this.io.setIntField(this, 0, sy);
        return this;
    }

    /**
     * kernel width<br>
     * C type : l_int32
     */
    @Field(1)
    public int sx() {
        return this.io.getIntField(this, 1);
    }

    /**
     * kernel width<br>
     * C type : l_int32
     */
    @Field(1)
    public L_Kernel sx(int sx) {
        this.io.setIntField(this, 1, sx);
        return this;
    }

    /**
     * y location of kernel origin<br>
     * C type : l_int32
     */
    @Field(2)
    public int cy() {
        return this.io.getIntField(this, 2);
    }

    /**
     * y location of kernel origin<br>
     * C type : l_int32
     */
    @Field(2)
    public L_Kernel cy(int cy) {
        this.io.setIntField(this, 2, cy);
        return this;
    }

    /**
     * x location of kernel origin<br>
     * C type : l_int32
     */
    @Field(3)
    public int cx() {
        return this.io.getIntField(this, 3);
    }

    /**
     * x location of kernel origin<br>
     * C type : l_int32
     */
    @Field(3)
    public L_Kernel cx(int cx) {
        this.io.setIntField(this, 3, cx);
        return this;
    }

    /**
     * data[i][j] in [row][col] order<br>
     * C type : l_float32**
     */
    @Field(4)
    public Pointer<Pointer<Float>> data() {
        return this.io.getPointerField(this, 4);
    }

    /**
     * data[i][j] in [row][col] order<br>
     * C type : l_float32**
     */
    @Field(4)
    public L_Kernel data(Pointer<Pointer<Float>> data) {
        this.io.setPointerField(this, 4, data);
        return this;
    }

    public L_Kernel() {
        super();
    }

    public L_Kernel(Pointer pointer) {
        super(pointer);
    }
}
