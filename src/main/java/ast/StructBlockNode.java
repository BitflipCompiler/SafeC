package ast;

import ast.abstracts.Node;
import ast.abstracts.StructBlock;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class StructBlockNode extends StructBlock {
    public List<Node> safeDclNodes = new ArrayList<>();

    public StructBlockNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
