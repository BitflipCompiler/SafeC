import java.util.ArrayList;
import java.util.List;

public class ASTArrayBoolValuesNode extends ASTArrayData{
    List<ASTNode> boolValues = new ArrayList<>();

    public ASTArrayBoolValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
