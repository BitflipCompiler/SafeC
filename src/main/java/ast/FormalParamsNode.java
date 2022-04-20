package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class FormalParamsNode extends Node {
    public List<Node> vdcls = new ArrayList<>();

    public FormalParamsNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "FormalParamsNode{" +
                "vdcls=" + vdcls +
                '}';
    }
}
