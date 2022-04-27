package ast;

import ast.abstracts.Node;
import ast.abstracts.Vals;
import visitor.ASTVisitor;

public class FuncBlockNode extends Node {
    public DclAssignSemiCommandNode dclAssignSemiCommand;
    public Node returnValue;

    public FuncBlockNode(Node dclAssignSemiCommand, Node returnValue) {
        this.dclAssignSemiCommand = (DclAssignSemiCommandNode) dclAssignSemiCommand;
        this.returnValue = returnValue;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    public Node getReturnValue() {
        return returnValue;
    }

    @Override
    public String toString() {
        return "FuncBlockNode{" +
                "dclAssignSemiCommand=" + dclAssignSemiCommand.getClass().getSimpleName() +
                ", returnValue=" + returnValue.getClass().getSimpleName() +
                '}';
    }
}
