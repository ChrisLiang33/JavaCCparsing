/* Generated By:JavaCC: Do not edit this line. parse.java */
class parse implements parseConstants {
    /** Main entry point. */
  public static void main(String args[]) throws ParseException {
    parse parser = new parse(System.in);
    parser.Program();
  }

/* Program Syntax */

// 
// grammar for mini java
// E  -> MainClass ClassDecl*
// MainClass -> class id { public static void main ( String [] id ) { Statement } }
// ClassDecl -> class id { VarDecl MethodDecl } | class id extends id { VarDecl MethodDecl }
// VarDecl -> Typeid;
// MethodDecl -> public Type id ( FormalList ) ExpList ExpRest
// id
//
//
// 
  static final public void Program() throws ParseException {
    MainClass();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      ClassDecl();
    }
    jj_consume_token(0);
  }

  static final public void MainClass() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LCBRACKET);
    jj_consume_token(PUBLIC);
    jj_consume_token(STATIC);
    jj_consume_token(VOID);
    jj_consume_token(MAIN);
    jj_consume_token(LPAREN);
    jj_consume_token(STRING_ARRAY);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(RPAREN);
    jj_consume_token(LCBRACKET);
    Statement();
    jj_consume_token(RCBRACKET);
    jj_consume_token(RCBRACKET);
  }

  static final public void ClassDecl() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CLASS:
      jj_consume_token(CLASS);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(LCBRACKET);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN:
        case INT:
        case INT_ARRAY:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        VarDecl();
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PUBLIC:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
        MethodDecl();
      }
      jj_consume_token(RCBRACKET);
      break;
      jj_consume_token(CLASS);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EXTENDS);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(LCBRACKET);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN:
        case INT:
        case INT_ARRAY:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_4;
        }
        VarDecl();
      }
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PUBLIC:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_5;
        }
        MethodDecl();
      }
      jj_consume_token(RCBRACKET);
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void VarDecl() throws ParseException {
    Type();
    jj_consume_token(IDENTIFIER);
    jj_consume_token(SEMICOLON);
  }

  static final public void MethodDecl() throws ParseException {
    jj_consume_token(PUBLIC);
    Type();
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LPAREN);
    FormalList();
    jj_consume_token(RPAREN);
    jj_consume_token(LCBRACKET);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BOOLEAN:
      case INT:
      case INT_ARRAY:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_6;
      }
      VarDecl();
    }
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case IDENTIFIER:
      case LCBRACKET:
      case PRINT:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_7;
      }
      Statement();
    }
    jj_consume_token(RETURN);
    Exp();
    jj_consume_token(SEMICOLON);
    jj_consume_token(RCBRACKET);
  }

  static final public void FormalList() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BOOLEAN:
    case INT:
    case INT_ARRAY:
    case IDENTIFIER:
      Type();
      jj_consume_token(IDENTIFIER);
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_8;
        }
        FormalRest();
      }
      break;
    default:
      jj_la1[9] = jj_gen;

    }
  }

  static final public void FormalRest() throws ParseException {
    jj_consume_token(COMMA);
    Type();
    jj_consume_token(IDENTIFIER);
  }

  static final public void Type() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT_ARRAY:
      jj_consume_token(INT_ARRAY);
      break;
    case BOOLEAN:
      jj_consume_token(BOOLEAN);
      break;
    case INT:
      jj_consume_token(INT);
      break;
    case IDENTIFIER:
      jj_consume_token(IDENTIFIER);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LCBRACKET:
      jj_consume_token(LCBRACKET);
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IF:
        case WHILE:
        case IDENTIFIER:
        case LCBRACKET:
        case PRINT:
          ;
          break;
        default:
          jj_la1[11] = jj_gen;
          break label_9;
        }
        Statement();
      }
      jj_consume_token(RCBRACKET);
      break;
    case IF:
      jj_consume_token(IF);
      jj_consume_token(LPAREN);
      Exp();
      jj_consume_token(RPAREN);
      Statement();
      jj_consume_token(ELSE);
      Statement();
      break;
    case WHILE:
      jj_consume_token(WHILE);
      Exp();
      Statement();
      break;
    case PRINT:
      jj_consume_token(PRINT);
      jj_consume_token(LPAREN);
      Exp();
      jj_consume_token(RPAREN);
      jj_consume_token(SEMICOLON);
      break;
    case IDENTIFIER:
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUALS);
      Exp();
      jj_consume_token(SEMICOLON);
      break;
      jj_consume_token(IDENTIFIER);
      jj_consume_token(LBRACKET);
      Exp();
      jj_consume_token(RBRACKET);
      jj_consume_token(EQUALS);
      Exp();
      jj_consume_token(SEMICOLON);
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Exp() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER_LITERAL:
      jj_consume_token(INTEGER_LITERAL);
      break;
    case TRUE:
      jj_consume_token(TRUE);
      break;
    case FALSE:
      jj_consume_token(FALSE);
      break;
    case IDENTIFIER:
      jj_consume_token(IDENTIFIER);
      break;
    case THIS:
      jj_consume_token(THIS);
      break;
    case NEW:
      jj_consume_token(NEW);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(LPAREN);
      jj_consume_token(RPAREN);
      break;
      jj_consume_token(NEW);
      jj_consume_token(INT);
      jj_consume_token(LBRACKET);
      Exp();
      jj_consume_token(RBRACKET);
      Exp1();
      break;
    case LPAREN:
      jj_consume_token(LPAREN);
      Exp();
      jj_consume_token(RPAREN);
      Exp1();
      break;
    case NOT:
      jj_consume_token(NOT);
      Exp();
      Exp1();
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Exp1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OPERATOR:
      jj_consume_token(OPERATOR);
      Exp();
      Exp1();
      break;
    case LBRACKET:
      jj_consume_token(LBRACKET);
      Exp();
      jj_consume_token(RBRACKET);
      Exp1();
      break;
    case PERIOD:
      jj_consume_token(PERIOD);
      jj_consume_token(LENGTH);
      Exp1();
      break;
      jj_consume_token(PERIOD);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(LPAREN);
      ExpList();
      jj_consume_token(RPAREN);
      Exp1();
      break;
    default:
      jj_la1[14] = jj_gen;

    }
  }

  static final public void ExpList() throws ParseException {
    Exp();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_10;
      }
      ExpRest();
    }
  }

  static final public void ExpRest() throws ParseException {
    jj_consume_token(COMMA);
    Exp();
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public parseTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[16];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1000,0x29000000,0x10000,0x29000000,0x10000,0x1000,0x29000000,0x402000,0x0,0x29000000,0x29000000,0x402000,0x402000,0xc6100820,0x200000,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x4,0x0,0x4,0x0,0x0,0x4,0x8024,0x2,0x4,0x4,0x8024,0x8024,0x4,0x4008,0x2,};
   }

  /** Constructor with InputStream. */
  public parse(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public parse(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new parseTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public parse(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new parseTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public parse(parseTokenManager tm) {
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
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(parseTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
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

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List jj_expentries = new java.util.ArrayList();
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
    for (int i = 0; i < 16; i++) {
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
      exptokseq[i] = (int[])jj_expentries.get(i);
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
