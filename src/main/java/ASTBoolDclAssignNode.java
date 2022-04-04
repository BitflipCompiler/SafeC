public class ASTBoolDclAssignNode extends ASTNode{
    ASTNode boolDcl;
    ASTNode bexpr;

    public ASTBoolDclAssignNode(ASTNode boolDcl, ASTNode bexpr) {
        this.boolDcl = boolDcl;
        this.bexpr = bexpr;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
