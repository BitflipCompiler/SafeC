import java.util.ArrayList;
import java.util.List;

public class ASTFormalParamsNode extends ASTNode{
    List<ASTNode> vdcls = new ArrayList<>();

    public ASTFormalParamsNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
