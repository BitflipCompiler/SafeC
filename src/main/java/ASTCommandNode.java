import java.util.ArrayList;
import java.util.List;

public class ASTCommandNode extends ASTNode{
    List<ASTNode> nodes = new ArrayList<>();

    public ASTCommandNode(){}

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
