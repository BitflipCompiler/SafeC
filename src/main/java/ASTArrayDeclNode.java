public class ASTArrayDeclNode extends ASTNode{
    ASTNode arrdcltype;
    String id;

    public ASTArrayDeclNode(ASTNode arrdcltype, String id) {
        this.arrdcltype = arrdcltype;
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
