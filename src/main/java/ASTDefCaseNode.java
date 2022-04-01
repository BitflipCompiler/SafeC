public class ASTDefCaseNode extends ASTNode{
    ASTNode caseblock;


    public ASTDefCaseNode(ASTNode caseblock) {
        this.caseblock = caseblock;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
