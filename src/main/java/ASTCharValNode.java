public class ASTCharValNode extends ASTNode{
    String value;

    public ASTCharValNode(String value) {
        this.value = value;
    }


    @Override
    public void accept(ASTVisitor v) {

    }
}
