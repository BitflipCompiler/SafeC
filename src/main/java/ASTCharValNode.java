public class ASTCharValNode extends ASTVals{
    String value;

    public ASTCharValNode(String value) {
        this.value = value;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
