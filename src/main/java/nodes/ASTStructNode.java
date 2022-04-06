package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTStructNode extends ASTNode {
    public String id;
    public ASTNode structBlock;

    public ASTStructNode(String id, ASTNode structBlock) {
        this.id = id;
        this.structBlock = structBlock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
