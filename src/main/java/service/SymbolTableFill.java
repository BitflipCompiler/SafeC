package service;

import ast.*;
import ast.abstracts.*;
import visitor.ASTVisitor;

public class SymbolTableFill extends ASTVisitor {

    SymbolTable symbolTable;

    public SymbolTableFill(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    @Override
    public void visit(NotNode ctx) {
        visit(ctx.value);

    }

    @Override
    public void visit(AndNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);

    }

    @Override
    public void visit(RelopEqualNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLessNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(IdBoolValNode ctx) {
        symbolTable.openScope();
        symbolTable.enterSymbol(new Attributes(ctx.id));
    }

    @Override
    public void visit(BoolValNode ctx) {

    }

    @Override
    public void visit(DivisionNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(IdNode ctx) {
        symbolTable.openScope();
        symbolTable.enterSymbol(new Attributes(ctx.id));
    }

    @Override
    public void visit(MinusNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ModNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(Numberval ctx) {

    }

    @Override
    public void visit(NumvalNode ctx) {

    }

    @Override
    public void visit(PiNode ctx) {

    }

    @Override
    public void visit(PlusNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(TimesNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ActualParamsNode ctx) {

    }

    @Override
    public void visit(ArrayBoolNode ctx) {

    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {

    }

    @Override
    public void visit(ArrayCharNode ctx) {

    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {

    }

    @Override
    public void visit(ArrayDeclNode ctx) {

    }

    @Override
    public void visit(ArrayNumNode ctx) {

    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {

    }

    @Override
    public void visit(ArrayStringNode ctx) {

    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {

    }

    @Override
    public void visit(AssignNode ctx) {

    }

    @Override
    public void visit(Bexpr ctx) {

    }

    @Override
    public void visit(BoolDclAssignNode ctx) {

    }

    @Override
    public void visit(BoolDclNode ctx) {

    }

    @Override
    public void visit(BoolLitteralNode ctx) {

    }

    @Override
    public void visit(CaseBlockNode ctx) {

    }

    @Override
    public void visit(CharDclAssignNode ctx) {

    }

    @Override
    public void visit(CharDclNode ctx) {

    }

    @Override
    public void visit(CharValNode ctx) {

    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {

    }

    @Override
    public void visit(DefCaseNode ctx) {

    }

    @Override
    public void visit(ForLoop ctx) {

    }

    @Override
    public void visit(FormalParamsNode ctx) {

    }

    @Override
    public void visit(ForParams ctx) {

    }

    @Override
    public void visit(FuncBlockNode ctx) {

    }

    @Override
    public void visit(FuncCalls ctx) {

    }

    @Override
    public void visit(FuncDcl ctx) {

    }

    @Override
    public void visit(IfStatementNode ctx) {

    }

    @Override
    public void visit(NumberLitteralNode ctx) {

    }

    @Override
    public void visit(NumDclAssignNode ctx) {

    }

    @Override
    public void visit(NumDclNode ctx) {

    }

    @Override
    public void visit(OrNode ctx) {

    }

    @Override
    public void visit(ProgNode ctx) {

    }

    @Override
    public void visit(SafeDclNode ctx) {

    }

    @Override
    public void visit(ScaseNode ctx) {

    }

    @Override
    public void visit(StringDclAssignNode ctx) {

    }

    @Override
    public void visit(StringDclNode ctx) {

    }

    @Override
    public void visit(StringLitteralNode ctx) {

    }

    @Override
    public void visit(StringValNode ctx) {

    }

    @Override
    public void visit(StructBlockNode ctx) {

    }

    @Override
    public void visit(StructNode ctx) {

    }

    @Override
    public void visit(SwitchStatementNode ctx) {

    }

    @Override
    public void visit(VoidLitteralNode ctx) {

    }

    @Override
    public void visit(WhileLoop ctx) {

    }
}
