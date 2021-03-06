package gen;
// Generated from C:/Users/winros/Documents/GitHub/ANTLR/grammar\SafeC.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SafeCLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWERCASE", "UPPERCASE", "NUMBER", "WHILESTMT", "FORSTMT", "IFSTMT", 
			"ELSE", "SWITCHSTMT", "CASE", "DEFAULT", "NUMDCL", "CHARDCL", "STRDCL", 
			"BOOLDCL", "VOIDDCL", "RETURN", "BREAK", "BOOLVAL", "NUMVAL", "CHARVAL", 
			"STRVAL", "ID", "SAFETY", "PLUS", "MINUS", "TIMES", "DIVISION", "POW", 
			"SQUARE", "MOD", "PI", "LBRACK", "RBRACK", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "DOT", "COMMA", "COLON", "SEMI", "SINGLEQOUTE", "DOUBLEQOUTE", 
			"ASSIGN", "LEQ", "GEQ", "EQ", "NEQ", "LESS", "GREATER", "NOT", "AND", 
			"OR", "HASHTAG", "DOLLAR", "WS", "COMMENT"
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


	public SafeCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SafeC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00da\n\23\3\24\6\24\u00dd\n\24\r\24\16\24\u00de"+
		"\3\24\3\24\6\24\u00e3\n\24\r\24\16\24\u00e4\5\24\u00e7\n\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\6\26\u00ef\n\26\r\26\16\26\u00f0\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\7\27\u00f9\n\27\f\27\16\27\u00fc\13\27\3\30\3\30\3\30\7"+
		"\30\u0101\n\30\f\30\16\30\u0104\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\3"+
		"8\39\69\u0153\n9\r9\169\u0154\39\39\3:\3:\3:\3:\7:\u015d\n:\f:\16:\u0160"+
		"\13:\3:\3:\2\2;\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13"+
		"\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67"+
		"\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62"+
		"i\63k\64m\65o\66q\67s8\3\2\7\3\2c|\3\2C\\\5\2\62;C\\c|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\2\u016a\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3\2\2\2\13"+
		"\u0081\3\2\2\2\r\u0085\3\2\2\2\17\u0088\3\2\2\2\21\u008d\3\2\2\2\23\u0094"+
		"\3\2\2\2\25\u0099\3\2\2\2\27\u00a1\3\2\2\2\31\u00a8\3\2\2\2\33\u00ad\3"+
		"\2\2\2\35\u00b4\3\2\2\2\37\u00bc\3\2\2\2!\u00c1\3\2\2\2#\u00c8\3\2\2\2"+
		"%\u00d9\3\2\2\2\'\u00dc\3\2\2\2)\u00e8\3\2\2\2+\u00ec\3\2\2\2-\u00f4\3"+
		"\2\2\2/\u00fd\3\2\2\2\61\u0105\3\2\2\2\63\u0107\3\2\2\2\65\u0109\3\2\2"+
		"\2\67\u010b\3\2\2\29\u010d\3\2\2\2;\u0111\3\2\2\2=\u0116\3\2\2\2?\u0118"+
		"\3\2\2\2A\u011b\3\2\2\2C\u011d\3\2\2\2E\u011f\3\2\2\2G\u0121\3\2\2\2I"+
		"\u0123\3\2\2\2K\u0125\3\2\2\2M\u0127\3\2\2\2O\u0129\3\2\2\2Q\u012b\3\2"+
		"\2\2S\u012d\3\2\2\2U\u012f\3\2\2\2W\u0131\3\2\2\2Y\u0133\3\2\2\2[\u0135"+
		"\3\2\2\2]\u0138\3\2\2\2_\u013b\3\2\2\2a\u013e\3\2\2\2c\u0141\3\2\2\2e"+
		"\u0143\3\2\2\2g\u0145\3\2\2\2i\u0147\3\2\2\2k\u014a\3\2\2\2m\u014d\3\2"+
		"\2\2o\u014f\3\2\2\2q\u0152\3\2\2\2s\u0158\3\2\2\2uv\t\2\2\2v\4\3\2\2\2"+
		"wx\t\3\2\2x\6\3\2\2\2yz\4\62;\2z\b\3\2\2\2{|\7y\2\2|}\7j\2\2}~\7k\2\2"+
		"~\177\7n\2\2\177\u0080\7g\2\2\u0080\n\3\2\2\2\u0081\u0082\7h\2\2\u0082"+
		"\u0083\7q\2\2\u0083\u0084\7t\2\2\u0084\f\3\2\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7h\2\2\u0087\16\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\20\3\2\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7y\2\2\u008f\u0090\7k\2\2\u0090\u0091\7v\2\2\u0091\u0092\7e\2\2"+
		"\u0092\u0093\7j\2\2\u0093\22\3\2\2\2\u0094\u0095\7e\2\2\u0095\u0096\7"+
		"c\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\24\3\2\2\2\u0099\u009a"+
		"\7f\2\2\u009a\u009b\7g\2\2\u009b\u009c\7h\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7v\2\2\u00a0\26\3\2\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7d\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7"+
		"e\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7t\2\2\u00ac\32"+
		"\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7i\2\2\u00b3\34\3\2\2\2\u00b4"+
		"\u00b5\7d\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7n\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7p\2\2\u00bb\36\3\2"+
		"\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7f\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7p\2\2\u00c7"+
		"\"\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7m\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5S*\2"+
		"\u00cf$\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2"+
		"\2\u00d3\u00da\7g\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7"+
		"\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00da\7g\2\2\u00d9\u00d0\3\2\2\2\u00d9"+
		"\u00d4\3\2\2\2\u00da&\3\2\2\2\u00db\u00dd\5\7\4\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e6"+
		"\3\2\2\2\u00e0\u00e2\5M\'\2\u00e1\u00e3\5\7\4\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7(\3\2\2\2\u00e8\u00e9"+
		"\5U+\2\u00e9\u00ea\t\4\2\2\u00ea\u00eb\5U+\2\u00eb*\3\2\2\2\u00ec\u00ee"+
		"\5W,\2\u00ed\u00ef\t\4\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5W"+
		",\2\u00f3,\3\2\2\2\u00f4\u00fa\5\3\2\2\u00f5\u00f9\5\3\2\2\u00f6\u00f9"+
		"\5\5\3\2\u00f7\u00f9\5\7\4\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb.\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5m\67\2\u00fe\u0102"+
		"\4\63;\2\u00ff\u0101\5\7\4\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\60\3\2\2\2\u0104\u0102\3\2\2"+
		"\2\u0105\u0106\7-\2\2\u0106\62\3\2\2\2\u0107\u0108\7/\2\2\u0108\64\3\2"+
		"\2\2\u0109\u010a\7,\2\2\u010a\66\3\2\2\2\u010b\u010c\7\61\2\2\u010c8\3"+
		"\2\2\2\u010d\u010e\7r\2\2\u010e\u010f\7q\2\2\u010f\u0110\7y\2\2\u0110"+
		":\3\2\2\2\u0111\u0112\7u\2\2\u0112\u0113\7s\2\2\u0113\u0114\7t\2\2\u0114"+
		"\u0115\7v\2\2\u0115<\3\2\2\2\u0116\u0117\7\'\2\2\u0117>\3\2\2\2\u0118"+
		"\u0119\7R\2\2\u0119\u011a\7K\2\2\u011a@\3\2\2\2\u011b\u011c\7]\2\2\u011c"+
		"B\3\2\2\2\u011d\u011e\7_\2\2\u011eD\3\2\2\2\u011f\u0120\7*\2\2\u0120F"+
		"\3\2\2\2\u0121\u0122\7+\2\2\u0122H\3\2\2\2\u0123\u0124\7}\2\2\u0124J\3"+
		"\2\2\2\u0125\u0126\7\177\2\2\u0126L\3\2\2\2\u0127\u0128\7\60\2\2\u0128"+
		"N\3\2\2\2\u0129\u012a\7.\2\2\u012aP\3\2\2\2\u012b\u012c\7<\2\2\u012cR"+
		"\3\2\2\2\u012d\u012e\7=\2\2\u012eT\3\2\2\2\u012f\u0130\7)\2\2\u0130V\3"+
		"\2\2\2\u0131\u0132\7$\2\2\u0132X\3\2\2\2\u0133\u0134\7?\2\2\u0134Z\3\2"+
		"\2\2\u0135\u0136\7>\2\2\u0136\u0137\7?\2\2\u0137\\\3\2\2\2\u0138\u0139"+
		"\7@\2\2\u0139\u013a\7?\2\2\u013a^\3\2\2\2\u013b\u013c\7?\2\2\u013c\u013d"+
		"\7?\2\2\u013d`\3\2\2\2\u013e\u013f\7#\2\2\u013f\u0140\7?\2\2\u0140b\3"+
		"\2\2\2\u0141\u0142\7>\2\2\u0142d\3\2\2\2\u0143\u0144\7@\2\2\u0144f\3\2"+
		"\2\2\u0145\u0146\7#\2\2\u0146h\3\2\2\2\u0147\u0148\7(\2\2\u0148\u0149"+
		"\7(\2\2\u0149j\3\2\2\2\u014a\u014b\7~\2\2\u014b\u014c\7~\2\2\u014cl\3"+
		"\2\2\2\u014d\u014e\7%\2\2\u014en\3\2\2\2\u014f\u0150\7&\2\2\u0150p\3\2"+
		"\2\2\u0151\u0153\t\5\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b9"+
		"\2\2\u0157r\3\2\2\2\u0158\u0159\7\61\2\2\u0159\u015a\7\61\2\2\u015a\u015e"+
		"\3\2\2\2\u015b\u015d\n\6\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0161\u0162\b:\2\2\u0162t\3\2\2\2\r\2\u00d9\u00de\u00e4\u00e6\u00f0"+
		"\u00f8\u00fa\u0102\u0154\u015e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}