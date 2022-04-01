public class ASTCharNode extends ASTNode{
    String id;
    ASTCharValNode charval;

    public ASTCharNode(String id, ASTCharValNode charval) {
        this.id = id;
        this.charval = charval;
    }

    public ASTCharNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
