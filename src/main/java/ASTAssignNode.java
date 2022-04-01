public class ASTAssignNode extends ASTNode{
    String id;
    ASTNode atypes;

    public ASTAssignNode(String id, ASTNode atypes) {
        this.id = id;
        this.atypes = atypes;
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
