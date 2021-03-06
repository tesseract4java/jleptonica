package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\ptra.h:47</i><br>
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
public class L_Ptra extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * size of allocated ptr array<br>
     * C type : l_int32
     */
    @Field(0)
    public int nalloc() {
        return this.io.getIntField(this, 0);
    }

    /**
     * size of allocated ptr array<br>
     * C type : l_int32
     */
    @Field(0)
    public L_Ptra nalloc(int nalloc) {
        this.io.setIntField(this, 0, nalloc);
        return this;
    }

    /**
     * greatest valid index<br>
     * C type : l_int32
     */
    @Field(1)
    public int imax() {
        return this.io.getIntField(this, 1);
    }

    /**
     * greatest valid index<br>
     * C type : l_int32
     */
    @Field(1)
    public L_Ptra imax(int imax) {
        this.io.setIntField(this, 1, imax);
        return this;
    }

    /**
     * actual number of stored elements<br>
     * C type : l_int32
     */
    @Field(2)
    public int nactual() {
        return this.io.getIntField(this, 2);
    }

    /**
     * actual number of stored elements<br>
     * C type : l_int32
     */
    @Field(2)
    public L_Ptra nactual(int nactual) {
        this.io.setIntField(this, 2, nactual);
        return this;
    }

    /**
     * ptr array<br>
     * C type : void**
     */
    @Field(3)
    public Pointer<Pointer<?>> array() {
        return this.io.getPointerField(this, 3);
    }

    /**
     * ptr array<br>
     * C type : void**
     */
    @Field(3)
    public L_Ptra array(Pointer<Pointer<?>> array) {
        this.io.setPointerField(this, 3, array);
        return this;
    }

    public L_Ptra() {
        super();
    }

    public L_Ptra(Pointer pointer) {
        super(pointer);
    }
}
