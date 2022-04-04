public class ASTNotNode extends ASTBexpr{
    ASTNode value;

    public ASTNotNode(ASTNode value) {
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
