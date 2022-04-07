// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/Safedeclaration\safedeclaration.g4 by ANTLR 4.9.2
package old.Safedeclaration.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class safedeclarationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAFETY=1, BOOLVAL=2, NUMVAL=3, DOT=4, NOT=5, AND=6, OR=7, NUMDCL=8, CHARDCL=9, 
		STRDCL=10, BOOLDCL=11, CHARVAL=12, STRVAL=13, ID=14, SINGLEQOUTE=15, DOUBLEQOUTE=16, 
		ASSIGN=17, LPAR=18, RPAR=19, PLUS=20, MINUS=21, TIMES=22, DIVISION=23, 
		MOD=24, PI=25, LEQ=26, GEQ=27, EQ=28, NEQ=29, LESS=30, GREATER=31, HASHTAG=32, 
		WS=33, COMMENT=34;
	public static final int
		RULE_safedeclaration = 0, RULE_vdcl = 1, RULE_vdclassign = 2, RULE_numdecl = 3, 
		RULE_booldecl = 4, RULE_chardecl = 5, RULE_stringdecl = 6, RULE_numdclassign = 7, 
		RULE_chardclassign = 8, RULE_stringdclassign = 9, RULE_booldclassign = 10, 
		RULE_bexpr = 11, RULE_bterm = 12, RULE_bpart = 13, RULE_bpiece = 14, RULE_blast = 15, 
		RULE_aexpr = 16, RULE_term = 17, RULE_part = 18, RULE_partbool = 19, RULE_numberval = 20, 
		RULE_bop = 21, RULE_relop = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"safedeclaration", "vdcl", "vdclassign", "numdecl", "booldecl", "chardecl", 
			"stringdecl", "numdclassign", "chardclassign", "stringdclassign", "booldclassign",
                "old/bexpr", "bterm", "bpart", "bpiece", "blast", "old/aexpr", "term", "part",
			"partbool", "numberval", "bop", "relop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'.'", "'!'", "'&&'", "'||'", "'number'", "'char'", 
			"'string'", "'boolean'", null, null, null, "'''", "'\"'", "'='", "'('", 
			"')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'pi'", "'<='", "'>='", "'=='", 
			"'!='", "'<'", "'>'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SAFETY", "BOOLVAL", "NUMVAL", "DOT", "NOT", "AND", "OR", "NUMDCL", 
			"CHARDCL", "STRDCL", "BOOLDCL", "CHARVAL", "STRVAL", "ID", "SINGLEQOUTE", 
			"DOUBLEQOUTE", "ASSIGN", "LPAR", "RPAR", "PLUS", "MINUS", "TIMES", "DIVISION", 
			"MOD", "PI", "LEQ", "GEQ", "EQ", "NEQ", "LESS", "GREATER", "HASHTAG", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "safedeclaration.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public safedeclarationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		public TerminalNode SAFETY() { return getToken(safedeclarationParser.SAFETY, 0); }
		public VdclContext vdcl() {
			return getRuleContext(VdclContext.class,0);
		}
		public VdclassignContext vdclassign() {
			return getRuleContext(VdclassignContext.class,0);
		}
		public SafeDeclNodeContext(SafedeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterSafeDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitSafeDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitSafeDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafedeclarationContext safedeclaration() throws RecognitionException {
		SafedeclarationContext _localctx = new SafedeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_safedeclaration);
		try {
			_localctx = new SafeDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SAFETY);
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(47);
				vdcl();
				}
				break;
			case 2:
				{
				setState(48);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterStringVDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitStringVDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitStringVDclNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBoolVDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBoolVDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBoolVDclNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterCharVDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitCharVDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitCharVDclNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterNumVDclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitNumVDclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitNumVDclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdclContext vdcl() throws RecognitionException {
		VdclContext _localctx = new VdclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vdcl);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				_localctx = new NumVDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				numdecl();
				}
				break;
			case CHARDCL:
				_localctx = new CharVDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				chardecl();
				}
				break;
			case STRDCL:
				_localctx = new StringVDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				stringdecl();
				}
				break;
			case BOOLDCL:
				_localctx = new BoolVDclNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBoolVDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBoolVDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBoolVDclAssignNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterCharVDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitCharVDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitCharVDclAssignNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterStringVDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitStringVDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitStringVDclAssignNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterNumVDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitNumVDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitNumVDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VdclassignContext vdclassign() throws RecognitionException {
		VdclassignContext _localctx = new VdclassignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vdclassign);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMDCL:
				_localctx = new NumVDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				numdclassign();
				}
				break;
			case CHARDCL:
				_localctx = new CharVDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				chardclassign();
				}
				break;
			case STRDCL:
				_localctx = new StringVDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				stringdclassign();
				}
				break;
			case BOOLDCL:
				_localctx = new BoolVDclAssignNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
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
		public TerminalNode NUMDCL() { return getToken(safedeclarationParser.NUMDCL, 0); }
		public TerminalNode ID() { return getToken(safedeclarationParser.ID, 0); }
		public NumDeclNodeContext(NumdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterNumDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitNumDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitNumDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdeclContext numdecl() throws RecognitionException {
		NumdeclContext _localctx = new NumdeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numdecl);
		try {
			_localctx = new NumDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(NUMDCL);
			setState(64);
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
		public TerminalNode BOOLDCL() { return getToken(safedeclarationParser.BOOLDCL, 0); }
		public TerminalNode ID() { return getToken(safedeclarationParser.ID, 0); }
		public BoolDeclNodeContext(BooldeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBoolDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBoolDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBoolDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldeclContext booldecl() throws RecognitionException {
		BooldeclContext _localctx = new BooldeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_booldecl);
		try {
			_localctx = new BoolDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(BOOLDCL);
			setState(67);
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
		public TerminalNode CHARDCL() { return getToken(safedeclarationParser.CHARDCL, 0); }
		public TerminalNode ID() { return getToken(safedeclarationParser.ID, 0); }
		public CharDeclNodeContext(ChardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterCharDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitCharDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitCharDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardeclContext chardecl() throws RecognitionException {
		ChardeclContext _localctx = new ChardeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chardecl);
		try {
			_localctx = new CharDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CHARDCL);
			setState(70);
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
		public TerminalNode STRDCL() { return getToken(safedeclarationParser.STRDCL, 0); }
		public TerminalNode ID() { return getToken(safedeclarationParser.ID, 0); }
		public StringDeclNodeContext(StringdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterStringDeclNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitStringDeclNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitStringDeclNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdeclContext stringdecl() throws RecognitionException {
		StringdeclContext _localctx = new StringdeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringdecl);
		try {
			_localctx = new StringDeclNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRDCL);
			setState(73);
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
		public TerminalNode ASSIGN() { return getToken(safedeclarationParser.ASSIGN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public NumDclAssignNodeContext(NumdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterNumDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitNumDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitNumDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumdclassignContext numdclassign() throws RecognitionException {
		NumdclassignContext _localctx = new NumdclassignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numdclassign);
		try {
			_localctx = new NumDclAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			numdecl();
			setState(76);
			match(ASSIGN);
			setState(77);
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
		public TerminalNode ASSIGN() { return getToken(safedeclarationParser.ASSIGN, 0); }
		public TerminalNode CHARVAL() { return getToken(safedeclarationParser.CHARVAL, 0); }
		public CharDclAssignNodeContext(ChardclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterCharDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitCharDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitCharDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardclassignContext chardclassign() throws RecognitionException {
		ChardclassignContext _localctx = new ChardclassignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chardclassign);
		try {
			_localctx = new CharDclAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			chardecl();
			setState(80);
			match(ASSIGN);
			setState(81);
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
		public TerminalNode ASSIGN() { return getToken(safedeclarationParser.ASSIGN, 0); }
		public TerminalNode STRVAL() { return getToken(safedeclarationParser.STRVAL, 0); }
		public StringDclAssignNodeContext(StringdclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterStringDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitStringDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitStringDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdclassignContext stringdclassign() throws RecognitionException {
		StringdclassignContext _localctx = new StringdclassignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stringdclassign);
		try {
			_localctx = new StringDclAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			stringdecl();
			setState(84);
			match(ASSIGN);
			setState(85);
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
		public TerminalNode ASSIGN() { return getToken(safedeclarationParser.ASSIGN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolDclAssignNodeContext(BooldclassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBoolDclAssignNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBoolDclAssignNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBoolDclAssignNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldclassignContext booldclassign() throws RecognitionException {
		BooldclassignContext _localctx = new BooldclassignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booldclassign);
		try {
			_localctx = new BoolDclAssignNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			booldecl();
			setState(88);
			match(ASSIGN);
			setState(89);
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
		public TerminalNode BOOLVAL() { return getToken(safedeclarationParser.BOOLVAL, 0); }
		public BoolValNodeContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBoolValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBoolValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBoolValNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBexprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bexpr);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BoolValNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(BOOLVAL);
				}
				break;
			case 2:
				_localctx = new BexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBPartNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBTermNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBTermNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBTermNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtermContext bterm() throws RecognitionException {
		BtermContext _localctx = new BtermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bterm);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BTermNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				partbool();
				setState(96);
				relop();
				setState(97);
				partbool();
				}
				break;
			case 2:
				_localctx = new BPartNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBpartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBpartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBpartNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBPieceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBPieceNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBPieceNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpartContext bpart() throws RecognitionException {
		BpartContext _localctx = new BpartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bpart);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new BpartNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				bpiece();
				setState(103);
				bop();
				setState(104);
				bpiece();
				}
				break;
			case 2:
				_localctx = new BPieceNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
		public TerminalNode NOT() { return getToken(safedeclarationParser.NOT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public NotNodeContext(BpieceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterNotNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitNotNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitNotNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterBlastNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitBlastNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitBlastNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpieceContext bpiece() throws RecognitionException {
		BpieceContext _localctx = new BpieceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bpiece);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(NOT);
				setState(110);
				bexpr();
				}
				break;
			case ID:
			case LPAR:
				_localctx = new BlastNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
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
		public TerminalNode ID() { return getToken(safedeclarationParser.ID, 0); }
		public IdBlastNodeContext(BlastContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterIdBlastNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitIdBlastNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitIdBlastNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParexprNodeContext extends BlastContext {
		public TerminalNode LPAR() { return getToken(safedeclarationParser.LPAR, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(safedeclarationParser.RPAR, 0); }
		public ParexprNodeContext(BlastContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterParexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitParexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitParexprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlastContext blast() throws RecognitionException {
		BlastContext _localctx = new BlastContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blast);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new ParexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(LPAR);
				setState(115);
				bexpr();
				setState(116);
				match(RPAR);
				}
				break;
			case ID:
				_localctx = new IdBlastNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
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
		public List<TerminalNode> PLUS() { return getTokens(safedeclarationParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(safedeclarationParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(safedeclarationParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(safedeclarationParser.MINUS, i);
		}
		public TermNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterTermNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitTermNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitTermNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aexpr);
		int _la;
		try {
			_localctx = new TermNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			term();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				term();
				}
				}
				setState(128);
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
		public List<TerminalNode> TIMES() { return getTokens(safedeclarationParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(safedeclarationParser.TIMES, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(safedeclarationParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(safedeclarationParser.DIVISION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(safedeclarationParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(safedeclarationParser.MOD, i);
		}
		public PartNodeContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitPartNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			_localctx = new PartNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			part();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				part();
				}
				}
				setState(136);
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
		public TerminalNode ID() { return getToken(safedeclarationParser.ID, 0); }
		public IdPartNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterIdPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitIdPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitIdPartNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartAexprNodeContext extends PartContext {
		public TerminalNode LPAR() { return getToken(safedeclarationParser.LPAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(safedeclarationParser.RPAR, 0); }
		public PartAexprNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterPartAexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitPartAexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitPartAexprNode(this);
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
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterNumberValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitNumberValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitNumberValNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_part);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new PartAexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(LPAR);
				setState(138);
				aexpr();
				setState(139);
				match(RPAR);
				}
				break;
			case ID:
				_localctx = new IdPartNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ID);
				}
				break;
			case NUMVAL:
			case PI:
				_localctx = new NumberValNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
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
		public TerminalNode BOOLVAL() { return getToken(safedeclarationParser.BOOLVAL, 0); }
		public PartBoolNodeContext(PartboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterPartBoolNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitPartBoolNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitPartBoolNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartboolContext partbool() throws RecognitionException {
		PartboolContext _localctx = new PartboolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partbool);
		try {
			_localctx = new PartBoolNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case ID:
			case LPAR:
			case PI:
				{
				setState(145);
				part();
				}
				break;
			case BOOLVAL:
				{
				setState(146);
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
		public TerminalNode NUMVAL() { return getToken(safedeclarationParser.NUMVAL, 0); }
		public NumValNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterNumValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitNumValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitNumValNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PiNodeContext extends NumbervalContext {
		public TerminalNode PI() { return getToken(safedeclarationParser.PI, 0); }
		public PiNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterPiNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitPiNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitPiNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbervalContext numberval() throws RecognitionException {
		NumbervalContext _localctx = new NumbervalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numberval);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
				_localctx = new NumValNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(NUMVAL);
				}
				break;
			case PI:
				_localctx = new PiNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
		public TerminalNode AND() { return getToken(safedeclarationParser.AND, 0); }
		public AndNodeContext(BopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterAndNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitAndNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitAndNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrNodeContext extends BopContext {
		public TerminalNode OR() { return getToken(safedeclarationParser.OR, 0); }
		public OrNodeContext(BopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterOrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitOrNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitOrNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bop);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
		public TerminalNode GEQ() { return getToken(safedeclarationParser.GEQ, 0); }
		public GreaterEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterGreaterEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitGreaterEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitGreaterEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterNodeContext extends RelopContext {
		public TerminalNode GREATER() { return getToken(safedeclarationParser.GREATER, 0); }
		public GreaterNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterGreaterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitGreaterNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitGreaterNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserEqualNodeContext extends RelopContext {
		public TerminalNode LEQ() { return getToken(safedeclarationParser.LEQ, 0); }
		public LesserEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterLesserEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitLesserEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitLesserEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualNodeContext extends RelopContext {
		public TerminalNode EQ() { return getToken(safedeclarationParser.EQ, 0); }
		public EqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualNodeContext extends RelopContext {
		public TerminalNode NEQ() { return getToken(safedeclarationParser.NEQ, 0); }
		public NotEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterNotEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitNotEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitNotEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserNodeContext extends RelopContext {
		public TerminalNode LESS() { return getToken(safedeclarationParser.LESS, 0); }
		public LesserNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).enterLesserNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof safedeclarationListener ) ((safedeclarationListener)listener).exitLesserNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof safedeclarationVisitor ) return ((safedeclarationVisitor<? extends T>)visitor).visitLesserNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relop);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(EQ);
				}
				break;
			case NEQ:
				_localctx = new NotEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(NEQ);
				}
				break;
			case GEQ:
				_localctx = new GreaterEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(GEQ);
				}
				break;
			case LEQ:
				_localctx = new LesserEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(LEQ);
				}
				break;
			case LESS:
				_localctx = new LesserNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(LESS);
				}
				break;
			case GREATER:
				_localctx = new GreaterNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\5\2\64\n\2\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r`\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\5\16g\n\16\3\17\3\17\3\17\3\17\3\17\5\17n\n\17\3\20\3\20"+
		"\3\20\5\20s\n\20\3\21\3\21\3\21\3\21\3\21\5\21z\n\21\3\22\3\22\3\22\7"+
		"\22\177\n\22\f\22\16\22\u0082\13\22\3\23\3\23\3\23\7\23\u0087\n\23\f\23"+
		"\16\23\u008a\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0092\n\24\3\25"+
		"\3\25\5\25\u0096\n\25\3\26\3\26\5\26\u009a\n\26\3\27\3\27\5\27\u009e\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00a6\n\30\3\30\2\2\31\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\4\3\2\26\27\3\2\30\32\2\u00a8"+
		"\2\60\3\2\2\2\49\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nD\3\2\2\2\fG\3\2\2\2\16"+
		"J\3\2\2\2\20M\3\2\2\2\22Q\3\2\2\2\24U\3\2\2\2\26Y\3\2\2\2\30_\3\2\2\2"+
		"\32f\3\2\2\2\34m\3\2\2\2\36r\3\2\2\2 y\3\2\2\2\"{\3\2\2\2$\u0083\3\2\2"+
		"\2&\u0091\3\2\2\2(\u0095\3\2\2\2*\u0099\3\2\2\2,\u009d\3\2\2\2.\u00a5"+
		"\3\2\2\2\60\63\7\3\2\2\61\64\5\4\3\2\62\64\5\6\4\2\63\61\3\2\2\2\63\62"+
		"\3\2\2\2\64\3\3\2\2\2\65:\5\b\5\2\66:\5\f\7\2\67:\5\16\b\28:\5\n\6\29"+
		"\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\5\3\2\2\2;@\5\20\t\2<@"+
		"\5\22\n\2=@\5\24\13\2>@\5\26\f\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2"+
		"\2@\7\3\2\2\2AB\7\n\2\2BC\7\20\2\2C\t\3\2\2\2DE\7\r\2\2EF\7\20\2\2F\13"+
		"\3\2\2\2GH\7\13\2\2HI\7\20\2\2I\r\3\2\2\2JK\7\f\2\2KL\7\20\2\2L\17\3\2"+
		"\2\2MN\5\b\5\2NO\7\23\2\2OP\5\"\22\2P\21\3\2\2\2QR\5\f\7\2RS\7\23\2\2"+
		"ST\7\16\2\2T\23\3\2\2\2UV\5\16\b\2VW\7\23\2\2WX\7\17\2\2X\25\3\2\2\2Y"+
		"Z\5\n\6\2Z[\7\23\2\2[\\\5\30\r\2\\\27\3\2\2\2]`\7\4\2\2^`\5\32\16\2_]"+
		"\3\2\2\2_^\3\2\2\2`\31\3\2\2\2ab\5(\25\2bc\5.\30\2cd\5(\25\2dg\3\2\2\2"+
		"eg\5\34\17\2fa\3\2\2\2fe\3\2\2\2g\33\3\2\2\2hi\5\36\20\2ij\5,\27\2jk\5"+
		"\36\20\2kn\3\2\2\2ln\5\36\20\2mh\3\2\2\2ml\3\2\2\2n\35\3\2\2\2op\7\7\2"+
		"\2ps\5\30\r\2qs\5 \21\2ro\3\2\2\2rq\3\2\2\2s\37\3\2\2\2tu\7\24\2\2uv\5"+
		"\30\r\2vw\7\25\2\2wz\3\2\2\2xz\7\20\2\2yt\3\2\2\2yx\3\2\2\2z!\3\2\2\2"+
		"{\u0080\5$\23\2|}\t\2\2\2}\177\5$\23\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081#\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0088\5&\24\2\u0084\u0085\t\3\2\2\u0085\u0087\5&\24\2\u0086\u0084\3\2"+
		"\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"%\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\24\2\2\u008c\u008d\5\"\22"+
		"\2\u008d\u008e\7\25\2\2\u008e\u0092\3\2\2\2\u008f\u0092\7\20\2\2\u0090"+
		"\u0092\5*\26\2\u0091\u008b\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2"+
		"\2\2\u0092\'\3\2\2\2\u0093\u0096\5&\24\2\u0094\u0096\7\4\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0094\3\2\2\2\u0096)\3\2\2\2\u0097\u009a\7\5\2\2\u0098"+
		"\u009a\7\33\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a+\3\2\2\2"+
		"\u009b\u009e\7\b\2\2\u009c\u009e\7\t\2\2\u009d\u009b\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e-\3\2\2\2\u009f\u00a6\7\36\2\2\u00a0\u00a6\7\37\2\2\u00a1"+
		"\u00a6\7\35\2\2\u00a2\u00a6\7\34\2\2\u00a3\u00a6\7 \2\2\u00a4\u00a6\7"+
		"!\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6/\3\2\2\2"+
		"\21\639?_fmry\u0080\u0088\u0091\u0095\u0099\u009d\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}