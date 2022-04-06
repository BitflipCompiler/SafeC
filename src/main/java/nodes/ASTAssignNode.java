package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTAssignNode extends ASTNode {
    public String id;
    public ASTNode atypes;

    public ASTAssignNode(String id, ASTNode atypes) {
        this.id = id;
        this.atypes = atypes;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
