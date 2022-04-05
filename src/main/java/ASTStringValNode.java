public class ASTStringValNode extends ASTVals{
    String value;

    public ASTStringValNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
