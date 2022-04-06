package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTArrayDeclNode extends ASTNode {
    public ASTNode arrdcltype;
    public String id;

    public ASTArrayDeclNode(ASTNode arrdcltype, String id) {
        this.arrdcltype = arrdcltype;
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
