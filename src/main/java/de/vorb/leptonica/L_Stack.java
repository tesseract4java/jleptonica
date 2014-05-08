package de.vorb.leptonica;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * Note that array[n] is the first null ptr in the array<br>
 * <i>native declaration : C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\tesseract-vs2013\liblept\include\stack.h:55</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Stack extends Structure {
	/**
	 * size of ptr array<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * number of stored elements<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * ptr array<br>
	 * C type : void**
	 */
	public PointerByReference array;
	/**
	 * auxiliary stack<br>
	 * C type : L_Stack*
	 */
	public L_Stack.ByReference auxstack;
	public L_Stack() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nalloc", "n", "array", "auxstack");
	}
	/**
	 * @param nalloc size of ptr array<br>
	 * C type : l_int32<br>
	 * @param n number of stored elements<br>
	 * C type : l_int32<br>
	 * @param array ptr array<br>
	 * C type : void**<br>
	 * @param auxstack auxiliary stack<br>
	 * C type : L_Stack*
	 */
	public L_Stack(int nalloc, int n, PointerByReference array, L_Stack.ByReference auxstack) {
		super();
		this.nalloc = nalloc;
		this.n = n;
		this.array = array;
		this.auxstack = auxstack;
	}
	public static class ByReference extends L_Stack implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Stack implements Structure.ByValue {
		
	};
}
