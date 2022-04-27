package ast;

import ast.abstracts.Aexpr;
import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class RelopGeqNode extends Bexpr {
    public Node leftChild;
    public Node rightChild;

    public RelopGeqNode(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
