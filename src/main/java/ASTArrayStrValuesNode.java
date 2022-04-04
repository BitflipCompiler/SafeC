import java.util.ArrayList;
import java.util.List;

public class ASTArrayStrValuesNode extends ASTNode{
    List<ASTNode> strValues = new ArrayList<>();

    public ASTArrayStrValuesNode() {
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
