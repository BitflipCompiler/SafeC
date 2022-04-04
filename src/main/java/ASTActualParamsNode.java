import java.util.ArrayList;
import java.util.List;

public class ASTActualParamsNode extends ASTNode{
    List<ASTNode> vals = new ArrayList<>();

    public ASTActualParamsNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
