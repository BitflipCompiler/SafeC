package service;

import ast.*;
import ast.abstracts.Bexpr;
import ast.abstracts.Numberval;
import org.apache.commons.lang3.RandomStringUtils;
import visitor.ASTVisitor;

import java.util.Random;

//TODO: .global _start og _start: og _end
public class CodeGenAssembler extends ASTVisitor {
    public StringBuilder codeGen = new StringBuilder();
    public StringBuilder declarationLabels = new StringBuilder();
    public StringBuilder variableData = new StringBuilder();

    public void setup(){
        codeGen.append("""
                .global _start
                _start:
                """);
        variableData.append(".data \n");
    }

    public void printFinalCode(){
        System.out.println(codeGen);
        System.out.println(declarationLabels);
        System.out.println(variableData);
    }

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
                vpop {d1}
                vpop {d2}
                vdiv.f64 d3, d2, d1
                vpush {d3}
                """);
    }

    @Override
    public void visit(IdNode ctx) {
        codeGen.append("ldr r0, " + ctx.id + "\n");
        codeGen.append("""
                vldr s14, [r0]
                vcvt.f64.f32 d0, s14
                vpush {d0}
                """);
    }

    @Override
    public void visit(MinusNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vsub.f64 d3, d2, d1
                vpush {d3}
                """);
    }

    @Override
    public void visit(ModNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        //TODO:something stinks...
        codeGen.append("""
                mov r4, #0
                vpop {d1}
                vpop {d2}
                modloop:
                cmp d2, d1
                vsubcs.f64 d2, d2, d1
                addcs r4, r4, #1
                bhi modloop
                vcvt.f32.f64 s14, d2
                push {d2}
                pop {
                """);
    }

    @Override
    public void visit(Numberval ctx) {

    }

    @Override
    public void visit(NumvalNode ctx) {
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        codeGen.append("ldr r0, " + generatedLabel + "_address \n");
        codeGen.append("""
                 vldr s14, [r0]
                 vcvt.f64.f32 d0, s14
                 vpush {d0}
                  """);
        declarationLabels.append(generatedLabel + "_address: \t .word " + generatedLabel + "\n");
        variableData.append(generatedLabel + ": \t .float " + Float.parseFloat(ctx.value) + "\n");
    }

    @Override
    public void visit(PiNode ctx) {
        codeGen.append("ldr r0, PI_address \n");
        codeGen.append("""
                  vldr s14, [r0]
                  vcvt.f64.f32 d0, s14
                  vpush {d0}
                """);
        declarationLabels.append("PI_address: \t .word PI \n");
        variableData.append("PI: \t .float 3.141592 \n");
    }

    @Override
    public void visit(PlusNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vadd.f64 d3, d2, d1
                vpush {d3}
                """);
    }

    @Override
    public void visit(TimesNode ctx) {
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vmul.f64 d3, d2, d1
                vpush {d3}
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
        //TODO: something stinks...
        variableData.append(ctx.id + ": .float ");
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
