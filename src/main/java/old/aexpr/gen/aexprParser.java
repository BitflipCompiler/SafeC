// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/aexpr\aexpr.g4 by ANTLR 4.9.2
package old.aexpr.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aexprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, DIVISION=4, MOD=5, LPAR=6, RPAR=7, ID=8, NUMVAL=9, 
		DOT=10, PI=11, WS=12, COMMENT=13;
	public static final int
		RULE_aexpr = 0, RULE_term = 1, RULE_part = 2, RULE_numberval = 3;
	private static String[] makeRuleNames() {
		return new String[] {
                "old/aexpr", "term", "part", "numberval"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", null, null, "'.'", 
			"'pi'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "DIVISION", "MOD", "LPAR", "RPAR", "ID", 
			"NUMVAL", "DOT", "PI", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "aexpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public aexprParser(TokenStream input) {
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
	public static class TermNodeContext extends AexprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(aexprParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(aexprParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(aexprParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(aexprParser.MINUS, i);
		}
		public TermNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).enterTermNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).exitTermNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aexprVisitor ) return ((aexprVisitor<? extends T>)visitor).visitTermNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aexpr);
		int _la;
		try {
			_localctx = new TermNodeContext(_localctx);
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
		public List<TerminalNode> TIMES() { return getTokens(aexprParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(aexprParser.TIMES, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(aexprParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(aexprParser.DIVISION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(aexprParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(aexprParser.MOD, i);
		}
		public PartNodeContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).enterPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).exitPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aexprVisitor ) return ((aexprVisitor<? extends T>)visitor).visitPartNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		int _la;
		try {
			_localctx = new PartNodeContext(_localctx);
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
		public TerminalNode ID() { return getToken(aexprParser.ID, 0); }
		public IdPartNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).enterIdPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).exitIdPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aexprVisitor ) return ((aexprVisitor<? extends T>)visitor).visitIdPartNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartAexprNodeContext extends PartContext {
		public TerminalNode LPAR() { return getToken(aexprParser.LPAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(aexprParser.RPAR, 0); }
		public PartAexprNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).enterPartAexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).exitPartAexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aexprVisitor ) return ((aexprVisitor<? extends T>)visitor).visitPartAexprNode(this);
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
			if ( listener instanceof aexprListener ) ((aexprListener)listener).enterNumberValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).exitNumberValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aexprVisitor ) return ((aexprVisitor<? extends T>)visitor).visitNumberValNode(this);
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
				_localctx = new PartAexprNodeContext(_localctx);
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
				_localctx = new IdPartNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(ID);
				}
				break;
			case NUMVAL:
			case PI:
				_localctx = new NumberValNodeContext(_localctx);
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
		public TerminalNode NUMVAL() { return getToken(aexprParser.NUMVAL, 0); }
		public NumValNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).enterNumValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).exitNumValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aexprVisitor ) return ((aexprVisitor<? extends T>)visitor).visitNumValNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PiNodeContext extends NumbervalContext {
		public TerminalNode PI() { return getToken(aexprParser.PI, 0); }
		public PiNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).enterPiNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aexprListener ) ((aexprListener)listener).exitPiNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aexprVisitor ) return ((aexprVisitor<? extends T>)visitor).visitPiNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbervalContext numberval() throws RecognitionException {
		NumbervalContext _localctx = new NumbervalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numberval);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
				_localctx = new NumValNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(NUMVAL);
				}
				break;
			case PI:
				_localctx = new PiNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3"+
		"\3\7\3\26\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3"+
		"\5\5\5%\n\5\3\5\2\2\6\2\4\6\b\2\4\3\2\3\4\3\2\5\7\2\'\2\n\3\2\2\2\4\22"+
		"\3\2\2\2\6 \3\2\2\2\b$\3\2\2\2\n\17\5\4\3\2\13\f\t\2\2\2\f\16\5\4\3\2"+
		"\r\13\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21"+
		"\17\3\2\2\2\22\27\5\6\4\2\23\24\t\3\2\2\24\26\5\6\4\2\25\23\3\2\2\2\26"+
		"\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32"+
		"\33\7\b\2\2\33\34\5\2\2\2\34\35\7\t\2\2\35!\3\2\2\2\36!\7\n\2\2\37!\5"+
		"\b\5\2 \32\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\7\3\2\2\2\"%\7\13\2\2#%\7"+
		"\r\2\2$\"\3\2\2\2$#\3\2\2\2%\t\3\2\2\2\6\17\27 $";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}