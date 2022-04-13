package ast;

import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class AndNode extends Bexpr {
    public Bexpr leftChild;
    public Bexpr rightChild;

    public AndNode(Node leftChild, Node rightChild) {
        this.leftChild = (Bexpr) leftChild;
        this.rightChild = (Bexpr) rightChild;
    }
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
