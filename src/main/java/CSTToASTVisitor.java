public class CSTToASTVisitor extends Aexpr2BaseVisitor<ASTNode> {


    @Override
    public ASTNode visitProg(Aexpr2Parser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitDeclaration(Aexpr2Parser.DeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitStructdcl(Aexpr2Parser.StructdclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitStructblock(Aexpr2Parser.StructblockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitDclassignsemi(Aexpr2Parser.DclassignsemiContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitDclassignsemicommand(Aexpr2Parser.DclassignsemicommandContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitSafedeclaration(Aexpr2Parser.SafedeclarationContext ctx) {
        ASTNode rightChild;
        System.out.println(ctx.children.get(1).getChild(0).getChild(0).getChild(0));
        if(ctx.vdcl() != null){
            rightChild = visit(ctx.vdcl());
        } else if(ctx.vdclassign() != null) {
            rightChild = visit(ctx.vdclassign());
        }


        return visitChildren(ctx);
        //throw new RuntimeException("SafeDeclaration error");
    }

    @Override
    public ASTNode visitParams(Aexpr2Parser.ParamsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBlock(Aexpr2Parser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitCaseblock(Aexpr2Parser.CaseblockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitVdcl(Aexpr2Parser.VdclContext ctx) {
       return visitChildren(ctx);
    }

    @Override
    public ASTNode visitArraydecl(Aexpr2Parser.ArraydeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitArrdcltype(Aexpr2Parser.ArrdcltypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitVassign(Aexpr2Parser.VassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitVdclassign(Aexpr2Parser.VdclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitArraydclassign(Aexpr2Parser.ArraydclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitNumarraydclassign(Aexpr2Parser.NumarraydclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitChararraydclassign(Aexpr2Parser.ChararraydclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitStringarraydclassign(Aexpr2Parser.StringarraydclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBoolarraydclassign(Aexpr2Parser.BoolarraydclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitDatatype(Aexpr2Parser.DatatypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitAtypes(Aexpr2Parser.AtypesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitArrayassign(Aexpr2Parser.ArrayassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitArraydata(Aexpr2Parser.ArraydataContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitNumarray(Aexpr2Parser.NumarrayContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitChararray(Aexpr2Parser.ChararrayContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitStrarray(Aexpr2Parser.StrarrayContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBoolarray(Aexpr2Parser.BoolarrayContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitCommand(Aexpr2Parser.CommandContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitFunccalls(Aexpr2Parser.FunccallsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitFuncdcl(Aexpr2Parser.FuncdclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitFuncblock(Aexpr2Parser.FuncblockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitCallparams(Aexpr2Parser.CallparamsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitCtrlstruct(Aexpr2Parser.CtrlstructContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitIterative(Aexpr2Parser.IterativeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitSelective(Aexpr2Parser.SelectiveContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitIflogic(Aexpr2Parser.IflogicContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitForparams(Aexpr2Parser.ForparamsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitScase(Aexpr2Parser.ScaseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitDefcase(Aexpr2Parser.DefcaseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitNumdecl(Aexpr2Parser.NumdeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBooldecl(Aexpr2Parser.BooldeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitChardecl(Aexpr2Parser.ChardeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitStringdecl(Aexpr2Parser.StringdeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitNumdclassign(Aexpr2Parser.NumdclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitChardclassign(Aexpr2Parser.ChardclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitStringdclassign(Aexpr2Parser.StringdclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBooldclassign(Aexpr2Parser.BooldclassignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBexprRelop(Aexpr2Parser.BexprRelopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitNOTBexpr(Aexpr2Parser.NOTBexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBexprIDBoolval(Aexpr2Parser.BexprIDBoolvalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBexprBop(Aexpr2Parser.BexprBopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBexprParens(Aexpr2Parser.BexprParensContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBexprBoolval(Aexpr2Parser.BexprBoolvalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitBop(Aexpr2Parser.BopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitVals(Aexpr2Parser.ValsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitRelop(Aexpr2Parser.RelopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitAexprTimesDivNode(Aexpr2Parser.AexprTimesDivNodeContext ctx) {
        if(ctx.op.getType() == Aexpr2Parser.TIMES){
            return new ASTTimesNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.op.getType() == Aexpr2Parser.DIVISION){
            return new ASTDivisionNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else {
            return new ASTModNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        }
    }

    @Override
    public ASTNode visitAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx) {
        if(ctx.op.getType() == Aexpr2Parser.PLUS){
            return new ASTPlusNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else {
            return new ASTMinusNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        }
    }
   
    @Override 
    public ASTNode visitAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx) {
        return visit(ctx.aexpr());
    }
    
    @Override 
    public ASTNode visitAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx) {
        return new ASTIdNode(ctx.ID().getText());
    }
    
    @Override 
    public ASTNode visitAexprNumbervalNode(Aexpr2Parser.AexprNumbervalNodeContext ctx) {
        return visitChildren(ctx); 
    }

    @Override
    public ASTNode visitAexprNumvalNode(Aexpr2Parser.AexprNumvalNodeContext ctx) {
        return new ASTNumvalNode(ctx.NUMVAL().toString());
    }

    @Override
    public ASTNode visitAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx) {
        return new ASTPiNode();
    }
   
}
