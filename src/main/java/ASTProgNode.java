import java.util.ArrayList;
import java.util.List;

public class ASTProgNode extends ASTNode{
    List<ASTNode> nodes = new ArrayList<>();

    public ASTProgNode() {
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
