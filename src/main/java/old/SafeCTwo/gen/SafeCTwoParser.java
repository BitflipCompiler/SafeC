// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/SafeCTwo\SafeCTwo.g4 by ANTLR 4.9.2
package old.SafeCTwo.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SafeCTwoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILESTMT=1, FORSTMT=2, IFSTMT=3, ELSE=4, SWITCHSTMT=5, CASE=6, DEFAULT=7, 
		NUMDCL=8, CHARDCL=9, STRDCL=10, BOOLDCL=11, VOIDDCL=12, RETURN=13, BREAK=14, 
		BOOLVAL=15, NUMVAL=16, CHARVAL=17, STRVAL=18, ID=19, SAFETY=20, PLUS=21, 
		MINUS=22, TIMES=23, DIVISION=24, POW=25, SQUARE=26, MOD=27, PI=28, LBRACK=29, 
		RBRACK=30, LPAR=31, RPAR=32, LBRACE=33, RBRACE=34, DOT=35, COMMA=36, COLON=37, 
		SEMI=38, SINGLEQOUTE=39, DOUBLEQOUTE=40, ASSIGN=41, LEQ=42, GEQ=43, EQ=44, 
		NEQ=45, LESS=46, GREATER=47, NOT=48, AND=49, OR=50, HASHTAG=51, DOLLAR=52, 
		WS=53, COMMENT=54;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_structdcl = 2, RULE_structblock = 3, 
		RULE_dclassignsemi = 4, RULE_dclassignsemicommand = 5, RULE_safedeclaration = 6, 
		RULE_params = 7, RULE_block = 8, RULE_caseblock = 9, RULE_vdcl = 10, RULE_arraydecl = 11, 
		RULE_arrdcltype = 12, RULE_vassign = 13, RULE_vdclassign = 14, RULE_arraydclassign = 15, 
		RULE_numarraydclassign = 16, RULE_chararraydclassign = 17, RULE_stringarraydclassign = 18, 
		RULE_boolarraydclassign = 19, RULE_datatype = 20, RULE_atypes = 21, RULE_arrayassign = 22, 
		RULE_arraydata = 23, RULE_numarray = 24, RULE_chararray = 25, RULE_strarray = 26, 
		RULE_boolarray = 27, RULE_command = 28, RULE_funccalls = 29, RULE_funcdcl = 30, 
		RULE_funcblock = 31, RULE_callparams = 32, RULE_ctrlstruct = 33, RULE_iterative = 34, 
		RULE_selective = 35, RULE_iflogic = 36, RULE_forparams = 37, RULE_scase = 38, 
		RULE_defcase = 39, RULE_numdecl = 40, RULE_booldecl = 41, RULE_chardecl = 42, 
		RULE_stringdecl = 43, RULE_numdclassign = 44, RULE_chardclassign = 45, 
		RULE_stringdclassign = 46, RULE_booldclassign = 47, RULE_bexpr = 48, RULE_bterm = 49, 
		RULE_bpart = 50, RULE_bpiece = 51, RULE_blast = 52, RULE_aexpr = 53, RULE_term = 54, 
		RULE_part = 55, RULE_partbool = 56, RULE_bop = 57, RULE_vals = 58, RULE_numberval = 59, 
		RULE_relop = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "structdcl", "structblock", "dclassignsemi", "dclassignsemicommand", 
			"safedeclaration", "params", "block", "caseblock", "vdcl", "arraydecl", 
			"arrdcltype", "vassign", "vdclassign", "arraydclassign", "numarraydclassign", 
			"chararraydclassign", "stringarraydclassign", "boolarraydclassign", "datatype", 
			"atypes", "arrayassign", "arraydata", "numarray", "chararray", "strarray", 
			"boolarray", "command", "funccalls", "funcdcl", "funcblock", "callparams", 
			"ctrlstruct", "iterative", "selective", "iflogic", "forparams", "scase", 
			"defcase", "numdecl", "booldecl", "chardecl", "stringdecl", "numdclassign", 
			"chardclassign", "stringdclassign", "booldclassign", "old/bexpr", "bterm",
			"bpart", "bpiece", "blast", "old/aexpr", "term", "part", "partbool", "bop",
			"vals", "numberval", "relop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'for'", "'if'", "'else'", "'switch'", "'case'", "'default'", 
			"'number'", "'char'", "'string'", "'boolean'", "'void'", "'return'", 
			null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'pow'", "'sqrt'", "'%'", "'PI'", "'['", "']'", "'('", "')'", "'{'", 
			"'}'", "'.'", "','", "':'", "';'", "'''", "'\"'", "'='", "'<='", "'>='", 
			"'=='", "'!='", "'<'", "'>'", "'!'", "'&&'", "'||'", "'#'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILESTMT", "FORSTMT", "IFSTMT", "ELSE", "SWITCHSTMT", "CASE", 
			"DEFAULT", "NUMDCL", "CHARDCL", "STRDCL", "BOOLDCL", "VOIDDCL", "RETURN", 
			"BREAK", "BOOLVAL", "NUMVAL", "CHARVAL", "STRVAL", "ID", "SAFETY", "PLUS", 
			"MINUS", "TIMES", "DIVISION", "POW", "SQUARE", "MOD", "PI", "LBRACK", 
			"RBRACK", "LPAR", "RPAR", "LBRACE", "RBRACE", "DOT", "COMMA", "COLON", 
			"SEMI", "SINGLEQOUTE", "DOUBLEQOUTE", "ASSIGN", "LEQ", "GEQ", "EQ", "NEQ", 
			"LESS", "GREATER", "NOT", "AND", "OR", "HASHTAG", "DOLLAR", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SafeCTwo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SafeCTwoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationNodeContext extends ProgContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationNodeContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterDeclarationNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitDeclarationNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitDeclarationNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new DeclarationNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMDCL) | (1L << CHARDCL) | (1L << STRDCL) | (1L << BOOLDCL) | (1L << VOIDDCL) | (1L << ID) | (1L << SAFETY) | (1L << DOLLAR))) != 0)) {
				{
				{
				setState(122);
				declaration();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructDclNodeContext extends DeclarationContext {
		public StructdclContext structdcl() {
			return getRuleContext(StructdclContext.class,0);
		}
		public StructDclNodeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStructDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStructDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStructDclNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DclAssignSemiNodeContext extends DeclarationContext {
		public DclassignsemiContext dclassignsemi() {
			return getRuleContext(DclassignsemiContext.class,0);
		}
		public DclAssignSemiNodeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterDclAssignSemiNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitDclAssignSemiNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitDclAssignSemiNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDclNodeContext extends DeclarationContext {
		public FuncdclContext funcdcl() {
			return getRuleContext(FuncdclContext.class,0);
		}
		public FuncDclNodeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterFuncDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitFuncDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitFuncDclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SAFETY:
				_localctx = new DclAssignSemiNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				dclassignsemi();
				}
				break;
			case DOLLAR:
				_localctx = new StructDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				structdcl();
				}
				break;
			case NUMDCL:
			case CHARDCL:
			case STRDCL:
			case BOOLDCL:
			case VOIDDCL:
				_localctx = new FuncDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				funcdcl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructdclContext extends ParserRuleContext {
		public StructdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structdcl; }
	 
		public StructdclContext() { }
		public void copyFrom(StructdclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructDclBlockNodeContext extends StructdclContext {
		public TerminalNode DOLLAR() { return getToken(SafeCTwoParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public StructblockContext structblock() {
			return getRuleContext(StructblockContext.class,0);
		}
		public StructDclBlockNodeContext(StructdclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStructDclBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStructDclBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStructDclBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructdclContext structdcl() throws RecognitionException {
		StructdclContext _localctx = new StructdclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structdcl);
		try {
			_localctx = new StructDclBlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(DOLLAR);
			setState(134);
			match(ID);
			setState(135);
			structblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructblockContext extends ParserRuleContext {
		public StructblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structblock; }
	 
		public StructblockContext() { }
		public void copyFrom(StructblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructBlockNodeContext extends StructblockContext {
		public TerminalNode LBRACE() { return getToken(SafeCTwoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SafeCTwoParser.RBRACE, 0); }
		public List<SafedeclarationContext> safedeclaration() {
			return getRuleContexts(SafedeclarationContext.class);
		}
		public SafedeclarationContext safedeclaration(int i) {
			return getRuleContext(SafedeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SafeCTwoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SafeCTwoParser.SEMI, i);
		}
		public StructBlockNodeContext(StructblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStructBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStructBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStructBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructblockContext structblock() throws RecognitionException {
		StructblockContext _localctx = new StructblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structblock);
		int _la;
		try {
			_localctx = new StructBlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(LBRACE);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				safedeclaration();
				setState(139);
				match(SEMI);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SAFETY );
			setState(145);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclassignsemiContext extends ParserRuleContext {
		public DclassignsemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclassignsemi; }
	 
		public DclassignsemiContext() { }
		public void copyFrom(DclassignsemiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SafeDeclVAssignNodeContext extends DclassignsemiContext {
		public TerminalNode SEMI() { return getToken(SafeCTwoParser.SEMI, 0); }
		public SafedeclarationContext safedeclaration() {
			return getRuleContext(SafedeclarationContext.class,0);
		}
		public VassignContext vassign() {
			return getRuleContext(VassignContext.class,0);
		}
		public SafeDeclVAssignNodeContext(DclassignsemiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterSafeDeclVAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitSafeDeclVAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitSafeDeclVAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclassignsemiContext dclassignsemi() throws RecognitionException {
		DclassignsemiContext _localctx = new DclassignsemiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dclassignsemi);
		try {
			_localctx = new SafeDeclVAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAFETY:
				{
				setState(147);
				safedeclaration();
				}
				break;
			case ID:
				{
				setState(148);
				vassign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclassignsemicommandContext extends ParserRuleContext {
		public DclassignsemicommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclassignsemicommand; }
	 
		public DclassignsemicommandContext() { }
		public void copyFrom(DclassignsemicommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DclAssignSemiCommandNodeContext extends DclassignsemicommandContext {
		public List<DclassignsemiContext> dclassignsemi() {
			return getRuleContexts(DclassignsemiContext.class);
		}
		public DclassignsemiContext dclassignsemi(int i) {
			return getRuleContext(DclassignsemiContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public DclAssignSemiCommandNodeContext(DclassignsemicommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterDclAssignSemiCommandNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitDclAssignSemiCommandNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitDclAssignSemiCommandNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclassignsemicommandContext dclassignsemicommand() throws RecognitionException {
		DclassignsemicommandContext _localctx = new DclassignsemicommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dclassignsemicommand);
		int _la;
		try {
			_localctx = new DclAssignSemiCommandNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILESTMT) | (1L << FORSTMT) | (1L << IFSTMT) | (1L << SWITCHSTMT) | (1L << ID) | (1L << SAFETY))) != 0)) {
				{
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(153);
					dclassignsemi();
					}
					break;
				case 2:
					{
					setState(154);
					command();
					}
					break;
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SafedeclarationContext extends ParserRuleContext {
		public SafedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safedeclaration; }
	 
		public SafedeclarationContext() { }
		public void copyFrom(SafedeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SafeDeclNodeContext extends SafedeclarationContext {
		public TerminalNode SAFETY() { return getToken(SafeCTwoParser.SAFETY, 0); }
		public VdclContext vdcl() {
			return getRuleContext(VdclContext.class,0);
		}
		public VdclassignContext vdclassign() {
			return getRuleContext(VdclassignContext.class,0);
		}
		public SafeDeclNodeContext(SafedeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterSafeDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitSafeDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitSafeDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafedeclarationContext safedeclaration() throws RecognitionException {
		SafedeclarationContext _localctx = new SafedeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_safedeclaration);
		try {
			_localctx = new SafeDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(SAFETY);
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(161);
				vdcl();
				}
				break;
			case 2:
				{
				setState(162);
				vdclassign();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamsNodeContext extends ParamsContext {
		public List<VdclContext> vdcl() {
			return getRuleContexts(VdclContext.class);
		}
		public VdclContext vdcl(int i) {
			return getRuleContext(VdclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SafeCTwoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafeCTwoParser.COMMA, i);
		}
		public ParamsNodeContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterParamsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitParamsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitParamsNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			_localctx = new ParamsNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			vdcl();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				vdcl();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockNodeContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(SafeCTwoParser.LBRACE, 0); }
		public DclassignsemicommandContext dclassignsemicommand() {
			return getRuleContext(DclassignsemicommandContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SafeCTwoParser.RBRACE, 0); }
		public BlockNodeContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			_localctx = new BlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LBRACE);
			setState(174);
			dclassignsemicommand();
			setState(175);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseblockContext extends ParserRuleContext {
		public CaseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseblock; }
	 
		public CaseblockContext() { }
		public void copyFrom(CaseblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseBlockNodeContext extends CaseblockContext {
		public DclassignsemicommandContext dclassignsemicommand() {
			return getRuleContext(DclassignsemicommandContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(SafeCTwoParser.BREAK, 0); }
		public CaseBlockNodeContext(CaseblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCaseBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCaseBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCaseBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseblockContext caseblock() throws RecognitionException {
		CaseblockContext _localctx = new CaseblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_caseblock);
		int _la;
		try {
			_localctx = new CaseBlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			dclassignsemicommand();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(178);
				match(BREAK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VdclContext extends ParserRuleContext {
		public VdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vdcl; }
	 
		public VdclContext() { }
		public void copyFrom(VdclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringVDclNodeContext extends VdclContext {
		public StringdeclContext stringdecl() {
			return getRuleContext(StringdeclContext.class,0);
		}
		public StringVDclNodeContext(VdclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringVDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringVDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringVDclNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolVDclNodeContext extends VdclContext {
		public BooldeclContext booldecl() {
			return getRuleContext(BooldeclContext.class,0);
		}
		public BoolVDclNodeContext(VdclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolVDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolVDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolVDclNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDclNodeContext extends VdclContext {
		public ArraydeclContext arraydecl() {
			return getRuleContext(ArraydeclContext.class,0);
		}
		public ArrayDclNodeContext(VdclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterArrayDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitArrayDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitArrayDclNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharVDclNodeContext extends VdclContext {
		public ChardeclContext chardecl() {
			return getRuleContext(ChardeclContext.class,0);
		}
		public CharVDclNodeContext(VdclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharVDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharVDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharVDclNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumVDclNodeContext extends VdclContext {
		public NumdeclContext numdecl() {
			return getRuleContext(NumdeclContext.class,0);
		}
		public NumVDclNodeContext(VdclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumVDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumVDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumVDclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdclContext vdcl() throws RecognitionException {
		VdclContext _localctx = new VdclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vdcl);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				_localctx = new NumVDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				numdecl();
				}
				break;
			case CHARDCL:
				_localctx = new CharVDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				chardecl();
				}
				break;
			case STRDCL:
				_localctx = new StringVDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				stringdecl();
				}
				break;
			case BOOLDCL:
				_localctx = new BoolVDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				booldecl();
				}
				break;
			case LBRACK:
				_localctx = new ArrayDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				arraydecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraydeclContext extends ParserRuleContext {
		public ArraydeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydecl; }
	 
		public ArraydeclContext() { }
		public void copyFrom(ArraydeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclNodeContext extends ArraydeclContext {
		public TerminalNode LBRACK() { return getToken(SafeCTwoParser.LBRACK, 0); }
		public ArrdcltypeContext arrdcltype() {
			return getRuleContext(ArrdcltypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SafeCTwoParser.RBRACK, 0); }
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public ArrayDeclNodeContext(ArraydeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterArrayDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitArrayDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitArrayDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydeclContext arraydecl() throws RecognitionException {
		ArraydeclContext _localctx = new ArraydeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arraydecl);
		try {
			_localctx = new ArrayDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LBRACK);
			setState(189);
			arrdcltype();
			setState(190);
			match(RBRACK);
			setState(191);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrdcltypeContext extends ParserRuleContext {
		public ArrdcltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrdcltype; }
	 
		public ArrdcltypeContext() { }
		public void copyFrom(ArrdcltypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDclTypeNumDclNodeContext extends ArrdcltypeContext {
		public TerminalNode NUMDCL() { return getToken(SafeCTwoParser.NUMDCL, 0); }
		public ArrayDclTypeNumDclNodeContext(ArrdcltypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterArrayDclTypeNumDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitArrayDclTypeNumDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitArrayDclTypeNumDclNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDclTypeBoolDclNodeContext extends ArrdcltypeContext {
		public TerminalNode BOOLDCL() { return getToken(SafeCTwoParser.BOOLDCL, 0); }
		public ArrayDclTypeBoolDclNodeContext(ArrdcltypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterArrayDclTypeBoolDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitArrayDclTypeBoolDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitArrayDclTypeBoolDclNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDclTypeCharDclNodeContext extends ArrdcltypeContext {
		public TerminalNode CHARDCL() { return getToken(SafeCTwoParser.CHARDCL, 0); }
		public ArrayDclTypeCharDclNodeContext(ArrdcltypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterArrayDclTypeCharDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitArrayDclTypeCharDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitArrayDclTypeCharDclNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDclTypeStringDclNodeContext extends ArrdcltypeContext {
		public TerminalNode STRDCL() { return getToken(SafeCTwoParser.STRDCL, 0); }
		public ArrayDclTypeStringDclNodeContext(ArrdcltypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterArrayDclTypeStringDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitArrayDclTypeStringDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitArrayDclTypeStringDclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrdcltypeContext arrdcltype() throws RecognitionException {
		ArrdcltypeContext _localctx = new ArrdcltypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrdcltype);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				_localctx = new ArrayDclTypeNumDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(NUMDCL);
				}
				break;
			case CHARDCL:
				_localctx = new ArrayDclTypeCharDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(CHARDCL);
				}
				break;
			case STRDCL:
				_localctx = new ArrayDclTypeStringDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(STRDCL);
				}
				break;
			case BOOLDCL:
				_localctx = new ArrayDclTypeBoolDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(BOOLDCL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VassignContext extends ParserRuleContext {
		public VassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vassign; }
	 
		public VassignContext() { }
		public void copyFrom(VassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VAssignNodeContext extends VassignContext {
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public AtypesContext atypes() {
			return getRuleContext(AtypesContext.class,0);
		}
		public VAssignNodeContext(VassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterVAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitVAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitVAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VassignContext vassign() throws RecognitionException {
		VassignContext _localctx = new VassignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vassign);
		try {
			_localctx = new VAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			match(ASSIGN);
			setState(201);
			atypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VdclassignContext extends ParserRuleContext {
		public VdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vdclassign; }
	 
		public VdclassignContext() { }
		public void copyFrom(VdclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolVDclAssignNodeContext extends VdclassignContext {
		public BooldclassignContext booldclassign() {
			return getRuleContext(BooldclassignContext.class,0);
		}
		public BoolVDclAssignNodeContext(VdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolVDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolVDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolVDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDclAssignNodeContext extends VdclassignContext {
		public ArraydclassignContext arraydclassign() {
			return getRuleContext(ArraydclassignContext.class,0);
		}
		public ArrayDclAssignNodeContext(VdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterArrayDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitArrayDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitArrayDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharVDclAssignNodeContext extends VdclassignContext {
		public ChardclassignContext chardclassign() {
			return getRuleContext(ChardclassignContext.class,0);
		}
		public CharVDclAssignNodeContext(VdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharVDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharVDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharVDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringVDclAssignNodeContext extends VdclassignContext {
		public StringdclassignContext stringdclassign() {
			return getRuleContext(StringdclassignContext.class,0);
		}
		public StringVDclAssignNodeContext(VdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringVDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringVDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringVDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumVDclAssignNodeContext extends VdclassignContext {
		public NumdclassignContext numdclassign() {
			return getRuleContext(NumdclassignContext.class,0);
		}
		public NumVDclAssignNodeContext(VdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumVDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumVDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumVDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdclassignContext vdclassign() throws RecognitionException {
		VdclassignContext _localctx = new VdclassignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vdclassign);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				_localctx = new NumVDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				numdclassign();
				}
				break;
			case CHARDCL:
				_localctx = new CharVDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				chardclassign();
				}
				break;
			case STRDCL:
				_localctx = new StringVDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				stringdclassign();
				}
				break;
			case BOOLDCL:
				_localctx = new BoolVDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				booldclassign();
				}
				break;
			case LBRACK:
				_localctx = new ArrayDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				arraydclassign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraydclassignContext extends ParserRuleContext {
		public ArraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydclassign; }
	 
		public ArraydclassignContext() { }
		public void copyFrom(ArraydclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringArrayDclAssignNodeContext extends ArraydclassignContext {
		public StringarraydclassignContext stringarraydclassign() {
			return getRuleContext(StringarraydclassignContext.class,0);
		}
		public StringArrayDclAssignNodeContext(ArraydclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringArrayDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringArrayDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringArrayDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharArrayDclAssignNodeContext extends ArraydclassignContext {
		public ChararraydclassignContext chararraydclassign() {
			return getRuleContext(ChararraydclassignContext.class,0);
		}
		public CharArrayDclAssignNodeContext(ArraydclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharArrayDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharArrayDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharArrayDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumArrayDclAssignNodeContext extends ArraydclassignContext {
		public NumarraydclassignContext numarraydclassign() {
			return getRuleContext(NumarraydclassignContext.class,0);
		}
		public NumArrayDclAssignNodeContext(ArraydclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumArrayDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumArrayDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumArrayDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolArrayDclAssignNodeContext extends ArraydclassignContext {
		public BoolarraydclassignContext boolarraydclassign() {
			return getRuleContext(BoolarraydclassignContext.class,0);
		}
		public BoolArrayDclAssignNodeContext(ArraydclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolArrayDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolArrayDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolArrayDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydclassignContext arraydclassign() throws RecognitionException {
		ArraydclassignContext _localctx = new ArraydclassignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arraydclassign);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new NumArrayDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				numarraydclassign();
				}
				break;
			case 2:
				_localctx = new CharArrayDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				chararraydclassign();
				}
				break;
			case 3:
				_localctx = new StringArrayDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				stringarraydclassign();
				}
				break;
			case 4:
				_localctx = new BoolArrayDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				boolarraydclassign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumarraydclassignContext extends ParserRuleContext {
		public NumarraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numarraydclassign; }
	 
		public NumarraydclassignContext() { }
		public void copyFrom(NumarraydclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumArrayDclAssignNumArrayNodeContext extends NumarraydclassignContext {
		public List<TerminalNode> LBRACK() { return getTokens(SafeCTwoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SafeCTwoParser.LBRACK, i);
		}
		public TerminalNode NUMDCL() { return getToken(SafeCTwoParser.NUMDCL, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(SafeCTwoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SafeCTwoParser.RBRACK, i);
		}
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public NumarrayContext numarray() {
			return getRuleContext(NumarrayContext.class,0);
		}
		public NumArrayDclAssignNumArrayNodeContext(NumarraydclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumArrayDclAssignNumArrayNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumArrayDclAssignNumArrayNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumArrayDclAssignNumArrayNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumarraydclassignContext numarraydclassign() throws RecognitionException {
		NumarraydclassignContext _localctx = new NumarraydclassignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numarraydclassign);
		try {
			_localctx = new NumArrayDclAssignNumArrayNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LBRACK);
			setState(217);
			match(NUMDCL);
			setState(218);
			match(RBRACK);
			setState(219);
			match(ID);
			setState(220);
			match(ASSIGN);
			setState(221);
			match(LBRACK);
			setState(222);
			numarray();
			setState(223);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChararraydclassignContext extends ParserRuleContext {
		public ChararraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chararraydclassign; }
	 
		public ChararraydclassignContext() { }
		public void copyFrom(ChararraydclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharArrayDclAssignCharArrayNodeContext extends ChararraydclassignContext {
		public List<TerminalNode> LBRACK() { return getTokens(SafeCTwoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SafeCTwoParser.LBRACK, i);
		}
		public TerminalNode CHARDCL() { return getToken(SafeCTwoParser.CHARDCL, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(SafeCTwoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SafeCTwoParser.RBRACK, i);
		}
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public ChararrayContext chararray() {
			return getRuleContext(ChararrayContext.class,0);
		}
		public CharArrayDclAssignCharArrayNodeContext(ChararraydclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharArrayDclAssignCharArrayNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharArrayDclAssignCharArrayNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharArrayDclAssignCharArrayNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChararraydclassignContext chararraydclassign() throws RecognitionException {
		ChararraydclassignContext _localctx = new ChararraydclassignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chararraydclassign);
		try {
			_localctx = new CharArrayDclAssignCharArrayNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LBRACK);
			setState(226);
			match(CHARDCL);
			setState(227);
			match(RBRACK);
			setState(228);
			match(ID);
			setState(229);
			match(ASSIGN);
			setState(230);
			match(LBRACK);
			setState(231);
			chararray();
			setState(232);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringarraydclassignContext extends ParserRuleContext {
		public StringarraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringarraydclassign; }
	 
		public StringarraydclassignContext() { }
		public void copyFrom(StringarraydclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringArrayDclAssignStringArrayNodeContext extends StringarraydclassignContext {
		public List<TerminalNode> LBRACK() { return getTokens(SafeCTwoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SafeCTwoParser.LBRACK, i);
		}
		public TerminalNode STRDCL() { return getToken(SafeCTwoParser.STRDCL, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(SafeCTwoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SafeCTwoParser.RBRACK, i);
		}
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public StrarrayContext strarray() {
			return getRuleContext(StrarrayContext.class,0);
		}
		public StringArrayDclAssignStringArrayNodeContext(StringarraydclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringArrayDclAssignStringArrayNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringArrayDclAssignStringArrayNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringArrayDclAssignStringArrayNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringarraydclassignContext stringarraydclassign() throws RecognitionException {
		StringarraydclassignContext _localctx = new StringarraydclassignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringarraydclassign);
		try {
			_localctx = new StringArrayDclAssignStringArrayNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(LBRACK);
			setState(235);
			match(STRDCL);
			setState(236);
			match(RBRACK);
			setState(237);
			match(ID);
			setState(238);
			match(ASSIGN);
			setState(239);
			match(LBRACK);
			setState(240);
			strarray();
			setState(241);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolarraydclassignContext extends ParserRuleContext {
		public BoolarraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolarraydclassign; }
	 
		public BoolarraydclassignContext() { }
		public void copyFrom(BoolarraydclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolArrayDclAssignBoolArrayNodeContext extends BoolarraydclassignContext {
		public List<TerminalNode> LBRACK() { return getTokens(SafeCTwoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SafeCTwoParser.LBRACK, i);
		}
		public TerminalNode BOOLDCL() { return getToken(SafeCTwoParser.BOOLDCL, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(SafeCTwoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SafeCTwoParser.RBRACK, i);
		}
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public BoolarrayContext boolarray() {
			return getRuleContext(BoolarrayContext.class,0);
		}
		public BoolArrayDclAssignBoolArrayNodeContext(BoolarraydclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolArrayDclAssignBoolArrayNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolArrayDclAssignBoolArrayNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolArrayDclAssignBoolArrayNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolarraydclassignContext boolarraydclassign() throws RecognitionException {
		BoolarraydclassignContext _localctx = new BoolarraydclassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolarraydclassign);
		try {
			_localctx = new BoolArrayDclAssignBoolArrayNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(LBRACK);
			setState(244);
			match(BOOLDCL);
			setState(245);
			match(RBRACK);
			setState(246);
			match(ID);
			setState(247);
			match(ASSIGN);
			setState(248);
			match(LBRACK);
			setState(249);
			boolarray();
			setState(250);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
	 
		public DatatypeContext() { }
		public void copyFrom(DatatypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumDclDatatypeNodeContext extends DatatypeContext {
		public TerminalNode NUMDCL() { return getToken(SafeCTwoParser.NUMDCL, 0); }
		public NumDclDatatypeNodeContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumDclDatatypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumDclDatatypeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumDclDatatypeNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolDclDatatypeNodeContext extends DatatypeContext {
		public TerminalNode BOOLDCL() { return getToken(SafeCTwoParser.BOOLDCL, 0); }
		public BoolDclDatatypeNodeContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolDclDatatypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolDclDatatypeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolDclDatatypeNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharDclDatatypeNodeContext extends DatatypeContext {
		public TerminalNode CHARDCL() { return getToken(SafeCTwoParser.CHARDCL, 0); }
		public CharDclDatatypeNodeContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharDclDatatypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharDclDatatypeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharDclDatatypeNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringDclDatatypeNodeContext extends DatatypeContext {
		public TerminalNode STRDCL() { return getToken(SafeCTwoParser.STRDCL, 0); }
		public StringDclDatatypeNodeContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringDclDatatypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringDclDatatypeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringDclDatatypeNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidDclDatatypeNodeContext extends DatatypeContext {
		public TerminalNode VOIDDCL() { return getToken(SafeCTwoParser.VOIDDCL, 0); }
		public VoidDclDatatypeNodeContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterVoidDclDatatypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitVoidDclDatatypeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitVoidDclDatatypeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_datatype);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				_localctx = new NumDclDatatypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(NUMDCL);
				}
				break;
			case CHARDCL:
				_localctx = new CharDclDatatypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(CHARDCL);
				}
				break;
			case STRDCL:
				_localctx = new StringDclDatatypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(STRDCL);
				}
				break;
			case BOOLDCL:
				_localctx = new BoolDclDatatypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(BOOLDCL);
				}
				break;
			case VOIDDCL:
				_localctx = new VoidDclDatatypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(VOIDDCL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtypesContext extends ParserRuleContext {
		public AtypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atypes; }
	 
		public AtypesContext() { }
		public void copyFrom(AtypesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ATypeBexprNodeContext extends AtypesContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public ATypeBexprNodeContext(AtypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterATypeBexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitATypeBexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitATypeBexprNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ATypeFuncCallsNodeContext extends AtypesContext {
		public FunccallsContext funccalls() {
			return getRuleContext(FunccallsContext.class,0);
		}
		public ATypeFuncCallsNodeContext(AtypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterATypeFuncCallsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitATypeFuncCallsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitATypeFuncCallsNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ATypeArrayAssignNodeContext extends AtypesContext {
		public ArrayassignContext arrayassign() {
			return getRuleContext(ArrayassignContext.class,0);
		}
		public ATypeArrayAssignNodeContext(AtypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterATypeArrayAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitATypeArrayAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitATypeArrayAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ATypeAexprNodeContext extends AtypesContext {
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public ATypeAexprNodeContext(AtypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterATypeAexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitATypeAexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitATypeAexprNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ATypeStrValNodeContext extends AtypesContext {
		public TerminalNode STRVAL() { return getToken(SafeCTwoParser.STRVAL, 0); }
		public ATypeStrValNodeContext(AtypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterATypeStrValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitATypeStrValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitATypeStrValNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ATypeCharValNodeContext extends AtypesContext {
		public TerminalNode CHARVAL() { return getToken(SafeCTwoParser.CHARVAL, 0); }
		public ATypeCharValNodeContext(AtypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterATypeCharValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitATypeCharValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitATypeCharValNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtypesContext atypes() throws RecognitionException {
		AtypesContext _localctx = new AtypesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atypes);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ATypeAexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				aexpr();
				}
				break;
			case 2:
				_localctx = new ATypeBexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				bexpr();
				}
				break;
			case 3:
				_localctx = new ATypeCharValNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(CHARVAL);
				}
				break;
			case 4:
				_localctx = new ATypeStrValNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(STRVAL);
				}
				break;
			case 5:
				_localctx = new ATypeFuncCallsNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				funccalls();
				}
				break;
			case 6:
				_localctx = new ATypeArrayAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				arrayassign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayassignContext extends ParserRuleContext {
		public ArrayassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayassign; }
	 
		public ArrayassignContext() { }
		public void copyFrom(ArrayassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssignNodeContext extends ArrayassignContext {
		public TerminalNode LBRACK() { return getToken(SafeCTwoParser.LBRACK, 0); }
		public ArraydataContext arraydata() {
			return getRuleContext(ArraydataContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SafeCTwoParser.RBRACK, 0); }
		public ArrayAssignNodeContext(ArrayassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterArrayAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitArrayAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitArrayAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayassignContext arrayassign() throws RecognitionException {
		ArrayassignContext _localctx = new ArrayassignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayassign);
		try {
			_localctx = new ArrayAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LBRACK);
			setState(268);
			arraydata();
			setState(269);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraydataContext extends ParserRuleContext {
		public ArraydataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydata; }
	 
		public ArraydataContext() { }
		public void copyFrom(ArraydataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharArrayDataNodeContext extends ArraydataContext {
		public ChararrayContext chararray() {
			return getRuleContext(ChararrayContext.class,0);
		}
		public CharArrayDataNodeContext(ArraydataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharArrayDataNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharArrayDataNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharArrayDataNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolArrayDataNodeContext extends ArraydataContext {
		public BoolarrayContext boolarray() {
			return getRuleContext(BoolarrayContext.class,0);
		}
		public BoolArrayDataNodeContext(ArraydataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolArrayDataNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolArrayDataNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolArrayDataNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringArrayDataNodeContext extends ArraydataContext {
		public StrarrayContext strarray() {
			return getRuleContext(StrarrayContext.class,0);
		}
		public StringArrayDataNodeContext(ArraydataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringArrayDataNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringArrayDataNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringArrayDataNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumArrayDataNodeContext extends ArraydataContext {
		public NumarrayContext numarray() {
			return getRuleContext(NumarrayContext.class,0);
		}
		public NumArrayDataNodeContext(ArraydataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumArrayDataNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumArrayDataNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumArrayDataNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydataContext arraydata() throws RecognitionException {
		ArraydataContext _localctx = new ArraydataContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arraydata);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case PI:
				_localctx = new NumArrayDataNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				numarray();
				}
				break;
			case CHARVAL:
				_localctx = new CharArrayDataNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				chararray();
				}
				break;
			case STRVAL:
				_localctx = new StringArrayDataNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				strarray();
				}
				break;
			case BOOLVAL:
				_localctx = new BoolArrayDataNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				boolarray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumarrayContext extends ParserRuleContext {
		public NumarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numarray; }
	 
		public NumarrayContext() { }
		public void copyFrom(NumarrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumArrayNodeContext extends NumarrayContext {
		public List<NumbervalContext> numberval() {
			return getRuleContexts(NumbervalContext.class);
		}
		public NumbervalContext numberval(int i) {
			return getRuleContext(NumbervalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SafeCTwoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafeCTwoParser.COMMA, i);
		}
		public NumArrayNodeContext(NumarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumArrayNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumArrayNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumArrayNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumarrayContext numarray() throws RecognitionException {
		NumarrayContext _localctx = new NumarrayContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numarray);
		int _la;
		try {
			_localctx = new NumArrayNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			numberval();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				numberval();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChararrayContext extends ParserRuleContext {
		public ChararrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chararray; }
	 
		public ChararrayContext() { }
		public void copyFrom(ChararrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharArrayNodeContext extends ChararrayContext {
		public List<TerminalNode> CHARVAL() { return getTokens(SafeCTwoParser.CHARVAL); }
		public TerminalNode CHARVAL(int i) {
			return getToken(SafeCTwoParser.CHARVAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SafeCTwoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafeCTwoParser.COMMA, i);
		}
		public CharArrayNodeContext(ChararrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharArrayNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharArrayNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharArrayNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChararrayContext chararray() throws RecognitionException {
		ChararrayContext _localctx = new ChararrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_chararray);
		int _la;
		try {
			_localctx = new CharArrayNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(CHARVAL);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				setState(287);
				match(CHARVAL);
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrarrayContext extends ParserRuleContext {
		public StrarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strarray; }
	 
		public StrarrayContext() { }
		public void copyFrom(StrarrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringArrayNodeContext extends StrarrayContext {
		public List<TerminalNode> STRVAL() { return getTokens(SafeCTwoParser.STRVAL); }
		public TerminalNode STRVAL(int i) {
			return getToken(SafeCTwoParser.STRVAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SafeCTwoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafeCTwoParser.COMMA, i);
		}
		public StringArrayNodeContext(StrarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringArrayNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringArrayNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringArrayNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrarrayContext strarray() throws RecognitionException {
		StrarrayContext _localctx = new StrarrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_strarray);
		int _la;
		try {
			_localctx = new StringArrayNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(STRVAL);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				match(STRVAL);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolarrayContext extends ParserRuleContext {
		public BoolarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolarray; }
	 
		public BoolarrayContext() { }
		public void copyFrom(BoolarrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolArrayNodeContext extends BoolarrayContext {
		public List<TerminalNode> BOOLVAL() { return getTokens(SafeCTwoParser.BOOLVAL); }
		public TerminalNode BOOLVAL(int i) {
			return getToken(SafeCTwoParser.BOOLVAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SafeCTwoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafeCTwoParser.COMMA, i);
		}
		public BoolArrayNodeContext(BoolarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolArrayNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolArrayNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolArrayNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolarrayContext boolarray() throws RecognitionException {
		BoolarrayContext _localctx = new BoolarrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolarray);
		int _la;
		try {
			_localctx = new BoolArrayNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(BOOLVAL);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302);
				match(COMMA);
				setState(303);
				match(BOOLVAL);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctioncallsNodeContext extends CommandContext {
		public FunccallsContext funccalls() {
			return getRuleContext(FunccallsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SafeCTwoParser.SEMI, 0); }
		public FunctioncallsNodeContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterFunctioncallsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitFunctioncallsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitFunctioncallsNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ControlstructNodeContext extends CommandContext {
		public CtrlstructContext ctrlstruct() {
			return getRuleContext(CtrlstructContext.class,0);
		}
		public ControlstructNodeContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterControlstructNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitControlstructNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitControlstructNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_command);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILESTMT:
			case FORSTMT:
			case IFSTMT:
			case SWITCHSTMT:
				_localctx = new ControlstructNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				ctrlstruct();
				}
				break;
			case ID:
				_localctx = new FunctioncallsNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				funccalls();
				setState(311);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunccallsContext extends ParserRuleContext {
		public FunccallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccalls; }
	 
		public FunccallsContext() { }
		public void copyFrom(FunccallsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallParametersNodeContext extends FunccallsContext {
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(SafeCTwoParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SafeCTwoParser.RPAR, 0); }
		public CallparamsContext callparams() {
			return getRuleContext(CallparamsContext.class,0);
		}
		public CallParametersNodeContext(FunccallsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCallParametersNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCallParametersNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCallParametersNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallsContext funccalls() throws RecognitionException {
		FunccallsContext _localctx = new FunccallsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_funccalls);
		int _la;
		try {
			_localctx = new CallParametersNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(316);
			match(LPAR);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVAL) | (1L << NUMVAL) | (1L << CHARVAL) | (1L << STRVAL) | (1L << ID) | (1L << PI))) != 0)) {
				{
				setState(317);
				callparams();
				}
			}

			setState(320);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdclContext extends ParserRuleContext {
		public FuncdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdcl; }
	 
		public FuncdclContext() { }
		public void copyFrom(FuncdclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDclBlockNodeContext extends FuncdclContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(SafeCTwoParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SafeCTwoParser.RPAR, 0); }
		public FuncblockContext funcblock() {
			return getRuleContext(FuncblockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncDclBlockNodeContext(FuncdclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterFuncDclBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitFuncDclBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitFuncDclBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdclContext funcdcl() throws RecognitionException {
		FuncdclContext _localctx = new FuncdclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_funcdcl);
		int _la;
		try {
			_localctx = new FuncDclBlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			datatype();
			setState(323);
			match(ID);
			setState(324);
			match(LPAR);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMDCL) | (1L << CHARDCL) | (1L << STRDCL) | (1L << BOOLDCL) | (1L << LBRACK))) != 0)) {
				{
				setState(325);
				params();
				}
			}

			setState(328);
			match(RPAR);
			setState(329);
			funcblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncblockContext extends ParserRuleContext {
		public FuncblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcblock; }
	 
		public FuncblockContext() { }
		public void copyFrom(FuncblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncBlockNodeContext extends FuncblockContext {
		public TerminalNode LBRACE() { return getToken(SafeCTwoParser.LBRACE, 0); }
		public DclassignsemicommandContext dclassignsemicommand() {
			return getRuleContext(DclassignsemicommandContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SafeCTwoParser.RETURN, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SafeCTwoParser.SEMI, 0); }
		public TerminalNode RBRACE() { return getToken(SafeCTwoParser.RBRACE, 0); }
		public FuncBlockNodeContext(FuncblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterFuncBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitFuncBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitFuncBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncblockContext funcblock() throws RecognitionException {
		FuncblockContext _localctx = new FuncblockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcblock);
		try {
			_localctx = new FuncBlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(LBRACE);
			setState(332);
			dclassignsemicommand();
			setState(333);
			match(RETURN);
			setState(334);
			vals();
			setState(335);
			match(SEMI);
			setState(336);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallparamsContext extends ParserRuleContext {
		public CallparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callparams; }
	 
		public CallparamsContext() { }
		public void copyFrom(CallparamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallParamsValsNodeContext extends CallparamsContext {
		public List<ValsContext> vals() {
			return getRuleContexts(ValsContext.class);
		}
		public ValsContext vals(int i) {
			return getRuleContext(ValsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SafeCTwoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafeCTwoParser.COMMA, i);
		}
		public CallParamsValsNodeContext(CallparamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCallParamsValsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCallParamsValsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCallParamsValsNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallparamsContext callparams() throws RecognitionException {
		CallparamsContext _localctx = new CallparamsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_callparams);
		int _la;
		try {
			_localctx = new CallParamsValsNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			vals();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(339);
				match(COMMA);
				setState(340);
				vals();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtrlstructContext extends ParserRuleContext {
		public CtrlstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrlstruct; }
	 
		public CtrlstructContext() { }
		public void copyFrom(CtrlstructContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IterativeNodeContext extends CtrlstructContext {
		public IterativeContext iterative() {
			return getRuleContext(IterativeContext.class,0);
		}
		public IterativeNodeContext(CtrlstructContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterIterativeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitIterativeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitIterativeNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectiveNodeContext extends CtrlstructContext {
		public SelectiveContext selective() {
			return getRuleContext(SelectiveContext.class,0);
		}
		public SelectiveNodeContext(CtrlstructContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterSelectiveNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitSelectiveNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitSelectiveNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtrlstructContext ctrlstruct() throws RecognitionException {
		CtrlstructContext _localctx = new CtrlstructContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ctrlstruct);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSTMT:
			case SWITCHSTMT:
				_localctx = new SelectiveNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				selective();
				}
				break;
			case WHILESTMT:
			case FORSTMT:
				_localctx = new IterativeNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				iterative();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterativeContext extends ParserRuleContext {
		public IterativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative; }
	 
		public IterativeContext() { }
		public void copyFrom(IterativeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStmtNodeContext extends IterativeContext {
		public TerminalNode FORSTMT() { return getToken(SafeCTwoParser.FORSTMT, 0); }
		public TerminalNode LPAR() { return getToken(SafeCTwoParser.LPAR, 0); }
		public ForparamsContext forparams() {
			return getRuleContext(ForparamsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafeCTwoParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtNodeContext(IterativeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterForStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitForStmtNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitForStmtNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtNodeContext extends IterativeContext {
		public TerminalNode WHILESTMT() { return getToken(SafeCTwoParser.WHILESTMT, 0); }
		public TerminalNode LPAR() { return getToken(SafeCTwoParser.LPAR, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafeCTwoParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtNodeContext(IterativeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterWhileStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitWhileStmtNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitWhileStmtNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_iterative);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORSTMT:
				_localctx = new ForStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(FORSTMT);
				setState(351);
				match(LPAR);
				setState(352);
				forparams();
				setState(353);
				match(RPAR);
				setState(354);
				block();
				}
				break;
			case WHILESTMT:
				_localctx = new WhileStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(WHILESTMT);
				setState(357);
				match(LPAR);
				setState(358);
				bexpr();
				setState(359);
				match(RPAR);
				setState(360);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectiveContext extends ParserRuleContext {
		public SelectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selective; }
	 
		public SelectiveContext() { }
		public void copyFrom(SelectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SwitchStmtNodeContext extends SelectiveContext {
		public TerminalNode SWITCHSTMT() { return getToken(SafeCTwoParser.SWITCHSTMT, 0); }
		public TerminalNode LPAR() { return getToken(SafeCTwoParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(SafeCTwoParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SafeCTwoParser.LBRACE, 0); }
		public DefcaseContext defcase() {
			return getRuleContext(DefcaseContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SafeCTwoParser.RBRACE, 0); }
		public List<ScaseContext> scase() {
			return getRuleContexts(ScaseContext.class);
		}
		public ScaseContext scase(int i) {
			return getRuleContext(ScaseContext.class,i);
		}
		public SwitchStmtNodeContext(SelectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterSwitchStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitSwitchStmtNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitSwitchStmtNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtNodeContext extends SelectiveContext {
		public TerminalNode IFSTMT() { return getToken(SafeCTwoParser.IFSTMT, 0); }
		public IflogicContext iflogic() {
			return getRuleContext(IflogicContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SafeCTwoParser.ELSE, 0); }
		public IfStmtNodeContext(SelectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterIfStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitIfStmtNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitIfStmtNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selective);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSTMT:
				_localctx = new IfStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(IFSTMT);
				setState(365);
				iflogic();
				setState(366);
				block();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(367);
					match(ELSE);
					setState(368);
					block();
					}
				}

				}
				break;
			case SWITCHSTMT:
				_localctx = new SwitchStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(SWITCHSTMT);
				setState(372);
				match(LPAR);
				setState(373);
				match(ID);
				setState(374);
				match(RPAR);
				setState(375);
				match(LBRACE);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(376);
					scase();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
				defcase();
				setState(383);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IflogicContext extends ParserRuleContext {
		public IflogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iflogic; }
	 
		public IflogicContext() { }
		public void copyFrom(IflogicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BtermNodeContext extends IflogicContext {
		public TerminalNode LPAR() { return getToken(SafeCTwoParser.LPAR, 0); }
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafeCTwoParser.RPAR, 0); }
		public BtermNodeContext(IflogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBtermNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBtermNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBtermNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IflogicContext iflogic() throws RecognitionException {
		IflogicContext _localctx = new IflogicContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_iflogic);
		try {
			_localctx = new BtermNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(LPAR);
			setState(388);
			bterm();
			setState(389);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForparamsContext extends ParserRuleContext {
		public ForparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forparams; }
	 
		public ForparamsContext() { }
		public void copyFrom(ForparamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForParamsNodeContext extends ForparamsContext {
		public NumdclassignContext numdclassign() {
			return getRuleContext(NumdclassignContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(SafeCTwoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SafeCTwoParser.SEMI, i);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public ForParamsNodeContext(ForparamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterForParamsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitForParamsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitForParamsNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForparamsContext forparams() throws RecognitionException {
		ForparamsContext _localctx = new ForparamsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forparams);
		try {
			_localctx = new ForParamsNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			numdclassign();
			setState(392);
			match(SEMI);
			setState(393);
			bexpr();
			setState(394);
			match(SEMI);
			setState(395);
			match(ID);
			setState(396);
			match(ASSIGN);
			setState(397);
			aexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaseContext extends ParserRuleContext {
		public ScaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scase; }
	 
		public ScaseContext() { }
		public void copyFrom(ScaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SCaseNodeContext extends ScaseContext {
		public TerminalNode CASE() { return getToken(SafeCTwoParser.CASE, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SafeCTwoParser.COLON, 0); }
		public CaseblockContext caseblock() {
			return getRuleContext(CaseblockContext.class,0);
		}
		public SCaseNodeContext(ScaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterSCaseNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitSCaseNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitSCaseNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaseContext scase() throws RecognitionException {
		ScaseContext _localctx = new ScaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_scase);
		try {
			_localctx = new SCaseNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(CASE);
			setState(400);
			vals();
			setState(401);
			match(COLON);
			setState(402);
			caseblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefcaseContext extends ParserRuleContext {
		public DefcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcase; }
	 
		public DefcaseContext() { }
		public void copyFrom(DefcaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefCaseNodeContext extends DefcaseContext {
		public TerminalNode DEFAULT() { return getToken(SafeCTwoParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(SafeCTwoParser.COLON, 0); }
		public CaseblockContext caseblock() {
			return getRuleContext(CaseblockContext.class,0);
		}
		public DefCaseNodeContext(DefcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterDefCaseNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitDefCaseNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitDefCaseNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcaseContext defcase() throws RecognitionException {
		DefcaseContext _localctx = new DefcaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_defcase);
		try {
			_localctx = new DefCaseNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(DEFAULT);
			setState(405);
			match(COLON);
			setState(406);
			caseblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumdeclContext extends ParserRuleContext {
		public NumdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdecl; }
	 
		public NumdeclContext() { }
		public void copyFrom(NumdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumDeclNodeContext extends NumdeclContext {
		public TerminalNode NUMDCL() { return getToken(SafeCTwoParser.NUMDCL, 0); }
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public NumDeclNodeContext(NumdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdeclContext numdecl() throws RecognitionException {
		NumdeclContext _localctx = new NumdeclContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_numdecl);
		try {
			_localctx = new NumDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(NUMDCL);
			setState(409);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooldeclContext extends ParserRuleContext {
		public BooldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldecl; }
	 
		public BooldeclContext() { }
		public void copyFrom(BooldeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolDeclNodeContext extends BooldeclContext {
		public TerminalNode BOOLDCL() { return getToken(SafeCTwoParser.BOOLDCL, 0); }
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public BoolDeclNodeContext(BooldeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldeclContext booldecl() throws RecognitionException {
		BooldeclContext _localctx = new BooldeclContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booldecl);
		try {
			_localctx = new BoolDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(BOOLDCL);
			setState(412);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChardeclContext extends ParserRuleContext {
		public ChardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardecl; }
	 
		public ChardeclContext() { }
		public void copyFrom(ChardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharDeclNodeContext extends ChardeclContext {
		public TerminalNode CHARDCL() { return getToken(SafeCTwoParser.CHARDCL, 0); }
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public CharDeclNodeContext(ChardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardeclContext chardecl() throws RecognitionException {
		ChardeclContext _localctx = new ChardeclContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_chardecl);
		try {
			_localctx = new CharDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(CHARDCL);
			setState(415);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringdeclContext extends ParserRuleContext {
		public StringdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdecl; }
	 
		public StringdeclContext() { }
		public void copyFrom(StringdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringDeclNodeContext extends StringdeclContext {
		public TerminalNode STRDCL() { return getToken(SafeCTwoParser.STRDCL, 0); }
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public StringDeclNodeContext(StringdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdeclContext stringdecl() throws RecognitionException {
		StringdeclContext _localctx = new StringdeclContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_stringdecl);
		try {
			_localctx = new StringDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(STRDCL);
			setState(418);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumdclassignContext extends ParserRuleContext {
		public NumdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdclassign; }
	 
		public NumdclassignContext() { }
		public void copyFrom(NumdclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumDclAssignNodeContext extends NumdclassignContext {
		public NumdeclContext numdecl() {
			return getRuleContext(NumdeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public NumDclAssignNodeContext(NumdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdclassignContext numdclassign() throws RecognitionException {
		NumdclassignContext _localctx = new NumdclassignContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_numdclassign);
		try {
			_localctx = new NumDclAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			numdecl();
			setState(421);
			match(ASSIGN);
			setState(422);
			aexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChardclassignContext extends ParserRuleContext {
		public ChardclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardclassign; }
	 
		public ChardclassignContext() { }
		public void copyFrom(ChardclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharDclAssignNodeContext extends ChardclassignContext {
		public ChardeclContext chardecl() {
			return getRuleContext(ChardeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public TerminalNode CHARVAL() { return getToken(SafeCTwoParser.CHARVAL, 0); }
		public CharDclAssignNodeContext(ChardclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterCharDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitCharDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitCharDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardclassignContext chardclassign() throws RecognitionException {
		ChardclassignContext _localctx = new ChardclassignContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_chardclassign);
		try {
			_localctx = new CharDclAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			chardecl();
			setState(425);
			match(ASSIGN);
			setState(426);
			match(CHARVAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringdclassignContext extends ParserRuleContext {
		public StringdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdclassign; }
	 
		public StringdclassignContext() { }
		public void copyFrom(StringdclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringDclAssignNodeContext extends StringdclassignContext {
		public StringdeclContext stringdecl() {
			return getRuleContext(StringdeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public TerminalNode STRVAL() { return getToken(SafeCTwoParser.STRVAL, 0); }
		public StringDclAssignNodeContext(StringdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterStringDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitStringDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitStringDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdclassignContext stringdclassign() throws RecognitionException {
		StringdclassignContext _localctx = new StringdclassignContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_stringdclassign);
		try {
			_localctx = new StringDclAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			stringdecl();
			setState(429);
			match(ASSIGN);
			setState(430);
			match(STRVAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooldclassignContext extends ParserRuleContext {
		public BooldclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldclassign; }
	 
		public BooldclassignContext() { }
		public void copyFrom(BooldclassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolDclAssignNodeContext extends BooldclassignContext {
		public BooldeclContext booldecl() {
			return getRuleContext(BooldeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SafeCTwoParser.ASSIGN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolDclAssignNodeContext(BooldclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldclassignContext booldclassign() throws RecognitionException {
		BooldclassignContext _localctx = new BooldclassignContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_booldclassign);
		try {
			_localctx = new BoolDclAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			booldecl();
			setState(433);
			match(ASSIGN);
			setState(434);
			bexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BexprContext extends ParserRuleContext {
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
	 
		public BexprContext() { }
		public void copyFrom(BexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolValNodeContext extends BexprContext {
		public TerminalNode BOOLVAL() { return getToken(SafeCTwoParser.BOOLVAL, 0); }
		public BoolValNodeContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBoolValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBoolValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBoolValNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BexprNodeContext extends BexprContext {
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public BexprNodeContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBexprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bexpr);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new BoolValNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(BOOLVAL);
				}
				break;
			case 2:
				_localctx = new BexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				bterm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BtermContext extends ParserRuleContext {
		public BtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bterm; }
	 
		public BtermContext() { }
		public void copyFrom(BtermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BPartNodeContext extends BtermContext {
		public BpartContext bpart() {
			return getRuleContext(BpartContext.class,0);
		}
		public BPartNodeContext(BtermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBPartNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BTermNodeContext extends BtermContext {
		public List<PartboolContext> partbool() {
			return getRuleContexts(PartboolContext.class);
		}
		public PartboolContext partbool(int i) {
			return getRuleContext(PartboolContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public BTermNodeContext(BtermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBTermNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBTermNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBTermNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtermContext bterm() throws RecognitionException {
		BtermContext _localctx = new BtermContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bterm);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new BTermNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				partbool();
				setState(441);
				relop();
				setState(442);
				partbool();
				}
				break;
			case 2:
				_localctx = new BPartNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				bpart();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BpartContext extends ParserRuleContext {
		public BpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bpart; }
	 
		public BpartContext() { }
		public void copyFrom(BpartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BpartNodeContext extends BpartContext {
		public List<BpieceContext> bpiece() {
			return getRuleContexts(BpieceContext.class);
		}
		public BpieceContext bpiece(int i) {
			return getRuleContext(BpieceContext.class,i);
		}
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public BpartNodeContext(BpartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBpartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBpartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBpartNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BPieceNodeContext extends BpartContext {
		public BpieceContext bpiece() {
			return getRuleContext(BpieceContext.class,0);
		}
		public BPieceNodeContext(BpartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBPieceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBPieceNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBPieceNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpartContext bpart() throws RecognitionException {
		BpartContext _localctx = new BpartContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bpart);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new BpartNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				bpiece();
				setState(448);
				bop();
				setState(449);
				bpiece();
				}
				break;
			case 2:
				_localctx = new BPieceNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				bpiece();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BpieceContext extends ParserRuleContext {
		public BpieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bpiece; }
	 
		public BpieceContext() { }
		public void copyFrom(BpieceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotNodeContext extends BpieceContext {
		public TerminalNode NOT() { return getToken(SafeCTwoParser.NOT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public NotNodeContext(BpieceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNotNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNotNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNotNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlastNodeContext extends BpieceContext {
		public BlastContext blast() {
			return getRuleContext(BlastContext.class,0);
		}
		public BlastNodeContext(BpieceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterBlastNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitBlastNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitBlastNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpieceContext bpiece() throws RecognitionException {
		BpieceContext _localctx = new BpieceContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_bpiece);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(NOT);
				setState(455);
				bexpr();
				}
				break;
			case ID:
			case LPAR:
				_localctx = new BlastNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				blast();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlastContext extends ParserRuleContext {
		public BlastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blast; }
	 
		public BlastContext() { }
		public void copyFrom(BlastContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdBlastNodeContext extends BlastContext {
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public IdBlastNodeContext(BlastContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterIdBlastNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitIdBlastNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitIdBlastNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParexprNodeContext extends BlastContext {
		public TerminalNode LPAR() { return getToken(SafeCTwoParser.LPAR, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafeCTwoParser.RPAR, 0); }
		public ParexprNodeContext(BlastContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterParexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitParexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitParexprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlastContext blast() throws RecognitionException {
		BlastContext _localctx = new BlastContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_blast);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new ParexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(LPAR);
				setState(460);
				bexpr();
				setState(461);
				match(RPAR);
				}
				break;
			case ID:
				_localctx = new IdBlastNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AexprContext extends ParserRuleContext {
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
	 
		public AexprContext() { }
		public void copyFrom(AexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermNodeContext extends AexprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SafeCTwoParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SafeCTwoParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SafeCTwoParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SafeCTwoParser.MINUS, i);
		}
		public TermNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterTermNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitTermNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitTermNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_aexpr);
		int _la;
		try {
			_localctx = new TermNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			term();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(467);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(468);
				term();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartNodeContext extends TermContext {
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(SafeCTwoParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(SafeCTwoParser.TIMES, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(SafeCTwoParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(SafeCTwoParser.DIVISION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SafeCTwoParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SafeCTwoParser.MOD, i);
		}
		public PartNodeContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitPartNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_term);
		int _la;
		try {
			_localctx = new PartNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			part();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(475);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(476);
				part();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartContext extends ParserRuleContext {
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
	 
		public PartContext() { }
		public void copyFrom(PartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdPartNodeContext extends PartContext {
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public IdPartNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterIdPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitIdPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitIdPartNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartAexprNodeContext extends PartContext {
		public TerminalNode LPAR() { return getToken(SafeCTwoParser.LPAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafeCTwoParser.RPAR, 0); }
		public PartAexprNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterPartAexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitPartAexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitPartAexprNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberValNodeContext extends PartContext {
		public NumbervalContext numberval() {
			return getRuleContext(NumbervalContext.class,0);
		}
		public NumberValNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumberValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumberValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumberValNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_part);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new PartAexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(LPAR);
				setState(483);
				aexpr();
				setState(484);
				match(RPAR);
				}
				break;
			case ID:
				_localctx = new IdPartNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(ID);
				}
				break;
			case NUMVAL:
			case PI:
				_localctx = new NumberValNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				numberval();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartboolContext extends ParserRuleContext {
		public PartboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partbool; }
	 
		public PartboolContext() { }
		public void copyFrom(PartboolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartBoolNodeContext extends PartboolContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(SafeCTwoParser.BOOLVAL, 0); }
		public PartBoolNodeContext(PartboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterPartBoolNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitPartBoolNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitPartBoolNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartboolContext partbool() throws RecognitionException {
		PartboolContext _localctx = new PartboolContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_partbool);
		try {
			_localctx = new PartBoolNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case ID:
			case PI:
			case LPAR:
				{
				setState(490);
				part();
				}
				break;
			case BOOLVAL:
				{
				setState(491);
				match(BOOLVAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BopContext extends ParserRuleContext {
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
	 
		public BopContext() { }
		public void copyFrom(BopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndNodeContext extends BopContext {
		public TerminalNode AND() { return getToken(SafeCTwoParser.AND, 0); }
		public AndNodeContext(BopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterAndNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitAndNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitAndNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrNodeContext extends BopContext {
		public TerminalNode OR() { return getToken(SafeCTwoParser.OR, 0); }
		public OrNodeContext(BopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterOrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitOrNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitOrNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_bop);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValsContext extends ParserRuleContext {
		public ValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vals; }
	 
		public ValsContext() { }
		public void copyFrom(ValsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValsStrValsNodeContext extends ValsContext {
		public TerminalNode STRVAL() { return getToken(SafeCTwoParser.STRVAL, 0); }
		public ValsStrValsNodeContext(ValsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterValsStrValsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitValsStrValsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitValsStrValsNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValsBoolValsNodeContext extends ValsContext {
		public TerminalNode BOOLVAL() { return getToken(SafeCTwoParser.BOOLVAL, 0); }
		public ValsBoolValsNodeContext(ValsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterValsBoolValsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitValsBoolValsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitValsBoolValsNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValsNumberValsNodeContext extends ValsContext {
		public NumbervalContext numberval() {
			return getRuleContext(NumbervalContext.class,0);
		}
		public ValsNumberValsNodeContext(ValsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterValsNumberValsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitValsNumberValsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitValsNumberValsNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValsCharValsNodeContext extends ValsContext {
		public TerminalNode CHARVAL() { return getToken(SafeCTwoParser.CHARVAL, 0); }
		public ValsCharValsNodeContext(ValsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterValsCharValsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitValsCharValsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitValsCharValsNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValsIdValsNodeContext extends ValsContext {
		public TerminalNode ID() { return getToken(SafeCTwoParser.ID, 0); }
		public ValsIdValsNodeContext(ValsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterValsIdValsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitValsIdValsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitValsIdValsNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValsContext vals() throws RecognitionException {
		ValsContext _localctx = new ValsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_vals);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case PI:
				_localctx = new ValsNumberValsNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				numberval();
				}
				break;
			case CHARVAL:
				_localctx = new ValsCharValsNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(CHARVAL);
				}
				break;
			case STRVAL:
				_localctx = new ValsStrValsNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(STRVAL);
				}
				break;
			case BOOLVAL:
				_localctx = new ValsBoolValsNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				match(BOOLVAL);
				}
				break;
			case ID:
				_localctx = new ValsIdValsNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumbervalContext extends ParserRuleContext {
		public NumbervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberval; }
	 
		public NumbervalContext() { }
		public void copyFrom(NumbervalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumValNodeContext extends NumbervalContext {
		public TerminalNode NUMVAL() { return getToken(SafeCTwoParser.NUMVAL, 0); }
		public NumValNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNumValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNumValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNumValNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PiNodeContext extends NumbervalContext {
		public TerminalNode PI() { return getToken(SafeCTwoParser.PI, 0); }
		public PiNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterPiNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitPiNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitPiNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbervalContext numberval() throws RecognitionException {
		NumbervalContext _localctx = new NumbervalContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_numberval);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
				_localctx = new NumValNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(NUMVAL);
				}
				break;
			case PI:
				_localctx = new PiNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(PI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	 
		public RelopContext() { }
		public void copyFrom(RelopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterEqualNodeContext extends RelopContext {
		public TerminalNode GEQ() { return getToken(SafeCTwoParser.GEQ, 0); }
		public GreaterEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterGreaterEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitGreaterEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitGreaterEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterNodeContext extends RelopContext {
		public TerminalNode GREATER() { return getToken(SafeCTwoParser.GREATER, 0); }
		public GreaterNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterGreaterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitGreaterNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitGreaterNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserEqualNodeContext extends RelopContext {
		public TerminalNode LEQ() { return getToken(SafeCTwoParser.LEQ, 0); }
		public LesserEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterLesserEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitLesserEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitLesserEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualNodeContext extends RelopContext {
		public TerminalNode EQ() { return getToken(SafeCTwoParser.EQ, 0); }
		public EqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualNodeContext extends RelopContext {
		public TerminalNode NEQ() { return getToken(SafeCTwoParser.NEQ, 0); }
		public NotEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterNotEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitNotEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitNotEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserNodeContext extends RelopContext {
		public TerminalNode LESS() { return getToken(SafeCTwoParser.LESS, 0); }
		public LesserNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).enterLesserNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeCTwoListener ) ((SafeCTwoListener)listener).exitLesserNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafeCTwoVisitor ) return ((SafeCTwoVisitor<? extends T>)visitor).visitLesserNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_relop);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(EQ);
				}
				break;
			case NEQ:
				_localctx = new NotEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(NEQ);
				}
				break;
			case GEQ:
				_localctx = new GreaterEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(GEQ);
				}
				break;
			case LEQ:
				_localctx = new LesserEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				match(LEQ);
				}
				break;
			case LESS:
				_localctx = new LesserNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				match(LESS);
				}
				break;
			case GREATER:
				_localctx = new GreaterNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(514);
				match(GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0208\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\7\2~\n\2\f\2\16\2\u0081\13\2\3\3\3\3\3\3\5\3\u0086\n\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\u0090\n\5\r\5\16\5\u0091\3\5\3\5\3\6"+
		"\3\6\5\6\u0098\n\6\3\6\3\6\3\7\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3"+
		"\b\3\b\3\b\5\b\u00a6\n\b\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00b6\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00bd"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\21"+
		"\5\21\u00d9\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0104\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010c\n"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0116\n\31\3\32\3\32"+
		"\3\32\7\32\u011b\n\32\f\32\16\32\u011e\13\32\3\33\3\33\3\33\7\33\u0123"+
		"\n\33\f\33\16\33\u0126\13\33\3\34\3\34\3\34\7\34\u012b\n\34\f\34\16\34"+
		"\u012e\13\34\3\35\3\35\3\35\7\35\u0133\n\35\f\35\16\35\u0136\13\35\3\36"+
		"\3\36\3\36\3\36\5\36\u013c\n\36\3\37\3\37\3\37\5\37\u0141\n\37\3\37\3"+
		"\37\3 \3 \3 \3 \5 \u0149\n \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\7\"\u0158\n\"\f\"\16\"\u015b\13\"\3#\3#\5#\u015f\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u016d\n$\3%\3%\3%\3%\3%\5%\u0174\n%\3%\3%\3%\3"+
		"%\3%\3%\7%\u017c\n%\f%\16%\u017f\13%\3%\3%\3%\5%\u0184\n%\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\5\62\u01b9\n\62\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u01c0\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u01c7\n\64\3\65\3\65\3"+
		"\65\5\65\u01cc\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u01d3\n\66\3\67\3\67"+
		"\3\67\7\67\u01d8\n\67\f\67\16\67\u01db\13\67\38\38\38\78\u01e0\n8\f8\16"+
		"8\u01e3\138\39\39\39\39\39\39\59\u01eb\n9\3:\3:\5:\u01ef\n:\3;\3;\5;\u01f3"+
		"\n;\3<\3<\3<\3<\3<\5<\u01fa\n<\3=\3=\5=\u01fe\n=\3>\3>\3>\3>\3>\3>\5>"+
		"\u0206\n>\3>\2\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\4\3\2\27\30\4\2\31\32\35\35"+
		"\2\u0210\2\177\3\2\2\2\4\u0085\3\2\2\2\6\u0087\3\2\2\2\b\u008b\3\2\2\2"+
		"\n\u0097\3\2\2\2\f\u009f\3\2\2\2\16\u00a2\3\2\2\2\20\u00a7\3\2\2\2\22"+
		"\u00af\3\2\2\2\24\u00b3\3\2\2\2\26\u00bc\3\2\2\2\30\u00be\3\2\2\2\32\u00c7"+
		"\3\2\2\2\34\u00c9\3\2\2\2\36\u00d2\3\2\2\2 \u00d8\3\2\2\2\"\u00da\3\2"+
		"\2\2$\u00e3\3\2\2\2&\u00ec\3\2\2\2(\u00f5\3\2\2\2*\u0103\3\2\2\2,\u010b"+
		"\3\2\2\2.\u010d\3\2\2\2\60\u0115\3\2\2\2\62\u0117\3\2\2\2\64\u011f\3\2"+
		"\2\2\66\u0127\3\2\2\28\u012f\3\2\2\2:\u013b\3\2\2\2<\u013d\3\2\2\2>\u0144"+
		"\3\2\2\2@\u014d\3\2\2\2B\u0154\3\2\2\2D\u015e\3\2\2\2F\u016c\3\2\2\2H"+
		"\u0183\3\2\2\2J\u0185\3\2\2\2L\u0189\3\2\2\2N\u0191\3\2\2\2P\u0196\3\2"+
		"\2\2R\u019a\3\2\2\2T\u019d\3\2\2\2V\u01a0\3\2\2\2X\u01a3\3\2\2\2Z\u01a6"+
		"\3\2\2\2\\\u01aa\3\2\2\2^\u01ae\3\2\2\2`\u01b2\3\2\2\2b\u01b8\3\2\2\2"+
		"d\u01bf\3\2\2\2f\u01c6\3\2\2\2h\u01cb\3\2\2\2j\u01d2\3\2\2\2l\u01d4\3"+
		"\2\2\2n\u01dc\3\2\2\2p\u01ea\3\2\2\2r\u01ee\3\2\2\2t\u01f2\3\2\2\2v\u01f9"+
		"\3\2\2\2x\u01fd\3\2\2\2z\u0205\3\2\2\2|~\5\4\3\2}|\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\3\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0082\u0086\5\n\6\2\u0083\u0086\5\6\4\2\u0084\u0086\5> \2\u0085\u0082"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\5\3\2\2\2\u0087"+
		"\u0088\7\66\2\2\u0088\u0089\7\25\2\2\u0089\u008a\5\b\5\2\u008a\7\3\2\2"+
		"\2\u008b\u008f\7#\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7(\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7$\2\2\u0094\t\3\2\2\2"+
		"\u0095\u0098\5\16\b\2\u0096\u0098\5\34\17\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7(\2\2\u009a\13\3\2\2\2"+
		"\u009b\u009e\5\n\6\2\u009c\u009e\5:\36\2\u009d\u009b\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\r\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\7\26\2\2\u00a3\u00a6\5\26\f"+
		"\2\u00a4\u00a6\5\36\20\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\17\3\2\2\2\u00a7\u00ac\5\26\f\2\u00a8\u00a9\7&\2\2\u00a9\u00ab\5\26\f"+
		"\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7#\2\2\u00b0"+
		"\u00b1\5\f\7\2\u00b1\u00b2\7$\2\2\u00b2\23\3\2\2\2\u00b3\u00b5\5\f\7\2"+
		"\u00b4\u00b6\7\20\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\25"+
		"\3\2\2\2\u00b7\u00bd\5R*\2\u00b8\u00bd\5V,\2\u00b9\u00bd\5X-\2\u00ba\u00bd"+
		"\5T+\2\u00bb\u00bd\5\30\r\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\27\3\2\2"+
		"\2\u00be\u00bf\7\37\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\7 \2\2\u00c1"+
		"\u00c2\7\25\2\2\u00c2\31\3\2\2\2\u00c3\u00c8\7\n\2\2\u00c4\u00c8\7\13"+
		"\2\2\u00c5\u00c8\7\f\2\2\u00c6\u00c8\7\r\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\33\3\2\2"+
		"\2\u00c9\u00ca\7\25\2\2\u00ca\u00cb\7+\2\2\u00cb\u00cc\5,\27\2\u00cc\35"+
		"\3\2\2\2\u00cd\u00d3\5Z.\2\u00ce\u00d3\5\\/\2\u00cf\u00d3\5^\60\2\u00d0"+
		"\u00d3\5`\61\2\u00d1\u00d3\5 \21\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2"+
		"\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\37\3\2\2\2\u00d4\u00d9\5\"\22\2\u00d5\u00d9\5$\23\2\u00d6\u00d9\5&\24"+
		"\2\u00d7\u00d9\5(\25\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9!\3\2\2\2\u00da\u00db\7\37\2\2\u00db"+
		"\u00dc\7\n\2\2\u00dc\u00dd\7 \2\2\u00dd\u00de\7\25\2\2\u00de\u00df\7+"+
		"\2\2\u00df\u00e0\7\37\2\2\u00e0\u00e1\5\62\32\2\u00e1\u00e2\7 \2\2\u00e2"+
		"#\3\2\2\2\u00e3\u00e4\7\37\2\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\7 \2\2"+
		"\u00e6\u00e7\7\25\2\2\u00e7\u00e8\7+\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea"+
		"\5\64\33\2\u00ea\u00eb\7 \2\2\u00eb%\3\2\2\2\u00ec\u00ed\7\37\2\2\u00ed"+
		"\u00ee\7\f\2\2\u00ee\u00ef\7 \2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\7+"+
		"\2\2\u00f1\u00f2\7\37\2\2\u00f2\u00f3\5\66\34\2\u00f3\u00f4\7 \2\2\u00f4"+
		"\'\3\2\2\2\u00f5\u00f6\7\37\2\2\u00f6\u00f7\7\r\2\2\u00f7\u00f8\7 \2\2"+
		"\u00f8\u00f9\7\25\2\2\u00f9\u00fa\7+\2\2\u00fa\u00fb\7\37\2\2\u00fb\u00fc"+
		"\58\35\2\u00fc\u00fd\7 \2\2\u00fd)\3\2\2\2\u00fe\u0104\7\n\2\2\u00ff\u0104"+
		"\7\13\2\2\u0100\u0104\7\f\2\2\u0101\u0104\7\r\2\2\u0102\u0104\7\16\2\2"+
		"\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0102\3\2\2\2\u0104+\3\2\2\2\u0105\u010c\5l\67\2\u0106"+
		"\u010c\5b\62\2\u0107\u010c\7\23\2\2\u0108\u010c\7\24\2\2\u0109\u010c\5"+
		"<\37\2\u010a\u010c\5.\30\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c-\3\2\2\2\u010d\u010e\7\37\2\2\u010e\u010f\5\60\31\2\u010f\u0110"+
		"\7 \2\2\u0110/\3\2\2\2\u0111\u0116\5\62\32\2\u0112\u0116\5\64\33\2\u0113"+
		"\u0116\5\66\34\2\u0114\u0116\58\35\2\u0115\u0111\3\2\2\2\u0115\u0112\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\61\3\2\2\2\u0117"+
		"\u011c\5x=\2\u0118\u0119\7&\2\2\u0119\u011b\5x=\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\63"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0124\7\23\2\2\u0120\u0121\7&\2\2\u0121"+
		"\u0123\7\23\2\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\65\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u012c\7\24\2\2\u0128\u0129\7&\2\2\u0129\u012b\7\24\2\2\u012a\u0128\3"+
		"\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\67\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0134\7\21\2\2\u0130\u0131\7&\2"+
		"\2\u0131\u0133\7\21\2\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u01359\3\2\2\2\u0136\u0134\3\2\2\2"+
		"\u0137\u013c\5D#\2\u0138\u0139\5<\37\2\u0139\u013a\7(\2\2\u013a\u013c"+
		"\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013c;\3\2\2\2\u013d"+
		"\u013e\7\25\2\2\u013e\u0140\7!\2\2\u013f\u0141\5B\"\2\u0140\u013f\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\"\2\2\u0143"+
		"=\3\2\2\2\u0144\u0145\5*\26\2\u0145\u0146\7\25\2\2\u0146\u0148\7!\2\2"+
		"\u0147\u0149\5\20\t\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\7\"\2\2\u014b\u014c\5@!\2\u014c?\3\2\2\2\u014d\u014e"+
		"\7#\2\2\u014e\u014f\5\f\7\2\u014f\u0150\7\17\2\2\u0150\u0151\5v<\2\u0151"+
		"\u0152\7(\2\2\u0152\u0153\7$\2\2\u0153A\3\2\2\2\u0154\u0159\5v<\2\u0155"+
		"\u0156\7&\2\2\u0156\u0158\5v<\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2"+
		"\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015aC\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015c\u015f\5H%\2\u015d\u015f\5F$\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015fE\3\2\2\2\u0160\u0161\7\4\2\2\u0161\u0162\7!\2\2\u0162"+
		"\u0163\5L\'\2\u0163\u0164\7\"\2\2\u0164\u0165\5\22\n\2\u0165\u016d\3\2"+
		"\2\2\u0166\u0167\7\3\2\2\u0167\u0168\7!\2\2\u0168\u0169\5b\62\2\u0169"+
		"\u016a\7\"\2\2\u016a\u016b\5\22\n\2\u016b\u016d\3\2\2\2\u016c\u0160\3"+
		"\2\2\2\u016c\u0166\3\2\2\2\u016dG\3\2\2\2\u016e\u016f\7\5\2\2\u016f\u0170"+
		"\5J&\2\u0170\u0173\5\22\n\2\u0171\u0172\7\6\2\2\u0172\u0174\5\22\n\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0184\3\2\2\2\u0175\u0176\7\7"+
		"\2\2\u0176\u0177\7!\2\2\u0177\u0178\7\25\2\2\u0178\u0179\7\"\2\2\u0179"+
		"\u017d\7#\2\2\u017a\u017c\5N(\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2"+
		"\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u0180\u0181\5P)\2\u0181\u0182\7$\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u016e\3\2\2\2\u0183\u0175\3\2\2\2\u0184I\3\2\2\2\u0185\u0186\7!\2\2\u0186"+
		"\u0187\5d\63\2\u0187\u0188\7\"\2\2\u0188K\3\2\2\2\u0189\u018a\5Z.\2\u018a"+
		"\u018b\7(\2\2\u018b\u018c\5b\62\2\u018c\u018d\7(\2\2\u018d\u018e\7\25"+
		"\2\2\u018e\u018f\7+\2\2\u018f\u0190\5l\67\2\u0190M\3\2\2\2\u0191\u0192"+
		"\7\b\2\2\u0192\u0193\5v<\2\u0193\u0194\7\'\2\2\u0194\u0195\5\24\13\2\u0195"+
		"O\3\2\2\2\u0196\u0197\7\t\2\2\u0197\u0198\7\'\2\2\u0198\u0199\5\24\13"+
		"\2\u0199Q\3\2\2\2\u019a\u019b\7\n\2\2\u019b\u019c\7\25\2\2\u019cS\3\2"+
		"\2\2\u019d\u019e\7\r\2\2\u019e\u019f\7\25\2\2\u019fU\3\2\2\2\u01a0\u01a1"+
		"\7\13\2\2\u01a1\u01a2\7\25\2\2\u01a2W\3\2\2\2\u01a3\u01a4\7\f\2\2\u01a4"+
		"\u01a5\7\25\2\2\u01a5Y\3\2\2\2\u01a6\u01a7\5R*\2\u01a7\u01a8\7+\2\2\u01a8"+
		"\u01a9\5l\67\2\u01a9[\3\2\2\2\u01aa\u01ab\5V,\2\u01ab\u01ac\7+\2\2\u01ac"+
		"\u01ad\7\23\2\2\u01ad]\3\2\2\2\u01ae\u01af\5X-\2\u01af\u01b0\7+\2\2\u01b0"+
		"\u01b1\7\24\2\2\u01b1_\3\2\2\2\u01b2\u01b3\5T+\2\u01b3\u01b4\7+\2\2\u01b4"+
		"\u01b5\5b\62\2\u01b5a\3\2\2\2\u01b6\u01b9\7\21\2\2\u01b7\u01b9\5d\63\2"+
		"\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9c\3\2\2\2\u01ba\u01bb\5"+
		"r:\2\u01bb\u01bc\5z>\2\u01bc\u01bd\5r:\2\u01bd\u01c0\3\2\2\2\u01be\u01c0"+
		"\5f\64\2\u01bf\u01ba\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0e\3\2\2\2\u01c1"+
		"\u01c2\5h\65\2\u01c2\u01c3\5t;\2\u01c3\u01c4\5h\65\2\u01c4\u01c7\3\2\2"+
		"\2\u01c5\u01c7\5h\65\2\u01c6\u01c1\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7g"+
		"\3\2\2\2\u01c8\u01c9\7\62\2\2\u01c9\u01cc\5b\62\2\u01ca\u01cc\5j\66\2"+
		"\u01cb\u01c8\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cci\3\2\2\2\u01cd\u01ce\7"+
		"!\2\2\u01ce\u01cf\5b\62\2\u01cf\u01d0\7\"\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01d3\7\25\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3k\3\2\2\2"+
		"\u01d4\u01d9\5n8\2\u01d5\u01d6\t\2\2\2\u01d6\u01d8\5n8\2\u01d7\u01d5\3"+
		"\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"m\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01e1\5p9\2\u01dd\u01de\t\3\2\2\u01de"+
		"\u01e0\5p9\2\u01df\u01dd\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2"+
		"\2\u01e1\u01e2\3\2\2\2\u01e2o\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5"+
		"\7!\2\2\u01e5\u01e6\5l\67\2\u01e6\u01e7\7\"\2\2\u01e7\u01eb\3\2\2\2\u01e8"+
		"\u01eb\7\25\2\2\u01e9\u01eb\5x=\2\u01ea\u01e4\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01ebq\3\2\2\2\u01ec\u01ef\5p9\2\u01ed\u01ef"+
		"\7\21\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01efs\3\2\2\2\u01f0"+
		"\u01f3\7\63\2\2\u01f1\u01f3\7\64\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3"+
		"\2\2\2\u01f3u\3\2\2\2\u01f4\u01fa\5x=\2\u01f5\u01fa\7\23\2\2\u01f6\u01fa"+
		"\7\24\2\2\u01f7\u01fa\7\21\2\2\u01f8\u01fa\7\25\2\2\u01f9\u01f4\3\2\2"+
		"\2\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8"+
		"\3\2\2\2\u01faw\3\2\2\2\u01fb\u01fe\7\22\2\2\u01fc\u01fe\7\36\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fey\3\2\2\2\u01ff\u0206\7.\2\2\u0200"+
		"\u0206\7/\2\2\u0201\u0206\7-\2\2\u0202\u0206\7,\2\2\u0203\u0206\7\60\2"+
		"\2\u0204\u0206\7\61\2\2\u0205\u01ff\3\2\2\2\u0205\u0200\3\2\2\2\u0205"+
		"\u0201\3\2\2\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2"+
		"\2\2\u0206{\3\2\2\2,\177\u0085\u0091\u0097\u009d\u009f\u00a5\u00ac\u00b5"+
		"\u00bc\u00c7\u00d2\u00d8\u0103\u010b\u0115\u011c\u0124\u012c\u0134\u013b"+
		"\u0140\u0148\u0159\u015e\u016c\u0173\u017d\u0183\u01b8\u01bf\u01c6\u01cb"+
		"\u01d2\u01d9\u01e1\u01ea\u01ee\u01f2\u01f9\u01fd\u0205";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}