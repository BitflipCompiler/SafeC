package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class AssignNode extends Node {
    public String id;
    public Node atypes;

    public AssignNode(String id, Node atypes) {
        this.id = id;
        this.atypes = atypes;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
