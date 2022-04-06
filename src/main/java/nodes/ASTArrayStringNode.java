package nodes;

import nodes.abstracts.ASTArray;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTArrayStringNode extends ASTArray {
    public String id;
    public ASTNode stringArray;

    public ASTArrayStringNode(String id, ASTNode stringArray) {
        this.id = id;
        this.stringArray = stringArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
