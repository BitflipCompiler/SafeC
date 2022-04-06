package nodes;

import nodes.abstracts.ASTNode;
import nodes.abstracts.ASTSelective;
import visitor.ASTVisitor;

public class ASTWhileLoop extends ASTSelective {
    public ASTNode bexpr;
    public ASTNode block;

    public ASTWhileLoop(ASTNode bexpr, ASTNode block) {
        this.bexpr = bexpr;
        this.block = block;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
