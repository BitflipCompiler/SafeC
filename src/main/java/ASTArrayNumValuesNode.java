import java.util.ArrayList;
import java.util.List;

public class ASTArrayNumValuesNode extends ASTNode{
    List<ASTNode> numValues = new ArrayList<>();

    public ASTArrayNumValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
