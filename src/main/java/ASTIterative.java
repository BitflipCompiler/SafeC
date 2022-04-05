public abstract class ASTIterative extends ASTNode{

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
