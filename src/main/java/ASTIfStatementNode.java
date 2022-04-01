public class ASTIfStatementNode extends ASTNode {
    ASTNode iflogic;
    ASTNode ifThenBlock;
    ASTNode elseBlock;

    public ASTIfStatementNode(ASTNode iflogic, ASTNode ifThenBlock, ASTNode elseBlock) {
        this.iflogic = iflogic;
        this.ifThenBlock = ifThenBlock;
        this.elseBlock = elseBlock;
    }


    @Override
    public void accept(ASTVisitor v) {

    }
}
