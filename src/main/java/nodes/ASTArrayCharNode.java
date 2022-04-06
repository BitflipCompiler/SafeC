package nodes;

import nodes.abstracts.ASTArray;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTArrayCharNode extends ASTArray {
    public String id;
    public ASTNode charArray;

    public ASTArrayCharNode(String id, ASTNode charArray) {
        this.id = id;
        this.charArray = charArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
