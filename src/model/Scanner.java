/* The following code was generated by JFlex 1.4.3 on 21.06.15 18:42 */

package model;
import java_cup.runtime.*;
import java.io.IOException;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 21.06.15 18:42 from the specification file
 * <tt>A:/NAUKA/VI sem/Teoria kompilacji i kompilatory/projekt/src/model/scanner.lex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\6\2\0\1\11\22\0\1\11\6\0\1\5\1\46"+
    "\1\47\1\40\1\41\1\45\1\42\1\4\1\43\12\2\1\55\1\44"+
    "\1\53\1\52\1\54\2\0\32\1\1\50\1\0\1\51\1\0\1\3"+
    "\1\0\1\12\1\17\1\23\1\14\1\20\1\32\1\21\1\25\1\22"+
    "\1\1\1\37\1\31\1\34\1\13\1\26\1\35\1\1\1\15\1\24"+
    "\1\30\1\33\1\36\1\27\1\1\1\16\1\1\1\7\1\0\1\10"+
    "\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\1"+
    "\21\2\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\2\0"+
    "\1\24\1\0\1\25\4\2\1\26\5\2\1\27\3\2"+
    "\1\30\1\31\3\2\1\32\7\2\1\33\1\34\1\35"+
    "\1\36\1\37\1\0\1\40\1\41\1\2\1\42\1\43"+
    "\4\2\1\44\10\2\1\45\3\2\1\46\1\2\1\47"+
    "\1\24\2\2\1\50\1\51\2\2\1\52\1\2\1\53"+
    "\1\54\3\2\1\55\2\2\1\56\2\2\1\57\4\2"+
    "\1\60\2\2\1\61\1\62\1\2\1\63\2\2\1\64"+
    "\1\65\1\2\1\66\1\2\1\67\4\2\1\70\1\71"+
    "\1\72\1\2\1\73\1\2\1\74\1\2\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\56\0\270\0\346\0\u0114"+
    "\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4"+
    "\0\u0422\0\56\0\56\0\56\0\56\0\56\0\56\0\56"+
    "\0\56\0\56\0\56\0\56\0\u0450\0\u047e\0\u04ac\0\u04da"+
    "\0\u0508\0\u0508\0\u0114\0\56\0\u0536\0\u0564\0\u0592\0\u05c0"+
    "\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4\0\134\0\u0702"+
    "\0\u0730\0\u075e\0\134\0\134\0\u078c\0\u07ba\0\u07e8\0\134"+
    "\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\56"+
    "\0\56\0\56\0\56\0\u04da\0\u0958\0\u0958\0\134\0\u0986"+
    "\0\134\0\134\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\134\0\u0a6c"+
    "\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\134"+
    "\0\u0bdc\0\u0c0a\0\u0c38\0\134\0\u0c66\0\134\0\u0958\0\u0c94"+
    "\0\u0cc2\0\u0cf0\0\134\0\u0d1e\0\u0d4c\0\134\0\u0d7a\0\134"+
    "\0\134\0\u0da8\0\u0dd6\0\u0e04\0\134\0\u0e32\0\u0e60\0\134"+
    "\0\u0e8e\0\u0ebc\0\134\0\u0eea\0\u0f18\0\u0f46\0\u0f74\0\134"+
    "\0\u0fa2\0\u0fd0\0\u0ffe\0\134\0\u102c\0\134\0\u105a\0\u1088"+
    "\0\134\0\134\0\u10b6\0\134\0\u10e4\0\134\0\u1112\0\u1140"+
    "\0\u116e\0\u119c\0\134\0\134\0\134\0\u11ca\0\134\0\u11f8"+
    "\0\134\0\u1226\0\134";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\2\1\7\1\11\1\12\1\13\1\14\1\3\1\15"+
    "\1\16\1\3\1\17\1\20\1\21\1\3\1\22\1\23"+
    "\1\24\1\3\1\25\1\26\1\27\1\30\1\31\1\3"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\57\0\3\3"+
    "\6\0\26\3\20\0\1\4\1\0\1\50\51\0\5\51"+
    "\1\52\1\0\47\51\6\0\1\7\2\0\1\7\44\0"+
    "\10\53\1\54\45\53\1\0\3\3\6\0\1\3\1\55"+
    "\1\3\1\56\22\3\17\0\3\3\6\0\10\3\1\57"+
    "\3\3\1\60\11\3\17\0\3\3\6\0\14\3\1\61"+
    "\11\3\17\0\3\3\6\0\6\3\1\62\17\3\17\0"+
    "\3\3\6\0\6\3\1\63\17\3\17\0\3\3\6\0"+
    "\1\3\1\64\15\3\1\65\6\3\17\0\3\3\6\0"+
    "\1\3\1\66\16\3\1\67\5\3\17\0\3\3\6\0"+
    "\1\70\12\3\1\71\12\3\17\0\3\3\6\0\16\3"+
    "\1\72\7\3\17\0\3\3\6\0\3\3\1\73\14\3"+
    "\1\74\5\3\17\0\3\3\6\0\3\3\1\75\7\3"+
    "\1\76\12\3\17\0\3\3\6\0\13\3\1\77\1\100"+
    "\11\3\17\0\3\3\6\0\14\3\1\101\4\3\1\102"+
    "\4\3\17\0\3\3\6\0\1\3\1\103\10\3\1\104"+
    "\13\3\17\0\3\3\6\0\14\3\1\105\11\3\17\0"+
    "\3\3\6\0\3\3\1\106\22\3\17\0\3\3\6\0"+
    "\1\107\25\3\70\0\1\110\1\0\1\111\53\0\1\112"+
    "\55\0\1\113\5\0\1\114\53\0\5\115\1\116\1\0"+
    "\47\115\1\0\3\3\6\0\2\3\1\117\23\3\17\0"+
    "\3\3\6\0\3\3\1\120\22\3\17\0\3\3\6\0"+
    "\17\3\1\121\6\3\17\0\3\3\6\0\16\3\1\122"+
    "\7\3\17\0\3\3\6\0\15\3\1\123\10\3\17\0"+
    "\3\3\6\0\1\124\22\3\1\125\2\3\17\0\3\3"+
    "\6\0\7\3\1\126\16\3\17\0\3\3\6\0\2\3"+
    "\1\127\23\3\17\0\3\3\6\0\12\3\1\130\13\3"+
    "\17\0\3\3\6\0\16\3\1\131\7\3\17\0\3\3"+
    "\6\0\12\3\1\132\13\3\17\0\3\3\6\0\1\133"+
    "\25\3\17\0\3\3\6\0\3\3\1\134\22\3\17\0"+
    "\3\3\6\0\10\3\1\135\15\3\17\0\3\3\6\0"+
    "\10\3\1\136\15\3\17\0\3\3\6\0\6\3\1\137"+
    "\17\3\17\0\3\3\6\0\3\3\1\140\22\3\17\0"+
    "\3\3\6\0\1\3\1\141\24\3\17\0\3\3\6\0"+
    "\16\3\1\142\7\3\17\0\3\3\6\0\6\3\1\143"+
    "\17\3\17\0\3\3\6\0\2\3\1\144\23\3\17\0"+
    "\3\3\6\0\14\3\1\145\11\3\17\0\3\3\6\0"+
    "\3\3\1\146\22\3\16\0\5\115\1\147\1\0\47\115"+
    "\1\0\3\3\6\0\1\150\25\3\17\0\3\3\6\0"+
    "\1\3\1\151\24\3\17\0\3\3\6\0\2\3\1\152"+
    "\14\3\1\153\6\3\17\0\3\3\6\0\6\3\1\154"+
    "\17\3\17\0\3\3\6\0\10\3\1\155\15\3\17\0"+
    "\3\3\6\0\6\3\1\156\17\3\17\0\3\3\6\0"+
    "\6\3\1\157\17\3\17\0\3\3\6\0\6\3\1\160"+
    "\17\3\17\0\3\3\6\0\3\3\1\161\22\3\17\0"+
    "\3\3\6\0\10\3\1\162\15\3\17\0\3\3\6\0"+
    "\16\3\1\163\7\3\17\0\3\3\6\0\17\3\1\164"+
    "\6\3\17\0\3\3\6\0\1\3\1\165\24\3\17\0"+
    "\3\3\6\0\11\3\1\166\14\3\17\0\3\3\6\0"+
    "\10\3\1\167\15\3\17\0\3\3\6\0\12\3\1\170"+
    "\13\3\17\0\3\3\6\0\7\3\1\171\1\3\1\172"+
    "\14\3\17\0\3\3\6\0\4\3\1\173\21\3\17\0"+
    "\3\3\6\0\16\3\1\174\7\3\17\0\3\3\6\0"+
    "\17\3\1\175\5\3\1\176\17\0\3\3\6\0\1\177"+
    "\25\3\17\0\3\3\6\0\1\3\1\200\24\3\17\0"+
    "\3\3\6\0\7\3\1\201\16\3\17\0\3\3\6\0"+
    "\1\3\1\202\24\3\17\0\3\3\6\0\6\3\1\203"+
    "\17\3\17\0\3\3\6\0\6\3\1\204\17\3\17\0"+
    "\3\3\6\0\16\3\1\205\7\3\17\0\3\3\6\0"+
    "\17\3\1\206\6\3\17\0\3\3\6\0\3\3\1\207"+
    "\22\3\17\0\3\3\6\0\6\3\1\210\17\3\17\0"+
    "\3\3\6\0\14\3\1\211\11\3\17\0\3\3\6\0"+
    "\1\3\1\212\24\3\17\0\3\3\6\0\6\3\1\213"+
    "\17\3\17\0\3\3\6\0\16\3\1\214\7\3\17\0"+
    "\3\3\6\0\6\3\1\215\17\3\17\0\3\3\6\0"+
    "\7\3\1\216\16\3\17\0\3\3\6\0\17\3\1\217"+
    "\6\3\17\0\3\3\6\0\10\3\1\220\15\3\17\0"+
    "\3\3\6\0\1\221\25\3\17\0\3\3\6\0\2\3"+
    "\1\222\23\3\17\0\3\3\6\0\4\3\1\223\21\3"+
    "\17\0\3\3\6\0\3\3\1\224\22\3\17\0\3\3"+
    "\6\0\1\3\1\225\24\3\17\0\3\3\6\0\14\3"+
    "\1\226\11\3\17\0\3\3\6\0\22\3\1\227\3\3"+
    "\17\0\3\3\6\0\21\3\1\230\4\3\17\0\3\3"+
    "\6\0\1\3\1\231\24\3\17\0\3\3\6\0\3\3"+
    "\1\232\22\3\17\0\3\3\6\0\6\3\1\233\17\3"+
    "\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4692];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\24\1\13\11\3\1\2\0"+
    "\1\1\1\0\1\11\33\1\4\11\1\1\1\0\116\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	private Symbol symbol(int type) {
    	return new Symbol(type, yyline, yycolumn);
	}

	private Symbol symbol(int type, Object value) {
    	return new Symbol(type, yyline, yycolumn, value);
	}

	public void error()
	throws IOException
	{
		throw new IOException("illegal text at line = "+yyline+", column = "+yycolumn+", text = '"+yytext()+"'");
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 122) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 57: 
          { return new Symbol(Sym.INT );
          }
        case 62: break;
        case 4: 
          { return new Symbol(Sym.DOT);
          }
        case 63: break;
        case 54: 
          { return new Symbol(Sym.REPEAT );
          }
        case 64: break;
        case 22: 
          { return new Symbol(Sym.DO );
          }
        case 65: break;
        case 44: 
          { return new Symbol(Sym.CHAR );
          }
        case 66: break;
        case 61: 
          { return new Symbol(Sym.PROCEDURE );
          }
        case 67: break;
        case 41: 
          { return new Symbol(Sym.REAL );
          }
        case 68: break;
        case 19: 
          { return new Symbol(Sym.COLON);
          }
        case 69: break;
        case 17: 
          { return new Symbol(Sym.GREATER);
          }
        case 70: break;
        case 46: 
          { return new Symbol(Sym.USES );
          }
        case 71: break;
        case 15: 
          { return new Symbol(Sym.RIGHT_BRACKET2);
          }
        case 72: break;
        case 7: 
          { return new Symbol(Sym.ADD);
          }
        case 73: break;
        case 32: 
          { return new Symbol(Sym.CHAR, yytext());
          }
        case 74: break;
        case 43: 
          { return new Symbol(Sym.CASE );
          }
        case 75: break;
        case 52: 
          { return new Symbol(Sym.DOWNTO );
          }
        case 76: break;
        case 38: 
          { return new Symbol(Sym.MOD );
          }
        case 77: break;
        case 24: 
          { return new Symbol(Sym.OR );
          }
        case 78: break;
        case 12: 
          { return new Symbol(Sym.LEFTBRACKET);
          }
        case 79: break;
        case 28: 
          { return new Symbol(Sym.NOT_EQUALS);
          }
        case 80: break;
        case 33: 
          { return new Symbol(Sym.AND );
          }
        case 81: break;
        case 1: 
          { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar);
          }
        case 82: break;
        case 16: 
          { return new Symbol(Sym.EQUALS);
          }
        case 83: break;
        case 3: 
          { return new Symbol(Sym.INT, yytext());
          }
        case 84: break;
        case 35: 
          { return new Symbol(Sym.NOT );
          }
        case 85: break;
        case 25: 
          { return new Symbol(Sym.OF );
          }
        case 86: break;
        case 5: 
          { /* Ignore whitespace. */
          }
        case 87: break;
        case 14: 
          { return new Symbol(Sym.LEFT_BRACKET2);
          }
        case 88: break;
        case 49: 
          { return new Symbol(Sym.WRITE );
          }
        case 89: break;
        case 37: 
          { return new Symbol(Sym.FOR );
          }
        case 90: break;
        case 48: 
          { return new Symbol(Sym.BEGIN );
          }
        case 91: break;
        case 45: 
          { return new Symbol(Sym.THEN );
          }
        case 92: break;
        case 36: 
          { return new Symbol(Sym.END );
          }
        case 93: break;
        case 8: 
          { return new Symbol(Sym.MINUS);
          }
        case 94: break;
        case 20: 
          { return new Symbol(Sym.STRING, yytext());
          }
        case 95: break;
        case 13: 
          { return new Symbol(Sym.RIGHTBRACKET);
          }
        case 96: break;
        case 6: 
          { return new Symbol(Sym.MULTIPLY);
          }
        case 97: break;
        case 58: 
          { return new Symbol(Sym.WRITELN );
          }
        case 98: break;
        case 39: 
          { return new Symbol(Sym.VAR );
          }
        case 99: break;
        case 2: 
          { return new Symbol(Sym.IDE, yytext());
          }
        case 100: break;
        case 60: 
          { return new Symbol(Sym.FUNCTION );
          }
        case 101: break;
        case 11: 
          { return new Symbol(Sym.COMMA);
          }
        case 102: break;
        case 50: 
          { return new Symbol(Sym.WHILE );
          }
        case 103: break;
        case 31: 
          { return new Symbol(Sym.REAL, yytext());
          }
        case 104: break;
        case 21: 
          { /* For this stand-alone lexer, print out comments. */
                  System.out.println("Recognized comment: " + yytext());
          }
        case 105: break;
        case 30: 
          { return new Symbol(Sym.ASSINGMENT);
          }
        case 106: break;
        case 26: 
          { return new Symbol(Sym.TO );
          }
        case 107: break;
        case 34: 
          { return new Symbol(Sym.NIL );
          }
        case 108: break;
        case 18: 
          { return new Symbol(Sym.LESS);
          }
        case 109: break;
        case 27: 
          { return new Symbol(Sym.LESS_OR_EQUALS);
          }
        case 110: break;
        case 47: 
          { return new Symbol(Sym.ARRAY );
          }
        case 111: break;
        case 29: 
          { return new Symbol(Sym.GREATER_OR_EQUALS);
          }
        case 112: break;
        case 56: 
          { return new Symbol(Sym.READKEY );
          }
        case 113: break;
        case 59: 
          { return new Symbol(Sym.PROGRAM );
          }
        case 114: break;
        case 51: 
          { return new Symbol(Sym.UNTIL );
          }
        case 115: break;
        case 55: 
          { return new Symbol(Sym.STRING );
          }
        case 116: break;
        case 40: 
          { return new Symbol(Sym.READ );
          }
        case 117: break;
        case 10: 
          { return new Symbol(Sym.SEMICOLON);
          }
        case 118: break;
        case 42: 
          { return new Symbol(Sym.ELSE );
          }
        case 119: break;
        case 9: 
          { return new Symbol(Sym.DIVIDE);
          }
        case 120: break;
        case 23: 
          { return new Symbol(Sym.IF );
          }
        case 121: break;
        case 53: 
          { return new Symbol(Sym.READLN );
          }
        case 122: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 
return (symbol(Sym.EOF));

 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
