public abstract class ASTDatatype extends ASTNode{

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
