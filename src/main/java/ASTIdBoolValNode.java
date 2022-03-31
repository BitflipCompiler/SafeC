import org.antlr.v4.runtime.tree.TerminalNode;

public class ASTIdBoolValNode extends ASTBexpr{
    String id;
    String boolVal;

    public ASTIdBoolValNode(String id, String boolVal) {
        this.id = id;
        this.boolVal = boolVal;
    }

}
