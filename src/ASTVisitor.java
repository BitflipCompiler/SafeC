public abstract class ASTVisitor {

    public void visit(ASTNode ctx){
        ctx.accept(this);
    }

    abstract void visit(ASTDivisionNode ctx);

    abstract void visit(ASTIdNode ctx);

    abstract void visit(ASTMinusNode ctx);

    abstract void visit(ASTModNode ctx);

    abstract void visit(ASTNumbervalNode ctx);

    abstract void visit(ASTNumvalNode ctx);

    abstract void visit(ASTPiNode ctx);

    abstract void visit(ASTPlusNode ctx);

    abstract void visit(ASTTimesNode ctx);
}
