// Generated from /home/jona/Documents/GitHub/ANTLR/src/main/java/safec/Safec.g4 by ANTLR 4.9.2
package old.safec.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SafecParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILESTMT=1, FORSTMT=2, IFSTMT=3, ELSE=4, SWITCHSTMT=5, CASE=6, DEFAULT=7, 
		NUMDCL=8, CHARDCL=9, STRDCL=10, BOOLDCL=11, VOIDDCL=12, RETURN=13, BREAK=14, 
		BOOLVAL=15, NUMVAL=16, CHARVAL=17, STRVAL=18, ID=19, SAFETY=20, PLUS=21, 
		MINUS=22, TIMES=23, DIVISION=24, POW=25, SQUARE=26, MOD=27, PI=28, LPAR=29, 
		RPAR=30, LBRACE=31, RBRACE=32, DOT=33, COMMA=34, COLON=35, SEMI=36, SINGLEQOUTE=37, 
		DOUBLEQOUTE=38, ASSIGN=39, LEQ=40, GEQ=41, EQ=42, NEQ=43, LESS=44, GREATER=45, 
		NOT=46, AND=47, OR=48, HASHTAG=49, WS=50, COMMENT=51;
	public static final int
		RULE_prog = 0, RULE_declarations = 1, RULE_commands = 2, RULE_declaration = 3, 
		RULE_dclassignsemi = 4, RULE_dclassignsemicommand = 5, RULE_safedeclaration = 6, 
		RULE_params = 7, RULE_block = 8, RULE_caseblock = 9, RULE_vdcl = 10, RULE_vassign = 11, 
		RULE_vdclassign = 12, RULE_datatype = 13, RULE_atypes = 14, RULE_command = 15, 
		RULE_funccalls = 16, RULE_funcdcl = 17, RULE_funcblock = 18, RULE_callparams = 19, 
		RULE_ctrlstruct = 20, RULE_iterative = 21, RULE_selective = 22, RULE_iflogic = 23, 
		RULE_forparams = 24, RULE_scase = 25, RULE_defcase = 26, RULE_numdecl = 27, 
		RULE_booldecl = 28, RULE_chardecl = 29, RULE_stringdecl = 30, RULE_numdclassign = 31, 
		RULE_chardclassign = 32, RULE_stringdclassign = 33, RULE_booldclassign = 34, 
		RULE_bexpr = 35, RULE_bterm = 36, RULE_bpart = 37, RULE_bpiece = 38, RULE_blast = 39, 
		RULE_aexpr = 40, RULE_term = 41, RULE_part = 42, RULE_partbool = 43, RULE_bop = 44, 
		RULE_vals = 45, RULE_numberval = 46, RULE_relop = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declarations", "commands", "declaration", "dclassignsemi", "dclassignsemicommand", 
			"safedeclaration", "params", "block", "caseblock", "vdcl", "vassign", 
			"vdclassign", "datatype", "atypes", "command", "funccalls", "funcdcl", 
			"funcblock", "callparams", "ctrlstruct", "iterative", "selective", "iflogic", 
			"forparams", "scase", "defcase", "numdecl", "booldecl", "chardecl", "stringdecl", 
			"numdclassign", "chardclassign", "stringdclassign", "booldclassign",
                "old/bexpr", "bterm", "bpart", "bpiece", "blast", "old/aexpr", "term", "part",
			"partbool", "bop", "vals", "numberval", "relop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'for'", "'if'", "'else'", "'switch'", "'case'", "'default'", 
			"'number'", "'char'", "'string'", "'boolean'", "'void'", "'return'", 
			null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'pow'", "'sqrt'", "'%'", "'pi'", "'('", "')'", "'{'", "'}'", "'.'", 
			"','", "':'", "';'", "'''", "'\"'", "'='", "'<='", "'>='", "'=='", "'!='", 
			"'<'", "'>'", "'!'", "'&&'", "'||'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILESTMT", "FORSTMT", "IFSTMT", "ELSE", "SWITCHSTMT", "CASE", 
			"DEFAULT", "NUMDCL", "CHARDCL", "STRDCL", "BOOLDCL", "VOIDDCL", "RETURN", 
			"BREAK", "BOOLVAL", "NUMVAL", "CHARVAL", "STRVAL", "ID", "SAFETY", "PLUS", 
			"MINUS", "TIMES", "DIVISION", "POW", "SQUARE", "MOD", "PI", "LPAR", "RPAR", 
			"LBRACE", "RBRACE", "DOT", "COMMA", "COLON", "SEMI", "SINGLEQOUTE", "DOUBLEQOUTE", 
			"ASSIGN", "LEQ", "GEQ", "EQ", "NEQ", "LESS", "GREATER", "NOT", "AND", 
			"OR", "HASHTAG", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Safec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SafecParser(TokenStream input) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			declarations();
			setState(97);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				declaration();
				setState(100);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commands);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILESTMT:
			case FORSTMT:
			case IFSTMT:
			case SWITCHSTMT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				command();
				setState(106);
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
		public DclassignsemiContext dclassignsemi() {
			return getRuleContext(DclassignsemiContext.class,0);
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
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SAFETY:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				dclassignsemi();
				}
				break;
			case NUMDCL:
			case CHARDCL:
			case STRDCL:
			case BOOLDCL:
			case VOIDDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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

	public static class DclassignsemiContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SafecParser.SEMI, 0); }
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
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitDclassignsemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclassignsemiContext dclassignsemi() throws RecognitionException {
		DclassignsemiContext _localctx = new DclassignsemiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dclassignsemi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAFETY:
				{
				setState(115);
				safedeclaration();
				}
				break;
			case ID:
				{
				setState(116);
				vassign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(119);
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
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitDclassignsemicommand(this);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILESTMT) | (1L << FORSTMT) | (1L << IFSTMT) | (1L << SWITCHSTMT) | (1L << ID) | (1L << SAFETY))) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(121);
					dclassignsemi();
					}
					break;
				case 2:
					{
					setState(122);
					command();
					}
					break;
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

	public static class SafedeclarationContext extends ParserRuleContext {
		public TerminalNode SAFETY() { return getToken(SafecParser.SAFETY, 0); }
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
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitSafedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafedeclarationContext safedeclaration() throws RecognitionException {
		SafedeclarationContext _localctx = new SafedeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_safedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(SAFETY);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(129);
				vdcl();
				}
				break;
			case 2:
				{
				setState(130);
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
		public List<TerminalNode> COMMA() { return getTokens(SafecParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafecParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitParams(this);
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
			setState(133);
			vdcl();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				vdcl();
				}
				}
				setState(140);
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
		public TerminalNode LBRACE() { return getToken(SafecParser.LBRACE, 0); }
		public DclassignsemicommandContext dclassignsemicommand() {
			return getRuleContext(DclassignsemicommandContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SafecParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LBRACE);
			setState(142);
			dclassignsemicommand();
			setState(143);
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
		public TerminalNode BREAK() { return getToken(SafecParser.BREAK, 0); }
		public CaseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitCaseblock(this);
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
			setState(145);
			dclassignsemicommand();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(146);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitVdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdclContext vdcl() throws RecognitionException {
		VdclContext _localctx = new VdclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vdcl);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				numdecl();
				}
				break;
			case CHARDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				chardecl();
				}
				break;
			case STRDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				stringdecl();
				}
				break;
			case BOOLDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
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
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SafecParser.ASSIGN, 0); }
		public AtypesContext atypes() {
			return getRuleContext(AtypesContext.class,0);
		}
		public VassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitVassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VassignContext vassign() throws RecognitionException {
		VassignContext _localctx = new VassignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(ASSIGN);
			setState(157);
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
		public VdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vdclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitVdclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdclassignContext vdclassign() throws RecognitionException {
		VdclassignContext _localctx = new VdclassignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vdclassign);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				numdclassign();
				}
				break;
			case CHARDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				chardclassign();
				}
				break;
			case STRDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				stringdclassign();
				}
				break;
			case BOOLDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode NUMDCL() { return getToken(SafecParser.NUMDCL, 0); }
		public TerminalNode CHARDCL() { return getToken(SafecParser.CHARDCL, 0); }
		public TerminalNode STRDCL() { return getToken(SafecParser.STRDCL, 0); }
		public TerminalNode BOOLDCL() { return getToken(SafecParser.BOOLDCL, 0); }
		public TerminalNode VOIDDCL() { return getToken(SafecParser.VOIDDCL, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		public TerminalNode CHARVAL() { return getToken(SafecParser.CHARVAL, 0); }
		public TerminalNode STRVAL() { return getToken(SafecParser.STRVAL, 0); }
		public AtypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atypes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitAtypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtypesContext atypes() throws RecognitionException {
		AtypesContext _localctx = new AtypesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atypes);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				aexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				bexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(CHARVAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(STRVAL);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_command);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILESTMT:
			case FORSTMT:
			case IFSTMT:
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				ctrlstruct();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(SafecParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SafecParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(SafecParser.SEMI, 0); }
		public CallparamsContext callparams() {
			return getRuleContext(CallparamsContext.class,0);
		}
		public FunccallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccalls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitFunccalls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallsContext funccalls() throws RecognitionException {
		FunccallsContext _localctx = new FunccallsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funccalls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(LPAR);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVAL) | (1L << NUMVAL) | (1L << CHARVAL) | (1L << STRVAL) | (1L << ID) | (1L << PI))) != 0)) {
				{
				setState(179);
				callparams();
				}
			}

			setState(182);
			match(RPAR);
			setState(183);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(SafecParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SafecParser.RPAR, 0); }
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
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitFuncdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdclContext funcdcl() throws RecognitionException {
		FuncdclContext _localctx = new FuncdclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			datatype();
			setState(186);
			match(ID);
			setState(187);
			match(LPAR);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMDCL) | (1L << CHARDCL) | (1L << STRDCL) | (1L << BOOLDCL))) != 0)) {
				{
				setState(188);
				params();
				}
			}

			setState(191);
			match(RPAR);
			setState(192);
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
		public TerminalNode LBRACE() { return getToken(SafecParser.LBRACE, 0); }
		public DclassignsemicommandContext dclassignsemicommand() {
			return getRuleContext(DclassignsemicommandContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SafecParser.RETURN, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SafecParser.SEMI, 0); }
		public TerminalNode RBRACE() { return getToken(SafecParser.RBRACE, 0); }
		public FuncblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitFuncblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncblockContext funcblock() throws RecognitionException {
		FuncblockContext _localctx = new FuncblockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LBRACE);
			setState(195);
			dclassignsemicommand();
			setState(196);
			match(RETURN);
			setState(197);
			vals();
			setState(198);
			match(SEMI);
			setState(199);
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
		public List<TerminalNode> COMMA() { return getTokens(SafecParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafecParser.COMMA, i);
		}
		public CallparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callparams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitCallparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallparamsContext callparams() throws RecognitionException {
		CallparamsContext _localctx = new CallparamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_callparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			vals();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				vals();
				}
				}
				setState(208);
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
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitCtrlstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtrlstructContext ctrlstruct() throws RecognitionException {
		CtrlstructContext _localctx = new CtrlstructContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ctrlstruct);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSTMT:
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				selective();
				}
				break;
			case WHILESTMT:
			case FORSTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
		public TerminalNode FORSTMT() { return getToken(SafecParser.FORSTMT, 0); }
		public TerminalNode LPAR() { return getToken(SafecParser.LPAR, 0); }
		public ForparamsContext forparams() {
			return getRuleContext(ForparamsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafecParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILESTMT() { return getToken(SafecParser.WHILESTMT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public IterativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitIterative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iterative);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(FORSTMT);
				setState(214);
				match(LPAR);
				setState(215);
				forparams();
				setState(216);
				match(RPAR);
				setState(217);
				block();
				}
				break;
			case WHILESTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(WHILESTMT);
				setState(220);
				match(LPAR);
				setState(221);
				bexpr();
				setState(222);
				match(RPAR);
				setState(223);
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
		public TerminalNode IFSTMT() { return getToken(SafecParser.IFSTMT, 0); }
		public IflogicContext iflogic() {
			return getRuleContext(IflogicContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SafecParser.ELSE, 0); }
		public TerminalNode SWITCHSTMT() { return getToken(SafecParser.SWITCHSTMT, 0); }
		public TerminalNode LPAR() { return getToken(SafecParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(SafecParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SafecParser.LBRACE, 0); }
		public DefcaseContext defcase() {
			return getRuleContext(DefcaseContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SafecParser.RBRACE, 0); }
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
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitSelective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selective);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFSTMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(IFSTMT);
				setState(228);
				iflogic();
				setState(229);
				block();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(230);
					match(ELSE);
					setState(231);
					block();
					}
				}

				}
				break;
			case SWITCHSTMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(SWITCHSTMT);
				setState(235);
				match(LPAR);
				setState(236);
				match(ID);
				setState(237);
				match(RPAR);
				setState(238);
				match(LBRACE);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(239);
					scase();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				defcase();
				setState(246);
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
		public TerminalNode LPAR() { return getToken(SafecParser.LPAR, 0); }
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafecParser.RPAR, 0); }
		public IflogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iflogic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitIflogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IflogicContext iflogic() throws RecognitionException {
		IflogicContext _localctx = new IflogicContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iflogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(LPAR);
			setState(251);
			bterm();
			setState(252);
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
		public List<TerminalNode> SEMI() { return getTokens(SafecParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SafecParser.SEMI, i);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SafecParser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public ForparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forparams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitForparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForparamsContext forparams() throws RecognitionException {
		ForparamsContext _localctx = new ForparamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			numdclassign();
			setState(255);
			match(SEMI);
			setState(256);
			bexpr();
			setState(257);
			match(SEMI);
			setState(258);
			match(ID);
			setState(259);
			match(ASSIGN);
			setState(260);
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
		public TerminalNode CASE() { return getToken(SafecParser.CASE, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SafecParser.COLON, 0); }
		public CaseblockContext caseblock() {
			return getRuleContext(CaseblockContext.class,0);
		}
		public ScaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitScase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaseContext scase() throws RecognitionException {
		ScaseContext _localctx = new ScaseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(CASE);
			setState(263);
			vals();
			setState(264);
			match(COLON);
			setState(265);
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
		public TerminalNode DEFAULT() { return getToken(SafecParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(SafecParser.COLON, 0); }
		public CaseblockContext caseblock() {
			return getRuleContext(CaseblockContext.class,0);
		}
		public DefcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitDefcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcaseContext defcase() throws RecognitionException {
		DefcaseContext _localctx = new DefcaseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_defcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(DEFAULT);
			setState(268);
			match(COLON);
			setState(269);
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
		public TerminalNode NUMDCL() { return getToken(SafecParser.NUMDCL, 0); }
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public NumdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitNumdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdeclContext numdecl() throws RecognitionException {
		NumdeclContext _localctx = new NumdeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(NUMDCL);
			setState(272);
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
		public TerminalNode BOOLDCL() { return getToken(SafecParser.BOOLDCL, 0); }
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public BooldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBooldecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldeclContext booldecl() throws RecognitionException {
		BooldeclContext _localctx = new BooldeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booldecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(BOOLDCL);
			setState(275);
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
		public TerminalNode CHARDCL() { return getToken(SafecParser.CHARDCL, 0); }
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public ChardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitChardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardeclContext chardecl() throws RecognitionException {
		ChardeclContext _localctx = new ChardeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CHARDCL);
			setState(278);
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
		public TerminalNode STRDCL() { return getToken(SafecParser.STRDCL, 0); }
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public StringdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitStringdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdeclContext stringdecl() throws RecognitionException {
		StringdeclContext _localctx = new StringdeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(STRDCL);
			setState(281);
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
		public TerminalNode ASSIGN() { return getToken(SafecParser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public NumdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitNumdclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdclassignContext numdclassign() throws RecognitionException {
		NumdclassignContext _localctx = new NumdclassignContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numdclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			numdecl();
			setState(284);
			match(ASSIGN);
			setState(285);
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
		public ChardeclContext chardecl() {
			return getRuleContext(ChardeclContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SafecParser.ASSIGN, 0); }
		public TerminalNode CHARVAL() { return getToken(SafecParser.CHARVAL, 0); }
		public ChardclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitChardclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardclassignContext chardclassign() throws RecognitionException {
		ChardclassignContext _localctx = new ChardclassignContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_chardclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			chardecl();
			setState(288);
			match(ASSIGN);
			setState(289);
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
		public TerminalNode ASSIGN() { return getToken(SafecParser.ASSIGN, 0); }
		public TerminalNode STRVAL() { return getToken(SafecParser.STRVAL, 0); }
		public StringdclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitStringdclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdclassignContext stringdclassign() throws RecognitionException {
		StringdclassignContext _localctx = new StringdclassignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stringdclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			stringdecl();
			setState(292);
			match(ASSIGN);
			setState(293);
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
		public TerminalNode ASSIGN() { return getToken(SafecParser.ASSIGN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BooldclassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldclassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBooldclassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldclassignContext booldclassign() throws RecognitionException {
		BooldclassignContext _localctx = new BooldclassignContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_booldclassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			booldecl();
			setState(296);
			match(ASSIGN);
			setState(297);
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
		public TerminalNode BOOLVAL() { return getToken(SafecParser.BOOLVAL, 0); }
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bexpr);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(BOOLVAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
		public List<PartboolContext> partbool() {
			return getRuleContexts(PartboolContext.class);
		}
		public PartboolContext partbool(int i) {
			return getRuleContext(PartboolContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public BpartContext bpart() {
			return getRuleContext(BpartContext.class,0);
		}
		public BtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bterm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtermContext bterm() throws RecognitionException {
		BtermContext _localctx = new BtermContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bterm);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				partbool();
				setState(304);
				relop();
				setState(305);
				partbool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
		public List<BpieceContext> bpiece() {
			return getRuleContexts(BpieceContext.class);
		}
		public BpieceContext bpiece(int i) {
			return getRuleContext(BpieceContext.class,i);
		}
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public BpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bpart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpartContext bpart() throws RecognitionException {
		BpartContext _localctx = new BpartContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bpart);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				bpiece();
				setState(311);
				bop();
				setState(312);
				bpiece();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
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
		public TerminalNode NOT() { return getToken(SafecParser.NOT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BlastContext blast() {
			return getRuleContext(BlastContext.class,0);
		}
		public BpieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bpiece; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBpiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpieceContext bpiece() throws RecognitionException {
		BpieceContext _localctx = new BpieceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bpiece);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(NOT);
				setState(318);
				bexpr();
				}
				break;
			case ID:
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
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
		public TerminalNode LPAR() { return getToken(SafecParser.LPAR, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafecParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public BlastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBlast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlastContext blast() throws RecognitionException {
		BlastContext _localctx = new BlastContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blast);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(LPAR);
				setState(323);
				bexpr();
				setState(324);
				match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SafecParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SafecParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SafecParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SafecParser.MINUS, i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitAexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_aexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			term();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(330);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(331);
				term();
				}
				}
				setState(336);
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
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(SafecParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(SafecParser.TIMES, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(SafecParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(SafecParser.DIVISION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SafecParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SafecParser.MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			part();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(338);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				part();
				}
				}
				setState(344);
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
		public TerminalNode LPAR() { return getToken(SafecParser.LPAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SafecParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public NumbervalContext numberval() {
			return getRuleContext(NumbervalContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_part);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(LPAR);
				setState(346);
				aexpr();
				setState(347);
				match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(ID);
				}
				break;
			case NUMVAL:
			case PI:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
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
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(SafecParser.BOOLVAL, 0); }
		public PartboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partbool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitPartbool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartboolContext partbool() throws RecognitionException {
		PartboolContext _localctx = new PartboolContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_partbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case ID:
			case PI:
			case LPAR:
				{
				setState(353);
				part();
				}
				break;
			case BOOLVAL:
				{
				setState(354);
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
		public TerminalNode AND() { return getToken(SafecParser.AND, 0); }
		public TerminalNode OR() { return getToken(SafecParser.OR, 0); }
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitBop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		public TerminalNode CHARVAL() { return getToken(SafecParser.CHARVAL, 0); }
		public TerminalNode STRVAL() { return getToken(SafecParser.STRVAL, 0); }
		public TerminalNode BOOLVAL() { return getToken(SafecParser.BOOLVAL, 0); }
		public TerminalNode ID() { return getToken(SafecParser.ID, 0); }
		public ValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitVals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValsContext vals() throws RecognitionException {
		ValsContext _localctx = new ValsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_vals);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case PI:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				numberval();
				}
				break;
			case CHARVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(CHARVAL);
				}
				break;
			case STRVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(STRVAL);
				}
				break;
			case BOOLVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(BOOLVAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
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
		public TerminalNode NUMVAL() { return getToken(SafecParser.NUMVAL, 0); }
		public TerminalNode PI() { return getToken(SafecParser.PI, 0); }
		public NumbervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitNumberval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbervalContext numberval() throws RecognitionException {
		NumbervalContext _localctx = new NumbervalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_numberval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		public TerminalNode EQ() { return getToken(SafecParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SafecParser.NEQ, 0); }
		public TerminalNode GEQ() { return getToken(SafecParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(SafecParser.LEQ, 0); }
		public TerminalNode LESS() { return getToken(SafecParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(SafecParser.GREATER, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SafecVisitor ) return ((SafecVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0175\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3j\n\3\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\5\5t\n\5\3\6\3\6\5\6x\n\6\3"+
		"\6\3\6\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\b\3\b\3\b\5\b\u0086\n\b"+
		"\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00a6\n\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00ae"+
		"\n\20\3\21\3\21\5\21\u00b2\n\21\3\22\3\22\3\22\5\22\u00b7\n\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c0\n\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00cf\n\25\f\25\16\25\u00d2"+
		"\13\25\3\26\3\26\5\26\u00d6\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u00e4\n\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00eb\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00f3\n\30\f\30\16\30\u00f6"+
		"\13\30\3\30\3\30\3\30\5\30\u00fb\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\5%\u0130\n%\3&\3&\3&\3"+
		"&\3&\5&\u0137\n&\3\'\3\'\3\'\3\'\3\'\5\'\u013e\n\'\3(\3(\3(\5(\u0143\n"+
		"(\3)\3)\3)\3)\3)\5)\u014a\n)\3*\3*\3*\7*\u014f\n*\f*\16*\u0152\13*\3+"+
		"\3+\3+\7+\u0157\n+\f+\16+\u015a\13+\3,\3,\3,\3,\3,\3,\5,\u0162\n,\3-\3"+
		"-\5-\u0166\n-\3.\3.\3/\3/\3/\3/\3/\5/\u016f\n/\3\60\3\60\3\61\3\61\3\61"+
		"\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`\2\b\3\2\n\16\3\2\27\30\4\2\31\32\35\35\3\2\61\62"+
		"\4\2\22\22\36\36\3\2*/\2\u016d\2b\3\2\2\2\4i\3\2\2\2\6o\3\2\2\2\bs\3\2"+
		"\2\2\nw\3\2\2\2\f\177\3\2\2\2\16\u0082\3\2\2\2\20\u0087\3\2\2\2\22\u008f"+
		"\3\2\2\2\24\u0093\3\2\2\2\26\u009b\3\2\2\2\30\u009d\3\2\2\2\32\u00a5\3"+
		"\2\2\2\34\u00a7\3\2\2\2\36\u00ad\3\2\2\2 \u00b1\3\2\2\2\"\u00b3\3\2\2"+
		"\2$\u00bb\3\2\2\2&\u00c4\3\2\2\2(\u00cb\3\2\2\2*\u00d5\3\2\2\2,\u00e3"+
		"\3\2\2\2.\u00fa\3\2\2\2\60\u00fc\3\2\2\2\62\u0100\3\2\2\2\64\u0108\3\2"+
		"\2\2\66\u010d\3\2\2\28\u0111\3\2\2\2:\u0114\3\2\2\2<\u0117\3\2\2\2>\u011a"+
		"\3\2\2\2@\u011d\3\2\2\2B\u0121\3\2\2\2D\u0125\3\2\2\2F\u0129\3\2\2\2H"+
		"\u012f\3\2\2\2J\u0136\3\2\2\2L\u013d\3\2\2\2N\u0142\3\2\2\2P\u0149\3\2"+
		"\2\2R\u014b\3\2\2\2T\u0153\3\2\2\2V\u0161\3\2\2\2X\u0165\3\2\2\2Z\u0167"+
		"\3\2\2\2\\\u016e\3\2\2\2^\u0170\3\2\2\2`\u0172\3\2\2\2bc\5\4\3\2cd\5\6"+
		"\4\2d\3\3\2\2\2ef\5\b\5\2fg\5\4\3\2gj\3\2\2\2hj\3\2\2\2ie\3\2\2\2ih\3"+
		"\2\2\2j\5\3\2\2\2kl\5 \21\2lm\5\6\4\2mp\3\2\2\2np\3\2\2\2ok\3\2\2\2on"+
		"\3\2\2\2p\7\3\2\2\2qt\5\n\6\2rt\5$\23\2sq\3\2\2\2sr\3\2\2\2t\t\3\2\2\2"+
		"ux\5\16\b\2vx\5\30\r\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2\2yz\7&\2\2z\13\3\2"+
		"\2\2{~\5\n\6\2|~\5 \21\2}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\r\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085\7\26"+
		"\2\2\u0083\u0086\5\26\f\2\u0084\u0086\5\32\16\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\17\3\2\2\2\u0087\u008c\5\26\f\2\u0088\u0089\7$\2"+
		"\2\u0089\u008b\5\26\f\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\21\3\2\2\2\u008e\u008c\3\2\2"+
		"\2\u008f\u0090\7!\2\2\u0090\u0091\5\f\7\2\u0091\u0092\7\"\2\2\u0092\23"+
		"\3\2\2\2\u0093\u0095\5\f\7\2\u0094\u0096\7\20\2\2\u0095\u0094\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\25\3\2\2\2\u0097\u009c\58\35\2\u0098\u009c"+
		"\5<\37\2\u0099\u009c\5> \2\u009a\u009c\5:\36\2\u009b\u0097\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\27\3\2\2"+
		"\2\u009d\u009e\7\25\2\2\u009e\u009f\7)\2\2\u009f\u00a0\5\36\20\2\u00a0"+
		"\31\3\2\2\2\u00a1\u00a6\5@!\2\u00a2\u00a6\5B\"\2\u00a3\u00a6\5D#\2\u00a4"+
		"\u00a6\5F$\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a5\u00a4\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8\35\3"+
		"\2\2\2\u00a9\u00ae\5R*\2\u00aa\u00ae\5H%\2\u00ab\u00ae\7\23\2\2\u00ac"+
		"\u00ae\7\24\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00b2\5*\26\2\u00b0"+
		"\u00b2\5\"\22\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2!\3\2\2\2"+
		"\u00b3\u00b4\7\25\2\2\u00b4\u00b6\7\37\2\2\u00b5\u00b7\5(\25\2\u00b6\u00b5"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7 \2\2\u00b9"+
		"\u00ba\7&\2\2\u00ba#\3\2\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7\25\2"+
		"\2\u00bd\u00bf\7\37\2\2\u00be\u00c0\5\20\t\2\u00bf\u00be\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7 \2\2\u00c2\u00c3\5&\24"+
		"\2\u00c3%\3\2\2\2\u00c4\u00c5\7!\2\2\u00c5\u00c6\5\f\7\2\u00c6\u00c7\7"+
		"\17\2\2\u00c7\u00c8\5\\/\2\u00c8\u00c9\7&\2\2\u00c9\u00ca\7\"\2\2\u00ca"+
		"\'\3\2\2\2\u00cb\u00d0\5\\/\2\u00cc\u00cd\7$\2\2\u00cd\u00cf\5\\/\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1)\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\5.\30\2\u00d4\u00d6"+
		"\5,\27\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6+\3\2\2\2\u00d7"+
		"\u00d8\7\4\2\2\u00d8\u00d9\7\37\2\2\u00d9\u00da\5\62\32\2\u00da\u00db"+
		"\7 \2\2\u00db\u00dc\5\22\n\2\u00dc\u00e4\3\2\2\2\u00dd\u00de\7\3\2\2\u00de"+
		"\u00df\7\37\2\2\u00df\u00e0\5H%\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\5\22"+
		"\n\2\u00e2\u00e4\3\2\2\2\u00e3\u00d7\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e4"+
		"-\3\2\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\5\60\31\2\u00e7\u00ea\5\22\n"+
		"\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\5\22\n\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00fb\3\2\2\2\u00ec\u00ed\7\7\2\2\u00ed\u00ee\7\37"+
		"\2\2\u00ee\u00ef\7\25\2\2\u00ef\u00f0\7 \2\2\u00f0\u00f4\7!\2\2\u00f1"+
		"\u00f3\5\64\33\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\5\66\34\2\u00f8\u00f9\7\"\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00e5\3"+
		"\2\2\2\u00fa\u00ec\3\2\2\2\u00fb/\3\2\2\2\u00fc\u00fd\7\37\2\2\u00fd\u00fe"+
		"\5J&\2\u00fe\u00ff\7 \2\2\u00ff\61\3\2\2\2\u0100\u0101\5@!\2\u0101\u0102"+
		"\7&\2\2\u0102\u0103\5H%\2\u0103\u0104\7&\2\2\u0104\u0105\7\25\2\2\u0105"+
		"\u0106\7)\2\2\u0106\u0107\5R*\2\u0107\63\3\2\2\2\u0108\u0109\7\b\2\2\u0109"+
		"\u010a\5\\/\2\u010a\u010b\7%\2\2\u010b\u010c\5\24\13\2\u010c\65\3\2\2"+
		"\2\u010d\u010e\7\t\2\2\u010e\u010f\7%\2\2\u010f\u0110\5\24\13\2\u0110"+
		"\67\3\2\2\2\u0111\u0112\7\n\2\2\u0112\u0113\7\25\2\2\u01139\3\2\2\2\u0114"+
		"\u0115\7\r\2\2\u0115\u0116\7\25\2\2\u0116;\3\2\2\2\u0117\u0118\7\13\2"+
		"\2\u0118\u0119\7\25\2\2\u0119=\3\2\2\2\u011a\u011b\7\f\2\2\u011b\u011c"+
		"\7\25\2\2\u011c?\3\2\2\2\u011d\u011e\58\35\2\u011e\u011f\7)\2\2\u011f"+
		"\u0120\5R*\2\u0120A\3\2\2\2\u0121\u0122\5<\37\2\u0122\u0123\7)\2\2\u0123"+
		"\u0124\7\23\2\2\u0124C\3\2\2\2\u0125\u0126\5> \2\u0126\u0127\7)\2\2\u0127"+
		"\u0128\7\24\2\2\u0128E\3\2\2\2\u0129\u012a\5:\36\2\u012a\u012b\7)\2\2"+
		"\u012b\u012c\5H%\2\u012cG\3\2\2\2\u012d\u0130\7\21\2\2\u012e\u0130\5J"+
		"&\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130I\3\2\2\2\u0131\u0132"+
		"\5X-\2\u0132\u0133\5`\61\2\u0133\u0134\5X-\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0137\5L\'\2\u0136\u0131\3\2\2\2\u0136\u0135\3\2\2\2\u0137K\3\2\2\2\u0138"+
		"\u0139\5N(\2\u0139\u013a\5Z.\2\u013a\u013b\5N(\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013e\5N(\2\u013d\u0138\3\2\2\2\u013d\u013c\3\2\2\2\u013eM\3\2\2\2\u013f"+
		"\u0140\7\60\2\2\u0140\u0143\5H%\2\u0141\u0143\5P)\2\u0142\u013f\3\2\2"+
		"\2\u0142\u0141\3\2\2\2\u0143O\3\2\2\2\u0144\u0145\7\37\2\2\u0145\u0146"+
		"\5H%\2\u0146\u0147\7 \2\2\u0147\u014a\3\2\2\2\u0148\u014a\7\25\2\2\u0149"+
		"\u0144\3\2\2\2\u0149\u0148\3\2\2\2\u014aQ\3\2\2\2\u014b\u0150\5T+\2\u014c"+
		"\u014d\t\3\2\2\u014d\u014f\5T+\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2"+
		"\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151S\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0153\u0158\5V,\2\u0154\u0155\t\4\2\2\u0155\u0157\5V,\2\u0156"+
		"\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159U\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\37\2\2\u015c\u015d"+
		"\5R*\2\u015d\u015e\7 \2\2\u015e\u0162\3\2\2\2\u015f\u0162\7\25\2\2\u0160"+
		"\u0162\5^\60\2\u0161\u015b\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2"+
		"\2\2\u0162W\3\2\2\2\u0163\u0166\5V,\2\u0164\u0166\7\21\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0164\3\2\2\2\u0166Y\3\2\2\2\u0167\u0168\t\5\2\2\u0168"+
		"[\3\2\2\2\u0169\u016f\5^\60\2\u016a\u016f\7\23\2\2\u016b\u016f\7\24\2"+
		"\2\u016c\u016f\7\21\2\2\u016d\u016f\7\25\2\2\u016e\u0169\3\2\2\2\u016e"+
		"\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2"+
		"\2\2\u016f]\3\2\2\2\u0170\u0171\t\6\2\2\u0171_\3\2\2\2\u0172\u0173\t\7"+
		"\2\2\u0173a\3\2\2\2!iosw}\177\u0085\u008c\u0095\u009b\u00a5\u00ad\u00b1"+
		"\u00b6\u00bf\u00d0\u00d5\u00e3\u00ea\u00f4\u00fa\u012f\u0136\u013d\u0142"+
		"\u0149\u0150\u0158\u0161\u0165\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}