package de.vorb.leptonica;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\tesseract-vs2013\liblept\include\pix.h:117</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("leptonica") 
public class Pix extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * width in pixels<br>
	 * C type : l_uint32
	 */
	@Field(0) 
	public int w() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * width in pixels<br>
	 * C type : l_uint32
	 */
	@Field(0) 
	public Pix w(int w) {
		this.io.setIntField(this, 0, w);
		return this;
	}
	/**
	 * height in pixels<br>
	 * C type : l_uint32
	 */
	@Field(1) 
	public int h() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * height in pixels<br>
	 * C type : l_uint32
	 */
	@Field(1) 
	public Pix h(int h) {
		this.io.setIntField(this, 1, h);
		return this;
	}
	/**
	 * depth in bits (bpp)<br>
	 * C type : l_uint32
	 */
	@Field(2) 
	public int d() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * depth in bits (bpp)<br>
	 * C type : l_uint32
	 */
	@Field(2) 
	public Pix d(int d) {
		this.io.setIntField(this, 2, d);
		return this;
	}
	/**
	 * number of samples per pixel<br>
	 * C type : l_uint32
	 */
	@Field(3) 
	public int spp() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * number of samples per pixel<br>
	 * C type : l_uint32
	 */
	@Field(3) 
	public Pix spp(int spp) {
		this.io.setIntField(this, 3, spp);
		return this;
	}
	/**
	 * 32-bit words/line<br>
	 * C type : l_uint32
	 */
	@Field(4) 
	public int wpl() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * 32-bit words/line<br>
	 * C type : l_uint32
	 */
	@Field(4) 
	public Pix wpl(int wpl) {
		this.io.setIntField(this, 4, wpl);
		return this;
	}
	/**
	 * reference count (1 if no clones)<br>
	 * C type : l_uint32
	 */
	@Field(5) 
	public int refcount() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * reference count (1 if no clones)<br>
	 * C type : l_uint32
	 */
	@Field(5) 
	public Pix refcount(int refcount) {
		this.io.setIntField(this, 5, refcount);
		return this;
	}
	/**
	 * image res (ppi) in x direction<br>
	 * C type : l_int32
	 */
	@Field(6) 
	public int xres() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * image res (ppi) in x direction<br>
	 * C type : l_int32
	 */
	@Field(6) 
	public Pix xres(int xres) {
		this.io.setIntField(this, 6, xres);
		return this;
	}
	/**
	 * image res (ppi) in y direction<br>
	 * C type : l_int32
	 */
	@Field(7) 
	public int yres() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * image res (ppi) in y direction<br>
	 * C type : l_int32
	 */
	@Field(7) 
	public Pix yres(int yres) {
		this.io.setIntField(this, 7, yres);
		return this;
	}
	/**
	 * input file format, IFF_*<br>
	 * C type : l_int32
	 */
	@Field(8) 
	public int informat() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * input file format, IFF_*<br>
	 * C type : l_int32
	 */
	@Field(8) 
	public Pix informat(int informat) {
		this.io.setIntField(this, 8, informat);
		return this;
	}
	/**
	 * special instructions for I/O, etc<br>
	 * C type : l_int32
	 */
	@Field(9) 
	public int special() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * special instructions for I/O, etc<br>
	 * C type : l_int32
	 */
	@Field(9) 
	public Pix special(int special) {
		this.io.setIntField(this, 9, special);
		return this;
	}
	/**
	 * text string associated with pix<br>
	 * C type : char*
	 */
	@Field(10) 
	public Pointer<Byte > text() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * text string associated with pix<br>
	 * C type : char*
	 */
	@Field(10) 
	public Pix text(Pointer<Byte > text) {
		this.io.setPointerField(this, 10, text);
		return this;
	}
	/**
	 * colormap (may be null)<br>
	 * C type : PixColormap*
	 */
	@Field(11) 
	public Pointer<PixColormap > colormap() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * colormap (may be null)<br>
	 * C type : PixColormap*
	 */
	@Field(11) 
	public Pix colormap(Pointer<PixColormap > colormap) {
		this.io.setPointerField(this, 11, colormap);
		return this;
	}
	/**
	 * the image data<br>
	 * C type : l_uint32*
	 */
	@Field(12) 
	public Pointer<Integer > data() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * the image data<br>
	 * C type : l_uint32*
	 */
	@Field(12) 
	public Pix data(Pointer<Integer > data) {
		this.io.setPointerField(this, 12, data);
		return this;
	}
	public Pix() {
		super();
	}
	public Pix(Pointer pointer) {
		super(pointer);
	}
}
