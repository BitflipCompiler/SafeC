package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class IdNode extends Node {
    public String id;
    public boolean isGlobal;

    public IdNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return id;
    }
}
