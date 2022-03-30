import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		RULE_aexpr = 0, RULE_numberval = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"aexpr", "numberval"
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_aexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new AexprIdNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(5);
				match(ID);
				}
				break;
			case NUMVAL:
			case PI:
				{
				_localctx = new AexprNumbervalNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(6);
				numberval();
				}
				break;
			case LPAR:
				{
				_localctx = new AexprParensNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(7);
				match(LPAR);
				setState(8);
				aexpr(0);
				setState(9);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(19);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AexprTimesDivNodeContext(new AexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(13);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(14);
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
						setState(15);
						aexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new AexprAddSubNodeContext(new AexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(16);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(17);
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
						setState(18);
						aexpr(5);
						}
						break;
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		enterRule(_localctx, 2, RULE_numberval);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
				_localctx = new AexprNumvalNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(NUMVAL);
				}
				break;
			case PI:
				_localctx = new AexprPiNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
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
		case 0:
			return aexpr_sempred((AexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\37\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\16\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\3\3\3\5\3\35\n\3\3\3\2\3\2\4\2\4\2\4\4\2\31"+
		"\32\35\35\3\2\27\30\2!\2\r\3\2\2\2\4\34\3\2\2\2\6\7\b\2\1\2\7\16\7\25"+
		"\2\2\b\16\5\4\3\2\t\n\7!\2\2\n\13\5\2\2\2\13\f\7\"\2\2\f\16\3\2\2\2\r"+
		"\6\3\2\2\2\r\b\3\2\2\2\r\t\3\2\2\2\16\27\3\2\2\2\17\20\f\7\2\2\20\21\t"+
		"\2\2\2\21\26\5\2\2\b\22\23\f\6\2\2\23\24\t\3\2\2\24\26\5\2\2\7\25\17\3"+
		"\2\2\2\25\22\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3"+
		"\2\2\2\31\27\3\2\2\2\32\35\7\22\2\2\33\35\7\36\2\2\34\32\3\2\2\2\34\33"+
		"\3\2\2\2\35\5\3\2\2\2\6\r\25\27\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}