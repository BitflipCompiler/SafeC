// Generated from C:/Users/mymay/Dropbox/AAU/Programmering/P4/ANTLR/grammar\Aexpr2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Aexpr2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Aexpr2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Aexpr2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Aexpr2Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#structdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructdcl(Aexpr2Parser.StructdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#structblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructblock(Aexpr2Parser.StructblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#dclassignsemi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclassignsemi(Aexpr2Parser.DclassignsemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#dclassignsemicommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclassignsemicommand(Aexpr2Parser.DclassignsemicommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#safedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafedeclaration(Aexpr2Parser.SafedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Aexpr2Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Aexpr2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#caseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseblock(Aexpr2Parser.CaseblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVdcl(Aexpr2Parser.VdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#arraydecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydecl(Aexpr2Parser.ArraydeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#arrdcltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrdcltype(Aexpr2Parser.ArrdcltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#vassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVassign(Aexpr2Parser.VassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVdclassign(Aexpr2Parser.VdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#arraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydclassign(Aexpr2Parser.ArraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#numarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumarraydclassign(Aexpr2Parser.NumarraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#chararraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChararraydclassign(Aexpr2Parser.ChararraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#stringarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringarraydclassign(Aexpr2Parser.StringarraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#boolarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolarraydclassign(Aexpr2Parser.BoolarraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(Aexpr2Parser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtypes(Aexpr2Parser.AtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#arrayassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayassign(Aexpr2Parser.ArrayassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#arraydata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydata(Aexpr2Parser.ArraydataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#numarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumarray(Aexpr2Parser.NumarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#chararray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChararray(Aexpr2Parser.ChararrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#strarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrarray(Aexpr2Parser.StrarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#boolarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolarray(Aexpr2Parser.BoolarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(Aexpr2Parser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#funccalls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccalls(Aexpr2Parser.FunccallsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#funcdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdcl(Aexpr2Parser.FuncdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#funcblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncblock(Aexpr2Parser.FuncblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#callparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallparams(Aexpr2Parser.CallparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#ctrlstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlstruct(Aexpr2Parser.CtrlstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#iterative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterative(Aexpr2Parser.IterativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#selective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelective(Aexpr2Parser.SelectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#iflogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIflogic(Aexpr2Parser.IflogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#forparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForparams(Aexpr2Parser.ForparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#scase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScase(Aexpr2Parser.ScaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#defcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcase(Aexpr2Parser.DefcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#numdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumdecl(Aexpr2Parser.NumdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#booldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooldecl(Aexpr2Parser.BooldeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#chardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardecl(Aexpr2Parser.ChardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#stringdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdecl(Aexpr2Parser.StringdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#numdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumdclassign(Aexpr2Parser.NumdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#chardclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardclassign(Aexpr2Parser.ChardclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#stringdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdclassign(Aexpr2Parser.StringdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#booldclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooldclassign(Aexpr2Parser.BooldclassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprRelop}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprRelop(Aexpr2Parser.BexprRelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTBexpr}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTBexpr(Aexpr2Parser.NOTBexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprIDBoolval}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprIDBoolval(Aexpr2Parser.BexprIDBoolvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprBop}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprBop(Aexpr2Parser.BexprBopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprParens}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprParens(Aexpr2Parser.BexprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprBoolval}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprBoolval(Aexpr2Parser.BexprBoolvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprIdNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprTimesDivNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprTimesDivNode(Aexpr2Parser.AexprTimesDivNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprNumbervalNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprNumbervalNode(Aexpr2Parser.AexprNumbervalNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprAddSubNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprParensNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBop(Aexpr2Parser.BopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVals(Aexpr2Parser.ValsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aexpr2Parser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(Aexpr2Parser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprNumvalNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprNumvalNode(Aexpr2Parser.AexprNumvalNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprPiNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx);
}