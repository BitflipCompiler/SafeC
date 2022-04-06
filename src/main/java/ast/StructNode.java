package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class StructNode extends Node {
    public String id;
    public Node structBlock;

    public StructNode(String id, Node structBlock) {
        this.id = id;
        this.structBlock = structBlock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
