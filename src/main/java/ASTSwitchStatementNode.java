import java.util.ArrayList;
import java.util.List;

public class ASTSwitchStatementNode extends ASTSelective{
    String id;
    List<ASTNode> scases = new ArrayList<>();
    ASTNode defcase;

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
