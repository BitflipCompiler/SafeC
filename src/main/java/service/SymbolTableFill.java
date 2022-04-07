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
        symbolTable.enterSymbol(new Attributes(ctx.id, null));
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
        for (Node node: ctx.vals) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayBoolNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayBool));
    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {

    }

    @Override
    public void visit(ArrayCharNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayChar));
    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {

    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, null));
        visit(ctx.arrdcltype);
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayNum));
    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {

    }

    @Override
    public void visit(ArrayStringNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayStr));
    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {

    }

    @Override
    public void visit(AssignNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, null));
        visit(ctx.atypes);
    }

    @Override
    public void visit(Bexpr ctx) {

    }

    @Override
    public void visit(BoolDclAssignNode ctx) {
        visit(ctx.boolDcl);
        visit(ctx.bexpr);
    }

    @Override
    public void visit(BoolDclNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Boolean));
    }

    @Override
    public void visit(BoolLitteralNode ctx) {

    }

    @Override
    public void visit(CaseBlockNode ctx) {
        symbolTable.openScope();
        visit(ctx.dclAssignCommand);
        symbolTable.closeScope();
    }

    @Override
    public void visit(CharDclAssignNode ctx) {
        visit(ctx.charDcl);
        visit(ctx.charval);
    }

    @Override
    public void visit(CharDclNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Char));

    }

    @Override
    public void visit(CharValNode ctx) {

    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        visit(ctx.actual);
        visit(ctx.recursion);
    }

    @Override
    public void visit(DefCaseNode ctx) {
        visit(ctx.caseblock);
    }

    @Override
    public void visit(ForLoop ctx) {
        visit(ctx.forparams);
        visit(ctx.block);
    }

    @Override
    public void visit(FormalParamsNode ctx) {
        for (Node node: ctx.vdcls) {
            visit(node);
        }
    }

    @Override
    public void visit(ForParams ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Number));
        visit(ctx.numdclassign);
        visit(ctx.bexpr);
        visit(ctx.aexpr);
    }

    @Override
    public void visit(FuncBlockNode ctx) {
        symbolTable.openScope();
        visit(ctx.dclAssignSemiCommand);
        visit(ctx.returnValue);
        symbolTable.closeScope();
    }

    @Override
    public void visit(FuncCalls ctx) {
        //TODO: skal slå op i symbol table og tjekke om id på func findes
        if(ctx.callparams != null){
            visit(ctx.callparams);
        }
    }

    @Override
    public void visit(FuncDcl ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, null));
        visit(ctx.datatype);
        if(ctx.params != null){
            visit(ctx.params);
        }
        visit(ctx.funcblock);

    }

    @Override
    public void visit(IfStatementNode ctx) {
        visit(ctx.iflogic);
        if(ctx.ifThenBlock != null){
            visit(ctx.ifThenBlock);
        } else if (ctx.elseBlock != null){
            visit(ctx.elseBlock);
        }
    }

    @Override
    public void visit(NumberLitteralNode ctx) {

    }

    @Override
    public void visit(NumDclAssignNode ctx) {
        visit(ctx.numdecl);
        visit(ctx.aexpr);
    }

    @Override
    public void visit(NumDclNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Number));
    }

    @Override
    public void visit(OrNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ProgNode ctx) {
        symbolTable.openScope();
        for (Node node: ctx.nodes) {
            visit(node);
        }
        symbolTable.closeScope();
    }

    @Override
    public void visit(SafeDclNode ctx) {
        //TODO: safety skal måske gemmes i SymbolTable somehow?
        visit(ctx.variable);
    }

    @Override
    public void visit(ScaseNode ctx) {
        visit(ctx.vals);
        visit(ctx.caseblock);
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        visit(ctx.stringdcl);
        visit(ctx.stringval);
    }

    @Override
    public void visit(StringDclNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.String));
    }

    @Override
    public void visit(StringLitteralNode ctx) {

    }

    @Override
    public void visit(StringValNode ctx) {

    }

    @Override
    public void visit(StructBlockNode ctx) {
        symbolTable.openScope();
        for (Node node: ctx.safeDclNodes) {
            visit(node);
        }
        symbolTable.closeScope();
    }

    @Override
    public void visit(StructNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Struct));
        visit(ctx.structBlock);
    }

    @Override
    public void visit(SwitchStatementNode ctx) {
        //TODO: først slå op i symboltable om id eksisterer
        symbolTable.openScope();
        for (Node node: ctx.scases) {
            visit(node);
        }
        visit(ctx.defcase);
        symbolTable.closeScope();
    }

    @Override
    public void visit(VoidLitteralNode ctx) {

    }

    @Override
    public void visit(WhileLoop ctx) {
        visit(ctx.bexpr);
        visit(ctx.block);
    }
}
