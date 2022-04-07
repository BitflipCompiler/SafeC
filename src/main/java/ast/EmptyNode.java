package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class EmptyNode extends Node {

    public EmptyNode() {
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
