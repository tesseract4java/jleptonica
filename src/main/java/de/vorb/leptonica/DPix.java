package de.vorb.leptonica;
import com.sun.jna.Structure;
import com.sun.jna.ptr.DoubleByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\tesseract-vs2013\liblept\include\pix.h:552</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DPix extends Structure {
	/**
	 * width in pixels<br>
	 * C type : l_int32
	 */
	public int w;
	/**
	 * height in pixels<br>
	 * C type : l_int32
	 */
	public int h;
	/**
	 * 32-bit words/line<br>
	 * C type : l_int32
	 */
	public int wpl;
	/**
	 * reference count (1 if no clones)<br>
	 * C type : l_uint32
	 */
	public int refcount;
	/**
	 * image res (ppi) in x direction<br>
	 * C type : l_int32
	 */
	public int xres;
	/**
	 * (use 0 if unknown)<br>
	 * image res (ppi) in y direction<br>
	 * C type : l_int32
	 */
	public int yres;
	/**
	 * (use 0 if unknown)<br>
	 * the double image data<br>
	 * C type : l_float64*
	 */
	public DoubleByReference data;
	public DPix() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("w", "h", "wpl", "refcount", "xres", "yres", "data");
	}
	/**
	 * @param w width in pixels<br>
	 * C type : l_int32<br>
	 * @param h height in pixels<br>
	 * C type : l_int32<br>
	 * @param wpl 32-bit words/line<br>
	 * C type : l_int32<br>
	 * @param refcount reference count (1 if no clones)<br>
	 * C type : l_uint32<br>
	 * @param xres image res (ppi) in x direction<br>
	 * C type : l_int32<br>
	 * @param yres (use 0 if unknown)<br>
	 * image res (ppi) in y direction<br>
	 * C type : l_int32<br>
	 * @param data (use 0 if unknown)<br>
	 * the double image data<br>
	 * C type : l_float64*
	 */
	public DPix(int w, int h, int wpl, int refcount, int xres, int yres, DoubleByReference data) {
		super();
		this.w = w;
		this.h = h;
		this.wpl = wpl;
		this.refcount = refcount;
		this.xres = xres;
		this.yres = yres;
		this.data = data;
	}
	public static class ByReference extends DPix implements Structure.ByReference {
		
	};
	public static class ByValue extends DPix implements Structure.ByValue {
		
	};
}
