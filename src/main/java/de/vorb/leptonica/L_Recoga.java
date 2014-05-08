package de.vorb.leptonica;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * recog.h<br>
 *     A simple utility for training and recognizing individual<br>
 *     machine-printed text characters.  In an application, one can<br>
 *     envision using a number of these, one for each trained set.<br>
 *     In training mode, a set of labelled bitmaps is presented, either<br>
 *     one at a time, or in a directory, or in a pixa.  If in a directory,<br>
 *     or a pixa, the labelling text string must be embedded in the<br>
 *     text field of the image file.<br>
 *     Any number of recognizers (L_Recog) can be trained and then used<br>
 *     together in an array (L_Recoga).  All these trained structures<br>
 *     can be serialized to file and read back.  The serialized version<br>
 *     holds all the bitmaps used for training, plus, for arbitrary<br>
 *     character sets, the UTF8 representation and the lookup table<br>
 *     mapping from the character representation to index.<br>
 *     There are three levels of "sets" here:<br>
 *       (1) Example set: the examples representing a character that<br>
 *           were printed in the same way, so that they can be combined<br>
 *           without scaling to form an "average" template for the character.<br>
 *           In the recognition phase, we use either this aligned average,<br>
 *           or the individual bitmaps.  All examples in the set are given<br>
 *           the same character label.   Example: the letter 'a' in the<br>
 *           predominant font in a book.<br>
 *       (2) Character set (represented by L_Recog, a single recognizer):<br>
 *           The set of different characters, each of which is described<br>
 *           by (1).  Each element of the set has a different character<br>
 *           label.  Example: the digits '0' through '9' that are used for<br>
 *           page numbering in a book.<br>
 *       (3) Recognizer set (represented by L_Recoga, an array of recogs):<br>
 *           A set of recognizers, each of which is described by (2).<br>
 *           In general, we do not want to combine the character sets<br>
 *           with the same labels within different recognizer sets,<br>
 *           because the bitmaps can differ in font type, style or size.<br>
 *           Example 1: the letter 'a' can be printed in two very different<br>
 *           ways (either with a large loop or with a smaller loop in<br>
 *           the lower half); both share the same label but need to be<br>
 *           distinguished so that they are not mixed when averaging.<br>
 *           Example 2: a recognizer trained for a book may be missing<br>
 *           some characters, so we need to supplement it with another<br>
 *           "generic" or "bootstrap" recognizer that has the additional<br>
 *           characters from a variety of sources.  Bootstrap recognizers<br>
 *           must be run in a mode where all characters are scaled.<br>
 *     In the recognition process, for each component in an input image,<br>
 *     each recognizer (L_Recog) records the best match (highest<br>
 *     correlation score).  If there is more than one recognizer, these<br>
 *     results are aggregated to find the best match for each character<br>
 *     for all the recognizers, and this is stored in L_Recoga.<br>
 * <i>native declaration : C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\tesseract-vs2013\liblept\include\recog.h:89</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("leptonica") 
public class L_Recoga extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * number of recogs<br>
	 * C type : l_int32
	 */
	@Field(0) 
	public int n() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * number of recogs<br>
	 * C type : l_int32
	 */
	@Field(0) 
	public L_Recoga n(int n) {
		this.io.setIntField(this, 0, n);
		return this;
	}
	/**
	 * number of recog ptrs allocated<br>
	 * C type : l_int32
	 */
	@Field(1) 
	public int nalloc() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * number of recog ptrs allocated<br>
	 * C type : l_int32
	 */
	@Field(1) 
	public L_Recoga nalloc(int nalloc) {
		this.io.setIntField(this, 1, nalloc);
		return this;
	}
	/**
	 * recog ptr array<br>
	 * C type : L_Recog**
	 */
	@Field(2) 
	public Pointer<Pointer<L_Recog > > recog() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * recog ptr array<br>
	 * C type : L_Recog**
	 */
	@Field(2) 
	public L_Recoga recog(Pointer<Pointer<L_Recog > > recog) {
		this.io.setPointerField(this, 2, recog);
		return this;
	}
	/**
	 * stores the array of best chars<br>
	 * C type : L_Rcha*
	 */
	@Field(3) 
	public Pointer<L_Rcha > rcha() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * stores the array of best chars<br>
	 * C type : L_Rcha*
	 */
	@Field(3) 
	public L_Recoga rcha(Pointer<L_Rcha > rcha) {
		this.io.setPointerField(this, 3, rcha);
		return this;
	}
	public L_Recoga() {
		super();
	}
	public L_Recoga(Pointer pointer) {
		super(pointer);
	}
}
