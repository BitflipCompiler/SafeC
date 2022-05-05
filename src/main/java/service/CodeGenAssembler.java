package service;

import ast.*;
import ast.abstracts.Aexpr;
import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import ast.abstracts.Numberval;
import org.apache.commons.lang3.RandomStringUtils;
import visitor.ASTVisitor;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Random;

/** This {@code CodeGenAssembler} is responsible for the Assembly code gen.
 * The code exstends {@link ASTVisitor}, as it uses the visitor pattern to gen the
 * assembly code.
 */


//TODO: .global _start og _start: og _end
public class CodeGenAssembler extends ASTVisitor {
    public StringBuilder codeGen = new StringBuilder();
    //public StringBuilder declarationLabels = new StringBuilder();
    public StringBuilder variableData = new StringBuilder();
    public boolean isAexpr;
    public boolean isAtype;

    public void setup(){
        codeGen.append("""
                .global _start
                _start:
                """);
        variableData.append(".data \n");
    }

    public void finalizeCode(){
        codeGen.append(".end \n");
    }

    public void printFinalCode(){
        System.out.println(codeGen);
        //System.out.println(declarationLabels);
        System.out.println(variableData);
    }

    @Override
    public void visit(NotNode ctx) {
        isAexpr = false;
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        visit(ctx.value);
        codeGen.append("""
                pop {r1}
                cmp r1, #0
                """);
        codeGen.append("beq " + generatedLabel + "_neg \n");
        codeGen.append("""
                mov r1, #0
                push {r1}
                """);
        codeGen.append("b " + generatedLabel + "_neg_end \n");
        codeGen.append(generatedLabel + "_neg: \n");
        codeGen.append("""
                mov r1, #1
                push {r1}
                """);
        codeGen.append(generatedLabel + "_neg_end: \n");
    }

