// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/P4/ANTLR/grammar\Aexpr2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Aexpr2Parser extends Parser {
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
		RULE_stringdclassign = 46, RULE_booldclassign = 47, RULE_bexpr = 48, RULE_aexpr = 49, 
		RULE_bop = 50, RULE_vals = 51, RULE_relop = 52, RULE_numberval = 53;
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
			"chardclassign", "stringdclassign", "booldclassign", "bexpr", "aexpr", 
			"bop", "vals", "relop", "numberval"
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
	public String getGrammarFileName() { return "Aexpr2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Aexpr2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMDCL) | (1L << CHARDCL) | (1L << STRDCL) | (1L << BOOLDCL) | (1L << VOIDDCL) | (1L << ID) | (1L << SAFETY) | (1L << DOLLAR))) != 0)) {
				{
				{
				setState(108);
				declaration();
				}
				}
				setState(113);
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
		public DclassignsemiContext dclassignsemi() {
			return getRuleContext(DclassignsemiContext.class,0);
		}
		public StructdclContext structdcl() {
			return getRuleContext(StructdclContext.class,0);
		}
		public FuncdclContext funcdcl() {
			return getRuleContext(FuncdclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SAFETY:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				dclassignsemi();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				structdcl();
				}
				break;
			case NUMDCL:
			case CHARDCL:
			case STRDCL:
			case BOOLDCL:
			case VOIDDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
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
		public TerminalNode DOLLAR() { return getToken(Aexpr2Parser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public StructblockContext structblock() {
			return getRuleContext(StructblockContext.class,0);
		}
		public StructdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structdcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitStructdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructdclContext structdcl() throws RecognitionException {
		StructdclContext _localctx = new StructdclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(DOLLAR);
			setState(120);
			match(ID);
			setState(121);
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
		public TerminalNode LBRACE() { return getToken(Aexpr2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Aexpr2Parser.RBRACE, 0); }
		public List<SafedeclarationContext> safedeclaration() {
			return getRuleContexts(SafedeclarationContext.class);
		}
		public SafedeclarationContext safedeclaration(int i) {
			return getRuleContext(SafedeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Aexpr2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Aexpr2Parser.SEMI, i);
		}
		public StructblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitStructblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructblockContext structblock() throws RecognitionException {
		StructblockContext _localctx = new StructblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LBRACE);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				safedeclaration();
				setState(125);
				match(SEMI);
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SAFETY );
			setState(131);
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
		public TerminalNode SEMI() { return getToken(Aexpr2Parser.SEMI, 0); }
		public SafedeclarationContext safedeclaration() {
			return getRuleContext(SafedeclarationContext.class,0);
		}
		public VassignContext vassign() {
			return getRuleContext(VassignContext.class,0);
		}
		public DclassignsemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclassignsemi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitDclassignsemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclassignsemiContext dclassignsemi() throws RecognitionException {
		DclassignsemiContext _localctx = new DclassignsemiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dclassignsemi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAFETY:
				{
				setState(133);
				safedeclaration();
				}
				break;
			case ID:
				{
				setState(134);
				vassign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
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
		public DclassignsemicommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclassignsemicommand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitDclassignsemicommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclassignsemicommandContext dclassignsemicommand() throws RecognitionException {
		DclassignsemicommandContext _localctx = new DclassignsemicommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dclassignsemicommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILESTMT) | (1L << FORSTMT) | (1L << IFSTMT) | (1L << SWITCHSTMT) | (1L << ID) | (1L << SAFETY))) != 0)) {
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(139);
					dclassignsemi();
					}
					break;
				case 2:
					{
					setState(140);
					command();
					}
					break;
				}
				}
				setState(145);
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
		public TerminalNode SAFETY() { return getToken(Aexpr2Parser.SAFETY, 0); }
		public VdclContext vdcl() {
			return getRuleContext(VdclContext.class,0);
		}
		public VdclassignContext vdclassign() {
			return getRuleContext(VdclassignContext.class,0);
		}
		public SafedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safedeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitSafedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafedeclarationContext safedeclaration() throws RecognitionException {
		SafedeclarationContext _localctx = new SafedeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_safedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(SAFETY);
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(147);
				vdcl();
				}
				break;
			case 2:
				{
				setState(148);
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
		public List<VdclContext> vdcl() {
			return getRuleContexts(VdclContext.class);
		}
		public VdclContext vdcl(int i) {
			return getRuleContext(VdclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Aexpr2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Aexpr2Parser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			vdcl();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(152);
				match(COMMA);
				setState(153);
				vdcl();
				}
				}
				setState(158);
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
		public TerminalNode LBRACE() { return getToken(Aexpr2Parser.LBRACE, 0); }
		public DclassignsemicommandContext dclassignsemicommand() {
			return getRuleContext(DclassignsemicommandContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Aexpr2Parser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LBRACE);
			setState(160);
			dclassignsemicommand();
			setState(161);
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
		public DclassignsemicommandContext dclassignsemicommand() {
			return getRuleContext(DclassignsemicommandContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(Aexpr2Parser.BREAK, 0); }
		public CaseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitCaseblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseblockContext caseblock() throws RecognitionException {
		CaseblockContext _localctx = new CaseblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_caseblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			dclassignsemicommand();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(164);
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
		public NumdeclContext numdecl() {
			return getRuleContext(NumdeclContext.class,0);
		}
		public ChardeclContext chardecl() {
			return getRuleContext(ChardeclContext.class,0);
		}
		public StringdeclContext stringdecl() {
			return getRuleContext(StringdeclContext.class,0);
		}
		public BooldeclContext booldecl() {
			return getRuleContext(BooldeclContext.class,0);
		}
		public ArraydeclContext arraydecl() {
			return getRuleContext(ArraydeclContext.class,0);
		}
		public VdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vdcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitVdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdclContext vdcl() throws RecognitionException {
		VdclContext _localctx = new VdclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vdcl);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				numdecl();
				}
				break;
			case CHARDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				chardecl();
				}
				break;
			case STRDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				stringdecl();
				}
				break;
			case BOOLDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				booldecl();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
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
		public TerminalNode LBRACK() { return getToken(Aexpr2Parser.LBRACK, 0); }
		public ArrdcltypeContext arrdcltype() {
			return getRuleContext(ArrdcltypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Aexpr2Parser.RBRACK, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public ArraydeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitArraydecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydeclContext arraydecl() throws RecognitionException {
		ArraydeclContext _localctx = new ArraydeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arraydecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LBRACK);
			setState(175);
			arrdcltype();
			setState(176);
			match(RBRACK);
			setState(177);
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
		public TerminalNode NUMDCL() { return getToken(Aexpr2Parser.NUMDCL, 0); }
		public TerminalNode CHARDCL() { return getToken(Aexpr2Parser.CHARDCL, 0); }
		public TerminalNode STRDCL() { return getToken(Aexpr2Parser.STRDCL, 0); }
		public TerminalNode BOOLDCL() { return getToken(Aexpr2Parser.BOOLDCL, 0); }
		public ArrdcltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrdcltype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitArrdcltype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrdcltypeContext arrdcltype() throws RecognitionException {
		ArrdcltypeContext _localctx = new ArrdcltypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrdcltype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMDCL) | (1L << CHARDCL) | (1L << STRDCL) | (1L << BOOLDCL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VassignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public AtypesContext atypes() {
			return getRuleContext(AtypesContext.class,0);
		}
		public VassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitVassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VassignContext vassign() throws RecognitionException {
		VassignContext _localctx = new VassignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ID);
			setState(182);
			match(ASSIGN);
			setState(183);
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
		public NumdclassignContext numdclassign() {
			return getRuleContext(NumdclassignContext.class,0);
		}
		public ChardclassignContext chardclassign() {
			return getRuleContext(ChardclassignContext.class,0);
		}
		public StringdclassignContext stringdclassign() {
			return getRuleContext(StringdclassignContext.class,0);
		}
		public BooldclassignContext booldclassign() {
			return getRuleContext(BooldclassignContext.class,0);
		}
		public ArraydclassignContext arraydclassign() {
			return getRuleContext(ArraydclassignContext.class,0);
		}
		public VdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vdclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitVdclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdclassignContext vdclassign() throws RecognitionException {
		VdclassignContext _localctx = new VdclassignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vdclassign);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				numdclassign();
				}
				break;
			case CHARDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				chardclassign();
				}
				break;
			case STRDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				stringdclassign();
				}
				break;
			case BOOLDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				booldclassign();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
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
		public NumarraydclassignContext numarraydclassign() {
			return getRuleContext(NumarraydclassignContext.class,0);
		}
		public ChararraydclassignContext chararraydclassign() {
			return getRuleContext(ChararraydclassignContext.class,0);
		}
		public StringarraydclassignContext stringarraydclassign() {
			return getRuleContext(StringarraydclassignContext.class,0);
		}
		public BoolarraydclassignContext boolarraydclassign() {
			return getRuleContext(BoolarraydclassignContext.class,0);
		}
		public ArraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitArraydclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydclassignContext arraydclassign() throws RecognitionException {
		ArraydclassignContext _localctx = new ArraydclassignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arraydclassign);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				numarraydclassign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				chararraydclassign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				stringarraydclassign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
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
		public List<TerminalNode> LBRACK() { return getTokens(Aexpr2Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Aexpr2Parser.LBRACK, i);
		}
		public TerminalNode NUMDCL() { return getToken(Aexpr2Parser.NUMDCL, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(Aexpr2Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Aexpr2Parser.RBRACK, i);
		}
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public NumarrayContext numarray() {
			return getRuleContext(NumarrayContext.class,0);
		}
		public NumarraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numarraydclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitNumarraydclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumarraydclassignContext numarraydclassign() throws RecognitionException {
		NumarraydclassignContext _localctx = new NumarraydclassignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numarraydclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(LBRACK);
			setState(199);
			match(NUMDCL);
			setState(200);
			match(RBRACK);
			setState(201);
			match(ID);
			setState(202);
			match(ASSIGN);
			setState(203);
			match(LBRACK);
			setState(204);
			numarray();
			setState(205);
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
		public List<TerminalNode> LBRACK() { return getTokens(Aexpr2Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Aexpr2Parser.LBRACK, i);
		}
		public TerminalNode CHARDCL() { return getToken(Aexpr2Parser.CHARDCL, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(Aexpr2Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Aexpr2Parser.RBRACK, i);
		}
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public ChararrayContext chararray() {
			return getRuleContext(ChararrayContext.class,0);
		}
		public ChararraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chararraydclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitChararraydclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChararraydclassignContext chararraydclassign() throws RecognitionException {
		ChararraydclassignContext _localctx = new ChararraydclassignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chararraydclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(LBRACK);
			setState(208);
			match(CHARDCL);
			setState(209);
			match(RBRACK);
			setState(210);
			match(ID);
			setState(211);
			match(ASSIGN);
			setState(212);
			match(LBRACK);
			setState(213);
			chararray();
			setState(214);
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
		public List<TerminalNode> LBRACK() { return getTokens(Aexpr2Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Aexpr2Parser.LBRACK, i);
		}
		public TerminalNode STRDCL() { return getToken(Aexpr2Parser.STRDCL, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(Aexpr2Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Aexpr2Parser.RBRACK, i);
		}
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public StrarrayContext strarray() {
			return getRuleContext(StrarrayContext.class,0);
		}
		public StringarraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringarraydclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitStringarraydclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringarraydclassignContext stringarraydclassign() throws RecognitionException {
		StringarraydclassignContext _localctx = new StringarraydclassignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringarraydclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LBRACK);
			setState(217);
			match(STRDCL);
			setState(218);
			match(RBRACK);
			setState(219);
			match(ID);
			setState(220);
			match(ASSIGN);
			setState(221);
			match(LBRACK);
			setState(222);
			strarray();
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

	public static class BoolarraydclassignContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(Aexpr2Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Aexpr2Parser.LBRACK, i);
		}
		public TerminalNode BOOLDCL() { return getToken(Aexpr2Parser.BOOLDCL, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(Aexpr2Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Aexpr2Parser.RBRACK, i);
		}
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public BoolarrayContext boolarray() {
			return getRuleContext(BoolarrayContext.class,0);
		}
		public BoolarraydclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolarraydclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBoolarraydclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolarraydclassignContext boolarraydclassign() throws RecognitionException {
		BoolarraydclassignContext _localctx = new BoolarraydclassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolarraydclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LBRACK);
			setState(226);
			match(BOOLDCL);
			setState(227);
			match(RBRACK);
			setState(228);
			match(ID);
			setState(229);
			match(ASSIGN);
			setState(230);
			match(LBRACK);
			setState(231);
			boolarray();
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode NUMDCL() { return getToken(Aexpr2Parser.NUMDCL, 0); }
		public TerminalNode CHARDCL() { return getToken(Aexpr2Parser.CHARDCL, 0); }
		public TerminalNode STRDCL() { return getToken(Aexpr2Parser.STRDCL, 0); }
		public TerminalNode BOOLDCL() { return getToken(Aexpr2Parser.BOOLDCL, 0); }
		public TerminalNode VOIDDCL() { return getToken(Aexpr2Parser.VOIDDCL, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMDCL) | (1L << CHARDCL) | (1L << STRDCL) | (1L << BOOLDCL) | (1L << VOIDDCL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AtypesContext extends ParserRuleContext {
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode CHARVAL() { return getToken(Aexpr2Parser.CHARVAL, 0); }
		public TerminalNode STRVAL() { return getToken(Aexpr2Parser.STRVAL, 0); }
		public FunccallsContext funccalls() {
			return getRuleContext(FunccallsContext.class,0);
		}
		public ArrayassignContext arrayassign() {
			return getRuleContext(ArrayassignContext.class,0);
		}
		public AtypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atypes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAtypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtypesContext atypes() throws RecognitionException {
		AtypesContext _localctx = new AtypesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atypes);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				aexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				bexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(CHARVAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(STRVAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				funccalls();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
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
		public TerminalNode LBRACK() { return getToken(Aexpr2Parser.LBRACK, 0); }
		public ArraydataContext arraydata() {
			return getRuleContext(ArraydataContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Aexpr2Parser.RBRACK, 0); }
		public ArrayassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitArrayassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayassignContext arrayassign() throws RecognitionException {
		ArrayassignContext _localctx = new ArrayassignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(LBRACK);
			setState(245);
			arraydata();
			setState(246);
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
		public NumarrayContext numarray() {
			return getRuleContext(NumarrayContext.class,0);
		}
		public ChararrayContext chararray() {
			return getRuleContext(ChararrayContext.class,0);
		}
		public StrarrayContext strarray() {
			return getRuleContext(StrarrayContext.class,0);
		}
		public BoolarrayContext boolarray() {
			return getRuleContext(BoolarrayContext.class,0);
		}
		public ArraydataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitArraydata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydataContext arraydata() throws RecognitionException {
		ArraydataContext _localctx = new ArraydataContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arraydata);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case PI:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				numarray();
				}
				break;
			case CHARVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				chararray();
				}
				break;
			case STRVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				strarray();
				}
				break;
			case BOOLVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
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
		public List<NumbervalContext> numberval() {
			return getRuleContexts(NumbervalContext.class);
		}
		public NumbervalContext numberval(int i) {
			return getRuleContext(NumbervalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Aexpr2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Aexpr2Parser.COMMA, i);
		}
		public NumarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numarray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitNumarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumarrayContext numarray() throws RecognitionException {
		NumarrayContext _localctx = new NumarrayContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			numberval();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				numberval();
				}
				}
				setState(261);
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
		public List<TerminalNode> CHARVAL() { return getTokens(Aexpr2Parser.CHARVAL); }
		public TerminalNode CHARVAL(int i) {
			return getToken(Aexpr2Parser.CHARVAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Aexpr2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Aexpr2Parser.COMMA, i);
		}
		public ChararrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chararray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitChararray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChararrayContext chararray() throws RecognitionException {
		ChararrayContext _localctx = new ChararrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_chararray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(CHARVAL);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				match(CHARVAL);
				}
				}
				setState(269);
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
		public List<TerminalNode> STRVAL() { return getTokens(Aexpr2Parser.STRVAL); }
		public TerminalNode STRVAL(int i) {
			return getToken(Aexpr2Parser.STRVAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Aexpr2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Aexpr2Parser.COMMA, i);
		}
		public StrarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strarray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitStrarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrarrayContext strarray() throws RecognitionException {
		StrarrayContext _localctx = new StrarrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_strarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(STRVAL);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(271);
				match(COMMA);
				setState(272);
				match(STRVAL);
				}
				}
				setState(277);
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
		public List<TerminalNode> BOOLVAL() { return getTokens(Aexpr2Parser.BOOLVAL); }
		public TerminalNode BOOLVAL(int i) {
			return getToken(Aexpr2Parser.BOOLVAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Aexpr2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Aexpr2Parser.COMMA, i);
		}
		public BoolarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolarray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBoolarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolarrayContext boolarray() throws RecognitionException {
		BoolarrayContext _localctx = new BoolarrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(BOOLVAL);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(280);
				match(BOOLVAL);
				}
				}
				setState(285);
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
		public CtrlstructContext ctrlstruct() {
			return getRuleContext(CtrlstructContext.class,0);
		}
		public FunccallsContext funccalls() {
			return getRuleContext(FunccallsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Aexpr2Parser.SEMI, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_command);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILESTMT:
			case FORSTMT:
			case IFSTMT:
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				ctrlstruct();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				funccalls();
				setState(288);
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
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(Aexpr2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Aexpr2Parser.RPAR, 0); }
		public CallparamsContext callparams() {
			return getRuleContext(CallparamsContext.class,0);
		}
		public FunccallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccalls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitFunccalls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallsContext funccalls() throws RecognitionException {
		FunccallsContext _localctx = new FunccallsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_funccalls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ID);
			setState(293);
			match(LPAR);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVAL) | (1L << NUMVAL) | (1L << CHARVAL) | (1L << STRVAL) | (1L << ID) | (1L << PI))) != 0)) {
				{
				setState(294);
				callparams();
				}
			}

			setState(297);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(Aexpr2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Aexpr2Parser.RPAR, 0); }
		public FuncblockContext funcblock() {
			return getRuleContext(FuncblockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitFuncdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdclContext funcdcl() throws RecognitionException {
		FuncdclContext _localctx = new FuncdclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_funcdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			datatype();
			setState(300);
			match(ID);
			setState(301);
			match(LPAR);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMDCL) | (1L << CHARDCL) | (1L << STRDCL) | (1L << BOOLDCL) | (1L << LBRACK))) != 0)) {
				{
				setState(302);
				params();
				}
			}

			setState(305);
			match(RPAR);
			setState(306);
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
		public TerminalNode LBRACE() { return getToken(Aexpr2Parser.LBRACE, 0); }
		public DclassignsemicommandContext dclassignsemicommand() {
			return getRuleContext(DclassignsemicommandContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(Aexpr2Parser.RETURN, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Aexpr2Parser.SEMI, 0); }
		public TerminalNode RBRACE() { return getToken(Aexpr2Parser.RBRACE, 0); }
		public FuncblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitFuncblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncblockContext funcblock() throws RecognitionException {
		FuncblockContext _localctx = new FuncblockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(LBRACE);
			setState(309);
			dclassignsemicommand();
			setState(310);
			match(RETURN);
			setState(311);
			vals();
			setState(312);
			match(SEMI);
			setState(313);
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
		public List<ValsContext> vals() {
			return getRuleContexts(ValsContext.class);
		}
		public ValsContext vals(int i) {
			return getRuleContext(ValsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Aexpr2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Aexpr2Parser.COMMA, i);
		}
		public CallparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callparams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitCallparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallparamsContext callparams() throws RecognitionException {
		CallparamsContext _localctx = new CallparamsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_callparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			vals();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316);
				match(COMMA);
				setState(317);
				vals();
				}
				}
				setState(322);
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
		public SelectiveContext selective() {
			return getRuleContext(SelectiveContext.class,0);
		}
		public IterativeContext iterative() {
			return getRuleContext(IterativeContext.class,0);
		}
		public CtrlstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrlstruct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitCtrlstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtrlstructContext ctrlstruct() throws RecognitionException {
		CtrlstructContext _localctx = new CtrlstructContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ctrlstruct);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSTMT:
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				selective();
				}
				break;
			case WHILESTMT:
			case FORSTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
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
		public TerminalNode FORSTMT() { return getToken(Aexpr2Parser.FORSTMT, 0); }
		public TerminalNode LPAR() { return getToken(Aexpr2Parser.LPAR, 0); }
		public ForparamsContext forparams() {
			return getRuleContext(ForparamsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Aexpr2Parser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILESTMT() { return getToken(Aexpr2Parser.WHILESTMT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public IterativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitIterative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_iterative);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(FORSTMT);
				setState(328);
				match(LPAR);
				setState(329);
				forparams();
				setState(330);
				match(RPAR);
				setState(331);
				block();
				}
				break;
			case WHILESTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(WHILESTMT);
				setState(334);
				match(LPAR);
				setState(335);
				bexpr(0);
				setState(336);
				match(RPAR);
				setState(337);
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
		public TerminalNode IFSTMT() { return getToken(Aexpr2Parser.IFSTMT, 0); }
		public IflogicContext iflogic() {
			return getRuleContext(IflogicContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Aexpr2Parser.ELSE, 0); }
		public TerminalNode SWITCHSTMT() { return getToken(Aexpr2Parser.SWITCHSTMT, 0); }
		public TerminalNode LPAR() { return getToken(Aexpr2Parser.LPAR, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode RPAR() { return getToken(Aexpr2Parser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(Aexpr2Parser.LBRACE, 0); }
		public DefcaseContext defcase() {
			return getRuleContext(DefcaseContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Aexpr2Parser.RBRACE, 0); }
		public List<ScaseContext> scase() {
			return getRuleContexts(ScaseContext.class);
		}
		public ScaseContext scase(int i) {
			return getRuleContext(ScaseContext.class,i);
		}
		public SelectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitSelective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selective);
		int _la;
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(IFSTMT);
				setState(342);
				iflogic();
				setState(343);
				block();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(344);
					match(ELSE);
					setState(345);
					block();
					}
				}

				}
				break;
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(SWITCHSTMT);
				setState(349);
				match(LPAR);
				setState(350);
				match(ID);
				setState(351);
				match(RPAR);
				setState(352);
				match(LBRACE);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(353);
					scase();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
				defcase();
				setState(360);
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
		public TerminalNode LPAR() { return getToken(Aexpr2Parser.LPAR, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Aexpr2Parser.RPAR, 0); }
		public IflogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iflogic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitIflogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IflogicContext iflogic() throws RecognitionException {
		IflogicContext _localctx = new IflogicContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_iflogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LPAR);
			setState(365);
			bexpr(0);
			setState(366);
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
		public NumdclassignContext numdclassign() {
			return getRuleContext(NumdclassignContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(Aexpr2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Aexpr2Parser.SEMI, i);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public ForparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forparams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitForparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForparamsContext forparams() throws RecognitionException {
		ForparamsContext _localctx = new ForparamsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			numdclassign();
			setState(369);
			match(SEMI);
			setState(370);
			bexpr(0);
			setState(371);
			match(SEMI);
			setState(372);
			match(ID);
			setState(373);
			match(ASSIGN);
			setState(374);
			aexpr(0);
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
		public TerminalNode CASE() { return getToken(Aexpr2Parser.CASE, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Aexpr2Parser.COLON, 0); }
		public CaseblockContext caseblock() {
			return getRuleContext(CaseblockContext.class,0);
		}
		public ScaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitScase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaseContext scase() throws RecognitionException {
		ScaseContext _localctx = new ScaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_scase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(CASE);
			setState(377);
			vals();
			setState(378);
			match(COLON);
			setState(379);
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
		public TerminalNode DEFAULT() { return getToken(Aexpr2Parser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(Aexpr2Parser.COLON, 0); }
		public CaseblockContext caseblock() {
			return getRuleContext(CaseblockContext.class,0);
		}
		public DefcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitDefcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcaseContext defcase() throws RecognitionException {
		DefcaseContext _localctx = new DefcaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_defcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(DEFAULT);
			setState(382);
			match(COLON);
			setState(383);
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
		public TerminalNode NUMDCL() { return getToken(Aexpr2Parser.NUMDCL, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public NumdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitNumdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdeclContext numdecl() throws RecognitionException {
		NumdeclContext _localctx = new NumdeclContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_numdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(NUMDCL);
			setState(386);
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
		public TerminalNode BOOLDCL() { return getToken(Aexpr2Parser.BOOLDCL, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public BooldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBooldecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldeclContext booldecl() throws RecognitionException {
		BooldeclContext _localctx = new BooldeclContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booldecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(BOOLDCL);
			setState(389);
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
		public TerminalNode CHARDCL() { return getToken(Aexpr2Parser.CHARDCL, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public ChardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitChardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardeclContext chardecl() throws RecognitionException {
		ChardeclContext _localctx = new ChardeclContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_chardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(CHARDCL);
			setState(392);
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
		public TerminalNode STRDCL() { return getToken(Aexpr2Parser.STRDCL, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public StringdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitStringdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdeclContext stringdecl() throws RecognitionException {
		StringdeclContext _localctx = new StringdeclContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_stringdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(STRDCL);
			setState(395);
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
		public NumdeclContext numdecl() {
			return getRuleContext(NumdeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public NumdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitNumdclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdclassignContext numdclassign() throws RecognitionException {
		NumdclassignContext _localctx = new NumdclassignContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_numdclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			numdecl();
			setState(398);
			match(ASSIGN);
			setState(399);
			aexpr(0);
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
		public ChardeclContext chardecl() {
			return getRuleContext(ChardeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public TerminalNode CHARVAL() { return getToken(Aexpr2Parser.CHARVAL, 0); }
		public ChardclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitChardclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardclassignContext chardclassign() throws RecognitionException {
		ChardclassignContext _localctx = new ChardclassignContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_chardclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			chardecl();
			setState(402);
			match(ASSIGN);
			setState(403);
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
		public StringdeclContext stringdecl() {
			return getRuleContext(StringdeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public TerminalNode STRVAL() { return getToken(Aexpr2Parser.STRVAL, 0); }
		public StringdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitStringdclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdclassignContext stringdclassign() throws RecognitionException {
		StringdclassignContext _localctx = new StringdclassignContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_stringdclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			stringdecl();
			setState(406);
			match(ASSIGN);
			setState(407);
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
		public BooldeclContext booldecl() {
			return getRuleContext(BooldeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Aexpr2Parser.ASSIGN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BooldclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBooldclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldclassignContext booldclassign() throws RecognitionException {
		BooldclassignContext _localctx = new BooldclassignContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_booldclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			booldecl();
			setState(410);
			match(ASSIGN);
			setState(411);
			bexpr(0);
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
	public static class BexprRelopContext extends BexprContext {
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public BexprRelopContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBexprRelop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NOTBexprContext extends BexprContext {
		public TerminalNode NOT() { return getToken(Aexpr2Parser.NOT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public NOTBexprContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitNOTBexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BexprIDBoolvalContext extends BexprContext {
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public TerminalNode EQ() { return getToken(Aexpr2Parser.EQ, 0); }
		public TerminalNode BOOLVAL() { return getToken(Aexpr2Parser.BOOLVAL, 0); }
		public BexprIDBoolvalContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBexprIDBoolval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BexprBopContext extends BexprContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public BexprBopContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBexprBop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BexprParensContext extends BexprContext {
		public TerminalNode LPAR() { return getToken(Aexpr2Parser.LPAR, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Aexpr2Parser.RPAR, 0); }
		public BexprParensContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBexprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BexprBoolvalContext extends BexprContext {
		public TerminalNode BOOLVAL() { return getToken(Aexpr2Parser.BOOLVAL, 0); }
		public BexprBoolvalContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBexprBoolval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new BexprBoolvalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(414);
				match(BOOLVAL);
				}
				break;
			case 2:
				{
				_localctx = new BexprIDBoolvalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415);
				match(ID);
				setState(416);
				match(EQ);
				setState(417);
				match(BOOLVAL);
				}
				break;
			case 3:
				{
				_localctx = new BexprRelopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(418);
				aexpr(0);
				setState(419);
				relop();
				setState(420);
				aexpr(0);
				}
				break;
			case 4:
				{
				_localctx = new NOTBexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422);
				match(NOT);
				setState(423);
				bexpr(2);
				}
				break;
			case 5:
				{
				_localctx = new BexprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				match(LPAR);
				setState(425);
				bexpr(0);
				setState(426);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BexprBopContext(new BexprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
					setState(430);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(431);
					bop();
					setState(432);
					bexpr(4);
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
	public static class AexprIdNodeContext extends AexprContext {
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public AexprIdNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAexprIdNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AexprTimesDivNodeContext extends AexprContext {
		public Token op;
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(Aexpr2Parser.TIMES, 0); }
		public TerminalNode DIVISION() { return getToken(Aexpr2Parser.DIVISION, 0); }
		public TerminalNode MOD() { return getToken(Aexpr2Parser.MOD, 0); }
		public AexprTimesDivNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAexprTimesDivNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AexprNumbervalNodeContext extends AexprContext {
		public NumbervalContext numberval() {
			return getRuleContext(NumbervalContext.class,0);
		}
		public AexprNumbervalNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAexprNumbervalNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AexprAddSubNodeContext extends AexprContext {
		public Token op;
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Aexpr2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Aexpr2Parser.MINUS, 0); }
		public AexprAddSubNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAexprAddSubNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AexprParensNodeContext extends AexprContext {
		public TerminalNode LPAR() { return getToken(Aexpr2Parser.LPAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Aexpr2Parser.RPAR, 0); }
		public AexprParensNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAexprParensNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		return aexpr(0);
	}

	private AexprContext aexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexprContext _localctx = new AexprContext(_ctx, _parentState);
		AexprContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_aexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new AexprIdNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(440);
				match(ID);
				}
				break;
			case NUMVAL:
			case PI:
				{
				_localctx = new AexprNumbervalNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(441);
				numberval();
				}
				break;
			case LPAR:
				{
				_localctx = new AexprParensNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(442);
				match(LPAR);
				setState(443);
				aexpr(0);
				setState(444);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(454);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new AexprTimesDivNodeContext(new AexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(448);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(449);
						((AexprTimesDivNodeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
							((AexprTimesDivNodeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(450);
						aexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new AexprAddSubNodeContext(new AexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(451);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(452);
						((AexprAddSubNodeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AexprAddSubNodeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(453);
						aexpr(5);
						}
						break;
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Aexpr2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Aexpr2Parser.OR, 0); }
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitBop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ValsContext extends ParserRuleContext {
		public NumbervalContext numberval() {
			return getRuleContext(NumbervalContext.class,0);
		}
		public TerminalNode CHARVAL() { return getToken(Aexpr2Parser.CHARVAL, 0); }
		public TerminalNode STRVAL() { return getToken(Aexpr2Parser.STRVAL, 0); }
		public TerminalNode BOOLVAL() { return getToken(Aexpr2Parser.BOOLVAL, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public ValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitVals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValsContext vals() throws RecognitionException {
		ValsContext _localctx = new ValsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_vals);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case PI:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				numberval();
				}
				break;
			case CHARVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(CHARVAL);
				}
				break;
			case STRVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(STRVAL);
				}
				break;
			case BOOLVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				match(BOOLVAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(Aexpr2Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(Aexpr2Parser.NEQ, 0); }
		public TerminalNode GEQ() { return getToken(Aexpr2Parser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(Aexpr2Parser.LEQ, 0); }
		public TerminalNode LESS() { return getToken(Aexpr2Parser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(Aexpr2Parser.GREATER, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEQ) | (1L << GEQ) | (1L << EQ) | (1L << NEQ) | (1L << LESS) | (1L << GREATER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class AexprNumvalNodeContext extends NumbervalContext {
		public TerminalNode NUMVAL() { return getToken(Aexpr2Parser.NUMVAL, 0); }
		public AexprNumvalNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAexprNumvalNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AexprPiNodeContext extends NumbervalContext {
		public TerminalNode PI() { return getToken(Aexpr2Parser.PI, 0); }
		public AexprPiNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAexprPiNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbervalContext numberval() throws RecognitionException {
		NumbervalContext _localctx = new NumbervalContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_numberval);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
				_localctx = new AexprNumvalNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(NUMVAL);
				}
				break;
			case PI:
				_localctx = new AexprPiNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 48:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		case 49:
			return aexpr_sempred((AexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\7\2p\n\2\f\2\16\2s\13\2\3\3\3\3"+
		"\3\3\5\3x\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\u0082\n\5\r\5\16\5\u0083"+
		"\3\5\3\5\3\6\3\6\5\6\u008a\n\6\3\6\3\6\3\7\3\7\7\7\u0090\n\7\f\7\16\7"+
		"\u0093\13\7\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3\t\3\t\7\t\u009d\n\t\f\t\16"+
		"\t\u00a0\13\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00a8\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00af\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00c1\n\20\3\21\3\21\3\21\3\21\5\21\u00c7"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00f5\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\5\31\u00ff\n\31\3\32\3\32\3\32\7\32\u0104\n\32\f\32\16\32\u0107\13\32"+
		"\3\33\3\33\3\33\7\33\u010c\n\33\f\33\16\33\u010f\13\33\3\34\3\34\3\34"+
		"\7\34\u0114\n\34\f\34\16\34\u0117\13\34\3\35\3\35\3\35\7\35\u011c\n\35"+
		"\f\35\16\35\u011f\13\35\3\36\3\36\3\36\3\36\5\36\u0125\n\36\3\37\3\37"+
		"\3\37\5\37\u012a\n\37\3\37\3\37\3 \3 \3 \3 \5 \u0132\n \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u0141\n\"\f\"\16\"\u0144\13\"\3#\3#\5"+
		"#\u0148\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0156\n$\3%\3%\3%\3"+
		"%\3%\5%\u015d\n%\3%\3%\3%\3%\3%\3%\7%\u0165\n%\f%\16%\u0168\13%\3%\3%"+
		"\3%\5%\u016d\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01af\n\62"+
		"\3\62\3\62\3\62\3\62\7\62\u01b5\n\62\f\62\16\62\u01b8\13\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u01c1\n\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\7\63\u01c9\n\63\f\63\16\63\u01cc\13\63\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u01d5\n\65\3\66\3\66\3\67\3\67\5\67\u01db\n\67\3\67\2\4bd8"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjl\2\b\3\2\n\r\3\2\n\16\4\2\31\32\35\35\3\2\27\30\3\2"+
		"\63\64\3\2,\61\2\u01de\2q\3\2\2\2\4w\3\2\2\2\6y\3\2\2\2\b}\3\2\2\2\n\u0089"+
		"\3\2\2\2\f\u0091\3\2\2\2\16\u0094\3\2\2\2\20\u0099\3\2\2\2\22\u00a1\3"+
		"\2\2\2\24\u00a5\3\2\2\2\26\u00ae\3\2\2\2\30\u00b0\3\2\2\2\32\u00b5\3\2"+
		"\2\2\34\u00b7\3\2\2\2\36\u00c0\3\2\2\2 \u00c6\3\2\2\2\"\u00c8\3\2\2\2"+
		"$\u00d1\3\2\2\2&\u00da\3\2\2\2(\u00e3\3\2\2\2*\u00ec\3\2\2\2,\u00f4\3"+
		"\2\2\2.\u00f6\3\2\2\2\60\u00fe\3\2\2\2\62\u0100\3\2\2\2\64\u0108\3\2\2"+
		"\2\66\u0110\3\2\2\28\u0118\3\2\2\2:\u0124\3\2\2\2<\u0126\3\2\2\2>\u012d"+
		"\3\2\2\2@\u0136\3\2\2\2B\u013d\3\2\2\2D\u0147\3\2\2\2F\u0155\3\2\2\2H"+
		"\u016c\3\2\2\2J\u016e\3\2\2\2L\u0172\3\2\2\2N\u017a\3\2\2\2P\u017f\3\2"+
		"\2\2R\u0183\3\2\2\2T\u0186\3\2\2\2V\u0189\3\2\2\2X\u018c\3\2\2\2Z\u018f"+
		"\3\2\2\2\\\u0193\3\2\2\2^\u0197\3\2\2\2`\u019b\3\2\2\2b\u01ae\3\2\2\2"+
		"d\u01c0\3\2\2\2f\u01cd\3\2\2\2h\u01d4\3\2\2\2j\u01d6\3\2\2\2l\u01da\3"+
		"\2\2\2np\5\4\3\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\3\3\2\2\2sq"+
		"\3\2\2\2tx\5\n\6\2ux\5\6\4\2vx\5> \2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\5"+
		"\3\2\2\2yz\7\66\2\2z{\7\25\2\2{|\5\b\5\2|\7\3\2\2\2}\u0081\7#\2\2~\177"+
		"\5\16\b\2\177\u0080\7(\2\2\u0080\u0082\3\2\2\2\u0081~\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7$\2\2\u0086\t\3\2\2\2\u0087\u008a\5\16\b\2\u0088\u008a\5\34\17"+
		"\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\7(\2\2\u008c\13\3\2\2\2\u008d\u0090\5\n\6\2\u008e\u0090\5:\36\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\r\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\7\26\2\2\u0095\u0098\5\26\f\2\u0096\u0098\5\36\20\2\u0097\u0095\3\2\2"+
		"\2\u0097\u0096\3\2\2\2\u0098\17\3\2\2\2\u0099\u009e\5\26\f\2\u009a\u009b"+
		"\7&\2\2\u009b\u009d\5\26\f\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\21\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7$\2\2\u00a4\23"+
		"\3\2\2\2\u00a5\u00a7\5\f\7\2\u00a6\u00a8\7\20\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\25\3\2\2\2\u00a9\u00af\5R*\2\u00aa\u00af\5"+
		"V,\2\u00ab\u00af\5X-\2\u00ac\u00af\5T+\2\u00ad\u00af\5\30\r\2\u00ae\u00a9"+
		"\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2\5\32"+
		"\16\2\u00b2\u00b3\7 \2\2\u00b3\u00b4\7\25\2\2\u00b4\31\3\2\2\2\u00b5\u00b6"+
		"\t\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\7+\2\2\u00b9"+
		"\u00ba\5,\27\2\u00ba\35\3\2\2\2\u00bb\u00c1\5Z.\2\u00bc\u00c1\5\\/\2\u00bd"+
		"\u00c1\5^\60\2\u00be\u00c1\5`\61\2\u00bf\u00c1\5 \21\2\u00c0\u00bb\3\2"+
		"\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\37\3\2\2\2\u00c2\u00c7\5\"\22\2\u00c3\u00c7\5$\23"+
		"\2\u00c4\u00c7\5&\24\2\u00c5\u00c7\5(\25\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7!\3\2\2\2\u00c8"+
		"\u00c9\7\37\2\2\u00c9\u00ca\7\n\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\7\25"+
		"\2\2\u00cc\u00cd\7+\2\2\u00cd\u00ce\7\37\2\2\u00ce\u00cf\5\62\32\2\u00cf"+
		"\u00d0\7 \2\2\u00d0#\3\2\2\2\u00d1\u00d2\7\37\2\2\u00d2\u00d3\7\13\2\2"+
		"\u00d3\u00d4\7 \2\2\u00d4\u00d5\7\25\2\2\u00d5\u00d6\7+\2\2\u00d6\u00d7"+
		"\7\37\2\2\u00d7\u00d8\5\64\33\2\u00d8\u00d9\7 \2\2\u00d9%\3\2\2\2\u00da"+
		"\u00db\7\37\2\2\u00db\u00dc\7\f\2\2\u00dc\u00dd\7 \2\2\u00dd\u00de\7\25"+
		"\2\2\u00de\u00df\7+\2\2\u00df\u00e0\7\37\2\2\u00e0\u00e1\5\66\34\2\u00e1"+
		"\u00e2\7 \2\2\u00e2\'\3\2\2\2\u00e3\u00e4\7\37\2\2\u00e4\u00e5\7\r\2\2"+
		"\u00e5\u00e6\7 \2\2\u00e6\u00e7\7\25\2\2\u00e7\u00e8\7+\2\2\u00e8\u00e9"+
		"\7\37\2\2\u00e9\u00ea\58\35\2\u00ea\u00eb\7 \2\2\u00eb)\3\2\2\2\u00ec"+
		"\u00ed\t\3\2\2\u00ed+\3\2\2\2\u00ee\u00f5\5d\63\2\u00ef\u00f5\5b\62\2"+
		"\u00f0\u00f5\7\23\2\2\u00f1\u00f5\7\24\2\2\u00f2\u00f5\5<\37\2\u00f3\u00f5"+
		"\5.\30\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5-\3\2\2\2"+
		"\u00f6\u00f7\7\37\2\2\u00f7\u00f8\5\60\31\2\u00f8\u00f9\7 \2\2\u00f9/"+
		"\3\2\2\2\u00fa\u00ff\5\62\32\2\u00fb\u00ff\5\64\33\2\u00fc\u00ff\5\66"+
		"\34\2\u00fd\u00ff\58\35\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\61\3\2\2\2\u0100\u0105\5l\67"+
		"\2\u0101\u0102\7&\2\2\u0102\u0104\5l\67\2\u0103\u0101\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\63\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010d\7\23\2\2\u0109\u010a\7&\2\2\u010a\u010c\7\23"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\65\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0115\7\24\2"+
		"\2\u0111\u0112\7&\2\2\u0112\u0114\7\24\2\2\u0113\u0111\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\67\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011d\7\21\2\2\u0119\u011a\7&\2\2\u011a\u011c\7\21"+
		"\2\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e9\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0125\5D#\2\u0121"+
		"\u0122\5<\37\2\u0122\u0123\7(\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2"+
		"\2\2\u0124\u0121\3\2\2\2\u0125;\3\2\2\2\u0126\u0127\7\25\2\2\u0127\u0129"+
		"\7!\2\2\u0128\u012a\5B\"\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\7\"\2\2\u012c=\3\2\2\2\u012d\u012e\5*\26\2"+
		"\u012e\u012f\7\25\2\2\u012f\u0131\7!\2\2\u0130\u0132\5\20\t\2\u0131\u0130"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\"\2\2\u0134"+
		"\u0135\5@!\2\u0135?\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138\5\f\7\2\u0138"+
		"\u0139\7\17\2\2\u0139\u013a\5h\65\2\u013a\u013b\7(\2\2\u013b\u013c\7$"+
		"\2\2\u013cA\3\2\2\2\u013d\u0142\5h\65\2\u013e\u013f\7&\2\2\u013f\u0141"+
		"\5h\65\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143C\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0148\5H%\2\u0146"+
		"\u0148\5F$\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148E\3\2\2\2\u0149"+
		"\u014a\7\4\2\2\u014a\u014b\7!\2\2\u014b\u014c\5L\'\2\u014c\u014d\7\"\2"+
		"\2\u014d\u014e\5\22\n\2\u014e\u0156\3\2\2\2\u014f\u0150\7\3\2\2\u0150"+
		"\u0151\7!\2\2\u0151\u0152\5b\62\2\u0152\u0153\7\"\2\2\u0153\u0154\5\22"+
		"\n\2\u0154\u0156\3\2\2\2\u0155\u0149\3\2\2\2\u0155\u014f\3\2\2\2\u0156"+
		"G\3\2\2\2\u0157\u0158\7\5\2\2\u0158\u0159\5J&\2\u0159\u015c\5\22\n\2\u015a"+
		"\u015b\7\6\2\2\u015b\u015d\5\22\n\2\u015c\u015a\3\2\2\2\u015c\u015d\3"+
		"\2\2\2\u015d\u016d\3\2\2\2\u015e\u015f\7\7\2\2\u015f\u0160\7!\2\2\u0160"+
		"\u0161\7\25\2\2\u0161\u0162\7\"\2\2\u0162\u0166\7#\2\2\u0163\u0165\5N"+
		"(\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\5P"+
		")\2\u016a\u016b\7$\2\2\u016b\u016d\3\2\2\2\u016c\u0157\3\2\2\2\u016c\u015e"+
		"\3\2\2\2\u016dI\3\2\2\2\u016e\u016f\7!\2\2\u016f\u0170\5b\62\2\u0170\u0171"+
		"\7\"\2\2\u0171K\3\2\2\2\u0172\u0173\5Z.\2\u0173\u0174\7(\2\2\u0174\u0175"+
		"\5b\62\2\u0175\u0176\7(\2\2\u0176\u0177\7\25\2\2\u0177\u0178\7+\2\2\u0178"+
		"\u0179\5d\63\2\u0179M\3\2\2\2\u017a\u017b\7\b\2\2\u017b\u017c\5h\65\2"+
		"\u017c\u017d\7\'\2\2\u017d\u017e\5\24\13\2\u017eO\3\2\2\2\u017f\u0180"+
		"\7\t\2\2\u0180\u0181\7\'\2\2\u0181\u0182\5\24\13\2\u0182Q\3\2\2\2\u0183"+
		"\u0184\7\n\2\2\u0184\u0185\7\25\2\2\u0185S\3\2\2\2\u0186\u0187\7\r\2\2"+
		"\u0187\u0188\7\25\2\2\u0188U\3\2\2\2\u0189\u018a\7\13\2\2\u018a\u018b"+
		"\7\25\2\2\u018bW\3\2\2\2\u018c\u018d\7\f\2\2\u018d\u018e\7\25\2\2\u018e"+
		"Y\3\2\2\2\u018f\u0190\5R*\2\u0190\u0191\7+\2\2\u0191\u0192\5d\63\2\u0192"+
		"[\3\2\2\2\u0193\u0194\5V,\2\u0194\u0195\7+\2\2\u0195\u0196\7\23\2\2\u0196"+
		"]\3\2\2\2\u0197\u0198\5X-\2\u0198\u0199\7+\2\2\u0199\u019a\7\24\2\2\u019a"+
		"_\3\2\2\2\u019b\u019c\5T+\2\u019c\u019d\7+\2\2\u019d\u019e\5b\62\2\u019e"+
		"a\3\2\2\2\u019f\u01a0\b\62\1\2\u01a0\u01af\7\21\2\2\u01a1\u01a2\7\25\2"+
		"\2\u01a2\u01a3\7.\2\2\u01a3\u01af\7\21\2\2\u01a4\u01a5\5d\63\2\u01a5\u01a6"+
		"\5j\66\2\u01a6\u01a7\5d\63\2\u01a7\u01af\3\2\2\2\u01a8\u01a9\7\62\2\2"+
		"\u01a9\u01af\5b\62\4\u01aa\u01ab\7!\2\2\u01ab\u01ac\5b\62\2\u01ac\u01ad"+
		"\7\"\2\2\u01ad\u01af\3\2\2\2\u01ae\u019f\3\2\2\2\u01ae\u01a1\3\2\2\2\u01ae"+
		"\u01a4\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af\u01b6\3\2"+
		"\2\2\u01b0\u01b1\f\5\2\2\u01b1\u01b2\5f\64\2\u01b2\u01b3\5b\62\6\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7c\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba"+
		"\b\63\1\2\u01ba\u01c1\7\25\2\2\u01bb\u01c1\5l\67\2\u01bc\u01bd\7!\2\2"+
		"\u01bd\u01be\5d\63\2\u01be\u01bf\7\"\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01b9"+
		"\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c1\u01ca\3\2\2\2\u01c2"+
		"\u01c3\f\7\2\2\u01c3\u01c4\t\4\2\2\u01c4\u01c9\5d\63\b\u01c5\u01c6\f\6"+
		"\2\2\u01c6\u01c7\t\5\2\2\u01c7\u01c9\5d\63\7\u01c8\u01c2\3\2\2\2\u01c8"+
		"\u01c5\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cbe\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\t\6\2\2\u01ceg\3\2"+
		"\2\2\u01cf\u01d5\5l\67\2\u01d0\u01d5\7\23\2\2\u01d1\u01d5\7\24\2\2\u01d2"+
		"\u01d5\7\21\2\2\u01d3\u01d5\7\25\2\2\u01d4\u01cf\3\2\2\2\u01d4\u01d0\3"+
		"\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"i\3\2\2\2\u01d6\u01d7\t\7\2\2\u01d7k\3\2\2\2\u01d8\u01db\7\22\2\2\u01d9"+
		"\u01db\7\36\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbm\3\2\2\2"+
		"$qw\u0083\u0089\u008f\u0091\u0097\u009e\u00a7\u00ae\u00c0\u00c6\u00f4"+
		"\u00fe\u0105\u010d\u0115\u011d\u0124\u0129\u0131\u0142\u0147\u0155\u015c"+
		"\u0166\u016c\u01ae\u01b6\u01c0\u01c8\u01ca\u01d4\u01da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}