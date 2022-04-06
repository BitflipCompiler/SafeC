package nodes;

import nodes.abstracts.ASTNode;
import nodes.abstracts.ASTSelective;
import visitor.ASTVisitor;

public class ASTIfStatementNode extends ASTSelective {
    public ASTNode iflogic;
    public ASTNode ifThenBlock;
    public ASTNode elseBlock;

    public ASTIfStatementNode(ASTNode iflogic, ASTNode ifThenBlock, ASTNode elseBlock) {
        this.iflogic = iflogic;
        this.ifThenBlock = ifThenBlock;
        this.elseBlock = elseBlock;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
