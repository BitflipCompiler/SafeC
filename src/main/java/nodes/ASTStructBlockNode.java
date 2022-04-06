package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ASTStructBlockNode extends ASTNode {
    public List<ASTNode> safeDclNodes = new ArrayList<>();

    public ASTStructBlockNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
