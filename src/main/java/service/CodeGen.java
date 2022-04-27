package service;

import ast.*;
import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import ast.abstracts.Numberval;
import visitor.ASTVisitor;
import java.util.ArrayList;

public class CodeGen extends ASTVisitor {

    public StringBuilder codeGen = new StringBuilder();
    public StringBuilder main = new StringBuilder();

    boolean hasBool = false;
    boolean isVoid;

    ArrayList<String> strArr = new ArrayList();

    public Type getDataType(String datatype) {
        if (datatype.startsWith("Num")){
            return Type.Number;
        } else if (datatype.startsWith("Void")){
            return Type.Void;
        } else if (datatype.startsWith("String")){
            return Type.String;
        } else if (datatype.startsWith("Bool")){
            return Type.Boolean;
        } else if (datatype.startsWith("Char")){
            return Type.Char;
        }
        throw new RuntimeException("Datatype not viable.");
    }

    public void addLibs(String lib){
        strArr.add(lib);
    }

    public ArrayList<String> getlibs() {
        return  strArr;
    }

    public void setupMain(StringBuilder main){
        main.insert(0,"void main(){\n");
        main.append("\n}");
    }

    @Override
    public void visit(NotNode ctx) {
        codeGen.append("!");
        visit(ctx.value);
    }

