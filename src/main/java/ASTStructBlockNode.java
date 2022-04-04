import java.util.ArrayList;
import java.util.List;

public class ASTStructBlockNode extends ASTNode{
    List<ASTNode> safeDclNodes = new ArrayList<>();

    public ASTStructBlockNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
