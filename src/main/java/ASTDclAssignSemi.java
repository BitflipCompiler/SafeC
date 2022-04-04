import java.util.ArrayList;
import java.util.List;

public class ASTDclAssignSemi extends ASTNode{
    List<ASTNode> nodes = new ArrayList<>();

    public ASTDclAssignSemi(){

    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
