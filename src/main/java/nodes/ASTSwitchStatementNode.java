package nodes;

import nodes.abstracts.ASTNode;
import nodes.abstracts.ASTSelective;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ASTSwitchStatementNode extends ASTSelective {
    public String id;
    public List<ASTNode> scases = new ArrayList<>();
    public ASTNode defcase;

    public ASTSwitchStatementNode(String id,List<ASTNode> scases, ASTNode defcase) {
        this.id = id;
        this.scases = scases;
        this.defcase = defcase;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
