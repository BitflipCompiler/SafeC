package gen;
// Generated from C:/Users/winros/Documents/GitHub/ANTLR/grammar\SafeC.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SafeCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SafeCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SafeCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SafeCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SafeCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#structdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructdcl(SafeCParser.StructdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#structblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructblock(SafeCParser.StructblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#dclassignsemi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclassignsemi(SafeCParser.DclassignsemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#dclassignsemicommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclassignsemicommand(SafeCParser.DclassignsemicommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#safedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafedeclaration(SafeCParser.SafedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SafeCParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SafeCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#caseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseblock(SafeCParser.CaseblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#vdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVdcl(SafeCParser.VdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#arraydecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydecl(SafeCParser.ArraydeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#arrdcltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrdcltype(SafeCParser.ArrdcltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#vassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVassign(SafeCParser.VassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#vdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVdclassign(SafeCParser.VdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#arraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydclassign(SafeCParser.ArraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#numarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumarraydclassign(SafeCParser.NumarraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#chararraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChararraydclassign(SafeCParser.ChararraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#stringarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringarraydclassign(SafeCParser.StringarraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#boolarraydclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolarraydclassign(SafeCParser.BoolarraydclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(SafeCParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#atypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtypes(SafeCParser.AtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#arrayassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayassign(SafeCParser.ArrayassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#arraydata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydata(SafeCParser.ArraydataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#numarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumarray(SafeCParser.NumarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#chararray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChararray(SafeCParser.ChararrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#strarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrarray(SafeCParser.StrarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#boolarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolarray(SafeCParser.BoolarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(SafeCParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#funccalls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccalls(SafeCParser.FunccallsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#funcdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdcl(SafeCParser.FuncdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#funcblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncblock(SafeCParser.FuncblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#callparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallparams(SafeCParser.CallparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#ctrlstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlstruct(SafeCParser.CtrlstructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link SafeCParser#iterative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(SafeCParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link SafeCParser#iterative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(SafeCParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link SafeCParser#selective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SafeCParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link SafeCParser#selective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(SafeCParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#iflogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIflogic(SafeCParser.IflogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#forparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForparams(SafeCParser.ForparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#scase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScase(SafeCParser.ScaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#defcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcase(SafeCParser.DefcaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#numdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumdecl(SafeCParser.NumdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#booldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooldecl(SafeCParser.BooldeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#chardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardecl(SafeCParser.ChardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#stringdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdecl(SafeCParser.StringdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#numdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumdclassign(SafeCParser.NumdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#chardclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardclassign(SafeCParser.ChardclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#stringdclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdclassign(SafeCParser.StringdclassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#booldclassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooldclassign(SafeCParser.BooldclassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprRelop}
	 * labeled alternative in {@link SafeCParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprRelop(SafeCParser.BexprRelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTBexpr}
	 * labeled alternative in {@link SafeCParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTBexpr(SafeCParser.NOTBexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprIDBoolval}
	 * labeled alternative in {@link SafeCParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprIDBoolval(SafeCParser.BexprIDBoolvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprBop}
	 * labeled alternative in {@link SafeCParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprBop(SafeCParser.BexprBopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprParens}
	 * labeled alternative in {@link SafeCParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprParens(SafeCParser.BexprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BexprBoolval}
	 * labeled alternative in {@link SafeCParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexprBoolval(SafeCParser.BexprBoolvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprIdNode}
	 * labeled alternative in {@link SafeCParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprIdNode(SafeCParser.AexprIdNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprTimesDivNode}
	 * labeled alternative in {@link SafeCParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprTimesDivNode(SafeCParser.AexprTimesDivNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprNumbervalNode}
	 * labeled alternative in {@link SafeCParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprNumbervalNode(SafeCParser.AexprNumbervalNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprAddSubNode}
	 * labeled alternative in {@link SafeCParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprAddSubNode(SafeCParser.AexprAddSubNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprParensNode}
	 * labeled alternative in {@link SafeCParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprParensNode(SafeCParser.AexprParensNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBop(SafeCParser.BopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVals(SafeCParser.ValsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SafeCParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(SafeCParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprNumvalNode}
	 * labeled alternative in {@link SafeCParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprNumvalNode(SafeCParser.AexprNumvalNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AexprPiNode}
	 * labeled alternative in {@link SafeCParser#numberval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprPiNode(SafeCParser.AexprPiNodeContext ctx);
}