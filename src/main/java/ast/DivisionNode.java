package ast;

import ast.abstracts.expr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class DivisionNode extends expr {
    public Node leftChild;
    public Node rightChild;

    public DivisionNode(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
