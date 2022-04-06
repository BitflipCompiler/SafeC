package nodes;

import nodes.abstracts.ASTArray;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTArrayNumNode extends ASTArray {
    public String id;
    public ASTNode numArray;

    public ASTArrayNumNode(String id, ASTNode numArray) {
        this.id = id;
        this.numArray = numArray;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
