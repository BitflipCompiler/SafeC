// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/P4/ANTLR/grammar\Aexpr2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Aexpr2Parser}.
 */
public interface Aexpr2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(Aexpr2Parser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(Aexpr2Parser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Aexpr2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Aexpr2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(Aexpr2Parser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(Aexpr2Parser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterNumberval(Aexpr2Parser.NumbervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitNumberval(Aexpr2Parser.NumbervalContext ctx);
}