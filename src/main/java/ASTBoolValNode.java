public class ASTBoolValNode extends ASTBexpr{
    String value;

    public ASTBoolValNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
