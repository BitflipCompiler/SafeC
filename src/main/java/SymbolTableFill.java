public class SymbolTableFill extends ASTVisitor{

    SymbolTable symbolTable;

    public SymbolTableFill(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    @Override
    public void visit(ASTNotNode ctx) {
        visit(ctx.value);

    }

    @Override
    public void visit(ASTAndNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);

    }

    @Override
    public void visit(ASTRelopEqualNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopNotEqualNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopLeqNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopGeqNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopLessNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopGreaterNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTIdBoolValNode ctx) {
        symbolTable.openScope();
        symbolTable.enterSymbol(new Attributes(ctx.id));
    }

    @Override
    public void visit(ASTBoolValNode ctx) {

    }

    @Override
    public void visit(ASTDivisionNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTIdNode ctx) {
        symbolTable.openScope();
        symbolTable.enterSymbol(new Attributes(ctx.id));
    }

    @Override
    public void visit(ASTMinusNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTModNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTNumbervalNode ctx) {

    }

    @Override
    public void visit(ASTNumvalNode ctx) {

    }

    @Override
    public void visit(ASTPiNode ctx) {

    }

    @Override
    public void visit(ASTPlusNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTTimesNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }
}
