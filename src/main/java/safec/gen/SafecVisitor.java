// Generated from /home/jona/Documents/GitHub/ANTLR/src/main/java/safec/Safec.g4 by ANTLR 4.9.2
package safec.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SafecParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SafecVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SafecParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SafecParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SafecParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(SafecParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SafecParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#dclassignsemi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclassignsemi(SafecParser.DclassignsemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#dclassignsemicommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclassignsemicommand(SafecParser.DclassignsemicommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#safedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafedeclaration(SafecParser.SafedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SafecParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SafecParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#caseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseblock(SafecParser.CaseblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVdcl(SafecParser.VdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#vassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVassign(SafecParser.VassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVdclassign(SafecParser.VdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(SafecParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtypes(SafecParser.AtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(SafecParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#funccalls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccalls(SafecParser.FunccallsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#funcdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdcl(SafecParser.FuncdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#funcblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncblock(SafecParser.FuncblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#callparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallparams(SafecParser.CallparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#ctrlstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlstruct(SafecParser.CtrlstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#iterative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterative(SafecParser.IterativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#selective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelective(SafecParser.SelectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#iflogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIflogic(SafecParser.IflogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#forparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForparams(SafecParser.ForparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#scase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScase(SafecParser.ScaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#defcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcase(SafecParser.DefcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#numdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumdecl(SafecParser.NumdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#booldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooldecl(SafecParser.BooldeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#chardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardecl(SafecParser.ChardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#stringdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdecl(SafecParser.StringdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#numdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumdclassign(SafecParser.NumdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#chardclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardclassign(SafecParser.ChardclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#stringdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdclassign(SafecParser.StringdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#booldclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooldclassign(SafecParser.BooldclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(SafecParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBterm(SafecParser.BtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#bpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpart(SafecParser.BpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#bpiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpiece(SafecParser.BpieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#blast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlast(SafecParser.BlastContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(SafecParser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SafecParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(SafecParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#partbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartbool(SafecParser.PartboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBop(SafecParser.BopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVals(SafecParser.ValsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberval(SafecParser.NumbervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafecParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(SafecParser.RelopContext ctx);
}