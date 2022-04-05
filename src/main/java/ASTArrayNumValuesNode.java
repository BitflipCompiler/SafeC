import java.util.ArrayList;
import java.util.List;

public class ASTArrayNumValuesNode extends ASTArrayData{
    List<ASTNode> numValues = new ArrayList<>();

    public ASTArrayNumValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
