package ast;

import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class AndNode extends Bexpr {
    public Node leftChild;
    public Node rightChild;

    public AndNode(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
