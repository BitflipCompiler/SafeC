package iter2.grammar_v2.gen;// Generated from Grammar_v2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Grammar_v2Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWERCASE", "UPPERCASE", "NUMBER", "WHILESTMT", "FORSTMT", "IFSTMT", 
			"SWITCHSTMT", "CASE", "DEFAULT", "NUMDCL", "STRDCL", "CHARDCL", "BOOLDCL", 
			"BREAK", "BLANK", "BOOLVAL", "ID", "SAFETY", "NUMVAL", "CHARVAL", "STRVAL", 
			"PLUS", "MINUS", "TIMES", "DIVISION", "POW", "SQUARE", "MOD", "PI", "LPAR", 
			"RPAR", "LBRACE", "RBRACE", "DOT", "COMMA", "COLON", "SEMI", "SINGLEQOUTE", 
			"DOUBLEQOUTE", "ASSIGN", "LEQ", "GEQ", "EQ", "NEQ", "LESS", "GREATER", 
			"NOT", "AND", "OR", "HASHTAG", "WS"
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


	public Grammar_v2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar_v2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u013a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00b5\n\20\r\20"+
		"\16\20\u00b6\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c2\n"+
		"\21\3\22\3\22\3\22\3\22\7\22\u00c8\n\22\f\22\16\22\u00cb\13\22\3\23\3"+
		"\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3\13\23\3\24\6\24\u00d6\n\24\r"+
		"\24\16\24\u00d7\3\24\3\24\6\24\u00dc\n\24\r\24\16\24\u00dd\5\24\u00e0"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\6\26\u00e8\n\26\r\26\16\26\u00e9\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\64\6\64\u0135\n\64\r\64\16\64\u0136\3\64\3\64\2\2\65\3\2"+
		"\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!"+
		"\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?"+
		"\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62\3\2\6\3\2c|\3\2"+
		"C\\\5\2\62;C\\c|\5\2\13\f\16\17\"\"\2\u0141\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7"+
		"m\3\2\2\2\to\3\2\2\2\13u\3\2\2\2\ry\3\2\2\2\17|\3\2\2\2\21\u0083\3\2\2"+
		"\2\23\u0088\3\2\2\2\25\u0090\3\2\2\2\27\u0097\3\2\2\2\31\u009e\3\2\2\2"+
		"\33\u00a3\3\2\2\2\35\u00ab\3\2\2\2\37\u00b4\3\2\2\2!\u00c1\3\2\2\2#\u00c3"+
		"\3\2\2\2%\u00cc\3\2\2\2\'\u00d5\3\2\2\2)\u00e1\3\2\2\2+\u00e5\3\2\2\2"+
		"-\u00ed\3\2\2\2/\u00ef\3\2\2\2\61\u00f1\3\2\2\2\63\u00f3\3\2\2\2\65\u00f5"+
		"\3\2\2\2\67\u00f9\3\2\2\29\u00fe\3\2\2\2;\u0100\3\2\2\2=\u0103\3\2\2\2"+
		"?\u0105\3\2\2\2A\u0107\3\2\2\2C\u0109\3\2\2\2E\u010b\3\2\2\2G\u010d\3"+
		"\2\2\2I\u010f\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2\2\2O\u0115\3\2\2\2Q\u0117"+
		"\3\2\2\2S\u0119\3\2\2\2U\u011c\3\2\2\2W\u011f\3\2\2\2Y\u0122\3\2\2\2["+
		"\u0125\3\2\2\2]\u0127\3\2\2\2_\u0129\3\2\2\2a\u012b\3\2\2\2c\u012e\3\2"+
		"\2\2e\u0131\3\2\2\2g\u0134\3\2\2\2ij\t\2\2\2j\4\3\2\2\2kl\t\3\2\2l\6\3"+
		"\2\2\2mn\4\62;\2n\b\3\2\2\2op\7y\2\2pq\7j\2\2qr\7k\2\2rs\7n\2\2st\7g\2"+
		"\2t\n\3\2\2\2uv\7h\2\2vw\7q\2\2wx\7t\2\2x\f\3\2\2\2yz\7k\2\2z{\7h\2\2"+
		"{\16\3\2\2\2|}\7u\2\2}~\7y\2\2~\177\7k\2\2\177\u0080\7v\2\2\u0080\u0081"+
		"\7e\2\2\u0081\u0082\7j\2\2\u0082\20\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087\22\3\2\2\2\u0088\u0089"+
		"\7f\2\2\u0089\u008a\7g\2\2\u008a\u008b\7h\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7w\2\2\u008d\u008e\7n\2\2\u008e\u008f\7v\2\2\u008f\24\3\2\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7w\2\2\u0092\u0093\7o\2\2\u0093\u0094\7d\2\2"+
		"\u0094\u0095\7g\2\2\u0095\u0096\7t\2\2\u0096\26\3\2\2\2\u0097\u0098\7"+
		"u\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b\u009c"+
		"\7p\2\2\u009c\u009d\7i\2\2\u009d\30\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0"+
		"\7j\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\32\3\2\2\2\u00a3\u00a4"+
		"\7d\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7p\2\2\u00aa\34\3\2\2\2\u00ab"+
		"\u00ac\7d\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2"+
		"\u00af\u00b0\7m\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5K&\2\u00b2\36\3\2"+
		"\2\2\u00b3\u00b5\7\"\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7t\2\2\u00ba\u00bb\7w\2\2\u00bb\u00c2\7g\2\2\u00bc\u00bd\7h\2\2"+
		"\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c2"+
		"\7g\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\"\3\2\2\2\u00c3"+
		"\u00c9\5\3\2\2\u00c4\u00c8\5\3\2\2\u00c5\u00c8\5\5\3\2\u00c6\u00c8\5\7"+
		"\4\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca$\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5e\63\2\u00cd\u00d1\4\63;\2\u00ce\u00d0"+
		"\5\7\4\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2&\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\5\7\4\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00df\3\2\2\2\u00d9\u00db\5E#\2\u00da\u00dc\5\7\4\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"(\3\2\2\2\u00e1\u00e2\5M\'\2\u00e2\u00e3\t\4\2\2\u00e3\u00e4\5M\'\2\u00e4"+
		"*\3\2\2\2\u00e5\u00e7\5O(\2\u00e6\u00e8\t\4\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\5O(\2\u00ec,\3\2\2\2\u00ed\u00ee\7-\2\2\u00ee.\3\2\2"+
		"\2\u00ef\u00f0\7/\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2\62\3\2"+
		"\2\2\u00f3\u00f4\7\61\2\2\u00f4\64\3\2\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7"+
		"\7q\2\2\u00f7\u00f8\7y\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb"+
		"\7s\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7v\2\2\u00fd8\3\2\2\2\u00fe\u00ff"+
		"\7\'\2\2\u00ff:\3\2\2\2\u0100\u0101\7r\2\2\u0101\u0102\7k\2\2\u0102<\3"+
		"\2\2\2\u0103\u0104\7*\2\2\u0104>\3\2\2\2\u0105\u0106\7+\2\2\u0106@\3\2"+
		"\2\2\u0107\u0108\7}\2\2\u0108B\3\2\2\2\u0109\u010a\7\177\2\2\u010aD\3"+
		"\2\2\2\u010b\u010c\7\60\2\2\u010cF\3\2\2\2\u010d\u010e\7.\2\2\u010eH\3"+
		"\2\2\2\u010f\u0110\7<\2\2\u0110J\3\2\2\2\u0111\u0112\7=\2\2\u0112L\3\2"+
		"\2\2\u0113\u0114\7)\2\2\u0114N\3\2\2\2\u0115\u0116\7$\2\2\u0116P\3\2\2"+
		"\2\u0117\u0118\7?\2\2\u0118R\3\2\2\2\u0119\u011a\7>\2\2\u011a\u011b\7"+
		"?\2\2\u011bT\3\2\2\2\u011c\u011d\7@\2\2\u011d\u011e\7?\2\2\u011eV\3\2"+
		"\2\2\u011f\u0120\7?\2\2\u0120\u0121\7?\2\2\u0121X\3\2\2\2\u0122\u0123"+
		"\7#\2\2\u0123\u0124\7?\2\2\u0124Z\3\2\2\2\u0125\u0126\7>\2\2\u0126\\\3"+
		"\2\2\2\u0127\u0128\7@\2\2\u0128^\3\2\2\2\u0129\u012a\7#\2\2\u012a`\3\2"+
		"\2\2\u012b\u012c\7(\2\2\u012c\u012d\7(\2\2\u012db\3\2\2\2\u012e\u012f"+
		"\7~\2\2\u012f\u0130\7~\2\2\u0130d\3\2\2\2\u0131\u0132\7%\2\2\u0132f\3"+
		"\2\2\2\u0133\u0135\t\5\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b\64"+
		"\2\2\u0139h\3\2\2\2\r\2\u00b6\u00c1\u00c7\u00c9\u00d1\u00d7\u00dd\u00df"+
		"\u00e9\u0136\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}