package nodes;

import nodes.abstracts.ASTArrayData;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class ASTArrayStrValuesNode extends ASTArrayData {
    public List<ASTNode> strValues = new ArrayList<>();

    public ASTArrayStrValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
