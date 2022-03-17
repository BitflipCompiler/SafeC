// Generated from /home/jona/Documents/GitHub/ANTLR/src/main/java/safec/Safec.g4 by ANTLR 4.9.2
package safec.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SafecLexer extends Lexer {
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
			"SQUARE", "MOD", "PI", "LPAR", "RPAR", "LBRACE", "RBRACE", "DOT", "COMMA", 
			"COLON", "SEMI", "SINGLEQOUTE", "DOUBLEQOUTE", "ASSIGN", "LEQ", "GEQ", 
			"EQ", "NEQ", "LESS", "GREATER", "NOT", "AND", "OR", "HASHTAG", "WS", 
			"COMMENT"
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


	public SafecLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Safec.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0157\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00d4\n\23\3\24\6\24\u00d7\n\24\r\24\16\24\u00d8\3\24\3\24\6\24\u00dd"+
		"\n\24\r\24\16\24\u00de\5\24\u00e1\n\24\3\25\3\25\3\25\3\25\3\26\3\26\6"+
		"\26\u00e9\n\26\r\26\16\26\u00ea\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00f3"+
		"\n\27\f\27\16\27\u00f6\13\27\3\30\3\30\3\30\7\30\u00fb\n\30\f\30\16\30"+
		"\u00fe\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\66\6\66\u0147\n\66\r\66\16\66\u0148\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\7\67\u0151\n\67\f\67\16\67\u0154\13\67\3\67\3\67\2\28\3"+
		"\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16"+
		"!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35"+
		"?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65\3\2"+
		"\7\3\2c|\3\2C\\\5\2\62;C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u015e"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\t"+
		"u\3\2\2\2\13{\3\2\2\2\r\177\3\2\2\2\17\u0082\3\2\2\2\21\u0087\3\2\2\2"+
		"\23\u008e\3\2\2\2\25\u0093\3\2\2\2\27\u009b\3\2\2\2\31\u00a2\3\2\2\2\33"+
		"\u00a7\3\2\2\2\35\u00ae\3\2\2\2\37\u00b6\3\2\2\2!\u00bb\3\2\2\2#\u00c2"+
		"\3\2\2\2%\u00d3\3\2\2\2\'\u00d6\3\2\2\2)\u00e2\3\2\2\2+\u00e6\3\2\2\2"+
		"-\u00ee\3\2\2\2/\u00f7\3\2\2\2\61\u00ff\3\2\2\2\63\u0101\3\2\2\2\65\u0103"+
		"\3\2\2\2\67\u0105\3\2\2\29\u0107\3\2\2\2;\u010b\3\2\2\2=\u0110\3\2\2\2"+
		"?\u0112\3\2\2\2A\u0115\3\2\2\2C\u0117\3\2\2\2E\u0119\3\2\2\2G\u011b\3"+
		"\2\2\2I\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2\2\2Q\u0125"+
		"\3\2\2\2S\u0127\3\2\2\2U\u0129\3\2\2\2W\u012b\3\2\2\2Y\u012e\3\2\2\2["+
		"\u0131\3\2\2\2]\u0134\3\2\2\2_\u0137\3\2\2\2a\u0139\3\2\2\2c\u013b\3\2"+
		"\2\2e\u013d\3\2\2\2g\u0140\3\2\2\2i\u0143\3\2\2\2k\u0146\3\2\2\2m\u014c"+
		"\3\2\2\2op\t\2\2\2p\4\3\2\2\2qr\t\3\2\2r\6\3\2\2\2st\4\62;\2t\b\3\2\2"+
		"\2uv\7y\2\2vw\7j\2\2wx\7k\2\2xy\7n\2\2yz\7g\2\2z\n\3\2\2\2{|\7h\2\2|}"+
		"\7q\2\2}~\7t\2\2~\f\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7h\2\2\u0081"+
		"\16\3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085"+
		"\u0086\7g\2\2\u0086\20\3\2\2\2\u0087\u0088\7u\2\2\u0088\u0089\7y\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7v\2\2\u008b\u008c\7e\2\2\u008c\u008d\7j\2\2"+
		"\u008d\22\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090\7c\2\2\u0090\u0091\7"+
		"u\2\2\u0091\u0092\7g\2\2\u0092\24\3\2\2\2\u0093\u0094\7f\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7w\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7v\2\2\u009a\26\3\2\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7w\2\2\u009d\u009e\7o\2\2\u009e\u009f\7d\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\u00a1\7t\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7"+
		"j\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7t\2\2\u00a6\32\3\2\2\2\u00a7\u00a8"+
		"\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\u00ad\7i\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7d\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\u00b4\7c\2\2\u00b4\u00b5\7p\2\2\u00b5\36\3\2\2\2\u00b6\u00b7\7"+
		"x\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7f\2\2\u00ba "+
		"\3\2\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7v\2\2\u00be"+
		"\u00bf\7w\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7p\2\2\u00c1\"\3\2\2\2\u00c2"+
		"\u00c3\7d\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2"+
		"\u00c6\u00c7\7m\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\5O(\2\u00c9$\3\2\2"+
		"\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7w\2\2\u00cd\u00d4"+
		"\7g\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1"+
		"\u00d2\7u\2\2\u00d2\u00d4\7g\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00ce\3\2\2"+
		"\2\u00d4&\3\2\2\2\u00d5\u00d7\5\7\4\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e0\3\2\2\2\u00da"+
		"\u00dc\5I%\2\u00db\u00dd\5\7\4\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00da"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1(\3\2\2\2\u00e2\u00e3\5Q)\2\u00e3\u00e4"+
		"\t\4\2\2\u00e4\u00e5\5Q)\2\u00e5*\3\2\2\2\u00e6\u00e8\5S*\2\u00e7\u00e9"+
		"\t\4\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5S*\2\u00ed,\3\2\2\2\u00ee"+
		"\u00f4\5\3\2\2\u00ef\u00f3\5\3\2\2\u00f0\u00f3\5\5\3\2\u00f1\u00f3\5\7"+
		"\4\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5.\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u00f8\5i\65\2\u00f8\u00fc\4\63;\2\u00f9\u00fb"+
		"\5\7\4\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\60\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7-\2\2"+
		"\u0100\62\3\2\2\2\u0101\u0102\7/\2\2\u0102\64\3\2\2\2\u0103\u0104\7,\2"+
		"\2\u0104\66\3\2\2\2\u0105\u0106\7\61\2\2\u01068\3\2\2\2\u0107\u0108\7"+
		"r\2\2\u0108\u0109\7q\2\2\u0109\u010a\7y\2\2\u010a:\3\2\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7s\2\2\u010d\u010e\7t\2\2\u010e\u010f\7v\2\2\u010f"+
		"<\3\2\2\2\u0110\u0111\7\'\2\2\u0111>\3\2\2\2\u0112\u0113\7r\2\2\u0113"+
		"\u0114\7k\2\2\u0114@\3\2\2\2\u0115\u0116\7*\2\2\u0116B\3\2\2\2\u0117\u0118"+
		"\7+\2\2\u0118D\3\2\2\2\u0119\u011a\7}\2\2\u011aF\3\2\2\2\u011b\u011c\7"+
		"\177\2\2\u011cH\3\2\2\2\u011d\u011e\7\60\2\2\u011eJ\3\2\2\2\u011f\u0120"+
		"\7.\2\2\u0120L\3\2\2\2\u0121\u0122\7<\2\2\u0122N\3\2\2\2\u0123\u0124\7"+
		"=\2\2\u0124P\3\2\2\2\u0125\u0126\7)\2\2\u0126R\3\2\2\2\u0127\u0128\7$"+
		"\2\2\u0128T\3\2\2\2\u0129\u012a\7?\2\2\u012aV\3\2\2\2\u012b\u012c\7>\2"+
		"\2\u012c\u012d\7?\2\2\u012dX\3\2\2\2\u012e\u012f\7@\2\2\u012f\u0130\7"+
		"?\2\2\u0130Z\3\2\2\2\u0131\u0132\7?\2\2\u0132\u0133\7?\2\2\u0133\\\3\2"+
		"\2\2\u0134\u0135\7#\2\2\u0135\u0136\7?\2\2\u0136^\3\2\2\2\u0137\u0138"+
		"\7>\2\2\u0138`\3\2\2\2\u0139\u013a\7@\2\2\u013ab\3\2\2\2\u013b\u013c\7"+
		"#\2\2\u013cd\3\2\2\2\u013d\u013e\7(\2\2\u013e\u013f\7(\2\2\u013ff\3\2"+
		"\2\2\u0140\u0141\7~\2\2\u0141\u0142\7~\2\2\u0142h\3\2\2\2\u0143\u0144"+
		"\7%\2\2\u0144j\3\2\2\2\u0145\u0147\t\5\2\2\u0146\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\b\66\2\2\u014bl\3\2\2\2\u014c\u014d\7\61\2\2\u014d\u014e\7\61\2"+
		"\2\u014e\u0152\3\2\2\2\u014f\u0151\n\6\2\2\u0150\u014f\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0156\b\67\2\2\u0156n\3\2\2\2\r\2\u00d3\u00d8\u00de"+
		"\u00e0\u00ea\u00f2\u00f4\u00fc\u0148\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}