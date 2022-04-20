package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class FuncBlockNode extends Node {
    public Node dclAssignSemiCommand;
    public Node returnValue;

    public FuncBlockNode(Node dclAssignSemiCommand, Node returnValue) {
        this.dclAssignSemiCommand = dclAssignSemiCommand;
        this.returnValue = returnValue;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "FuncBlockNode{" +
                "dclAssignSemiCommand=" + dclAssignSemiCommand +
                ", returnValue=" + returnValue +
                '}';
    }
}
