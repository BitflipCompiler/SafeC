package ast;

import ast.abstracts.Callparems;
import ast.abstracts.Node;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class ActualParamsNode extends Callparems {
    public List<Node> vals = new ArrayList<>();

    public ActualParamsNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
