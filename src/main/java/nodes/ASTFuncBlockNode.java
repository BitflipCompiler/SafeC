package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTFuncBlockNode extends ASTNode {
    public ASTNode dclAssignSemiCommand;
    public ASTNode returnValue;

    public ASTFuncBlockNode(ASTNode dclAssignSemiCommand, ASTNode returnValue) {
        this.dclAssignSemiCommand = dclAssignSemiCommand;
        this.returnValue = returnValue;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
