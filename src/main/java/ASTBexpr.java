public abstract class ASTBexpr extends ASTNode{

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
