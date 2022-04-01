// Generated from /Users/karlos/Desktop/ANTLR/grammar/Aexpr2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Aexpr2Parser}.
 */
public interface Aexpr2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Aexpr2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Aexpr2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Aexpr2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Aexpr2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#structdcl}.
	 * @param ctx the parse tree
	 */
	void enterStructdcl(Aexpr2Parser.StructdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#structdcl}.
	 * @param ctx the parse tree
	 */
	void exitStructdcl(Aexpr2Parser.StructdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#structblock}.
	 * @param ctx the parse tree
	 */
	void enterStructblock(Aexpr2Parser.StructblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#structblock}.
	 * @param ctx the parse tree
	 */
	void exitStructblock(Aexpr2Parser.StructblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DclassignSemi}
	 * labeled alternative in {@link Aexpr2Parser#dclassignsemi}.
	 * @param ctx the parse tree
	 */
	void enterDclassignSemi(Aexpr2Parser.DclassignSemiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DclassignSemi}
	 * labeled alternative in {@link Aexpr2Parser#dclassignsemi}.
	 * @param ctx the parse tree
	 */
	void exitDclassignSemi(Aexpr2Parser.DclassignSemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#dclassignsemicommand}.
	 * @param ctx the parse tree
	 */
	void enterDclassignsemicommand(Aexpr2Parser.DclassignsemicommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#dclassignsemicommand}.
	 * @param ctx the parse tree
	 */
	void exitDclassignsemicommand(Aexpr2Parser.DclassignsemicommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#safedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSafedeclaration(Aexpr2Parser.SafedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#safedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSafedeclaration(Aexpr2Parser.SafedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Aexpr2Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Aexpr2Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Aexpr2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Aexpr2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#caseblock}.
	 * @param ctx the parse tree
	 */
	void enterCaseblock(Aexpr2Parser.CaseblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#caseblock}.
	 * @param ctx the parse tree
	 */
	void exitCaseblock(Aexpr2Parser.CaseblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#vdcl}.
	 * @param ctx the parse tree
	 */
	void enterVdcl(Aexpr2Parser.VdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#vdcl}.
	 * @param ctx the parse tree
	 */
	void exitVdcl(Aexpr2Parser.VdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#arraydecl}.
	 * @param ctx the parse tree
	 */
	void enterArraydecl(Aexpr2Parser.ArraydeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#arraydecl}.
	 * @param ctx the parse tree
	 */
	void exitArraydecl(Aexpr2Parser.ArraydeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void enterArrdcltype(Aexpr2Parser.ArrdcltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#arrdcltype}.
	 * @param ctx the parse tree
	 */
	void exitArrdcltype(Aexpr2Parser.ArrdcltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#vassign}.
	 * @param ctx the parse tree
	 */
	void enterVassign(Aexpr2Parser.VassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#vassign}.
	 * @param ctx the parse tree
	 */
	void exitVassign(Aexpr2Parser.VassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void enterVdclassign(Aexpr2Parser.VdclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#vdclassign}.
	 * @param ctx the parse tree
	 */
	void exitVdclassign(Aexpr2Parser.VdclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterArraydclassign(Aexpr2Parser.ArraydclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#arraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitArraydclassign(Aexpr2Parser.ArraydclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#numarraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumarraydclassign(Aexpr2Parser.NumarraydclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#numarraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumarraydclassign(Aexpr2Parser.NumarraydclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#chararraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterChararraydclassign(Aexpr2Parser.ChararraydclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#chararraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitChararraydclassign(Aexpr2Parser.ChararraydclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#stringarraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringarraydclassign(Aexpr2Parser.StringarraydclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#stringarraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringarraydclassign(Aexpr2Parser.StringarraydclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#boolarraydclassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolarraydclassign(Aexpr2Parser.BoolarraydclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#boolarraydclassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolarraydclassign(Aexpr2Parser.BoolarraydclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(Aexpr2Parser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(Aexpr2Parser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#atypes}.
	 * @param ctx the parse tree
	 */
	void enterAtypes(Aexpr2Parser.AtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#atypes}.
	 * @param ctx the parse tree
	 */
	void exitAtypes(Aexpr2Parser.AtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#arrayassign}.
	 * @param ctx the parse tree
	 */
	void enterArrayassign(Aexpr2Parser.ArrayassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#arrayassign}.
	 * @param ctx the parse tree
	 */
	void exitArrayassign(Aexpr2Parser.ArrayassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#arraydata}.
	 * @param ctx the parse tree
	 */
	void enterArraydata(Aexpr2Parser.ArraydataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#arraydata}.
	 * @param ctx the parse tree
	 */
	void exitArraydata(Aexpr2Parser.ArraydataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#numarray}.
	 * @param ctx the parse tree
	 */
	void enterNumarray(Aexpr2Parser.NumarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#numarray}.
	 * @param ctx the parse tree
	 */
	void exitNumarray(Aexpr2Parser.NumarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#chararray}.
	 * @param ctx the parse tree
	 */
	void enterChararray(Aexpr2Parser.ChararrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#chararray}.
	 * @param ctx the parse tree
	 */
	void exitChararray(Aexpr2Parser.ChararrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#strarray}.
	 * @param ctx the parse tree
	 */
	void enterStrarray(Aexpr2Parser.StrarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#strarray}.
	 * @param ctx the parse tree
	 */
	void exitStrarray(Aexpr2Parser.StrarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#boolarray}.
	 * @param ctx the parse tree
	 */
	void enterBoolarray(Aexpr2Parser.BoolarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#boolarray}.
	 * @param ctx the parse tree
	 */
	void exitBoolarray(Aexpr2Parser.BoolarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(Aexpr2Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(Aexpr2Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#funccalls}.
	 * @param ctx the parse tree
	 */
	void enterFunccalls(Aexpr2Parser.FunccallsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#funccalls}.
	 * @param ctx the parse tree
	 */
	void exitFunccalls(Aexpr2Parser.FunccallsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#funcdcl}.
	 * @param ctx the parse tree
	 */
	void enterFuncdcl(Aexpr2Parser.FuncdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#funcdcl}.
	 * @param ctx the parse tree
	 */
	void exitFuncdcl(Aexpr2Parser.FuncdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#funcblock}.
	 * @param ctx the parse tree
	 */
	void enterFuncblock(Aexpr2Parser.FuncblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#funcblock}.
	 * @param ctx the parse tree
	 */
	void exitFuncblock(Aexpr2Parser.FuncblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#callparams}.
	 * @param ctx the parse tree
	 */
	void enterCallparams(Aexpr2Parser.CallparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#callparams}.
	 * @param ctx the parse tree
	 */
	void exitCallparams(Aexpr2Parser.CallparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#ctrlstruct}.
	 * @param ctx the parse tree
	 */
	void enterCtrlstruct(Aexpr2Parser.CtrlstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#ctrlstruct}.
	 * @param ctx the parse tree
	 */
	void exitCtrlstruct(Aexpr2Parser.CtrlstructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link Aexpr2Parser#iterative}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(Aexpr2Parser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link Aexpr2Parser#iterative}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(Aexpr2Parser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link Aexpr2Parser#iterative}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(Aexpr2Parser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link Aexpr2Parser#iterative}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(Aexpr2Parser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link Aexpr2Parser#selective}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Aexpr2Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link Aexpr2Parser#selective}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Aexpr2Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link Aexpr2Parser#selective}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(Aexpr2Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link Aexpr2Parser#selective}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(Aexpr2Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#iflogic}.
	 * @param ctx the parse tree
	 */
	void enterIflogic(Aexpr2Parser.IflogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#iflogic}.
	 * @param ctx the parse tree
	 */
	void exitIflogic(Aexpr2Parser.IflogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#forparams}.
	 * @param ctx the parse tree
	 */
	void enterForparams(Aexpr2Parser.ForparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#forparams}.
	 * @param ctx the parse tree
	 */
	void exitForparams(Aexpr2Parser.ForparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#scase}.
	 * @param ctx the parse tree
	 */
	void enterScase(Aexpr2Parser.ScaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#scase}.
	 * @param ctx the parse tree
	 */
	void exitScase(Aexpr2Parser.ScaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#defcase}.
	 * @param ctx the parse tree
	 */
	void enterDefcase(Aexpr2Parser.DefcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#defcase}.
	 * @param ctx the parse tree
	 */
	void exitDefcase(Aexpr2Parser.DefcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#numdecl}.
	 * @param ctx the parse tree
	 */
	void enterNumdecl(Aexpr2Parser.NumdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#numdecl}.
	 * @param ctx the parse tree
	 */
	void exitNumdecl(Aexpr2Parser.NumdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#booldecl}.
	 * @param ctx the parse tree
	 */
	void enterBooldecl(Aexpr2Parser.BooldeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#booldecl}.
	 * @param ctx the parse tree
	 */
	void exitBooldecl(Aexpr2Parser.BooldeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#chardecl}.
	 * @param ctx the parse tree
	 */
	void enterChardecl(Aexpr2Parser.ChardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#chardecl}.
	 * @param ctx the parse tree
	 */
	void exitChardecl(Aexpr2Parser.ChardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#stringdecl}.
	 * @param ctx the parse tree
	 */
	void enterStringdecl(Aexpr2Parser.StringdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#stringdecl}.
	 * @param ctx the parse tree
	 */
	void exitStringdecl(Aexpr2Parser.StringdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#numdclassign}.
	 * @param ctx the parse tree
	 */
	void enterNumdclassign(Aexpr2Parser.NumdclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#numdclassign}.
	 * @param ctx the parse tree
	 */
	void exitNumdclassign(Aexpr2Parser.NumdclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#chardclassign}.
	 * @param ctx the parse tree
	 */
	void enterChardclassign(Aexpr2Parser.ChardclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#chardclassign}.
	 * @param ctx the parse tree
	 */
	void exitChardclassign(Aexpr2Parser.ChardclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#stringdclassign}.
	 * @param ctx the parse tree
	 */
	void enterStringdclassign(Aexpr2Parser.StringdclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#stringdclassign}.
	 * @param ctx the parse tree
	 */
	void exitStringdclassign(Aexpr2Parser.StringdclassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#booldclassign}.
	 * @param ctx the parse tree
	 */
	void enterBooldclassign(Aexpr2Parser.BooldclassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#booldclassign}.
	 * @param ctx the parse tree
	 */
	void exitBooldclassign(Aexpr2Parser.BooldclassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BexprRelop}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexprRelop(Aexpr2Parser.BexprRelopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BexprRelop}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexprRelop(Aexpr2Parser.BexprRelopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTBexpr}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterNOTBexpr(Aexpr2Parser.NOTBexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTBexpr}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitNOTBexpr(Aexpr2Parser.NOTBexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BexprIDBoolval}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexprIDBoolval(Aexpr2Parser.BexprIDBoolvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BexprIDBoolval}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexprIDBoolval(Aexpr2Parser.BexprIDBoolvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BexprBop}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexprBop(Aexpr2Parser.BexprBopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BexprBop}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexprBop(Aexpr2Parser.BexprBopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BexprParens}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexprParens(Aexpr2Parser.BexprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BexprParens}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexprParens(Aexpr2Parser.BexprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BexprBoolval}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexprBoolval(Aexpr2Parser.BexprBoolvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BexprBoolval}
	 * labeled alternative in {@link Aexpr2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexprBoolval(Aexpr2Parser.BexprBoolvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprIdNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprIdNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprTimesDivNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexprTimesDivNode(Aexpr2Parser.AexprTimesDivNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprTimesDivNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexprTimesDivNode(Aexpr2Parser.AexprTimesDivNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprNumbervalNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexprNumbervalNode(Aexpr2Parser.AexprNumbervalNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprNumbervalNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexprNumbervalNode(Aexpr2Parser.AexprNumbervalNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprAddSubNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprAddSubNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprParensNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprParensNode}
	 * labeled alternative in {@link Aexpr2Parser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(Aexpr2Parser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(Aexpr2Parser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#vals}.
	 * @param ctx the parse tree
	 */
	void enterVals(Aexpr2Parser.ValsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#vals}.
	 * @param ctx the parse tree
	 */
	void exitVals(Aexpr2Parser.ValsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aexpr2Parser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(Aexpr2Parser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aexpr2Parser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(Aexpr2Parser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprNumvalNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterAexprNumvalNode(Aexpr2Parser.AexprNumvalNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprNumvalNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitAexprNumvalNode(Aexpr2Parser.AexprNumvalNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AexprPiNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void enterAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AexprPiNode}
	 * labeled alternative in {@link Aexpr2Parser#numberval}.
	 * @param ctx the parse tree
	 */
	void exitAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx);
}