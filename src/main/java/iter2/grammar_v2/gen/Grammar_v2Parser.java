package iter2.grammar_v2.gen;// Generated from Grammar_v2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Grammar_v2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILESTMT=1, FORSTMT=2, IFSTMT=3, SWITCHSTMT=4, CASE=5, DEFAULT=6, NUMDCL=7, 
		STRDCL=8, CHARDCL=9, BOOLDCL=10, BREAK=11, BLANK=12, BOOLVAL=13, ID=14, 
		SAFETY=15, NUMVAL=16, CHARVAL=17, STRVAL=18, PLUS=19, MINUS=20, TIMES=21, 
		DIVISION=22, POW=23, SQUARE=24, MOD=25, PI=26, LPAR=27, RPAR=28, LBRACE=29, 
		RBRACE=30, DOT=31, COMMA=32, COLON=33, SEMI=34, SINGLEQOUTE=35, DOUBLEQOUTE=36, 
		ASSIGN=37, LEQ=38, GEQ=39, EQ=40, NEQ=41, LESS=42, GREATER=43, NOT=44, 
		AND=45, OR=46, HASHTAG=47, WS=48;
	public static final int
		RULE_prog = 0, RULE_declarations = 1, RULE_commands = 2, RULE_declaration = 3, 
		RULE_safedeclaration = 4, RULE_reassign = 5, RULE_params = 6, RULE_block = 7, 
		RULE_caseblock = 8, RULE_vdcl = 9, RULE_vassign = 10, RULE_vdclassign = 11, 
		RULE_command = 12, RULE_funccalls = 13, RULE_funcdcl = 14, RULE_callparams = 15, 
		RULE_ctrlstruct = 16, RULE_iterative = 17, RULE_selective = 18, RULE_iflogic = 19, 
		RULE_scase = 20, RULE_defcase = 21, RULE_forparams = 22, RULE_boolassignment = 23, 
		RULE_booldclassign = 24, RULE_booldecl = 25, RULE_numassignment = 26, 
		RULE_numdclassign = 27, RULE_numdecl = 28, RULE_charassignment = 29, RULE_chardclassign = 30, 
		RULE_chardecl = 31, RULE_stringassignment = 32, RULE_stringdclassign = 33, 
		RULE_stringdecl = 34, RULE_bexpr = 35, RULE_aexpr = 36, RULE_term = 37, 
		RULE_part = 38, RULE_bop = 39, RULE_vals = 40, RULE_numberval = 41, RULE_relop = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declarations", "commands", "declaration", "safedeclaration", 
			"reassign", "params", "block", "caseblock", "vdcl", "vassign", "vdclassign", 
			"command", "funccalls", "funcdcl", "callparams", "ctrlstruct", "iterative", 
			"selective", "iflogic", "scase", "defcase", "forparams", "boolassignment", 
			"booldclassign", "booldecl", "numassignment", "numdclassign", "numdecl", 
			"charassignment", "chardclassign", "chardecl", "stringassignment", "stringdclassign", 
			"stringdecl", "bexpr", "aexpr", "term", "part", "bop", "vals", "numberval", 
			"relop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'for'", "'if'", "'switch'", "'case'", "'default'", 
			"'number'", "'string'", "'char'", "'boolean'", null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'pow'", "'sqrt'", 
			"'%'", "'pi'", "'('", "')'", "'{'", "'}'", "'.'", "','", "':'", "';'", 
			"'''", "'\"'", "'='", "'<='", "'>='", "'=='", "'!='", "'<'", "'>'", "'!'", 
			"'&&'", "'||'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILESTMT", "FORSTMT", "IFSTMT", "SWITCHSTMT", "CASE", "DEFAULT", 
			"NUMDCL", "STRDCL", "CHARDCL", "BOOLDCL", "BREAK", "BLANK", "BOOLVAL", 
			"ID", "SAFETY", "NUMVAL", "CHARVAL", "STRVAL", "PLUS", "MINUS", "TIMES", 
			"DIVISION", "POW", "SQUARE", "MOD", "PI", "LPAR", "RPAR", "LBRACE", "RBRACE", 
			"DOT", "COMMA", "COLON", "SEMI", "SINGLEQOUTE", "DOUBLEQOUTE", "ASSIGN", 
			"LEQ", "GEQ", "EQ", "NEQ", "LESS", "GREATER", "NOT", "AND", "OR", "HASHTAG", 
			"WS"
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
	public String getGrammarFileName() { return "Grammar_v2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Grammar_v2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			declarations();
			setState(87);
			commands();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				declaration();
				setState(90);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commands);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILESTMT:
			case FORSTMT:
			case IFSTMT:
			case SWITCHSTMT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				command();
				setState(96);
				commands();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclarationContext extends ParserRuleContext {
		public SafedeclarationContext safedeclaration() {
			return getRuleContext(SafedeclarationContext.class,0);
		}
		public ReassignContext reassign() {
			return getRuleContext(ReassignContext.class,0);
		}
		public FuncdclContext funcdcl() {
			return getRuleContext(FuncdclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				safedeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				reassign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				funcdcl();
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

	public static class SafedeclarationContext extends ParserRuleContext {
		public TerminalNode SAFETY() { return getToken(Grammar_v2Parser.SAFETY, 0); }
		public TerminalNode SEMI() { return getToken(Grammar_v2Parser.SEMI, 0); }
		public VdclContext vdcl() {
			return getRuleContext(VdclContext.class,0);
		}
		public VdclassignContext vdclassign() {
			return getRuleContext(VdclassignContext.class,0);
		}
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public SafedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterSafedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitSafedeclaration(this);
		}
	}

	public final SafedeclarationContext safedeclaration() throws RecognitionException {
		SafedeclarationContext _localctx = new SafedeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_safedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(SAFETY);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(107);
				match(BLANK);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(113);
				vdcl();
				}
				break;
			case 2:
				{
				setState(114);
				vdclassign();
				}
				break;
			}
			setState(117);
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

	public static class ReassignContext extends ParserRuleContext {
		public VassignContext vassign() {
			return getRuleContext(VassignContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Grammar_v2Parser.SEMI, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public ReassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterReassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitReassign(this);
		}
	}

	public final ReassignContext reassign() throws RecognitionException {
		ReassignContext _localctx = new ReassignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(119);
				match(BLANK);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			vassign();
			setState(126);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<VdclContext> vdcl() {
			return getRuleContexts(VdclContext.class);
		}
		public VdclContext vdcl(int i) {
			return getRuleContext(VdclContext.class,i);
		}
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Grammar_v2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Grammar_v2Parser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			vdcl();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(129);
				match(BLANK);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(136);
					match(BLANK);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				vdcl();
				}
				}
				setState(147);
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
		public TerminalNode LBRACE() { return getToken(Grammar_v2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Grammar_v2Parser.RBRACE, 0); }
		public List<SafedeclarationContext> safedeclaration() {
			return getRuleContexts(SafedeclarationContext.class);
		}
		public SafedeclarationContext safedeclaration(int i) {
			return getRuleContext(SafedeclarationContext.class,i);
		}
		public List<ReassignContext> reassign() {
			return getRuleContexts(ReassignContext.class);
		}
		public ReassignContext reassign(int i) {
			return getRuleContext(ReassignContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(LBRACE);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILESTMT) | (1L << FORSTMT) | (1L << IFSTMT) | (1L << SWITCHSTMT) | (1L << BLANK) | (1L << ID) | (1L << SAFETY))) != 0)) {
				{
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(149);
					safedeclaration();
					}
					break;
				case 2:
					{
					setState(150);
					reassign();
					}
					break;
				case 3:
					{
					setState(151);
					command();
					}
					break;
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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
		public List<SafedeclarationContext> safedeclaration() {
			return getRuleContexts(SafedeclarationContext.class);
		}
		public SafedeclarationContext safedeclaration(int i) {
			return getRuleContext(SafedeclarationContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(Grammar_v2Parser.BREAK, 0); }
		public CaseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterCaseblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitCaseblock(this);
		}
	}

	public final CaseblockContext caseblock() throws RecognitionException {
		CaseblockContext _localctx = new CaseblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_caseblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILESTMT) | (1L << FORSTMT) | (1L << IFSTMT) | (1L << SWITCHSTMT) | (1L << ID) | (1L << SAFETY))) != 0)) {
				{
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SAFETY:
					{
					setState(159);
					safedeclaration();
					}
					break;
				case WHILESTMT:
				case FORSTMT:
				case IFSTMT:
				case SWITCHSTMT:
				case ID:
					{
					setState(160);
					command();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(166);
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
		public VdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterVdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitVdcl(this);
		}
	}

	public final VdclContext vdcl() throws RecognitionException {
		VdclContext _localctx = new VdclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vdcl);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				numdecl();
				}
				break;
			case CHARDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				chardecl();
				}
				break;
			case STRDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				stringdecl();
				}
				break;
			case BOOLDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				booldecl();
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
		public NumassignmentContext numassignment() {
			return getRuleContext(NumassignmentContext.class,0);
		}
		public CharassignmentContext charassignment() {
			return getRuleContext(CharassignmentContext.class,0);
		}
		public StringassignmentContext stringassignment() {
			return getRuleContext(StringassignmentContext.class,0);
		}
		public BoolassignmentContext boolassignment() {
			return getRuleContext(BoolassignmentContext.class,0);
		}
		public VassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterVassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitVassign(this);
		}
	}

	public final VassignContext vassign() throws RecognitionException {
		VassignContext _localctx = new VassignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vassign);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				numassignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				charassignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				stringassignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				boolassignment();
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
		public VdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vdclassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterVdclassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitVdclassign(this);
		}
	}

	public final VdclassignContext vdclassign() throws RecognitionException {
		VdclassignContext _localctx = new VdclassignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vdclassign);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				numdclassign();
				}
				break;
			case CHARDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				chardclassign();
				}
				break;
			case STRDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				stringdclassign();
				}
				break;
			case BOOLDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				booldclassign();
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

	public static class CommandContext extends ParserRuleContext {
		public CtrlstructContext ctrlstruct() {
			return getRuleContext(CtrlstructContext.class,0);
		}
		public FunccallsContext funccalls() {
			return getRuleContext(FunccallsContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_command);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILESTMT:
			case FORSTMT:
			case IFSTMT:
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				ctrlstruct();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				funccalls();
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
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(Grammar_v2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Grammar_v2Parser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(Grammar_v2Parser.SEMI, 0); }
		public CallparamsContext callparams() {
			return getRuleContext(CallparamsContext.class,0);
		}
		public FunccallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccalls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterFunccalls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitFunccalls(this);
		}
	}

	public final FunccallsContext funccalls() throws RecognitionException {
		FunccallsContext _localctx = new FunccallsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funccalls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ID);
			setState(192);
			match(LPAR);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVAL) | (1L << ID) | (1L << NUMVAL) | (1L << CHARVAL) | (1L << STRVAL) | (1L << PI))) != 0)) {
				{
				setState(193);
				callparams();
				}
			}

			setState(196);
			match(RPAR);
			setState(197);
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

	public static class FuncdclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(Grammar_v2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Grammar_v2Parser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterFuncdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitFuncdcl(this);
		}
	}

	public final FuncdclContext funcdcl() throws RecognitionException {
		FuncdclContext _localctx = new FuncdclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			match(LPAR);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMDCL) | (1L << STRDCL) | (1L << CHARDCL) | (1L << BOOLDCL))) != 0)) {
				{
				setState(201);
				params();
				}
			}

			setState(204);
			match(RPAR);
			setState(205);
			block();
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
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Grammar_v2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Grammar_v2Parser.COMMA, i);
		}
		public CallparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterCallparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitCallparams(this);
		}
	}

	public final CallparamsContext callparams() throws RecognitionException {
		CallparamsContext _localctx = new CallparamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			vals();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(208);
				match(BLANK);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(215);
					match(BLANK);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				vals();
				}
				}
				setState(226);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterCtrlstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitCtrlstruct(this);
		}
	}

	public final CtrlstructContext ctrlstruct() throws RecognitionException {
		CtrlstructContext _localctx = new CtrlstructContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ctrlstruct);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSTMT:
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				selective();
				}
				break;
			case WHILESTMT:
			case FORSTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
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
		public TerminalNode FORSTMT() { return getToken(Grammar_v2Parser.FORSTMT, 0); }
		public TerminalNode LPAR() { return getToken(Grammar_v2Parser.LPAR, 0); }
		public ForparamsContext forparams() {
			return getRuleContext(ForparamsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Grammar_v2Parser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILESTMT() { return getToken(Grammar_v2Parser.WHILESTMT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public IterativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterIterative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitIterative(this);
		}
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterative);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(FORSTMT);
				setState(232);
				match(LPAR);
				setState(233);
				forparams();
				setState(234);
				match(RPAR);
				setState(235);
				block();
				}
				break;
			case WHILESTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(WHILESTMT);
				setState(238);
				match(LPAR);
				setState(239);
				bexpr(0);
				setState(240);
				match(RPAR);
				setState(241);
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
		public TerminalNode IFSTMT() { return getToken(Grammar_v2Parser.IFSTMT, 0); }
		public IflogicContext iflogic() {
			return getRuleContext(IflogicContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SWITCHSTMT() { return getToken(Grammar_v2Parser.SWITCHSTMT, 0); }
		public TerminalNode LPAR() { return getToken(Grammar_v2Parser.LPAR, 0); }
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode RPAR() { return getToken(Grammar_v2Parser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(Grammar_v2Parser.LBRACE, 0); }
		public DefcaseContext defcase() {
			return getRuleContext(DefcaseContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Grammar_v2Parser.RBRACE, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterSelective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitSelective(this);
		}
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selective);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(IFSTMT);
				setState(246);
				iflogic();
				setState(247);
				block();
				}
				break;
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(SWITCHSTMT);
				setState(250);
				match(LPAR);
				setState(251);
				match(ID);
				setState(252);
				match(RPAR);
				setState(253);
				match(LBRACE);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(254);
					scase();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				defcase();
				setState(261);
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
		public TerminalNode LPAR() { return getToken(Grammar_v2Parser.LPAR, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Grammar_v2Parser.RPAR, 0); }
		public IflogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iflogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterIflogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitIflogic(this);
		}
	}

	public final IflogicContext iflogic() throws RecognitionException {
		IflogicContext _localctx = new IflogicContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iflogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LPAR);
			setState(266);
			bexpr(0);
			setState(267);
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

	public static class ScaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Grammar_v2Parser.CASE, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Grammar_v2Parser.COLON, 0); }
		public CaseblockContext caseblock() {
			return getRuleContext(CaseblockContext.class,0);
		}
		public ScaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterScase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitScase(this);
		}
	}

	public final ScaseContext scase() throws RecognitionException {
		ScaseContext _localctx = new ScaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(CASE);
			setState(270);
			match(BLANK);
			setState(271);
			vals();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(272);
				match(BLANK);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(COLON);
			setState(279);
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
		public TerminalNode DEFAULT() { return getToken(Grammar_v2Parser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(Grammar_v2Parser.COLON, 0); }
		public CaseblockContext caseblock() {
			return getRuleContext(CaseblockContext.class,0);
		}
		public DefcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterDefcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitDefcase(this);
		}
	}

	public final DefcaseContext defcase() throws RecognitionException {
		DefcaseContext _localctx = new DefcaseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_defcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(DEFAULT);
			setState(282);
			match(COLON);
			setState(283);
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

	public static class ForparamsContext extends ParserRuleContext {
		public NumdclassignContext numdclassign() {
			return getRuleContext(NumdclassignContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(Grammar_v2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Grammar_v2Parser.SEMI, i);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public NumassignmentContext numassignment() {
			return getRuleContext(NumassignmentContext.class,0);
		}
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public ForparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterForparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitForparams(this);
		}
	}

	public final ForparamsContext forparams() throws RecognitionException {
		ForparamsContext _localctx = new ForparamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			numdclassign();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(286);
				match(BLANK);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(SEMI);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(293);
				match(BLANK);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			bexpr(0);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(300);
				match(BLANK);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(SEMI);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(307);
				match(BLANK);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			numassignment();
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

	public static class BoolassignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Grammar_v2Parser.ASSIGN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public BoolassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterBoolassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitBoolassignment(this);
		}
	}

	public final BoolassignmentContext boolassignment() throws RecognitionException {
		BoolassignmentContext _localctx = new BoolassignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(316);
				match(BLANK);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(ASSIGN);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(323);
				match(BLANK);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
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

	public static class BooldclassignContext extends ParserRuleContext {
		public TerminalNode BOOLDCL() { return getToken(Grammar_v2Parser.BOOLDCL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Grammar_v2Parser.ASSIGN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BooldclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldclassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterBooldclassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitBooldclassign(this);
		}
	}

	public final BooldclassignContext booldclassign() throws RecognitionException {
		BooldclassignContext _localctx = new BooldclassignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booldclassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(BOOLDCL);
			setState(332);
			match(BLANK);
			setState(333);
			match(ID);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(334);
				match(BLANK);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(ASSIGN);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(341);
				match(BLANK);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
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

	public static class BooldeclContext extends ParserRuleContext {
		public TerminalNode BOOLDCL() { return getToken(Grammar_v2Parser.BOOLDCL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public BooldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterBooldecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitBooldecl(this);
		}
	}

	public final BooldeclContext booldecl() throws RecognitionException {
		BooldeclContext _localctx = new BooldeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booldecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(BOOLDCL);
			setState(350);
			match(BLANK);
			setState(351);
			match(ID);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					match(BLANK);
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class NumassignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Grammar_v2Parser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public NumassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterNumassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitNumassignment(this);
		}
	}

	public final NumassignmentContext numassignment() throws RecognitionException {
		NumassignmentContext _localctx = new NumassignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_numassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ID);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(359);
				match(BLANK);
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(ASSIGN);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(366);
				match(BLANK);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
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

	public static class NumdclassignContext extends ParserRuleContext {
		public TerminalNode NUMDCL() { return getToken(Grammar_v2Parser.NUMDCL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Grammar_v2Parser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public NumdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdclassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterNumdclassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitNumdclassign(this);
		}
	}

	public final NumdclassignContext numdclassign() throws RecognitionException {
		NumdclassignContext _localctx = new NumdclassignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numdclassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(NUMDCL);
			setState(375);
			match(BLANK);
			setState(376);
			match(ID);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(377);
				match(BLANK);
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(ASSIGN);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(384);
				match(BLANK);
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
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

	public static class NumdeclContext extends ParserRuleContext {
		public TerminalNode NUMDCL() { return getToken(Grammar_v2Parser.NUMDCL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public NumdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterNumdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitNumdecl(this);
		}
	}

	public final NumdeclContext numdecl() throws RecognitionException {
		NumdeclContext _localctx = new NumdeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numdecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(NUMDCL);
			setState(393);
			match(BLANK);
			setState(394);
			match(ID);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					match(BLANK);
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class CharassignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Grammar_v2Parser.ASSIGN, 0); }
		public TerminalNode CHARVAL() { return getToken(Grammar_v2Parser.CHARVAL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public CharassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterCharassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitCharassignment(this);
		}
	}

	public final CharassignmentContext charassignment() throws RecognitionException {
		CharassignmentContext _localctx = new CharassignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_charassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(ID);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(402);
				match(BLANK);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(ASSIGN);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(409);
				match(BLANK);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
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

	public static class ChardclassignContext extends ParserRuleContext {
		public TerminalNode CHARDCL() { return getToken(Grammar_v2Parser.CHARDCL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Grammar_v2Parser.ASSIGN, 0); }
		public TerminalNode CHARVAL() { return getToken(Grammar_v2Parser.CHARVAL, 0); }
		public ChardclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardclassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterChardclassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitChardclassign(this);
		}
	}

	public final ChardclassignContext chardclassign() throws RecognitionException {
		ChardclassignContext _localctx = new ChardclassignContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_chardclassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(CHARDCL);
			setState(418);
			match(BLANK);
			setState(419);
			match(ID);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(420);
				match(BLANK);
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(ASSIGN);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(427);
				match(BLANK);
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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

	public static class ChardeclContext extends ParserRuleContext {
		public TerminalNode CHARDCL() { return getToken(Grammar_v2Parser.CHARDCL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public ChardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterChardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitChardecl(this);
		}
	}

	public final ChardeclContext chardecl() throws RecognitionException {
		ChardeclContext _localctx = new ChardeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_chardecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(CHARDCL);
			setState(436);
			match(BLANK);
			setState(437);
			match(ID);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(438);
					match(BLANK);
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class StringassignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Grammar_v2Parser.ASSIGN, 0); }
		public TerminalNode STRVAL() { return getToken(Grammar_v2Parser.STRVAL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public StringassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterStringassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitStringassignment(this);
		}
	}

	public final StringassignmentContext stringassignment() throws RecognitionException {
		StringassignmentContext _localctx = new StringassignmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stringassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(ID);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(445);
				match(BLANK);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(ASSIGN);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(452);
				match(BLANK);
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
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

	public static class StringdclassignContext extends ParserRuleContext {
		public TerminalNode STRDCL() { return getToken(Grammar_v2Parser.STRDCL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Grammar_v2Parser.ASSIGN, 0); }
		public TerminalNode STRVAL() { return getToken(Grammar_v2Parser.STRVAL, 0); }
		public StringdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdclassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterStringdclassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitStringdclassign(this);
		}
	}

	public final StringdclassignContext stringdclassign() throws RecognitionException {
		StringdclassignContext _localctx = new StringdclassignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stringdclassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(STRDCL);
			setState(461);
			match(BLANK);
			setState(462);
			match(ID);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(463);
				match(BLANK);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			match(ASSIGN);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(470);
				match(BLANK);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
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

	public static class StringdeclContext extends ParserRuleContext {
		public TerminalNode STRDCL() { return getToken(Grammar_v2Parser.STRDCL, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public StringdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterStringdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitStringdecl(this);
		}
	}

	public final StringdeclContext stringdecl() throws RecognitionException {
		StringdeclContext _localctx = new StringdeclContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stringdecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(STRDCL);
			setState(479);
			match(BLANK);
			setState(480);
			match(ID);
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(481);
					match(BLANK);
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class BexprContext extends ParserRuleContext {
		public List<TerminalNode> BOOLVAL() { return getTokens(Grammar_v2Parser.BOOLVAL); }
		public TerminalNode BOOLVAL(int i) {
			return getToken(Grammar_v2Parser.BOOLVAL, i);
		}
		public TerminalNode NOT() { return getToken(Grammar_v2Parser.NOT, 0); }
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(Grammar_v2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Grammar_v2Parser.RPAR, 0); }
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitBexpr(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(488);
				match(BOOLVAL);
				}
				break;
			case 2:
				{
				setState(489);
				match(NOT);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(490);
					match(BLANK);
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				bexpr(3);
				}
				break;
			case 3:
				{
				setState(499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case NUMVAL:
				case LPAR:
					{
					setState(497);
					aexpr();
					}
					break;
				case BOOLVAL:
					{
					setState(498);
					match(BOOLVAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(501);
					match(BLANK);
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(507);
				relop();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(508);
					match(BLANK);
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case NUMVAL:
				case LPAR:
					{
					setState(514);
					aexpr();
					}
					break;
				case BOOLVAL:
					{
					setState(515);
					match(BOOLVAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(518);
				match(LPAR);
				setState(519);
				bexpr(0);
				setState(520);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
					setState(524);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BLANK) {
						{
						{
						setState(525);
						match(BLANK);
						}
						}
						setState(530);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(531);
					bop();
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BLANK) {
						{
						{
						setState(532);
						match(BLANK);
						}
						}
						setState(537);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(538);
					bexpr(6);
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Grammar_v2Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Grammar_v2Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Grammar_v2Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Grammar_v2Parser.MINUS, i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitAexpr(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_aexpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			term();
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(546);
					match(BLANK);
					}
					} 
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(552);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BLANK) {
						{
						{
						setState(553);
						match(BLANK);
						}
						}
						setState(558);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(559);
					term();
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(Grammar_v2Parser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(Grammar_v2Parser.TIMES, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(Grammar_v2Parser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(Grammar_v2Parser.DIVISION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(Grammar_v2Parser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(Grammar_v2Parser.MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			part();
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(566);
					match(BLANK);
					}
					} 
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(572);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BLANK) {
						{
						{
						setState(573);
						match(BLANK);
						}
						}
						setState(578);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(579);
					part();
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		public TerminalNode LPAR() { return getToken(Grammar_v2Parser.LPAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Grammar_v2Parser.RPAR, 0); }
		public List<TerminalNode> BLANK() { return getTokens(Grammar_v2Parser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(Grammar_v2Parser.BLANK, i);
		}
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public TerminalNode NUMVAL() { return getToken(Grammar_v2Parser.NUMVAL, 0); }
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitPart(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_part);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(LPAR);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(586);
					match(BLANK);
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				aexpr();
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(593);
					match(BLANK);
					}
					}
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(599);
				match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				match(ID);
				}
				break;
			case NUMVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				match(NUMVAL);
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

	public static class BopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Grammar_v2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Grammar_v2Parser.OR, 0); }
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitBop(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
		public TerminalNode CHARVAL() { return getToken(Grammar_v2Parser.CHARVAL, 0); }
		public TerminalNode STRVAL() { return getToken(Grammar_v2Parser.STRVAL, 0); }
		public TerminalNode BOOLVAL() { return getToken(Grammar_v2Parser.BOOLVAL, 0); }
		public TerminalNode ID() { return getToken(Grammar_v2Parser.ID, 0); }
		public ValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterVals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitVals(this);
		}
	}

	public final ValsContext vals() throws RecognitionException {
		ValsContext _localctx = new ValsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_vals);
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case PI:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				numberval();
				}
				break;
			case CHARVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(CHARVAL);
				}
				break;
			case STRVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(STRVAL);
				}
				break;
			case BOOLVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(610);
				match(BOOLVAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(611);
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
		public TerminalNode NUMVAL() { return getToken(Grammar_v2Parser.NUMVAL, 0); }
		public TerminalNode PI() { return getToken(Grammar_v2Parser.PI, 0); }
		public NumbervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterNumberval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitNumberval(this);
		}
	}

	public final NumbervalContext numberval() throws RecognitionException {
		NumbervalContext _localctx = new NumbervalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_numberval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( !(_la==NUMVAL || _la==PI) ) {
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(Grammar_v2Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(Grammar_v2Parser.NEQ, 0); }
		public TerminalNode GEQ() { return getToken(Grammar_v2Parser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(Grammar_v2Parser.LEQ, 0); }
		public TerminalNode LESS() { return getToken(Grammar_v2Parser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(Grammar_v2Parser.GREATER, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammar_v2Listener ) ((Grammar_v2Listener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u026d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3\4\5\4f\n\4\3\5"+
		"\3\5\3\5\5\5k\n\5\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\3\6\5\6v\n\6\3\6"+
		"\3\6\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\3\7\3\b\3\b\7\b\u0085\n\b\f\b"+
		"\16\b\u0088\13\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b\3\b\7\b\u0092"+
		"\n\b\f\b\16\b\u0095\13\b\3\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e"+
		"\13\t\3\t\3\t\3\n\3\n\7\n\u00a4\n\n\f\n\16\n\u00a7\13\n\3\n\5\n\u00aa"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u00b0\n\13\3\f\3\f\3\f\3\f\5\f\u00b6\n\f"+
		"\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\5\16\u00c0\n\16\3\17\3\17\3\17"+
		"\5\17\u00c5\n\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00cd\n\20\3\20\3"+
		"\20\3\20\3\21\3\21\7\21\u00d4\n\21\f\21\16\21\u00d7\13\21\3\21\3\21\7"+
		"\21\u00db\n\21\f\21\16\21\u00de\13\21\3\21\7\21\u00e1\n\21\f\21\16\21"+
		"\u00e4\13\21\3\22\3\22\5\22\u00e8\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f6\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0102\n\24\f\24\16\24\u0105\13\24\3\24"+
		"\3\24\3\24\5\24\u010a\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26"+
		"\u0114\n\26\f\26\16\26\u0117\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\7\30\u0122\n\30\f\30\16\30\u0125\13\30\3\30\3\30\7\30\u0129"+
		"\n\30\f\30\16\30\u012c\13\30\3\30\3\30\7\30\u0130\n\30\f\30\16\30\u0133"+
		"\13\30\3\30\3\30\7\30\u0137\n\30\f\30\16\30\u013a\13\30\3\30\3\30\3\31"+
		"\3\31\7\31\u0140\n\31\f\31\16\31\u0143\13\31\3\31\3\31\7\31\u0147\n\31"+
		"\f\31\16\31\u014a\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0152\n\32"+
		"\f\32\16\32\u0155\13\32\3\32\3\32\7\32\u0159\n\32\f\32\16\32\u015c\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0164\n\33\f\33\16\33\u0167\13"+
		"\33\3\34\3\34\7\34\u016b\n\34\f\34\16\34\u016e\13\34\3\34\3\34\7\34\u0172"+
		"\n\34\f\34\16\34\u0175\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u017d"+
		"\n\35\f\35\16\35\u0180\13\35\3\35\3\35\7\35\u0184\n\35\f\35\16\35\u0187"+
		"\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u018f\n\36\f\36\16\36\u0192"+
		"\13\36\3\37\3\37\7\37\u0196\n\37\f\37\16\37\u0199\13\37\3\37\3\37\7\37"+
		"\u019d\n\37\f\37\16\37\u01a0\13\37\3\37\3\37\3 \3 \3 \3 \7 \u01a8\n \f"+
		" \16 \u01ab\13 \3 \3 \7 \u01af\n \f \16 \u01b2\13 \3 \3 \3!\3!\3!\3!\7"+
		"!\u01ba\n!\f!\16!\u01bd\13!\3\"\3\"\7\"\u01c1\n\"\f\"\16\"\u01c4\13\""+
		"\3\"\3\"\7\"\u01c8\n\"\f\"\16\"\u01cb\13\"\3\"\3\"\3#\3#\3#\3#\7#\u01d3"+
		"\n#\f#\16#\u01d6\13#\3#\3#\7#\u01da\n#\f#\16#\u01dd\13#\3#\3#\3$\3$\3"+
		"$\3$\7$\u01e5\n$\f$\16$\u01e8\13$\3%\3%\3%\3%\7%\u01ee\n%\f%\16%\u01f1"+
		"\13%\3%\3%\3%\5%\u01f6\n%\3%\7%\u01f9\n%\f%\16%\u01fc\13%\3%\3%\7%\u0200"+
		"\n%\f%\16%\u0203\13%\3%\3%\5%\u0207\n%\3%\3%\3%\3%\5%\u020d\n%\3%\3%\7"+
		"%\u0211\n%\f%\16%\u0214\13%\3%\3%\7%\u0218\n%\f%\16%\u021b\13%\3%\3%\7"+
		"%\u021f\n%\f%\16%\u0222\13%\3&\3&\7&\u0226\n&\f&\16&\u0229\13&\3&\3&\7"+
		"&\u022d\n&\f&\16&\u0230\13&\3&\7&\u0233\n&\f&\16&\u0236\13&\3\'\3\'\7"+
		"\'\u023a\n\'\f\'\16\'\u023d\13\'\3\'\3\'\7\'\u0241\n\'\f\'\16\'\u0244"+
		"\13\'\3\'\7\'\u0247\n\'\f\'\16\'\u024a\13\'\3(\3(\7(\u024e\n(\f(\16(\u0251"+
		"\13(\3(\3(\7(\u0255\n(\f(\16(\u0258\13(\3(\3(\3(\3(\5(\u025e\n(\3)\3)"+
		"\3*\3*\3*\3*\3*\5*\u0267\n*\3+\3+\3,\3,\3,\2\3H-\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\7\3\2\25\26"+
		"\4\2\27\30\33\33\3\2/\60\4\2\22\22\34\34\3\2(-\2\u0296\2X\3\2\2\2\4_\3"+
		"\2\2\2\6e\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\f|\3\2\2\2\16\u0082\3\2\2\2\20"+
		"\u0096\3\2\2\2\22\u00a5\3\2\2\2\24\u00af\3\2\2\2\26\u00b5\3\2\2\2\30\u00bb"+
		"\3\2\2\2\32\u00bf\3\2\2\2\34\u00c1\3\2\2\2\36\u00c9\3\2\2\2 \u00d1\3\2"+
		"\2\2\"\u00e7\3\2\2\2$\u00f5\3\2\2\2&\u0109\3\2\2\2(\u010b\3\2\2\2*\u010f"+
		"\3\2\2\2,\u011b\3\2\2\2.\u011f\3\2\2\2\60\u013d\3\2\2\2\62\u014d\3\2\2"+
		"\2\64\u015f\3\2\2\2\66\u0168\3\2\2\28\u0178\3\2\2\2:\u018a\3\2\2\2<\u0193"+
		"\3\2\2\2>\u01a3\3\2\2\2@\u01b5\3\2\2\2B\u01be\3\2\2\2D\u01ce\3\2\2\2F"+
		"\u01e0\3\2\2\2H\u020c\3\2\2\2J\u0223\3\2\2\2L\u0237\3\2\2\2N\u025d\3\2"+
		"\2\2P\u025f\3\2\2\2R\u0266\3\2\2\2T\u0268\3\2\2\2V\u026a\3\2\2\2XY\5\4"+
		"\3\2YZ\5\6\4\2Z\3\3\2\2\2[\\\5\b\5\2\\]\5\4\3\2]`\3\2\2\2^`\3\2\2\2_["+
		"\3\2\2\2_^\3\2\2\2`\5\3\2\2\2ab\5\32\16\2bc\5\6\4\2cf\3\2\2\2df\3\2\2"+
		"\2ea\3\2\2\2ed\3\2\2\2f\7\3\2\2\2gk\5\n\6\2hk\5\f\7\2ik\5\36\20\2jg\3"+
		"\2\2\2jh\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lp\7\21\2\2mo\7\16\2\2nm\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qu\3\2\2\2rp\3\2\2\2sv\5\24\13\2tv\5\30"+
		"\r\2us\3\2\2\2ut\3\2\2\2vw\3\2\2\2wx\7$\2\2x\13\3\2\2\2y{\7\16\2\2zy\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\5\26\f\2\u0080\u0081\7$\2\2\u0081\r\3\2\2\2\u0082\u0086\5\24\13\2\u0083"+
		"\u0085\7\16\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0093\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008d\7\"\2\2\u008a\u008c\7\16\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0092\5\24\13\2\u0091\u0089\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\17\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u009c\7\37\2\2\u0097\u009b\5\n\6\2\u0098\u009b\5"+
		"\f\7\2\u0099\u009b\5\32\16\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7 \2\2\u00a0"+
		"\21\3\2\2\2\u00a1\u00a4\5\n\6\2\u00a2\u00a4\5\32\16\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7\r"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00b0"+
		"\5:\36\2\u00ac\u00b0\5@!\2\u00ad\u00b0\5F$\2\u00ae\u00b0\5\64\33\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\25\3\2\2\2\u00b1\u00b6\5\66\34\2\u00b2\u00b6\5<\37\2\u00b3"+
		"\u00b6\5B\"\2\u00b4\u00b6\5\60\31\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\27\3\2\2\2\u00b7"+
		"\u00bc\58\35\2\u00b8\u00bc\5> \2\u00b9\u00bc\5D#\2\u00ba\u00bc\5\62\32"+
		"\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00c0\5\"\22\2\u00be\u00c0\5\34\17\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00c2\7\20\2"+
		"\2\u00c2\u00c4\7\35\2\2\u00c3\u00c5\5 \21\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\36\2\2\u00c7\u00c8\7"+
		"$\2\2\u00c8\35\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca\u00cc\7\35\2\2\u00cb"+
		"\u00cd\5\16\b\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cf\7\36\2\2\u00cf\u00d0\5\20\t\2\u00d0\37\3\2\2\2\u00d1"+
		"\u00d5\5R*\2\u00d2\u00d4\7\16\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e2\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00dc\7\"\2\2\u00d9\u00db\7\16\2\2\u00da\u00d9\3"+
		"\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5R*\2\u00e0\u00d8\3\2\2"+
		"\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3!"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\5&\24\2\u00e6\u00e8\5$\23\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00ea\7\4\2\2"+
		"\u00ea\u00eb\7\35\2\2\u00eb\u00ec\5.\30\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee"+
		"\5\20\t\2\u00ee\u00f6\3\2\2\2\u00ef\u00f0\7\3\2\2\u00f0\u00f1\7\35\2\2"+
		"\u00f1\u00f2\5H%\2\u00f2\u00f3\7\36\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6%\3\2\2\2\u00f7"+
		"\u00f8\7\5\2\2\u00f8\u00f9\5(\25\2\u00f9\u00fa\5\20\t\2\u00fa\u010a\3"+
		"\2\2\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\7\35\2\2\u00fd\u00fe\7\20\2\2\u00fe"+
		"\u00ff\7\36\2\2\u00ff\u0103\7\37\2\2\u0100\u0102\5*\26\2\u0101\u0100\3"+
		"\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\5,\27\2\u0107\u0108\7 "+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u00f7\3\2\2\2\u0109\u00fb\3\2\2\2\u010a"+
		"\'\3\2\2\2\u010b\u010c\7\35\2\2\u010c\u010d\5H%\2\u010d\u010e\7\36\2\2"+
		"\u010e)\3\2\2\2\u010f\u0110\7\7\2\2\u0110\u0111\7\16\2\2\u0111\u0115\5"+
		"R*\2\u0112\u0114\7\16\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u0119\7#\2\2\u0119\u011a\5\22\n\2\u011a+\3\2\2\2\u011b\u011c"+
		"\7\b\2\2\u011c\u011d\7#\2\2\u011d\u011e\5\22\n\2\u011e-\3\2\2\2\u011f"+
		"\u0123\58\35\2\u0120\u0122\7\16\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3"+
		"\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u012a\7$\2\2\u0127\u0129\7\16\2\2\u0128\u0127\3\2"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0131\5H%\2\u012e\u0130\7\16"+
		"\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0138\7$"+
		"\2\2\u0135\u0137\7\16\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013b\u013c\5\66\34\2\u013c/\3\2\2\2\u013d\u0141\7\20\2\2\u013e\u0140"+
		"\7\16\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0148"+
		"\7\'\2\2\u0145\u0147\7\16\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2"+
		"\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014c\5H%\2\u014c\61\3\2\2\2\u014d\u014e\7\f\2\2\u014e"+
		"\u014f\7\16\2\2\u014f\u0153\7\20\2\2\u0150\u0152\7\16\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015a\7\'\2\2\u0157\u0159\7\16"+
		"\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\5H"+
		"%\2\u015e\63\3\2\2\2\u015f\u0160\7\f\2\2\u0160\u0161\7\16\2\2\u0161\u0165"+
		"\7\20\2\2\u0162\u0164\7\16\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\65\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u016c\7\20\2\2\u0169\u016b\7\16\2\2\u016a\u0169\3\2\2\2"+
		"\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0173\7\'\2\2\u0170\u0172\7\16\2\2"+
		"\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\5J&\2\u0177"+
		"\67\3\2\2\2\u0178\u0179\7\t\2\2\u0179\u017a\7\16\2\2\u017a\u017e\7\20"+
		"\2\2\u017b\u017d\7\16\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0185\7\'\2\2\u0182\u0184\7\16\2\2\u0183\u0182\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0188\u0189\5J&\2\u01899\3\2\2\2\u018a\u018b"+
		"\7\t\2\2\u018b\u018c\7\16\2\2\u018c\u0190\7\20\2\2\u018d\u018f\7\16\2"+
		"\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191;\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0197\7\20\2\2\u0194"+
		"\u0196\7\16\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3"+
		"\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019e\7\'\2\2\u019b\u019d\7\16\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a2\7\23\2\2\u01a2=\3\2\2\2\u01a3\u01a4\7\13\2"+
		"\2\u01a4\u01a5\7\16\2\2\u01a5\u01a9\7\20\2\2\u01a6\u01a8\7\16\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01b0\7\'\2\2\u01ad"+
		"\u01af\7\16\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3"+
		"\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3"+
		"\u01b4\7\23\2\2\u01b4?\3\2\2\2\u01b5\u01b6\7\13\2\2\u01b6\u01b7\7\16\2"+
		"\2\u01b7\u01bb\7\20\2\2\u01b8\u01ba\7\16\2\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcA\3\2\2\2"+
		"\u01bd\u01bb\3\2\2\2\u01be\u01c2\7\20\2\2\u01bf\u01c1\7\16\2\2\u01c0\u01bf"+
		"\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c9\7\'\2\2\u01c6\u01c8\7\16"+
		"\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\7\24"+
		"\2\2\u01cdC\3\2\2\2\u01ce\u01cf\7\n\2\2\u01cf\u01d0\7\16\2\2\u01d0\u01d4"+
		"\7\20\2\2\u01d1\u01d3\7\16\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2"+
		"\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d7\u01db\7\'\2\2\u01d8\u01da\7\16\2\2\u01d9\u01d8\3\2\2\2"+
		"\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de"+
		"\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7\24\2\2\u01dfE\3\2\2\2\u01e0"+
		"\u01e1\7\n\2\2\u01e1\u01e2\7\16\2\2\u01e2\u01e6\7\20\2\2\u01e3\u01e5\7"+
		"\16\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7G\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\b%\1\2\u01ea"+
		"\u020d\7\17\2\2\u01eb\u01ef\7.\2\2\u01ec\u01ee\7\16\2\2\u01ed\u01ec\3"+
		"\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u020d\5H%\5\u01f3\u01f6\5J&\2"+
		"\u01f4\u01f6\7\17\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01fa"+
		"\3\2\2\2\u01f7\u01f9\7\16\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2"+
		"\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fd\u0201\5V,\2\u01fe\u0200\7\16\2\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0206\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0204\u0207\5J&\2\u0205\u0207\7\17\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u020d\3\2\2\2\u0208\u0209\7\35"+
		"\2\2\u0209\u020a\5H%\2\u020a\u020b\7\36\2\2\u020b\u020d\3\2\2\2\u020c"+
		"\u01e9\3\2\2\2\u020c\u01eb\3\2\2\2\u020c\u01f5\3\2\2\2\u020c\u0208\3\2"+
		"\2\2\u020d\u0220\3\2\2\2\u020e\u0212\f\7\2\2\u020f\u0211\7\16\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0219\5P)\2\u0216\u0218"+
		"\7\16\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2"+
		"\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d"+
		"\5H%\b\u021d\u021f\3\2\2\2\u021e\u020e\3\2\2\2\u021f\u0222\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221I\3\2\2\2\u0222\u0220\3\2\2\2"+
		"\u0223\u0227\5L\'\2\u0224\u0226\7\16\2\2\u0225\u0224\3\2\2\2\u0226\u0229"+
		"\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0234\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022e\t\2\2\2\u022b\u022d\7\16\2\2\u022c\u022b\3"+
		"\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233\5L\'\2\u0232\u022a\3\2"+
		"\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"K\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u023b\5N(\2\u0238\u023a\7\16\2\2\u0239"+
		"\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u0248\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0242\t\3\2\2\u023f"+
		"\u0241\7\16\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3"+
		"\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245"+
		"\u0247\5N(\2\u0246\u023e\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2"+
		"\2\u0248\u0249\3\2\2\2\u0249M\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024f"+
		"\7\35\2\2\u024c\u024e\7\16\2\2\u024d\u024c\3\2\2\2\u024e\u0251\3\2\2\2"+
		"\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u024f"+
		"\3\2\2\2\u0252\u0256\5J&\2\u0253\u0255\7\16\2\2\u0254\u0253\3\2\2\2\u0255"+
		"\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0259\u025a\7\36\2\2\u025a\u025e\3\2\2\2\u025b"+
		"\u025e\7\20\2\2\u025c\u025e\7\22\2\2\u025d\u024b\3\2\2\2\u025d\u025b\3"+
		"\2\2\2\u025d\u025c\3\2\2\2\u025eO\3\2\2\2\u025f\u0260\t\4\2\2\u0260Q\3"+
		"\2\2\2\u0261\u0267\5T+\2\u0262\u0267\7\23\2\2\u0263\u0267\7\24\2\2\u0264"+
		"\u0267\7\17\2\2\u0265\u0267\7\20\2\2\u0266\u0261\3\2\2\2\u0266\u0262\3"+
		"\2\2\2\u0266\u0263\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267"+
		"S\3\2\2\2\u0268\u0269\t\5\2\2\u0269U\3\2\2\2\u026a\u026b\t\6\2\2\u026b"+
		"W\3\2\2\2I_ejpu|\u0086\u008d\u0093\u009a\u009c\u00a3\u00a5\u00a9\u00af"+
		"\u00b5\u00bb\u00bf\u00c4\u00cc\u00d5\u00dc\u00e2\u00e7\u00f5\u0103\u0109"+
		"\u0115\u0123\u012a\u0131\u0138\u0141\u0148\u0153\u015a\u0165\u016c\u0173"+
		"\u017e\u0185\u0190\u0197\u019e\u01a9\u01b0\u01bb\u01c2\u01c9\u01d4\u01db"+
		"\u01e6\u01ef\u01f5\u01fa\u0201\u0206\u020c\u0212\u0219\u0220\u0227\u022e"+
		"\u0234\u023b\u0242\u0248\u024f\u0256\u025d\u0266";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}