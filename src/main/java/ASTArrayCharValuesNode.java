import java.util.ArrayList;
import java.util.List;

public class ASTArrayCharValuesNode extends ASTArrayData{
    List<ASTNode> charvalues = new ArrayList<>();

    public ASTArrayCharValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
