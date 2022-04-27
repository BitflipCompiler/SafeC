package ast;

import ast.abstracts.Aexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class IdNode extends Node {
    public String id;

    public IdNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "IdNode{" +
                "id='" + id + '\'' +
                '}';
    }
}