    @Override
    public void visit(AndNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" && ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopEqualNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" == ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" != ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" <= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" >= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLessNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" < ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" > ");
        visit(ctx.rightChild);

    }

    @Override
    public void visit(IdBoolValNode ctx) {
        codeGen.append(ctx.id);
        codeGen.append(" == ");
        codeGen.append(ctx.boolVal);
    }

    @Override
    public void visit(BoolValNode ctx) {
        codeGen.append(ctx.value);

    }

    @Override
    public void visit(DivisionNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" / ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(IdNode ctx) {
        codeGen.append(ctx.id);
    }

    @Override
    public void visit(MinusNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" - ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ModNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" % ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(Numberval ctx) {

    }

    @Override
    public void visit(NumvalNode ctx) {
        codeGen.append(ctx.value);
    }

    @Override
    public void visit(PiNode ctx) {
        codeGen.append("3.1415926535");

    }

    @Override
    public void visit(PlusNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" + ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(TimesNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" * ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ActualParamsNode ctx) {
        if(ctx.vals.size() == 1){
            main.append(ctx.vals.get(0));
        }else {
            main.append(ctx.vals.get(0));
            for (int i = 1; i < ctx.vals.size();i++) {
                main.append(", ");
                main.append(ctx.vals.get(i));
            }
        }
    }

    @Override
    public void visit(ArrayBoolNode ctx) {
        codeGen.append("[ ");
        codeGen.append("bool ");
        codeGen.append("] ");
        codeGen.append(ctx.id);
        codeGen.append(" = ");
        codeGen.append("[ ");
        visit(ctx.boolArray);
        codeGen.append(" ]");
    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {
        for (Node node : ctx.boolValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayCharNode ctx) {
        codeGen.append("[ ");
        codeGen.append("char ");
        codeGen.append("] ");
        codeGen.append(ctx.id);
        codeGen.append(" = ");
        codeGen.append("[ ");
        visit(ctx.charArray);
        codeGen.append(" ]");
    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {
        for (Node node : ctx.charvalues) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        codeGen.append("[ ");
        visit(ctx.arrdcltype);
        codeGen.append(" ] ");
        codeGen.append(ctx.id);
        //[number] x
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        codeGen.append("[ ");
        codeGen.append("number ");
        codeGen.append(" ]");
        codeGen.append(ctx.id);
        codeGen.append(" = ");
        codeGen.append("[ ");
        visit(ctx.numArray);
        codeGen.append(" ]");

    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {
        for (Node node : ctx.numValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayStringNode ctx) {
        codeGen.append("[ ");
        codeGen.append("string ");
        codeGen.append("] ");
        codeGen.append(ctx.id);
        codeGen.append(" = ");
        codeGen.append("[ ");
        visit(ctx.stringArray);
        codeGen.append(" ] ");
    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {
        for (Node node : ctx.strValues) {
            visit(node);
        }
    }

    @Override
    public void visit(AssignNode ctx) {
        codeGen.append(ctx.id);
        codeGen.append(" = ");
        visit(ctx.atypes);
        codeGen.append(";");
        //codeGen.appendln();
    }

    @Override
    public void visit(Bexpr ctx) {

    }

    @Override
    public void visit(BoolDclAssignNode ctx) {
            visit(ctx.boolDcl);
            codeGen.append(" = ");
            visit(ctx.bexpr);
    }

    @Override
    public void visit(BoolDclNode ctx) {
        if(hasBool == false){
            addLibs("#include <stdbool.h>");
            hasBool = true;
        }

        if(ctx.isGlobal == true){
            main.append("bool ");
            main.append(ctx.id).append(";").append("\n");

        }else {
            codeGen.append("bool ");
            codeGen.append(ctx.id);
        }
    }

    @Override
    public void visit(BoolLitteralNode ctx) {
        codeGen.append("bool ");
    }

    @Override
    public void visit(CaseBlockNode ctx) {
        visit(ctx.dclAssignCommand);
        if(ctx.optbreak != null){
            codeGen.append(ctx.optbreak);
        }
        codeGen.append("\n");
    }

    @Override
    public void visit(CharDclAssignNode ctx) {
        visit(ctx.charDcl);
        codeGen.append(" = ");
        visit(ctx.charval);
    }

    @Override
    public void visit(CharDclNode ctx) {
        if(ctx.isGlobal == true){
            main.append("char  ");
            main.append(ctx.id).append(";").append("\n");

        }else {
            codeGen.append("char  ");
            codeGen.append(ctx.id);
        }
    }

    @Override
    public void visit(CharValNode ctx) {
        codeGen.append(ctx.value);
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        codeGen.append("\n");
        visit(ctx.actual);
        visit(ctx.recursion);
    }

    @Override
    public void visit(DefCaseNode ctx) {
        codeGen.append("default: ");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(ForLoopNode ctx) {
        codeGen.append("for ");
        codeGen.append("(");
        visit(ctx.forparams);
        codeGen.append(")");
        codeGen.append("{");

        visit(ctx.block);
        codeGen.append("\n");

        codeGen.append("}\n");
    }

    @Override
    public void visit(FormalParamsNode ctx) {
        if(ctx.vdcls.size() == 1){
            visit(ctx.vdcls.get(0));
        }else {
            codeGen.append(ctx.vdcls.get(0));
            for (int i = 1; i < ctx.vdcls.size();i++) {
                codeGen.append(", ");
                visit(ctx.vdcls.get(i));
            }
        }
    }

    @Override
    public void visit(ForParamsNode ctx) {
        visit(ctx.numdclassign);
        codeGen.append(";");
        visit(ctx.bexpr);
        codeGen.append(";");
        codeGen.append(ctx.id);
        codeGen.append(" = ");
        visit(ctx.aexpr);

        //for(number i = 0; bexpr; i = i + 1)

    }

    @Override
    public void visit(FuncBlockNode ctx) {
        codeGen.append("{");
        visit(ctx.dclAssignSemiCommand);
        codeGen.append("\n");
        if(isVoid == false){
            codeGen.append("return ");
            visit(ctx.returnValue);
            codeGen.append(";");
        }

        codeGen.append("}\n");
    }

    @Override
    public void visit(FuncCallsNode ctx) {
        main.append(ctx.id);
        main.append("(");
        if(ctx.actualParamsNode != null){
            visit(ctx.actualParamsNode);
        }
        main.append(")");
        main.append(";");

/*        codeGen.append(ctx.id);
        codeGen.append("(");
        if(ctx.callparams != null){
            visit(ctx.callparams);
        }
        codeGen.append(")");
        codeGen.append(";");*/
    }

    @Override
    public void visit(FuncDclNode ctx) {
        visit(ctx.datatype);
        if(getDataType(ctx.datatype.getClass().getSimpleName()) == Type.Void){
            isVoid = true;
        }else{
            isVoid = false;
        }
        codeGen.append(ctx.id);
        codeGen.append("(");
        if(ctx.params != null){
            visit(ctx.params);
        }
        codeGen.append(")");
        visit(ctx.funcblock);

    }


    @Override
    public void visit(IfStatementNode ctx) {
        codeGen.append("if ");
        codeGen.append("(");
        visit(ctx.iflogic);
        codeGen.append(")");
        codeGen.append("{");

        visit(ctx.ifThenBlock);
        codeGen.append("\n");

        codeGen.append("}\n");

        if(ctx.elseBlock != null){
            codeGen.append("else ");
            codeGen.append("{");

            visit(ctx.elseBlock);
            codeGen.append("\n");
            codeGen.append("}");

        }
    }

    @Override
    public void visit(NumberLitteralNode ctx) {
        codeGen.append("float ");
    }

    @Override
    public void visit(NumDclAssignNode ctx) {
        visit(ctx.numdecl);
        codeGen.append(" = ");
        visit(ctx.aexpr);
    }

    @Override
    public void visit(NumDclNode ctx) {
        if(ctx.isGlobal == true){
            main.append("float ");
            main.append(ctx.id).append(";").append("\n");

        }else {
            codeGen.append("float ");
            codeGen.append(ctx.id);
        }
    }

    @Override
    public void visit(OrNode ctx) {
        visit(ctx.leftChild);
        codeGen.append(" || ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ProgNode ctx) {
        for (Node node : ctx.nodes) {
            visit(node);
            codeGen.append("\n");
        }
    }

    @Override
    public void visit(SafeDclNode ctx) {
        //codeGen.append(ctx.safety);
        //codeGen.append(" ");
        visit(ctx.variable);
        //codeGen.append(";");
        //codeGen.appendln();
    }

    @Override
    public void visit(ScaseNode ctx) {
        codeGen.append("case ");
        visit(ctx.vals);
        codeGen.append(":");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        visit(ctx.stringdcl);
        codeGen.append(" = ");
        visit(ctx.stringval);
    }

    @Override
    public void visit(StringDclNode ctx) {
        if(ctx.isGlobal == true){
            main.append("char *");
            main.append(ctx.id).append(";").append("\n");

        }else {
            codeGen.append("char * ");
            codeGen.append(ctx.id);
        }
    }

    @Override
    public void visit(StringLitteralNode ctx) {
        codeGen.append("string ");

    }

    @Override
    public void visit(StringValNode ctx) {
        codeGen.append(ctx.value);
    }

    @Override
    public void visit(StructBlockNode ctx) {
        codeGen.append("{ \n");

        for (Node node : ctx.safeDclNodes) {
            visit(node);
        }

        codeGen.append("\n" + "}");
    }

    @Override
    public void visit(StructDclNode ctx) {
        codeGen.append("typedef struct ");
        codeGen.append(ctx.id);
        visit(ctx.structBlock);
    }

    @Override
    public void visit(SwitchStatementNode ctx) {
        codeGen.append("switch ");
        codeGen.append("(");
        codeGen.append(ctx.id);
        codeGen.append(")");
        codeGen.append("{ \n");
        if(ctx.scases != null){
            for (Node node : ctx.scases) {
                visit(node);
            }
        }
        visit(ctx.defcase);
        codeGen.append("} ");
    }

    @Override
    public void visit(VoidLitteralNode ctx) {
        codeGen.append("void ");
    }

    @Override
    public void visit(WhileLoop ctx) {
        codeGen.append("while ");
        codeGen.append("(");
        visit(ctx.bexpr);
        codeGen.append(")");
        codeGen.append("{");
        visit(ctx.block);
        codeGen.append("}\n");

    }
}


   