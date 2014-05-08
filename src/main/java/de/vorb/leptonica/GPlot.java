package de.vorb.leptonica;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * <i>native declaration :
 * C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\
 * tesseract-vs2013\liblept\include\gplot.h:68</i><br>
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
public class GPlot extends StructObject {
    static {
        BridJ.register();
    }

    /**
     * for cmd, data, output<br>
     * C type : char*
     */
    @Field(0)
    public Pointer<Byte> rootname() {
        return this.io.getPointerField(this, 0);
    }

    /**
     * for cmd, data, output<br>
     * C type : char*
     */
    @Field(0)
    public GPlot rootname(Pointer<Byte> rootname) {
        this.io.setPointerField(this, 0, rootname);
        return this;
    }

    /**
     * command file name<br>
     * C type : char*
     */
    @Field(1)
    public Pointer<Byte> cmdname() {
        return this.io.getPointerField(this, 1);
    }

    /**
     * command file name<br>
     * C type : char*
     */
    @Field(1)
    public GPlot cmdname(Pointer<Byte> cmdname) {
        this.io.setPointerField(this, 1, cmdname);
        return this;
    }

    /**
     * command file contents<br>
     * C type : Sarray*
     */
    @Field(2)
    public Pointer<Sarray> cmddata() {
        return this.io.getPointerField(this, 2);
    }

    /**
     * command file contents<br>
     * C type : Sarray*
     */
    @Field(2)
    public GPlot cmddata(Pointer<Sarray> cmddata) {
        this.io.setPointerField(this, 2, cmddata);
        return this;
    }

    /**
     * data file names<br>
     * C type : Sarray*
     */
    @Field(3)
    public Pointer<Sarray> datanames() {
        return this.io.getPointerField(this, 3);
    }

    /**
     * data file names<br>
     * C type : Sarray*
     */
    @Field(3)
    public GPlot datanames(Pointer<Sarray> datanames) {
        this.io.setPointerField(this, 3, datanames);
        return this;
    }

    /**
     * plot data (1 string/file)<br>
     * C type : Sarray*
     */
    @Field(4)
    public Pointer<Sarray> plotdata() {
        return this.io.getPointerField(this, 4);
    }

    /**
     * plot data (1 string/file)<br>
     * C type : Sarray*
     */
    @Field(4)
    public GPlot plotdata(Pointer<Sarray> plotdata) {
        this.io.setPointerField(this, 4, plotdata);
        return this;
    }

    /**
     * title for each individual plot<br>
     * C type : Sarray*
     */
    @Field(5)
    public Pointer<Sarray> plottitles() {
        return this.io.getPointerField(this, 5);
    }

    /**
     * title for each individual plot<br>
     * C type : Sarray*
     */
    @Field(5)
    public GPlot plottitles(Pointer<Sarray> plottitles) {
        this.io.setPointerField(this, 5, plottitles);
        return this;
    }

    /**
     * plot style for individual plots<br>
     * C type : Numa*
     */
    @Field(6)
    public Pointer<Numa> plotstyles() {
        return this.io.getPointerField(this, 6);
    }

    /**
     * plot style for individual plots<br>
     * C type : Numa*
     */
    @Field(6)
    public GPlot plotstyles(Pointer<Numa> plotstyles) {
        this.io.setPointerField(this, 6, plotstyles);
        return this;
    }

    /**
     * current number of plots<br>
     * C type : l_int32
     */
    @Field(7)
    public int nplots() {
        return this.io.getIntField(this, 7);
    }

    /**
     * current number of plots<br>
     * C type : l_int32
     */
    @Field(7)
    public GPlot nplots(int nplots) {
        this.io.setIntField(this, 7, nplots);
        return this;
    }

    /**
     * output file name<br>
     * C type : char*
     */
    @Field(8)
    public Pointer<Byte> outname() {
        return this.io.getPointerField(this, 8);
    }

    /**
     * output file name<br>
     * C type : char*
     */
    @Field(8)
    public GPlot outname(Pointer<Byte> outname) {
        this.io.setPointerField(this, 8, outname);
        return this;
    }

    /**
     * GPLOT_OUTPUT values<br>
     * C type : l_int32
     */
    @Field(9)
    public int outformat() {
        return this.io.getIntField(this, 9);
    }

    /**
     * GPLOT_OUTPUT values<br>
     * C type : l_int32
     */
    @Field(9)
    public GPlot outformat(int outformat) {
        this.io.setIntField(this, 9, outformat);
        return this;
    }

    /**
     * GPLOT_SCALING values<br>
     * C type : l_int32
     */
    @Field(10)
    public int scaling() {
        return this.io.getIntField(this, 10);
    }

    /**
     * GPLOT_SCALING values<br>
     * C type : l_int32
     */
    @Field(10)
    public GPlot scaling(int scaling) {
        this.io.setIntField(this, 10, scaling);
        return this;
    }

    /**
     * optional<br>
     * C type : char*
     */
    @Field(11)
    public Pointer<Byte> title() {
        return this.io.getPointerField(this, 11);
    }

    /**
     * optional<br>
     * C type : char*
     */
    @Field(11)
    public GPlot title(Pointer<Byte> title) {
        this.io.setPointerField(this, 11, title);
        return this;
    }

    /**
     * optional x axis label<br>
     * C type : char*
     */
    @Field(12)
    public Pointer<Byte> xlabel() {
        return this.io.getPointerField(this, 12);
    }

    /**
     * optional x axis label<br>
     * C type : char*
     */
    @Field(12)
    public GPlot xlabel(Pointer<Byte> xlabel) {
        this.io.setPointerField(this, 12, xlabel);
        return this;
    }

    /**
     * optional y axis label<br>
     * C type : char*
     */
    @Field(13)
    public Pointer<Byte> ylabel() {
        return this.io.getPointerField(this, 13);
    }

    /**
     * optional y axis label<br>
     * C type : char*
     */
    @Field(13)
    public GPlot ylabel(Pointer<Byte> ylabel) {
        this.io.setPointerField(this, 13, ylabel);
        return this;
    }

    public GPlot() {
        super();
    }

    public GPlot(Pointer pointer) {
        super(pointer);
    }
}
