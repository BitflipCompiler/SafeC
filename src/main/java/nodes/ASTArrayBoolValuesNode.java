package nodes;

import nodes.abstracts.ASTArrayData;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ASTArrayBoolValuesNode extends ASTArrayData {
    public List<ASTNode> boolValues = new ArrayList<>();

    public ASTArrayBoolValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
