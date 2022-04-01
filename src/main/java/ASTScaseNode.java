public class ASTScaseNode extends ASTNode{
    ASTNode vals;
    ASTNode caseblock;

    public ASTScaseNode(ASTNode vals, ASTNode caseblock) {
        this.vals = vals;
        this.caseblock = caseblock;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
