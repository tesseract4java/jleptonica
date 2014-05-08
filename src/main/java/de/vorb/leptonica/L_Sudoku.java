package de.vorb.leptonica;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * sudoku.h<br>
 * *    The L_Sudoku holds all the information of the current state.<br>
 * *    The input to sudokuCreate() is a file with any number of lines<br>
 *    starting with '#', followed by 9 lines consisting of 9 numbers<br>
 *    in each line.  These have the known values and use 0 for the unknowns.<br>
 *    Blank lines are ignored.<br>
 * *    The @locs array holds the indices of the unknowns, numbered<br>
 *    left-to-right and top-to-bottom from 0 to 80.  The array size<br>
 *    is initialized to @num.  @current is the index into the @locs<br>
 *    array of the current guess: locs[current].<br>
 * *    The @state array is used to determine the validity of each guess.<br>
 *    It is of size 81, and is initialized by setting the unknowns to 0<br>
 *    and the knowns to their input values.<br>
 * <i>native declaration : C:\Users\Paul\Studium\Masterarbeit\Entwicklung\VS2013\tesseract-vs2013\liblept\include\sudoku.h:49</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Sudoku extends Structure {
	/**
	 * number of unknowns<br>
	 * C type : l_int32
	 */
	public int num;
	/**
	 * location of unknowns<br>
	 * C type : l_int32*
	 */
	public IntByReference locs;
	/**
	 * index into @locs of current location<br>
	 * C type : l_int32
	 */
	public int current;
	/**
	 * initial state, with 0 representing<br>
	 * C type : l_int32*
	 */
	public IntByReference init;
	/**
	 * the unknowns<br>
	 * present state, including inits and<br>
	 * C type : l_int32*
	 */
	public IntByReference state;
	/**
	 * guesses of unknowns up to @current<br>
	 * shows current number of guesses<br>
	 * C type : l_int32
	 */
	public int nguess;
	/**
	 * set to 1 when solved<br>
	 * C type : l_int32
	 */
	public int finished;
	/**
	 * set to 1 if no solution is possible<br>
	 * C type : l_int32
	 */
	public int failure;
	public L_Sudoku() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("num", "locs", "current", "init", "state", "nguess", "finished", "failure");
	}
	/**
	 * @param num number of unknowns<br>
	 * C type : l_int32<br>
	 * @param locs location of unknowns<br>
	 * C type : l_int32*<br>
	 * @param current index into @locs of current location<br>
	 * C type : l_int32<br>
	 * @param init initial state, with 0 representing<br>
	 * C type : l_int32*<br>
	 * @param state the unknowns<br>
	 * present state, including inits and<br>
	 * C type : l_int32*<br>
	 * @param nguess guesses of unknowns up to @current<br>
	 * shows current number of guesses<br>
	 * C type : l_int32<br>
	 * @param finished set to 1 when solved<br>
	 * C type : l_int32<br>
	 * @param failure set to 1 if no solution is possible<br>
	 * C type : l_int32
	 */
	public L_Sudoku(int num, IntByReference locs, int current, IntByReference init, IntByReference state, int nguess, int finished, int failure) {
		super();
		this.num = num;
		this.locs = locs;
		this.current = current;
		this.init = init;
		this.state = state;
		this.nguess = nguess;
		this.finished = finished;
		this.failure = failure;
	}
	public static class ByReference extends L_Sudoku implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Sudoku implements Structure.ByValue {
		
	};
}
