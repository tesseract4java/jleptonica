package de.vorb.leptonica;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\tesseract-vs2013\liblept\include\ccbord.h:101</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CCBorda extends Structure {
	/**
	 * input pix (may be null)<br>
	 * C type : Pix*
	 */
	public de.vorb.leptonica.Pix.ByReference pix;
	/**
	 * width of pix<br>
	 * C type : l_int32
	 */
	public int w;
	/**
	 * height of pix<br>
	 * C type : l_int32
	 */
	public int h;
	/**
	 * number of ccbord in ptr array<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * number of ccbord ptrs allocated<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * ccb ptr array<br>
	 * C type : CCBord**
	 */
	public de.vorb.leptonica.CCBord.ByReference[] ccb;
	public CCBorda() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("pix", "w", "h", "n", "nalloc", "ccb");
	}
	/**
	 * @param pix input pix (may be null)<br>
	 * C type : Pix*<br>
	 * @param w width of pix<br>
	 * C type : l_int32<br>
	 * @param h height of pix<br>
	 * C type : l_int32<br>
	 * @param n number of ccbord in ptr array<br>
	 * C type : l_int32<br>
	 * @param nalloc number of ccbord ptrs allocated<br>
	 * C type : l_int32<br>
	 * @param ccb ccb ptr array<br>
	 * C type : CCBord**
	 */
	public CCBorda(de.vorb.leptonica.Pix.ByReference pix, int w, int h, int n, int nalloc, de.vorb.leptonica.CCBord.ByReference ccb[]) {
		super();
		this.pix = pix;
		this.w = w;
		this.h = h;
		this.n = n;
		this.nalloc = nalloc;
		if ((ccb.length != this.ccb.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ccb = ccb;
	}
	public static class ByReference extends CCBorda implements Structure.ByReference {
		
	};
	public static class ByValue extends CCBorda implements Structure.ByValue {
		
	};
}
