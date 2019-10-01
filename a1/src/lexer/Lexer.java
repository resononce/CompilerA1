/* Lexer.java */
/* Generated By:JavaCC: Do not edit this line. Lexer.java */
  package lexer;
  import util.*;
  import java.util.Vector;

  /** A class for performing lexical analysis */
  public class Lexer implements LexerConstants {
      /** Maximum string length allowed */
      public static final int MAX_STRING_LENGTH = 5000;
      /** Is debugging enabled? */
      private static boolean debug = false;
      /** Filenames of source files */
      private static String[] filenames = null;
      /** Input streams of source files */
      private static java.io.FileInputStream[] fileReaders = null;
      /** Current file number (index into filenames and fileReaders) */
      private static int fileCnt = 0;

      /** Lexer constructor 
        * @param filenames array of filenames for the source files
	* @param debug flag indicating whether debugging is enabled
	* */
      public Lexer(String[] filenames, boolean debug) {
          // set debugging flag
          this.debug = debug;

          // initialize filenames field to parameter filenames
          // used later for finding the name of the current file
          this.filenames = filenames;

          // check that there is at least one specified filename
          if (filenames.length == 0)
              throw new RuntimeException(
                    "Must specify at least one filename to scan");

          initFiles(/*first time?*/true);
      }

      /** Initialize (or reinitialize) file readers
        * @param firstTime flag indicating whether this is the first
	* time through
	* */
      private void initFiles(boolean firstTime) {
          // must initialize readers for each file (FileInputStream)
          fileReaders = new java.io.FileInputStream[filenames.length];
          for (int i = 0; i < filenames.length; i++) {
              // try...catch checks if file is found
              try {
                  // create the ith file reader
                  fileReaders[i] = new java.io.FileInputStream(filenames[i]);
              }
              catch(java.io.FileNotFoundException e) {
                  // if file not found then report an error and exit
                  System.err.println("Error: file '" + filenames[i] +
                                      "' not found");
                  System.exit(1);
              }
          }

          if (firstTime) {
              try { jj_input_stream = new JavaCharStream(fileReaders[0],
                                                         null, 1, 1); }
              catch(java.io.UnsupportedEncodingException e) {
                         throw new RuntimeException(e);
              }
              token_source = new LexerTokenManager(jj_input_stream);
          }
          else
              jj_input_stream.ReInit(fileReaders[0], 1, 1);
      }

      /** Scan the input files and print their tokens
        * */
      public void scanAndPrintTokens() throws ParseException {
          // reinitialize the files
          initFiles(/*first time?*/false);

          for (fileCnt = 0; fileCnt < fileReaders.length; fileCnt++) {
              System.out.println("# " + filenames[fileCnt]);
              for (token = token_source.getNextToken();
                   token != null && token.kind != EOF;
                   token = token_source.getNextToken()) {
                  System.out.println("# line " + token.beginLine);
                  if (token.kind == ID)
                      System.out.println("<ID, " + token.image + ">");
                  else if (token.kind == INT_CONST)
                      System.out.println("<INT_CONST, " + token.image + ">");
                  else if (token.kind == BOOLEAN_CONST)
                      System.out.println("<BOOLEAN_CONST, " + token.image
                                                            + ">");
                  else if (token.kind == STRING_CONST) {
                      System.out.println("<STRING_CONST, " + token.image +
                          ", [length: " + computeLengthAndCheck(token) + "] >");
                  }
                  else
                      System.out.println("<" + token.image.toUpperCase()
                                             + ", >");
              }

              // move to next file
              if (fileCnt < fileReaders.length - 1)
                  jj_input_stream.ReInit(fileReaders[fileCnt+1], 1, 1);
          }

          System.out.println("# line " + token.beginLine);
          System.out.println("<EOF, >");
      }

      /** Get the filename of the file currently being scanned
        * */
      public static String getCurrFilename() {
          return filenames[fileCnt];
      }

     /** Given a STRING_CONST token, compute and return the number of
       * characters in the corresponding Java string. Note, for example,
       * that the two-character substring "\\" in the token's lexeme counts as
       * the single character '\' in the corresponding Java String.
       * Also detect and register all of the following lexical errors:
       *   + Each and every illegal escape character in the string.
       *   + Each and every newline character (i.e., '\n', as opposed to the
       *     substring "\n") in the string.
       *   + The corresponding Java string contains more than MAX_STRING_LENGTH
       *     characters.
       * */
     private static int computeLengthAndCheck(Token token) {

      String tkImage = token.toString();
      int len = tkImage.length();
      if (tkImage.length() > MAX_STRING_LENGTH)
      {
        token_source.errorHandler.register(token_source.errorHandler.LEX_ERROR,
                              Lexer.getCurrFilename(),
                              JavaCharStream.getBeginLine(),
                              "String constant is too long");
      }

      if(tkImage.charAt(0) == '"'){
        len--;
      }
      if(tkImage.charAt(tkImage.length() - 1) == '"'){
        len--;
      }
      for(int i = 0; i < tkImage.length() - 1; i++){
        if(tkImage.charAt(i) == '\u005c\u005c' ){
          System.out.println("found an escape character");
          len--;
          i++;
          if(tkImage.charAt(i) != 'n' && tkImage.charAt(i) != 'f' && tkImage.charAt(i) != 't' && tkImage.charAt(i) != '\u005c"' && tkImage.charAt(i) != '\u005c\u005c' && tkImage.charAt(i) != ' ')
          {
            token_source.errorHandler.register(token_source.errorHandler.LEX_ERROR,
                            Lexer.getCurrFilename(),
                            JavaCharStream.getBeginLine(),
                            "Illegal escape character: " + tkImage.charAt(i-1) + tkImage.charAt(i));
          }
        }else if(tkImage.charAt(i) == '\u005cn'){
          len--;
          token_source.errorHandler.register(token_source.errorHandler.LEX_ERROR,
                                Lexer.getCurrFilename(),
                                JavaCharStream.getBeginLine(),
                                "String spans more than one line");
        }else if(tkImage.charAt(i) == '\u005ct'){
        }else if(tkImage.charAt(i) == '\u005c\u005c'){
        }else if(tkImage.charAt(i) == '\u005c"'){
        }else if(tkImage.charAt(i) == '\u005cr'){
        }
      }
      return len;
    }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public LexerTokenManager token_source;
  static JavaCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {};
   }

  /** Constructor with InputStream. */
  public Lexer(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Lexer(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new LexerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Lexer(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new LexerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
  }

  /** Constructor with generated Token Manager. */
  public Lexer(LexerTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
  }

  /** Reinitialise. */
  public void ReInit(LexerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[48];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 48; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  }
