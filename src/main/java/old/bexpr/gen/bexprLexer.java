// Generated from C:/Users/Mandrup/Documents/GitHub/ANTLR/src/main/java/bexpr\bexpr.g4 by ANTLR 4.9.2
package old.bexpr.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bexprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLVAL=1, NUMVAL=2, DOT=3, NOT=4, AND=5, OR=6, ID=7, LPAR=8, RPAR=9, 
		PLUS=10, MINUS=11, TIMES=12, DIVISION=13, MOD=14, PI=15, LEQ=16, GEQ=17, 
		EQ=18, NEQ=19, LESS=20, GREATER=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWERCASE", "UPPERCASE", "NUMBER", "BOOLVAL", "NUMVAL", "DOT", "NOT", 
			"AND", "OR", "ID", "LPAR", "RPAR", "PLUS", "MINUS", "TIMES", "DIVISION", 
			"MOD", "PI", "LEQ", "GEQ", "EQ", "NEQ", "LESS", "GREATER"
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


	public bexprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bexpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"C\n\5\3\6\6\6F\n\6\r\6\16\6G\3\6\3\6\6\6L\n\6\r\6\16\6M\5\6P\n\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13`\n\13\f\13"+
		"\16\13c\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\2\2\32\3\2\5\2\7\2\t\3\13\4\r\5\17"+
		"\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24"+
		"-\25/\26\61\27\3\2\4\3\2c|\3\2C\\\2\u0088\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\tB\3\2\2\2"+
		"\13E\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23X\3\2\2\2\25[\3\2\2"+
		"\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2"+
		"\2#p\3\2\2\2%r\3\2\2\2\'u\3\2\2\2)x\3\2\2\2+{\3\2\2\2-~\3\2\2\2/\u0081"+
		"\3\2\2\2\61\u0083\3\2\2\2\63\64\t\2\2\2\64\4\3\2\2\2\65\66\t\3\2\2\66"+
		"\6\3\2\2\2\678\4\62;\28\b\3\2\2\29:\7v\2\2:;\7t\2\2;<\7w\2\2<C\7g\2\2"+
		"=>\7h\2\2>?\7c\2\2?@\7n\2\2@A\7u\2\2AC\7g\2\2B9\3\2\2\2B=\3\2\2\2C\n\3"+
		"\2\2\2DF\5\7\4\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HO\3\2\2\2IK\5"+
		"\r\7\2JL\5\7\4\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OI\3"+
		"\2\2\2OP\3\2\2\2P\f\3\2\2\2QR\7\60\2\2R\16\3\2\2\2ST\7#\2\2T\20\3\2\2"+
		"\2UV\7(\2\2VW\7(\2\2W\22\3\2\2\2XY\7~\2\2YZ\7~\2\2Z\24\3\2\2\2[a\5\3\2"+
		"\2\\`\5\3\2\2]`\5\5\3\2^`\5\7\4\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2b\26\3\2\2\2ca\3\2\2\2de\7*\2\2e\30\3\2\2\2fg"+
		"\7+\2\2g\32\3\2\2\2hi\7-\2\2i\34\3\2\2\2jk\7/\2\2k\36\3\2\2\2lm\7,\2\2"+
		"m \3\2\2\2no\7\61\2\2o\"\3\2\2\2pq\7\'\2\2q$\3\2\2\2rs\7r\2\2st\7k\2\2"+
		"t&\3\2\2\2uv\7>\2\2vw\7?\2\2w(\3\2\2\2xy\7@\2\2yz\7?\2\2z*\3\2\2\2{|\7"+
		"?\2\2|}\7?\2\2},\3\2\2\2~\177\7#\2\2\177\u0080\7?\2\2\u0080.\3\2\2\2\u0081"+
		"\u0082\7>\2\2\u0082\60\3\2\2\2\u0083\u0084\7@\2\2\u0084\62\3\2\2\2\t\2"+
		"BGMO_a\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}