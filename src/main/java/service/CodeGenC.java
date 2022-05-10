package service;

import ast.*;
import ast.abstracts.Node;
import visitor.ASTVisitor;

import java.io.FileWriter;
import java.io.IOException;

/**
 * This {@link CodeGenC} is responsible for the C code gen.
 * The code exstends {@link ASTVisitor}, as it uses the visitor pattern to gen the
 * C code.
 */

public class CodeGenC extends ASTVisitor {

    public StringBuilder globalCode = new StringBuilder();
    public StringBuilder mainCode = new StringBuilder();
    public StringBuilder structCode = new StringBuilder();
    public StringBuilder globalVars = new StringBuilder();

    public boolean inStruct = false;
    boolean inFuncCall = false;
    boolean hasBool = false;
    boolean isVoid = false;

    StringBuilder libs = new StringBuilder();

    public StringBuilder gatherAllBuilds(CodeGenC codeGen) {

        codeGen.setupMain(codeGen.mainCode);

        StringBuilder gatherAllBuilds = new StringBuilder();
        gatherAllBuilds.append(codeGen.getlibs());
        gatherAllBuilds.append(codeGen.globalVars);
        gatherAllBuilds.append(codeGen.structCode);
        gatherAllBuilds.append(codeGen.globalCode);
        gatherAllBuilds.append(codeGen.mainCode);

        return gatherAllBuilds;
    }

    public void printBuilderToFile(StringBuilder builder) {
        //Write to file
        try {
            FileWriter myWriter = new FileWriter("output/output.c");
            myWriter.write(String.valueOf(builder));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("C file can be found in output folder");
    }

    public Type getDataType(String datatype) {
        if (datatype.startsWith("Num")) {
            return Type.Number;
        } else if (datatype.startsWith("Void")) {
            return Type.Void;
        } else if (datatype.startsWith("String")) {
            return Type.String;
        } else if (datatype.startsWith("Bool")) {
            return Type.Boolean;
        } else if (datatype.startsWith("Char")) {
            return Type.Char;
        }
        throw new RuntimeException("Datatype not viable.");
    }

    //Add C libs to imports
    public void addLibs(String lib) {
        libs.append(lib);
    }

    //Get all libs
    public StringBuilder getlibs() {
        return libs;
    }

    //Setup C main
    public void setupMain(StringBuilder main) {
        main.insert(0, "void main(){\n");
        main.append("\n}\n");
    }

    //Visitor start--
    @Override
    public void visit(NotNode ctx) {
        globalCode.append("!");
        visit(ctx.value);
    }

    @Override
    public void visit(AndNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" && ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopEqualNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" == ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" != ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" <= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" >= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLessNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" < ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" > ");
        visit(ctx.rightChild);

    }

    @Override
    public void visit(IdBoolValNode ctx) {
        visit(ctx.id);
        globalCode.append(" == ");
        visit(ctx.boolVal);
    }

    @Override
    public void visit(BoolValNode ctx) {
        if (ctx.isGlobal && !inFuncCall) {
            globalVars.append(ctx.value);
        } else if (inFuncCall) {
            mainCode.append(ctx.value);
        } else if (inStruct) {
            structCode.append(ctx.value);
        } else {
            globalCode.append(ctx.value);
        }
    }

    @Override
    public void visit(DivisionNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" / ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(IdNode ctx) {

        if (ctx.isGlobal) {
            mainCode.append(ctx.id);
        } else {
            globalCode.append(ctx.id);
        }
    }

    @Override
    public void visit(MinusNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" - ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ModNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" % ");
        visit(ctx.rightChild);
    }


    @Override
    public void visit(NumvalNode ctx) {
        if (ctx.isGlobal && !inFuncCall) {
            globalVars.append(ctx.value);
        } else if (inFuncCall) {
            mainCode.append(ctx.value);
        } else if (inStruct) {
            structCode.append(ctx.value);
        } else {
            globalCode.append(ctx.value);
        }

    }

