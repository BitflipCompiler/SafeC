package ast;

import ast.abstracts.Aexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class TimesNode extends Aexpr {
    public Node leftChild;
    public Node rightChild;

    public TimesNode(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
