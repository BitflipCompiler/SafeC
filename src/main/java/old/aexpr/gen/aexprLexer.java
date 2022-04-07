// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/aexpr\aexpr.g4 by ANTLR 4.9.2
package old.aexpr.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aexprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, DIVISION=4, MOD=5, LPAR=6, RPAR=7, ID=8, NUMVAL=9, 
		DOT=10, PI=11, WS=12, COMMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWERCASE", "UPPERCASE", "NUMBER", "PLUS", "MINUS", "TIMES", "DIVISION", 
			"MOD", "LPAR", "RPAR", "ID", "NUMVAL", "DOT", "PI", "WS", "COMMENT"
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


	public aexprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "aexpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\7\f<\n\f\f\f\16\f?\13\f\3\r\6\rB\n\r\r\r\16\rC\3\r"+
		"\3\r\6\rH\n\r\r\r\16\rI\5\rL\n\r\3\16\3\16\3\17\3\17\3\17\3\20\6\20T\n"+
		"\20\r\20\16\20U\3\20\3\20\3\21\3\21\3\21\3\21\7\21^\n\21\f\21\16\21a\13"+
		"\21\3\21\3\21\2\2\22\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n"+
		"\31\13\33\f\35\r\37\16!\17\3\2\6\3\2c|\3\2C\\\5\2\13\f\16\17\"\"\4\2\f"+
		"\f\17\17\2h\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2"+
		"\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\63\3"+
		"\2\2\2\25\65\3\2\2\2\27\67\3\2\2\2\31A\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2"+
		"\37S\3\2\2\2!Y\3\2\2\2#$\t\2\2\2$\4\3\2\2\2%&\t\3\2\2&\6\3\2\2\2\'(\4"+
		"\62;\2(\b\3\2\2\2)*\7-\2\2*\n\3\2\2\2+,\7/\2\2,\f\3\2\2\2-.\7,\2\2.\16"+
		"\3\2\2\2/\60\7\61\2\2\60\20\3\2\2\2\61\62\7\'\2\2\62\22\3\2\2\2\63\64"+
		"\7*\2\2\64\24\3\2\2\2\65\66\7+\2\2\66\26\3\2\2\2\67=\5\3\2\28<\5\3\2\2"+
		"9<\5\5\3\2:<\5\7\4\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>\30\3\2\2\2?=\3\2\2\2@B\5\7\4\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2DK\3\2\2\2EG\5\33\16\2FH\5\7\4\2GF\3\2\2\2HI\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2JL\3\2\2\2KE\3\2\2\2KL\3\2\2\2L\32\3\2\2\2MN\7\60\2\2N\34"+
		"\3\2\2\2OP\7r\2\2PQ\7k\2\2Q\36\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2U"+
		"S\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\20\2\2X \3\2\2\2YZ\7\61\2\2Z[\7\61\2"+
		"\2[_\3\2\2\2\\^\n\5\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2"+
		"\2\2a_\3\2\2\2bc\b\21\2\2c\"\3\2\2\2\n\2;=CIKU_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}