    @Override
    public void visit(AndNode ctx) {
        isAexpr = false;
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                pop {r1}
                pop {r2}
                and r3, r2, r1
                push {r3}""");
    }

    @Override
    public void visit(RelopEqualNode ctx) {
        isAexpr = false;
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vcmp.f64 d2, d1
                vmrs APSR_nzcv, FPSCR
                """);
        codeGen.append("beq " + generatedLabel + "_eq\n");
        codeGen.append("""
                mov r0, #0
                push {r0}
                """);
        codeGen.append("b " + generatedLabel + "_eq_end\n");
        codeGen.append(generatedLabel + "_eq: \n");
        codeGen.append("""
                mov r0, #1
                push {r0}
                """);
        codeGen.append(generatedLabel + "_eq_end:\n");
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        isAexpr = false;
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vcmp.f64 d2, d1
                vmrs APSR_nzcv, FPSCR
                """);
        codeGen.append("bne " + generatedLabel + "_neq\n");
        codeGen.append("""
                mov r0, #0
                push {r0}
                """);
        codeGen.append("b " + generatedLabel + "_neq_end\n");
        codeGen.append(generatedLabel + "_neq: \n");
        codeGen.append("""
                mov r0, #1
                push {r0}
                """);
        codeGen.append(generatedLabel + "_neq_end:\n");
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        isAexpr = false;
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vcmp.f64 d2, d1
                vmrs APSR_nzcv, FPSCR
                """);
        codeGen.append("ble " + generatedLabel + "_leq\n");
        codeGen.append("""
                mov r0, #0
                push {r0}
                """);
        codeGen.append("b " + generatedLabel + "_leq_end\n");
        codeGen.append(generatedLabel + "_leq: \n");
        codeGen.append("""
                mov r0, #1
                push {r0}
                """);
        codeGen.append(generatedLabel + "_leq_end:\n");
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        isAexpr = false;
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vcmp.f64 d2, d1
                vmrs APSR_nzcv, FPSCR
                """);
        codeGen.append("bge " + generatedLabel + "_geq\n");
        codeGen.append("""
                mov r0, #0
                push {r0}
                """);
        codeGen.append("b " + generatedLabel + "_geq_end\n");
        codeGen.append(generatedLabel + "_geq: \n");
        codeGen.append("""
                mov r0, #1
                push {r0}
                """);
        codeGen.append(generatedLabel + "_geq_end:\n");
    }

    @Override
    public void visit(RelopLessNode ctx) {
        isAexpr = false;
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vcmp.f64 d2, d1
                vmrs APSR_nzcv, FPSCR
                """);
        codeGen.append("blt " + generatedLabel + "_blt\n");
        codeGen.append("""
                mov r0, #0
                push {r0}
                """);
        codeGen.append("b " + generatedLabel + "_blt_end\n");
        codeGen.append(generatedLabel + "_blt: \n");
        codeGen.append("""
                mov r0, #1
                push {r0}
                """);
        codeGen.append(generatedLabel + "_blt_end:\n");
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        isAexpr = false;
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vcmp.f64 d2, d1
                vmrs APSR_nzcv, FPSCR
                """);
        codeGen.append("bgt " + generatedLabel + "_bgt\n");
        codeGen.append("""
                mov r0, #0
                push {r0}
                """);
        codeGen.append("b " + generatedLabel + "_bgt_end\n");
        codeGen.append(generatedLabel + "_bgt: \n");
        codeGen.append("""
                mov r0, #1
                push {r0}
                """);
        codeGen.append(generatedLabel + "_bgt_end:\n");
    }

    @Override
    public void visit(IdBoolValNode ctx) {
        isAexpr = false;
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        visit(ctx.id);
        visit(ctx.boolVal);
        codeGen.append("""
                pop {r1}
                pop {r2}
                cmp r2, r1
                """);
        codeGen.append("beq " + generatedLabel + "_id_bool_eq\n");
        codeGen.append("""
                mov r0, #0
                push {r0}
                """);
        codeGen.append("b " + generatedLabel + "_id_bool_eq_end\n");
        codeGen.append(generatedLabel + "_id_bool_eq: \n");
        codeGen.append("""
                mov r0, #1
                push {r0}
                """);
        codeGen.append(generatedLabel + "_id_bool_eq_end:\n");

    }

    @Override
    public void visit(BoolValNode ctx) {
        String boolVal = ctx.value;
        if(boolVal.equals("true")){
            boolVal = "1";
        } else if (boolVal.equals("false")){
            boolVal = "0";
        } else {
            throw new RuntimeException("Boolean value not valid.");
        }
        codeGen.append("mov r0, #" + boolVal);
        codeGen.append("push {r0}");
    }

    @Override
    public void visit(DivisionNode ctx) {
        isAexpr = true;
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
        if(isAexpr){
            codeGen.append("ldr r0, =" + ctx.id + "\n");
            codeGen.append("mov r1, r0 \n");
            if(isAtype){
                codeGen.append("""
                vldr d0, [r0]
                vpush {d0}
                """);
            }
        } else {
            codeGen.append("mov r0, =" +ctx.id + "\n");
        }

    }

    @Override
    public void visit(MinusNode ctx) {
        isAexpr = true;
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
        isAexpr = true;
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        codeGen.append("""
                vpop {d1}
                vpop {d2}
                vdiv.f64 d3, d2, d1
                vcvt.s32.f64 s13, d3
                vcvt.f64.s32 d4, s13
                vsub.f64 d4, d3, d4
                vmul.f64 d4, d4, d1
                vpush {d4}
                """);
    }


    @Override
    public void visit(NumvalNode ctx) {
        String generatedLabel = RandomStringUtils.randomAlphabetic(10);
        codeGen.append("ldr r0, =" + generatedLabel + "\n");
        codeGen.append("""
                 vldr d0, [r0]
                 vpush {d0}
                  """);
        //declarationLabels.append(generatedLabel + "_address: \t .word " + generatedLabel + "\n");
        variableData.append(generatedLabel + ": \t .double \t 0e" + Float.parseFloat(ctx.value) + "\n");
    }

    @Override
    public void visit(PiNode ctx) {
        codeGen.append("ldr r0, PI_address \n");
        codeGen.append("""
                  vldr s14, [r0]
                  vcvt.f64.f32 d0, s14
                  vpush {d0}
                """);
        //declarationLabels.append("PI_address: \t .word PI \n");
        variableData.append("PI: \t .float 3.141592 \n");
    }

    @Override
    public void visit(PlusNode ctx) {
        isAexpr = true;
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
        isAexpr = true;
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
        isAtype = true;
        visit(ctx.atypes);
        isAtype = false;
        if(ctx.atypes instanceof Aexpr){
            isAexpr = true;
            codeGen.append("vpop {d1} \n");
            visit(ctx.id);
            codeGen.append("""
                vstr d1, [r1]
                """);
        } else if( ctx.atypes instanceof Bexpr){
            isAexpr = false;

        }

    }


    @Override
    public void visit(BoolDclAssignNode ctx) {
        visit(ctx.bexpr);
        codeGen.append("vpop {d0}");
        visit(ctx.boolDcl);
        codeGen.append("""
                vstr d0, [r0]
                """);
    }

    @Override
    public void visit(BoolDclNode ctx) {
        variableData.append(ctx.id + ": .space 8 \n");
    }

    @Override
    public void visit(BoolLitteralNode ctx) {

    }

    @Override
    public void visit(CaseBlockNode ctx) {

    }

    @Override
    public void visit(CharDclAssignNode ctx) {
        visit(ctx.charval);
        codeGen.append("vpop {d0}");
        visit(ctx.charDcl);
        codeGen.append("""
                vstr d0, [r0]
                """);
    }

    @Override
    public void visit(CharDclNode ctx) {
        variableData.append(ctx.id + ": .space 8 \n");
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
        visit(ctx.aexpr);
        codeGen.append("vpop {d0}");
        visit(ctx.numdecl);
        codeGen.append("""
                vstr d0, [r0]
                """);

    }

    @Override
    public void visit(NumDclNode ctx) {
        variableData.append(ctx.id + ": .space 8 \n");
    }

    @Override
    public void visit(OrNode ctx) {
        codeGen.append("""
                pop {r1}
                pop {r2}
                orr r3, r2, r1
                push {r3}""");
    }

    @Override
    public void visit(ProgNode ctx) {
        for (Node node: ctx.nodes) {
            visit(node);
        }
    }

    @Override
    public void visit(SafeDclNode ctx) {
        visit(ctx.variable);
    }

    @Override
    public void visit(ScaseNode ctx) {

    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        visit(ctx.stringval);
        codeGen.append("vpop {d0}");
        visit(ctx.stringdcl);
        codeGen.append("""
                vstr d0, [r0]
                """);
    }

    @Override
    public void visit(StringDclNode ctx) {
        variableData.append(ctx.id + ": .space 8 \n");
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
