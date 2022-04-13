package ast;

import ast.abstracts.Callparems;
import ast.abstracts.Node;
import ast.abstracts.Vals;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class ActualParamsNode extends Node {
    public List<Vals> vals = new ArrayList<>();

    public ActualParamsNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
