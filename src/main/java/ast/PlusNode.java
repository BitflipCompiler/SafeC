package ast;

import ast.abstracts.Expr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class PlusNode extends Expr {
    public Node leftChild;
    public Node rightChild;

    public PlusNode(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
