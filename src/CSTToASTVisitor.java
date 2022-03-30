public class CSTToASTVisitor extends Aexpr2BaseVisitor<ASTNode>{


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
