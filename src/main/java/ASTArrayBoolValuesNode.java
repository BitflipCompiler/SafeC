import java.util.ArrayList;
import java.util.List;

public class ASTArrayBoolValuesNode extends ASTNode{
    List<ASTNode> boolValues = new ArrayList<>();

    public ASTArrayBoolValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
