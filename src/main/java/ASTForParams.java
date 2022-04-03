public class ASTForParams extends ASTNode{
    ASTNode numdclassign;
    ASTNode bexpr;
    String id;
    ASTNode aexpr;

    public ASTForParams(ASTNode numdclassign, ASTNode bexpr, String id, ASTNode aexpr) {
        this.numdclassign = numdclassign;
        this.bexpr = bexpr;
        this.id = id;
        this.aexpr = aexpr;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
