public class ASTArrayDecl extends ASTNode{
    ASTNode arrdcltype;
    String id;

    public ASTArrayDecl(ASTNode arrdcltype, String id) {
        this.arrdcltype = arrdcltype;
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
