package nodes;

import nodes.abstracts.ASTArrayData;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class ASTArrayNumValuesNode extends ASTArrayData {
    public List<ASTNode> numValues = new ArrayList<>();

    public ASTArrayNumValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
