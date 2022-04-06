package nodes;

import nodes.abstracts.ASTArray;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTArrayBoolNode extends ASTArray {
    public String id;
    public ASTNode boolArray;

    public ASTArrayBoolNode(String id, ASTNode boolArray) {
        this.id = id;
        this.boolArray = boolArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
