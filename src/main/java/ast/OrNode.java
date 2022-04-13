package ast;

import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class OrNode extends Bexpr {
    public Bexpr leftChild;
    public Bexpr rightChild;

    public OrNode(Node leftChild, Node rightChild) {
        this.leftChild = (Bexpr) leftChild;
        this.rightChild = (Bexpr) rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
