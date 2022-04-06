package nodes;

import nodes.abstracts.ASTArrayData;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ASTArrayCharValuesNode extends ASTArrayData {
    public List<ASTNode> charvalues = new ArrayList<>();

    public ASTArrayCharValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
