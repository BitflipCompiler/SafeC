package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ForParams extends Node {
    public Node numdclassign;
    public Node bexpr;
    public String id;
    public Node aexpr;

    public ForParams(Node numdclassign, Node bexpr, String id, Node aexpr) {
        this.numdclassign = numdclassign;
        this.bexpr = bexpr;
        this.id = id;
        this.aexpr = aexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
