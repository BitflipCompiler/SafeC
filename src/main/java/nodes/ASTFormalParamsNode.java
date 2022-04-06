package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class ASTFormalParamsNode extends ASTNode {
    public List<ASTNode> vdcls = new ArrayList<>();

    public ASTFormalParamsNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
