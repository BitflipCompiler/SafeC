public abstract class ASTVisitor {

    public void visit(ASTNode ctx){
        ctx.accept(this);
    }

    public abstract void visit(ASTDivisionNode ctx);

    public abstract void visit(ASTIdNode ctx);

    public abstract void visit(ASTMinusNode ctx);

    public abstract void visit(ASTModNode ctx);

    public abstract void visit(ASTNumbervalNode ctx);

    public abstract void visit(ASTNumvalNode ctx);

    public abstract void visit(ASTPiNode ctx);

    public abstract void visit(ASTPlusNode ctx);

    public abstract void visit(ASTTimesNode ctx);
}
