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
		RULE_aexpr = 0, RULE_term = 1, RULE_part = 2, RULE_numberval = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"aexpr", "term", "part", "numberval"
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

	public static class AexprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Aexpr2Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Aexpr2Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Aexpr2Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Aexpr2Parser.MINUS, i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aexpr2Listener ) ((Aexpr2Listener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aexpr2Listener ) ((Aexpr2Listener)listener).exitAexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitAexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			term();
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(9);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(10);
				term();
				}
				}
				setState(15);
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
		public List<TerminalNode> TIMES() { return getTokens(Aexpr2Parser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(Aexpr2Parser.TIMES, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(Aexpr2Parser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(Aexpr2Parser.DIVISION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(Aexpr2Parser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(Aexpr2Parser.MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aexpr2Listener ) ((Aexpr2Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aexpr2Listener ) ((Aexpr2Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			part();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(17);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(18);
				part();
				}
				}
				setState(23);
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
		public TerminalNode LPAR() { return getToken(Aexpr2Parser.LPAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Aexpr2Parser.RPAR, 0); }
		public TerminalNode ID() { return getToken(Aexpr2Parser.ID, 0); }
		public NumbervalContext numberval() {
			return getRuleContext(NumbervalContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aexpr2Listener ) ((Aexpr2Listener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aexpr2Listener ) ((Aexpr2Listener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_part);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(LPAR);
				setState(25);
				aexpr();
				setState(26);
				match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(ID);
				}
				break;
			case NUMVAL:
			case PI:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
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

	public static class NumbervalContext extends ParserRuleContext {
		public TerminalNode NUMVAL() { return getToken(Aexpr2Parser.NUMVAL, 0); }
		public TerminalNode PI() { return getToken(Aexpr2Parser.PI, 0); }
		public NumbervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aexpr2Listener ) ((Aexpr2Listener)listener).enterNumberval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aexpr2Listener ) ((Aexpr2Listener)listener).exitNumberval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aexpr2Visitor ) return ((Aexpr2Visitor<? extends T>)visitor).visitNumberval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbervalContext numberval() throws RecognitionException {
		NumbervalContext _localctx = new NumbervalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numberval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38%\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3\3\7"+
		"\3\26\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3"+
		"\5\2\2\6\2\4\6\b\2\5\3\2\27\30\4\2\31\32\35\35\4\2\22\22\36\36\2$\2\n"+
		"\3\2\2\2\4\22\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n\17\5\4\3\2\13\f\t\2\2\2"+
		"\f\16\5\4\3\2\r\13\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20"+
		"\3\3\2\2\2\21\17\3\2\2\2\22\27\5\6\4\2\23\24\t\3\2\2\24\26\5\6\4\2\25"+
		"\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31"+
		"\27\3\2\2\2\32\33\7!\2\2\33\34\5\2\2\2\34\35\7\"\2\2\35!\3\2\2\2\36!\7"+
		"\25\2\2\37!\5\b\5\2 \32\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\7\3\2\2\2\"#"+
		"\t\4\2\2#\t\3\2\2\2\5\17\27 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}