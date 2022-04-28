package service;

import ast.*;
import ast.abstracts.Bexpr;
import ast.abstracts.Numberval;
import visitor.ASTVisitor;

//TODO: .global _start og _start: og _end
public class CodeGenAssembler extends ASTVisitor {
    public StringBuilder codeGen = new StringBuilder();

    @Override
    public void visit(NotNode ctx) {

    }

    @Override
    public void visit(AndNode ctx) {

    }

    @Override
    public void visit(RelopEqualNode ctx) {

    }

    @Override
    public void visit(RelopNotEqualNode ctx) {

    }

    @Override
    public void visit(RelopLeqNode ctx) {

    }

    @Override
    public void visit(RelopGeqNode ctx) {

    }

    @Override
    public void visit(RelopLessNode ctx) {

    }

    @Override
    public void visit(RelopGreaterNode ctx) {

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
        codeGen.append("""
                mov r4, #0
                pop {r1}
                pop {r2}
                divloop:
                cmp r2, r1
                subcs r2, r2, r1
                addcs r4, r4, #1
                bhi divloop
                push {r4}
                """);
    }

    @Override
    public void visit(IdNode ctx) {

    }

    @Override
    public void visit(MinusNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                pop {r1}
                pop {r2}
                sub r3, r2, r1
                push {r3}
                """);
    }

    @Override
    public void visit(ModNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                mov r4, #0
                pop {r1}
                pop {r2}
                modloop:
                cmp r2, r1
                subcs r2, r2, r1
                addcs r4, r4, #1
                bhi modloop
                push {r2}
                """);
    }

    @Override
    public void visit(Numberval ctx) {

    }

    @Override
    public void visit(NumvalNode ctx) {
        codeGen.append("mov r0, #" + ctx.value + "\n");
        codeGen.append("push {r0}\n");

    }

    @Override
    public void visit(PiNode ctx) {

    }

    @Override
    public void visit(PlusNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                pop {r1}
                pop {r2}
                add r3, r2, r1
                push {r3}
                """);
    }

    @Override
    public void visit(TimesNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                pop {r1}
                pop {r2}
                mul r3, r2, r1
                push {r3}
                """);

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
    public void visit(ForLoopNode ctx) {

    }

    @Override
    public void visit(FormalParamsNode ctx) {

    }

    @Override
    public void visit(ForParamsNode ctx) {

    }

    @Override
    public void visit(FuncBlockNode ctx) {

    }

    @Override
    public void visit(FuncCallsNode ctx) {

    }

    @Override
    public void visit(FuncDclNode ctx) {

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
    public void visit(StructDclNode ctx) {

    }

    @Override
    public void visit(SwitchStatementNode ctx) {

    }

    @Override
    public void visit(VoidLitteralNode ctx) {

    }

    @Override
    public void visit(WhileLoopNode ctx) {

    }
}
