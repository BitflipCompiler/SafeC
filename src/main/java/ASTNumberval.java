public abstract class ASTNumberval extends ASTAexpr{
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
