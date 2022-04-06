package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ASTProgNode extends ASTNode {
    public List<ASTNode> nodes = new ArrayList<>();

    public ASTProgNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
