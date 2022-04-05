public abstract class ASTVisitor {

    public void visit(ASTNode ctx){
        ctx.accept(this);
    }

    public abstract void visit(ASTNotNode ctx);

    public abstract void visit(ASTAndNode ctx);

    public abstract void visit(ASTRelopEqualNode ctx);

    public abstract void visit(ASTRelopNotEqualNode ctx);

    public abstract void visit(ASTRelopLeqNode ctx);

    public abstract void visit(ASTRelopGeqNode ctx);

    public abstract void visit(ASTRelopLessNode ctx);

    public abstract void visit(ASTRelopGreaterNode ctx);

    public abstract void visit(ASTIdBoolValNode ctx);

    public abstract void visit(ASTBoolValNode ctx);

    public abstract void visit(ASTDivisionNode ctx);

    public abstract void visit(ASTIdNode ctx);

    public abstract void visit(ASTMinusNode ctx);

    public abstract void visit(ASTModNode ctx);

    public abstract void visit(ASTNumbervalNode ctx);

    public abstract void visit(ASTNumvalNode ctx);

    public abstract void visit(ASTPiNode ctx);

    public abstract void visit(ASTPlusNode ctx);

    public abstract void visit(ASTTimesNode ctx);

    public abstract void visit(ASTActualParamsNode ctx);

    public abstract void visit(ASTArrayBoolNode ctx);

    public abstract void visit(ASTArrayBoolValuesNode ctx);


}
