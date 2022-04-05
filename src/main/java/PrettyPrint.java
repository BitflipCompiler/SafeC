public class PrettyPrint extends ASTVisitor {

    @Override
    public void visit(ASTNotNode ctx) {
        System.out.print("!");
        visit(ctx.value);
    }

    @Override
    public void visit(ASTAndNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" && ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopEqualNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" == ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopNotEqualNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" != ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopLeqNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" <= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopGeqNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" >= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopLessNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" < ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopGreaterNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" > ");
        visit(ctx.rightChild);

    }

    @Override
    public void visit(ASTIdBoolValNode ctx) {
        System.out.print(ctx.id);
        System.out.print(" == ");
        System.out.print(ctx.boolVal);
    }

    @Override
    public void visit(ASTBoolValNode ctx) {
        System.out.print(ctx.value);

    }

    @Override
    public void visit(ASTDivisionNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" / ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTIdNode ctx) {
        System.out.print(ctx.id);
    }

    @Override
    public void visit(ASTMinusNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" - ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTModNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" % ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTNumberval ctx) {

    }

    @Override
    public void visit(ASTNumvalNode ctx) {
        System.out.print(ctx.value);
    }

    @Override
    public void visit(ASTPiNode ctx) {
        System.out.print("3.1415926535");

    }

    @Override
    public void visit(ASTPlusNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" + ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTTimesNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" * ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTActualParamsNode ctx) {
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
    public void visit(ASTArrayBoolNode ctx) {
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
    public void visit(ASTArrayBoolValuesNode ctx) {
        for (ASTNode node : ctx.boolValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTArrayCharNode ctx) {
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
    public void visit(ASTArrayCharValuesNode ctx) {
        for (ASTNode node : ctx.charvalues) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTArrayDeclNode ctx) {
        System.out.print("[ ");
        visit(ctx.arrdcltype);
        System.out.print(" ] ");
        System.out.print(ctx.id);
        //[number] x
    }

    @Override
    public void visit(ASTArrayNumNode ctx) {
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
    public void visit(ASTArrayNumValuesNode ctx) {
        for (ASTNode node : ctx.numValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTArrayStringNode ctx) {
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
    public void visit(ASTArrayStrValuesNode ctx) {
        for (ASTNode node : ctx.strValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTAssignNode ctx) {
        System.out.print(ctx.id);
        System.out.print(" = ");
        visit(ctx.atypes);
    }

    @Override
    public void visit(ASTBexpr ctx) {

    }

    @Override
    public void visit(ASTBoolDclAssignNode ctx) {
        visit(ctx.boolDcl);
        System.out.print(" = ");
        visit(ctx.bexpr);
        System.out.println(";");
    }

    @Override
    public void visit(ASTBoolDclNode ctx) {
        System.out.print("boolean ");
        System.out.print(ctx.id);
    }

    @Override
    public void visit(ASTBoolLitteralNode ctx) {
        System.out.print("boolean ");
    }

    @Override
    public void visit(ASTCaseBlockNode ctx) {
        visit(ctx.dclAssignCommand);
        if(ctx.optbreak != null){
            System.out.print(ctx.optbreak);
        }
    }

    @Override
    public void visit(ASTCharDclAssignNode ctx) {
        visit(ctx.charDcl);
        System.out.print(" = ");
        visit(ctx.charval);
    }

    @Override
    public void visit(ASTCharDclNode ctx) {
        System.out.print("char ");
        System.out.print(ctx.id);
    }

    @Override
    public void visit(ASTCharValNode ctx) {
        System.out.print(ctx.value);
    }

    @Override
    public void visit(ASTDclAssignSemiCommandNode ctx) {
        visit(ctx.actual);
        visit(ctx.recursion);
    }

    @Override
    public void visit(ASTDefCaseNode ctx) {
        System.out.print("default: ");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(ASTForLoop ctx) {
        System.out.print("for ");
        System.out.print("(");
        visit(ctx.forparams);
        System.out.print(")");
        visit(ctx.block);
    }

    @Override
    public void visit(ASTFormalParamsNode ctx) {
        if(ctx.vdcls.size() == 1){
            System.out.print(ctx.vdcls.get(0));
        }else {
            System.out.print(ctx.vdcls.get(0));
            for (int i = 1; i < ctx.vdcls.size();i++) {
                System.out.print(", ");
                System.out.print(ctx.vdcls.get(i));
            }
        }
    }

    @Override
    public void visit(ASTForParams ctx) {
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
    public void visit(ASTFuncBlockNode ctx) {
        System.out.print("{ ");
        visit(ctx.dclAssignSemiCommand);
        System.out.print("return ");
        visit(ctx.returnValue);
        System.out.print(";");
        System.out.print("} ");
    }

    @Override
    public void visit(ASTFuncCalls ctx) {
        System.out.print(ctx.id);
        System.out.print("(");
        if(ctx.callparams != null){
            visit(ctx.callparams);
        }
        System.out.print(")");
    }

    @Override
    public void visit(ASTFuncDcl ctx) {
        visit(ctx.dataytype);
        System.out.print(ctx.id);
        System.out.print("(");
        if(ctx.params != null){
            visit(ctx.params);
        }
        System.out.print(")");
        visit(ctx.funcblock);

    }

    @Override
    public void visit(ASTIfStatementNode ctx) {
        System.out.print("if ");
        visit(ctx.iflogic);
        visit(ctx.ifThenBlock);
        if(ctx.elseBlock != null){
            System.out.print("else ");
            visit(ctx.elseBlock);
        }
    }

    @Override
    public void visit(ASTNumberLitteralNode ctx) {
        System.out.print("number ");
    }

    @Override
    public void visit(ASTNumDclAssignNode ctx) {
        visit(ctx.numdecl);
        System.out.print(" = ");
        visit(ctx.aexpr);
    }

    @Override
    public void visit(ASTNumDclNode ctx) {
        System.out.print("number ");
        System.out.print(ctx.id);
    }

    @Override
    public void visit(ASTOrNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" || ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTProgNode ctx) {
        for (ASTNode node : ctx.nodes) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTSafeDclNode ctx) {
        System.out.print(ctx.safety);
        System.out.print(" ");
        visit(ctx.variable);
    }

    @Override
    public void visit(ASTScaseNode ctx) {
        System.out.print("case ");
        visit(ctx.vals);
        System.out.print(";");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(ASTStringDclAssignNode ctx) {
        visit(ctx.stringdcl);
        System.out.print(" = ");
        visit(ctx.stringval);
    }

    @Override
    public void visit(ASTStringDclNode ctx) {
        System.out.print("string ");
        System.out.print(ctx.id);
    }

    @Override
    public void visit(ASTStringLitteralNode ctx) {
        System.out.print("string ");

    }

    @Override
    public void visit(ASTStringValNode ctx) {
        System.out.print(ctx.value);
    }

    @Override
    public void visit(ASTStructBlockNode ctx) {
        System.out.print("{ \n");
        for (ASTNode node : ctx.safeDclNodes) {
            visit(node);
        }
        System.out.print("\n" + "} \n");
    }

    @Override
    public void visit(ASTStructNode ctx) {
        System.out.print("$ ");
        System.out.print(ctx.id);
        visit(ctx.structBlock);
    }

    @Override
    public void visit(ASTSwitchStatementNode ctx) {
        System.out.print("switch ");
        System.out.print("(");
        System.out.print(ctx.id);
        System.out.print(")");
        System.out.print("{ ");
        if(ctx.scases != null){
            for (ASTNode node : ctx.scases) {
                visit(node);
            }
        }
        visit(ctx.defcase);
        System.out.print("} ");
    }

    @Override
    public void visit(ASTVoidLitteralNode ctx) {
        System.out.print("void ");
    }

    @Override
    public void visit(ASTWhileLoop ctx) {
        System.out.print("while ");
        System.out.print("(");
        visit(ctx.bexpr);
        System.out.print(")");
        visit(ctx.block);
    }
}
