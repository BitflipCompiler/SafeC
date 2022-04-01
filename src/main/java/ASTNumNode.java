public class ASTNumNode extends ASTNode{
    String id;
    ASTNode aexpr;

    public ASTNumNode(String id, ASTNode aexpr) {
        this.id = id;
        this.aexpr = aexpr;
    }

    public ASTNumNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
