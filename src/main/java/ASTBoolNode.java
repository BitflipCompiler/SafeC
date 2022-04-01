public class ASTBoolNode extends ASTNode{
    String id;
    ASTNode bexpr;

    public ASTBoolNode(String id, ASTNode bexpr) {
        this.id = id;
        this.bexpr = bexpr;
    }

    public ASTBoolNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
