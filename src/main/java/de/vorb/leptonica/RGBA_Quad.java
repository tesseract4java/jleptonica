package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\pix.h:152</i><br>
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
public class RGBA_Quad extends StructObject {
    static {
        BridJ.register();
    }

    /** C type : l_uint8 */
    @Field(0)
    public byte blue() {
        return this.io.getByteField(this, 0);
    }

    /** C type : l_uint8 */
    @Field(0)
    public RGBA_Quad blue(byte blue) {
        this.io.setByteField(this, 0, blue);
        return this;
    }

    /** C type : l_uint8 */
    @Field(1)
    public byte green() {
        return this.io.getByteField(this, 1);
    }

    /** C type : l_uint8 */
    @Field(1)
    public RGBA_Quad green(byte green) {
        this.io.setByteField(this, 1, green);
        return this;
    }

    /** C type : l_uint8 */
    @Field(2)
    public byte red() {
        return this.io.getByteField(this, 2);
    }

    /** C type : l_uint8 */
    @Field(2)
    public RGBA_Quad red(byte red) {
        this.io.setByteField(this, 2, red);
        return this;
    }

    /** C type : l_uint8 */
    @Field(3)
    public byte alpha() {
        return this.io.getByteField(this, 3);
    }

    /** C type : l_uint8 */
    @Field(3)
    public RGBA_Quad alpha(byte alpha) {
        this.io.setByteField(this, 3, alpha);
        return this;
    }

    public RGBA_Quad() {
        super();
    }

    public RGBA_Quad(Pointer pointer) {
        super(pointer);
    }
}
