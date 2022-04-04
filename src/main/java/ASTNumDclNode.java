public class ASTNumDclNode extends ASTNode{

    String id;

    public ASTNumDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
