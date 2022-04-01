public class ASTCaseBlockNode extends ASTNode{
    ASTNode dclAssignCommand;
    String optbreak;

    public ASTCaseBlockNode(ASTNode dclAssignCommand, String optbreak) {
        this.dclAssignCommand = dclAssignCommand;
        this.optbreak = optbreak;
    }

    public ASTCaseBlockNode(ASTNode dclAssignCommand) {
        this.dclAssignCommand = dclAssignCommand;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
