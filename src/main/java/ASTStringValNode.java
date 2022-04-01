public class ASTStringValNode extends ASTNode{
    String value;

    public ASTStringValNode(String value) {
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
