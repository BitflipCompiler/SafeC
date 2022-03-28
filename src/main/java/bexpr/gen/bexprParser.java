// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/bexpr\bexpr.g4 by ANTLR 4.9.2
package bexpr.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bexprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLVAL=1, NUMVAL=2, DOT=3, NOT=4, AND=5, OR=6, ID=7, LPAR=8, RPAR=9, 
		PLUS=10, MINUS=11, TIMES=12, DIVISION=13, MOD=14, PI=15, LEQ=16, GEQ=17, 
		EQ=18, NEQ=19, LESS=20, GREATER=21;
	public static final int
		RULE_bexpr = 0, RULE_bterm = 1, RULE_bpart = 2, RULE_bpiece = 3, RULE_blast = 4, 
		RULE_aexpr = 5, RULE_term = 6, RULE_part = 7, RULE_partbool = 8, RULE_numberval = 9, 
		RULE_bop = 10, RULE_relop = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"bexpr", "bterm", "bpart", "bpiece", "blast", "aexpr", "term", "part", 
			"partbool", "numberval", "bop", "relop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'", "'!'", "'&&'", "'||'", null, "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'pi'", "'<='", "'>='", "'=='", "'!='", "'<'", 
			"'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLVAL", "NUMVAL", "DOT", "NOT", "AND", "OR", "ID", "LPAR", "RPAR", 
			"PLUS", "MINUS", "TIMES", "DIVISION", "MOD", "PI", "LEQ", "GEQ", "EQ", 
			"NEQ", "LESS", "GREATER"
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
	public String getGrammarFileName() { return "bexpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bexprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		public TerminalNode BOOLVAL() { return getToken(bexprParser.BOOLVAL, 0); }
		public BoolValNodeContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterBoolValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitBoolValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitBoolValNode(this);
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
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterBexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitBexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitBexprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bexpr);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new BoolValNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(BOOLVAL);
				}
				break;
			case 2:
				_localctx = new BexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
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
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterBPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitBPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitBPartNode(this);
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
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterBTermNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitBTermNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitBTermNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtermContext bterm() throws RecognitionException {
		BtermContext _localctx = new BtermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bterm);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BTermNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				partbool();
				setState(29);
				relop();
				setState(30);
				partbool();
				}
				break;
			case 2:
				_localctx = new BPartNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
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
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterBpartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitBpartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitBpartNode(this);
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
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterBPieceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitBPieceNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitBPieceNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpartContext bpart() throws RecognitionException {
		BpartContext _localctx = new BpartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bpart);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BpartNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				bpiece();
				setState(36);
				bop();
				setState(37);
				bpiece();
				}
				break;
			case 2:
				_localctx = new BPieceNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
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
		public TerminalNode NOT() { return getToken(bexprParser.NOT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public NotNodeContext(BpieceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterNotNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitNotNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitNotNode(this);
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
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterBlastNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitBlastNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitBlastNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpieceContext bpiece() throws RecognitionException {
		BpieceContext _localctx = new BpieceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bpiece);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(NOT);
				setState(43);
				bexpr();
				}
				break;
			case ID:
			case LPAR:
				_localctx = new BlastNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
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
		public TerminalNode ID() { return getToken(bexprParser.ID, 0); }
		public IdBlastNodeContext(BlastContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterIdBlastNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitIdBlastNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitIdBlastNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParexprNodeContext extends BlastContext {
		public TerminalNode LPAR() { return getToken(bexprParser.LPAR, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(bexprParser.RPAR, 0); }
		public ParexprNodeContext(BlastContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterParexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitParexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitParexprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlastContext blast() throws RecognitionException {
		BlastContext _localctx = new BlastContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blast);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new ParexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(LPAR);
				setState(48);
				bexpr();
				setState(49);
				match(RPAR);
				}
				break;
			case ID:
				_localctx = new IdBlastNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
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
		public List<TerminalNode> PLUS() { return getTokens(bexprParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(bexprParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(bexprParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(bexprParser.MINUS, i);
		}
		public TermNodeContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterTermNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitTermNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitTermNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aexpr);
		int _la;
		try {
			_localctx = new TermNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			term();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				term();
				}
				}
				setState(61);
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
		public List<TerminalNode> TIMES() { return getTokens(bexprParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(bexprParser.TIMES, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(bexprParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(bexprParser.DIVISION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(bexprParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(bexprParser.MOD, i);
		}
		public PartNodeContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitPartNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			_localctx = new PartNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			part();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(63);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				part();
				}
				}
				setState(69);
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
		public TerminalNode ID() { return getToken(bexprParser.ID, 0); }
		public IdPartNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterIdPartNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitIdPartNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitIdPartNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartAexprNodeContext extends PartContext {
		public TerminalNode LPAR() { return getToken(bexprParser.LPAR, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(bexprParser.RPAR, 0); }
		public PartAexprNodeContext(PartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterPartAexprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitPartAexprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitPartAexprNode(this);
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
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterNumberValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitNumberValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitNumberValNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_part);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new PartAexprNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(LPAR);
				setState(71);
				aexpr();
				setState(72);
				match(RPAR);
				}
				break;
			case ID:
				_localctx = new IdPartNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(ID);
				}
				break;
			case NUMVAL:
			case PI:
				_localctx = new NumberValNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
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
		public TerminalNode BOOLVAL() { return getToken(bexprParser.BOOLVAL, 0); }
		public PartBoolNodeContext(PartboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterPartBoolNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitPartBoolNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitPartBoolNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartboolContext partbool() throws RecognitionException {
		PartboolContext _localctx = new PartboolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partbool);
		try {
			_localctx = new PartBoolNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
			case ID:
			case LPAR:
			case PI:
				{
				setState(78);
				part();
				}
				break;
			case BOOLVAL:
				{
				setState(79);
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
		public TerminalNode NUMVAL() { return getToken(bexprParser.NUMVAL, 0); }
		public NumValNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterNumValNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitNumValNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitNumValNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PiNodeContext extends NumbervalContext {
		public TerminalNode PI() { return getToken(bexprParser.PI, 0); }
		public PiNodeContext(NumbervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterPiNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitPiNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitPiNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbervalContext numberval() throws RecognitionException {
		NumbervalContext _localctx = new NumbervalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numberval);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMVAL:
				_localctx = new NumValNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(NUMVAL);
				}
				break;
			case PI:
				_localctx = new PiNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
		public TerminalNode AND() { return getToken(bexprParser.AND, 0); }
		public AndNodeContext(BopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterAndNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitAndNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitAndNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrNodeContext extends BopContext {
		public TerminalNode OR() { return getToken(bexprParser.OR, 0); }
		public OrNodeContext(BopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterOrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitOrNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitOrNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bop);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
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
	public static class LesseEqualNodeContext extends RelopContext {
		public TerminalNode LEQ() { return getToken(bexprParser.LEQ, 0); }
		public LesseEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterLesseEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitLesseEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitLesseEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualNodeContext extends RelopContext {
		public TerminalNode GEQ() { return getToken(bexprParser.GEQ, 0); }
		public GreaterEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterGreaterEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitGreaterEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitGreaterEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterNodeContext extends RelopContext {
		public TerminalNode GREATER() { return getToken(bexprParser.GREATER, 0); }
		public GreaterNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterGreaterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitGreaterNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitGreaterNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualNodeContext extends RelopContext {
		public TerminalNode EQ() { return getToken(bexprParser.EQ, 0); }
		public EqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualNodeContext extends RelopContext {
		public TerminalNode NEQ() { return getToken(bexprParser.NEQ, 0); }
		public NotEqualNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterNotEqualNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitNotEqualNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitNotEqualNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserNodeContext extends RelopContext {
		public TerminalNode LESS() { return getToken(bexprParser.LESS, 0); }
		public LesserNodeContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).enterLesserNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bexprListener ) ((bexprListener)listener).exitLesserNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bexprVisitor ) return ((bexprVisitor<? extends T>)visitor).visitLesserNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relop);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(EQ);
				}
				break;
			case NEQ:
				_localctx = new NotEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(NEQ);
				}
				break;
			case GEQ:
				_localctx = new GreaterEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(GEQ);
				}
				break;
			case LEQ:
				_localctx = new LesseEqualNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(LEQ);
				}
				break;
			case LESS:
				_localctx = new LesserNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(LESS);
				}
				break;
			case GREATER:
				_localctx = new GreaterNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\5\5\60\n\5\3\6\3\6\3\6\3\6\3\6\5\6\67"+
		"\n\6\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\b\3\b\3\b\7\bD\n\b\f\b\16\b"+
		"G\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\5\nS\n\n\3\13\3\13\5\13"+
		"W\n\13\3\f\3\f\5\f[\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rc\n\r\3\r\2\2\16\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\f\r\3\2\16\20\2i\2\34\3\2\2\2\4#"+
		"\3\2\2\2\6*\3\2\2\2\b/\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16@\3\2\2\2\20"+
		"N\3\2\2\2\22R\3\2\2\2\24V\3\2\2\2\26Z\3\2\2\2\30b\3\2\2\2\32\35\7\3\2"+
		"\2\33\35\5\4\3\2\34\32\3\2\2\2\34\33\3\2\2\2\35\3\3\2\2\2\36\37\5\22\n"+
		"\2\37 \5\30\r\2 !\5\22\n\2!$\3\2\2\2\"$\5\6\4\2#\36\3\2\2\2#\"\3\2\2\2"+
		"$\5\3\2\2\2%&\5\b\5\2&\'\5\26\f\2\'(\5\b\5\2(+\3\2\2\2)+\5\b\5\2*%\3\2"+
		"\2\2*)\3\2\2\2+\7\3\2\2\2,-\7\6\2\2-\60\5\2\2\2.\60\5\n\6\2/,\3\2\2\2"+
		"/.\3\2\2\2\60\t\3\2\2\2\61\62\7\n\2\2\62\63\5\2\2\2\63\64\7\13\2\2\64"+
		"\67\3\2\2\2\65\67\7\t\2\2\66\61\3\2\2\2\66\65\3\2\2\2\67\13\3\2\2\28="+
		"\5\16\b\29:\t\2\2\2:<\5\16\b\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">\r\3\2\2\2?=\3\2\2\2@E\5\20\t\2AB\t\3\2\2BD\5\20\t\2CA\3\2\2\2DG\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2F\17\3\2\2\2GE\3\2\2\2HI\7\n\2\2IJ\5\f\7\2JK\7"+
		"\13\2\2KO\3\2\2\2LO\7\t\2\2MO\5\24\13\2NH\3\2\2\2NL\3\2\2\2NM\3\2\2\2"+
		"O\21\3\2\2\2PS\5\20\t\2QS\7\3\2\2RP\3\2\2\2RQ\3\2\2\2S\23\3\2\2\2TW\7"+
		"\4\2\2UW\7\21\2\2VT\3\2\2\2VU\3\2\2\2W\25\3\2\2\2X[\7\7\2\2Y[\7\b\2\2"+
		"ZX\3\2\2\2ZY\3\2\2\2[\27\3\2\2\2\\c\7\24\2\2]c\7\25\2\2^c\7\23\2\2_c\7"+
		"\22\2\2`c\7\26\2\2ac\7\27\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2"+
		"b`\3\2\2\2ba\3\2\2\2c\31\3\2\2\2\16\34#*/\66=ENRVZb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}