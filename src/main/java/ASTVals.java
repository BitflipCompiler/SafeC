public abstract class ASTVals extends ASTNode{

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
