public class ASTStringNode extends ASTNode{
    String id;
    ASTStringValNode stringval;

    public ASTStringNode(String id, ASTStringValNode stringval) {
        this.id = id;
        this.stringval = stringval;
    }

    public ASTStringNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