    @Override
    public void visit(PiNode ctx) {
        globalCode.append("3.1415926535");

    }

    @Override
    public void visit(PlusNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" + ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(TimesNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" * ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ActualParamsNode ctx) {
        if (ctx.isGlobal == true) {
            if (ctx.vals.size() == 1) {
                visit(ctx.vals.get(0));
            } else {
                visit(ctx.vals.get(0));
                for (int i = 1; i < ctx.vals.size(); i++) {
                    mainCode.append(", ");
                    visit(ctx.vals.get(i));
                }
            }
        } else {
            if (ctx.vals.size() == 1) {
                visit(ctx.vals.get(0));
            } else {
                visit(ctx.vals.get(0));
                for (int i = 1; i < ctx.vals.size(); i++) {
                    globalCode.append(", ");
                    visit(ctx.vals.get(i));
                }
            }
        }

    }

    @Override
    public void visit(ArrayBoolNode ctx) {
        globalCode.append("bool ");
        globalCode.append(ctx.id);
        globalCode.append(" = ");
        globalCode.append("[ ");
        visit(ctx.boolArray);
        globalCode.append(" ]");
    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {
        for (Node node : ctx.boolValues) {
            visit(node);
        }
    }

    //Denne skal laves om til c syntax.
    @Override
    public void visit(ArrayCharNode ctx) {
        globalCode.append("char ");
        globalCode.append(ctx.id);
        globalCode.append(" = ");
        globalCode.append("[ ");
        visit(ctx.charArray);
        globalCode.append(" ]");
    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {
        for (Node node : ctx.charvalues) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        globalCode.append("[ ");
        visit(ctx.arrdcltype);
        globalCode.append(" ] ");
        globalCode.append(ctx.id);
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        globalCode.append("float ");
        globalCode.append(ctx.id);
        globalCode.append(" = ");
        globalCode.append("[ ");
        visit(ctx.numArray);
        globalCode.append(" ]");

    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {
        for (Node node : ctx.numValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ArrayStringNode ctx) {
        globalCode.append("string ");
        globalCode.append(ctx.id);
        globalCode.append(" = ");
        globalCode.append("[ ");
        visit(ctx.stringArray);
        globalCode.append(" ] ");
    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {
        for (Node node : ctx.strValues) {
            visit(node);
        }
    }

    @Override
    public void visit(AssignNode ctx) {
        if (ctx.atypes instanceof FuncCallsNode) {
            mainCode.append(ctx.id.getId());
            mainCode.append(" = ");
            visit(ctx.atypes);
        } else {
            globalCode.append(ctx.id.getId());
            globalCode.append(" = ");
            visit(ctx.atypes);
            globalCode.append(";");
        }
    }

    @Override
    public void visit(BoolDclAssignNode ctx) {
        visit(ctx.boolDcl);
        if (ctx.isGlobal) {
            globalVars.append(" = ");
        } else {
            if (inStruct) {
                structCode.append(" = ");
            } else {
                globalCode.append(" = ");
            }
        }
        visit(ctx.bexpr);
    }

    @Override
    public void visit(BoolDclNode ctx) {

        if (hasBool == false) {
            addLibs("#include <stdbool.h>\n");
            hasBool = true;
        }

        if (ctx.isGlobal == true) {
            globalVars.append("bool ");
            globalVars.append(ctx.id);

        } else {
            if (inStruct) {
                structCode.append("bool ");
                structCode.append(ctx.id);
            } else {
                globalCode.append("bool ");
                globalCode.append(ctx.id);
            }
        }
    }

    @Override
    public void visit(BoolLitteralNode ctx) {
        globalCode.append("bool ");
    }

    @Override
    public void visit(CaseBlockNode ctx) {
        visit(ctx.dclAssignCommand);
        if (ctx.optbreak != null) {
            globalCode.append(ctx.optbreak);
        }
        globalCode.append("\n");
    }

    @Override
    public void visit(CharDclAssignNode ctx) {
        visit(ctx.charDcl);
        if (ctx.isGlobal) {
            globalVars.append(" = ");
        } else {
            if (inStruct) {
                structCode.append(" = ");
            } else {
                globalCode.append(" = ");
            }
        }

        visit(ctx.charval);
    }

    @Override
    public void visit(CharDclNode ctx) {
        if (ctx.isGlobal == true) {
            globalVars.append("char  ");
            globalVars.append(ctx.id);

        } else {
            if (inStruct) {
                structCode.append("char  ");
                structCode.append(ctx.id);
            } else {
                globalCode.append("char  ");
                globalCode.append(ctx.id);
            }
        }
    }

    @Override
    public void visit(CharValNode ctx) {
        if (ctx.isGlobal && !inFuncCall) {
            globalVars.append(ctx.value);
        } else if (inFuncCall) {
            mainCode.append(ctx.value);
        } else if (inStruct) {
            structCode.append(ctx.value);
        } else {
            globalCode.append(ctx.value);
        }
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        globalCode.append("\n");
        visit(ctx.actual);
        visit(ctx.recursion);
    }

    @Override
    public void visit(DefCaseNode ctx) {
        globalCode.append("default: ");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(ForLoopNode ctx) {
        globalCode.append("for ");
        globalCode.append("(");
        visit(ctx.forparams);
        globalCode.append(")");
        globalCode.append("{");

        visit(ctx.block);
        globalCode.append("\n");

        globalCode.append("}\n");
    }

    @Override
    public void visit(FormalParamsNode ctx) {
        if (ctx.vdcls.size() == 1) {
            visit(ctx.vdcls.get(0));
        } else {
            visit(ctx.vdcls.get(0));
            for (int i = 1; i < ctx.vdcls.size(); i++) {
                globalCode.append(", ");
                visit(ctx.vdcls.get(i));
            }
        }
    }

    @Override
    public void visit(ForParamsNode ctx) {
        visit(ctx.numdclassign);
        globalCode.append(";");
        visit(ctx.bexpr);
        globalCode.append(";");
        globalCode.append(ctx.id);
        globalCode.append(" = ");
        visit(ctx.aexpr);
    }

    @Override
    public void visit(FuncBlockNode ctx) {
        globalCode.append("{");
        visit(ctx.dclAssignSemiCommand);
        globalCode.append("\n");
        if (isVoid == false) {
            globalCode.append("return ");
            visit(ctx.returnValue);
            globalCode.append(";");
        }
        globalCode.append("\n}\n");
    }

    @Override
    public void visit(FuncCallsNode ctx) {
        inFuncCall = true;
        if (ctx.isGlobal == true) {
            mainCode.append(ctx.id);
            mainCode.append("(");
            if (ctx.actualParamsNode != null) {
                visit(ctx.actualParamsNode);
            }
            mainCode.append(")");
            mainCode.append(";\n");

        } else {
            globalCode.append(ctx.id);
            globalCode.append("(");
            if (ctx.actualParamsNode != null) {
                visit(ctx.actualParamsNode);
            }
            globalCode.append(")");
            globalCode.append(";");

        }
        inFuncCall = false;
    }

    @Override
    public void visit(FuncDclNode ctx) {
        visit(ctx.datatype);
        if (getDataType(ctx.datatype.getClass().getSimpleName()) == Type.Void) {
            isVoid = true;
        } else {
            isVoid = false;
        }
        globalCode.append(ctx.id);
        globalCode.append("(");
        if (ctx.params != null) {
            visit(ctx.params);
        }
        globalCode.append(")");
        visit(ctx.funcblock);

    }


    @Override
    public void visit(IfStatementNode ctx) {
        globalCode.append("if ");
        globalCode.append("(");
        visit(ctx.iflogic);
        globalCode.append(")");
        globalCode.append("{");

        visit(ctx.ifThenBlock);
        globalCode.append("\n");

        globalCode.append("}\n");

        if (ctx.elseBlock != null) {
            globalCode.append("else ");
            globalCode.append("{");

            visit(ctx.elseBlock);
            globalCode.append("\n");
            globalCode.append("}");

        }
    }

    @Override
    public void visit(NumberLitteralNode ctx) {
        globalCode.append("float ");
    }

    @Override
    public void visit(NumDclAssignNode ctx) {
        visit(ctx.numdecl);
        if (ctx.isGlobal) {
            globalVars.append(" = ");
        } else {
            if (inStruct) {
                structCode.append(" = ");
            } else {
                globalCode.append(" = ");
            }
        }
        visit(ctx.aexpr);
    }

    @Override
    public void visit(NumDclNode ctx) {
        if (ctx.isGlobal == true) {
            globalVars.append("float ");
            globalVars.append(ctx.id);

        } else {
            if (inStruct) {
                structCode.append("float ");
                structCode.append(ctx.id);
            } else {
                globalCode.append("float ");
                globalCode.append(ctx.id);
            }
        }
    }

    @Override
    public void visit(OrNode ctx) {
        visit(ctx.leftChild);
        globalCode.append(" || ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ProgNode ctx) {
        for (Node node : ctx.nodes) {
            visit(node);
        }
    }

    @Override
    public void visit(SafeDclNode ctx) {
        visit(ctx.variable);
        if (ctx.isGlobal) {
            globalVars.append(";\n");
        } else {
            if (inStruct) {
                structCode.append(";\n");
            } else {
                globalCode.append(";\n");
            }
        }
    }

    @Override
    public void visit(ScaseNode ctx) {
        globalCode.append("case ");
        visit(ctx.vals);
        globalCode.append(":");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        visit(ctx.stringdcl);
        if (ctx.isGlobal) {
            globalVars.append(" = ");
        } else {
            if (inStruct) {
                structCode.append(" = ");
            } else {
                globalCode.append(" = ");
            }
        }
        visit(ctx.stringval);
    }

    @Override
    public void visit(StringDclNode ctx) {
        if (ctx.isGlobal == true) {
            globalVars.append("char * ");
            globalVars.append(ctx.id);
        } else {
            if (inStruct) {
                structCode.append("char * ");
                structCode.append(ctx.id);
            } else {
                globalCode.append("char * ");
                globalCode.append(ctx.id);
            }
        }
    }

    @Override
    public void visit(StringLitteralNode ctx) {
        globalCode.append("string ");
    }

    @Override
    public void visit(StringValNode ctx) {
        if (ctx.isGlobal && !inFuncCall) {
            globalVars.append(ctx.value);
        } else if (inFuncCall) {
            mainCode.append(ctx.value);
        } else if (inStruct) {
            structCode.append(ctx.value);
        } else {
            globalCode.append(ctx.value);
        }
    }

    @Override
    public void visit(StructBlockNode ctx) {
        inStruct = true;
        structCode.append("{ \n");

        for (Node node : ctx.safeDclNodes) {
            visit(node);
        }
        structCode.append("}" + ";\n\n");
        inStruct = false;
    }

    @Override
    public void visit(StructDclNode ctx) {
        structCode.append("struct ");
        structCode.append(ctx.id);
        visit(ctx.structBlock);
    }

    @Override
    public void visit(SwitchStatementNode ctx) {
        globalCode.append("switch ");
        globalCode.append("((int)");
        globalCode.append(ctx.id);
        globalCode.append(")");
        globalCode.append("{ \n");
        if (ctx.scases != null) {
            for (Node node : ctx.scases) {
                visit(node);
            }
        }
        visit(ctx.defcase);
        globalCode.append("} ");
    }

    @Override
    public void visit(VoidLitteralNode ctx) {
        globalCode.append("void ");
    }

    @Override
    public void visit(WhileLoopNode ctx) {
        globalCode.append("while ");
        globalCode.append("(");
        visit(ctx.bexpr);
        globalCode.append(")");
        globalCode.append("{");
        visit(ctx.block);
        globalCode.append("}\n");

    }
}


   