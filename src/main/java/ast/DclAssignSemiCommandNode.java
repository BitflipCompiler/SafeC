package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class DclAssignSemiCommandNode extends Node {
    public Node actual;
    public Node recursion;

    public DclAssignSemiCommandNode(Node actual, Node recursion) {
        this.actual = actual;
        this.recursion = recursion;
    }

    public DclAssignSemiCommandNode(Node actual) {
        this.actual = actual;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
