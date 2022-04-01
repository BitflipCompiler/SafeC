public class ASTFuncBlockNode extends ASTNode{
    ASTNode dclAssignSemiCommand;
    ASTNode returnValue;

    public ASTFuncBlockNode(ASTNode dclAssignSemiCommand, ASTNode returnValue) {
        this.dclAssignSemiCommand = dclAssignSemiCommand;
        this.returnValue = returnValue;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
