public class ASTFuncCalls extends ASTNode{
    String id;
    ASTNode callparams;

    public ASTFuncCalls(String id) {
        this.id = id;
    }

    public ASTFuncCalls(String id, ASTNode callparams) {
        this.id = id;
        this.callparams = callparams;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
