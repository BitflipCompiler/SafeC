public abstract class ASTArrayData extends ASTNode{

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
