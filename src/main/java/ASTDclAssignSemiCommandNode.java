public class ASTDclAssignSemiCommandNode extends ASTNode{
    ASTDclAssignSemi astDclAssignSemi;
    ASTCommandNode astCommandNode;

    public ASTDclAssignSemiCommandNode(ASTDclAssignSemi astDclAssignSemi, ASTCommandNode astCommandNode) {
        this.astDclAssignSemi = astDclAssignSemi;
        this.astCommandNode = astCommandNode;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
