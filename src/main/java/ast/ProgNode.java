package ast;

import ast.abstracts.Dcl;
import ast.abstracts.Node;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends Node {
    public List<Node> nodes = new ArrayList<>();

    public ProgNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
