package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class ASTActualParamsNode extends ASTNode {
    public List<ASTNode> vals = new ArrayList<>();

    public ASTActualParamsNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
