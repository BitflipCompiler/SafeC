public class ASTArrayNumNode extends ASTNode{
    String id;
    ASTNode numArray;

    public ASTArrayNumNode(String id, ASTNode numArray) {
        this.id = id;
        this.numArray = numArray;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
