package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ArrayDeclNode extends Node {
    public Node arrdcltype;
    public String id;

    public ArrayDeclNode(Node arrdcltype, String id) {
        this.arrdcltype = arrdcltype;
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
