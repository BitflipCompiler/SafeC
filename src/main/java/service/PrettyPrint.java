package service;

import ast.*;
import ast.abstracts.*;
import visitor.ASTVisitor;

public class PrettyPrint extends ASTVisitor {
    private int indentation = 0;

    StringBuilder printIndentation(int indentation){
        StringBuilder str = new StringBuilder(" ");
        for(int i = 0; i < indentation; i++){
            str.append("\t");
        }
        return str;
    }

    @Override
    public void visit(NotNode ctx) {
        System.out.print("!");
        visit(ctx.value);
    }

    @Override
    public void visit(AndNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" && ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopEqualNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" == ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" != ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" <= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" >= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLessNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" < ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" > ");
        visit(ctx.rightChild);

    }

    @Override
    public void visit(IdBoolValNode ctx) {
        System.out.print(ctx.id);
        System.out.print(" == ");
        System.out.print(ctx.boolVal);
    }

    @Override
    public void visit(BoolValNode ctx) {
        System.out.print(ctx.value);

    }

    @Override
    public void visit(DivisionNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" / ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(IdNode ctx) {
        System.out.print(ctx.id);
    }

    @Override
    public void visit(MinusNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" - ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ModNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" % ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(Numberval ctx) {

    }

    @Override
    public void visit(NumvalNode ctx) {
        System.out.print(ctx.value);
    }

    @Override
    public void visit(PiNode ctx) {
        System.out.print("3.1415926535");

    }

    @Override
    public void visit(PlusNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" + ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(TimesNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" * ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ActualParamsNode ctx) {
        if(ctx.vals.size() == 1){
            System.out.print(ctx.vals.get(0));
        }else {
            System.out.print(ctx.vals.get(0));
            for (int i = 1; i < ctx.vals.size();i++) {
                System.out.print(", ");
                System.out.print(ctx.vals.get(i));
            }
        }
    }

    @Override
    public void visit(ArrayBoolNode ctx) {
        System.out.print("[ ");
        System.out.print("boolean ");
        System.out.print("] ");
        System.out.print(ctx.id);
        System.out.print(" = ");
        System.out.print("[ ");
        visit(ctx.boolArray);
        System.out.print(" ]");
    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {
        for (Node node : ctx.boolValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayCharNode ctx) {
        System.out.print("[ ");
        System.out.print("char ");
        System.out.print("] ");
        System.out.print(ctx.id);
        System.out.print(" = ");
        System.out.print("[ ");
        visit(ctx.charArray);
        System.out.print(" ]");
    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {
        for (Node node : ctx.charvalues) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        System.out.print("[ ");
        visit(ctx.arrdcltype);
        System.out.print(" ] ");
        System.out.print(ctx.id);
        //[number] x
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        System.out.print("[ ");
        System.out.print("number ");
        System.out.print(" ]");
        System.out.print(ctx.id);
        System.out.print(" = ");
        System.out.print("[ ");
        visit(ctx.numArray);
        System.out.print(" ]");

    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {
        for (Node node : ctx.numValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayStringNode ctx) {
        System.out.print("[ ");
        System.out.print("string ");
        System.out.print("] ");
        System.out.print(ctx.id);
        System.out.print(" = ");
        System.out.print("[ ");
        visit(ctx.stringArray);
        System.out.print(" ] ");
    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {
        for (Node node : ctx.strValues) {
            visit(node);
        }
    }

    @Override
    public void visit(AssignNode ctx) {
        System.out.print(ctx.id);
        System.out.print(" = ");
        visit(ctx.atypes);
        //System.out.println();
    }

    @Override
    public void visit(Bexpr ctx) {

    }

    @Override
    public void visit(BoolDclAssignNode ctx) {
        visit(ctx.boolDcl);
        System.out.print(" = ");
        visit(ctx.bexpr);
        //System.out.println(";");
    }

    @Override
    public void visit(BoolDclNode ctx) {
        System.out.print("boolean ");
        System.out.print(ctx.id);
    }

    @Override
    public void visit(BoolLitteralNode ctx) {
        System.out.print("boolean ");
    }

    @Override
    public void visit(CaseBlockNode ctx) {
        visit(ctx.dclAssignCommand);
        if(ctx.optbreak != null){
            System.out.print(ctx.optbreak);
        }
        System.out.println();
    }

    @Override
    public void visit(CharDclAssignNode ctx) {
        visit(ctx.charDcl);
        System.out.print(" = ");
        visit(ctx.charval);
    }

    @Override
    public void visit(CharDclNode ctx) {
        System.out.print("char ");
        System.out.print(ctx.id);
    }

    @Override
    public void visit(CharValNode ctx) {
        System.out.print(ctx.value);
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        System.out.println();
        System.out.print(printIndentation(indentation));
        visit(ctx.actual);
        visit(ctx.recursion);
    }

    @Override
    public void visit(DefCaseNode ctx) {
        System.out.print("default: ");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(ForLoop ctx) {
        System.out.print("for ");
        System.out.print("(");
        visit(ctx.forparams);
        System.out.print(")");
        System.out.print("{");
        indentation++;
        visit(ctx.block);
        System.out.println();
        indentation--;
        System.out.println("}");
    }

    @Override
    public void visit(FormalParamsNode ctx) {
        if(ctx.vdcls.size() == 1){
            visit(ctx.vdcls.get(0));
        }else {
            System.out.print(ctx.vdcls.get(0));
            for (int i = 1; i < ctx.vdcls.size();i++) {
                System.out.print(", ");
                visit(ctx.vdcls.get(i));
            }
        }
    }

    @Override
    public void visit(ForParams ctx) {
        visit(ctx.numdclassign);
        System.out.print(";");
        visit(ctx.bexpr);
        System.out.print(";");
        System.out.print(ctx.id);
        System.out.print(" = ");
        visit(ctx.aexpr);

        //for(number i = 0; bexpr; i = i + 1)

    }

    @Override
    public void visit(FuncBlockNode ctx) {
        System.out.print("{");
        indentation++;
        visit(ctx.dclAssignSemiCommand);
        System.out.println();
        System.out.print("return ");
        visit(ctx.returnValue);
        System.out.print(";");
        System.out.println();
        indentation--;
        System.out.println("}");
    }

    @Override
    public void visit(FuncCalls ctx) {
        System.out.print(ctx.id);
        System.out.print("(");
        if(ctx.callparams != null){
            visit(ctx.callparams);
        }
        System.out.print(")");
    }

    @Override
    public void visit(FuncDcl ctx) {
        visit(ctx.datatype);
        System.out.print(ctx.id);
        System.out.print("(");
        if(ctx.params != null){
            visit(ctx.params);
        }
        System.out.print(")");
        visit(ctx.funcblock);

    }

    @Override
    public void visit(IfStatementNode ctx) {
        System.out.print("if ");
        System.out.print("(");
        visit(ctx.iflogic);
        System.out.print(")");
        System.out.print("{");
        indentation++;
        visit(ctx.ifThenBlock);
        System.out.println();
        indentation--;
        System.out.print(printIndentation(indentation));
        System.out.println("}");

        if(ctx.elseBlock != null){
            System.out.print("else ");
            System.out.print("{");
            indentation++;
            visit(ctx.elseBlock);
            System.out.println();
            System.out.print("}");
            indentation--;
        }
    }

    @Override
    public void visit(NumberLitteralNode ctx) {
        System.out.print("number ");
    }

    @Override
    public void visit(NumDclAssignNode ctx) {
        visit(ctx.numdecl);
        System.out.print(" = ");
        visit(ctx.aexpr);
    }

    @Override
    public void visit(NumDclNode ctx) {
        System.out.print("number ");
        System.out.print(ctx.id);
    }

    @Override
    public void visit(OrNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" || ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ProgNode ctx) {
        for (Node node : ctx.nodes) {
            visit(node);
            System.out.println();
        }
    }

    @Override
    public void visit(SafeDclNode ctx) {
        System.out.print(ctx.safety);
        System.out.print(" ");
        visit(ctx.variable);
        //System.out.println();
    }

    @Override
    public void visit(ScaseNode ctx) {
        System.out.print("case ");
        visit(ctx.vals);
        System.out.print(":");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        visit(ctx.stringdcl);
        System.out.print(" = ");
        visit(ctx.stringval);
    }

    @Override
    public void visit(StringDclNode ctx) {
        System.out.print("string ");
        System.out.print(ctx.id);
    }

    @Override
    public void visit(StringLitteralNode ctx) {
        System.out.print("string ");

    }

    @Override
    public void visit(StringValNode ctx) {
        System.out.print(ctx.value);
    }

    @Override
    public void visit(StructBlockNode ctx) {
        System.out.print("{ \n");
        indentation++;
        for (Node node : ctx.safeDclNodes) {
            System.out.print(printIndentation(indentation));
            visit(node);
        }
        indentation--;
        System.out.print(printIndentation(indentation));
        System.out.print("\n" + "}");
    }

    @Override
    public void visit(StructNode ctx) {
        System.out.print("$ ");
        System.out.print(ctx.id);
        visit(ctx.structBlock);
    }

    @Override
    public void visit(SwitchStatementNode ctx) {
        System.out.print("switch ");
        System.out.print("(");
        System.out.print(ctx.id);
        System.out.print(")");
        System.out.println("{ ");
        if(ctx.scases != null){
            indentation++;
            for (Node node : ctx.scases) {
                System.out.print(printIndentation(indentation));
                visit(node);
            }
        }
        System.out.print(printIndentation(indentation));
        visit(ctx.defcase);
        indentation--;
        System.out.print(printIndentation(indentation));
        System.out.print("} ");
    }

    @Override
    public void visit(VoidLitteralNode ctx) {
        System.out.print("void ");
    }

    @Override
    public void visit(WhileLoop ctx) {
        System.out.print("while ");
        System.out.print("(");
        visit(ctx.bexpr);
        System.out.print(")");
        System.out.print("{");
        indentation++;
        visit(ctx.block);
        indentation--;
        System.out.print(printIndentation(indentation));
        System.out.println("}");

    }
}
