public class PrettyPrint extends ASTVisitor {

    @Override
    public void visit(ASTNotNode ctx) {
        System.out.print("!");
        visit(ctx.value);
    }

    @Override
    public void visit(ASTAndNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" && ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopEqualNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" == ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopNotEqualNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" != ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopLeqNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" <= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopGeqNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" >= ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopLessNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" < ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTRelopGreaterNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" > ");
        visit(ctx.rightChild);

    }

    @Override
    public void visit(ASTIdBoolValNode ctx) {
        System.out.println(ctx.id);
        System.out.println(" == ");
        System.out.println(ctx.boolVal);
    }

    @Override
    public void visit(ASTBoolValNode ctx) {
        System.out.println(ctx.value);

    }

    @Override
    public void visit(ASTDivisionNode ctx) {
        visit(ctx.leftChild);
        System.out.print(" / ");
        visit(ctx.rightChild);
    }

    @Override
    public void visit(ASTIdNode ctx) {
        System.out.println(ctx.id);
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
        System.out.println("3.1415926535");

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
            System.out.println(ctx.vals.get(0));
        }else {
            System.out.println(ctx.vals.get(0));
            for (int i = 1; i < ctx.vals.size();i++) {
                System.out.println(",");
                System.out.println(ctx.vals.get(i));
            }
        }
    }

    @Override
    public void visit(ASTArrayBoolNode ctx) {
        System.out.println("[");
        System.out.println("boolean");
        System.out.println("]");
        System.out.println(ctx.id);
        System.out.println("=");
        System.out.println("[");
        visit(ctx.boolArray);
        System.out.println("]");
    }

    @Override
    public void visit(ASTArrayBoolValuesNode ctx) {
        for (ASTNode node : ctx.boolValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTArrayCharNode ctx) {
        System.out.println("[");
        System.out.println("char");
        System.out.println("]");
        System.out.println(ctx.id);
        System.out.println("=");
        System.out.println("[");
        visit(ctx.charArray);
        System.out.println("]");
    }

    @Override
    public void visit(ASTArrayCharValuesNode ctx) {
        for (ASTNode node : ctx.charvalues) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTArrayDeclNode ctx) {
        System.out.println("[");
        visit(ctx.arrdcltype);
        System.out.println("]");
        System.out.println(ctx.id);
        //[number] x
    }

    @Override
    public void visit(ASTArrayNumNode ctx) {
        System.out.println("[");
        System.out.println("number");
        System.out.println("]");
        System.out.println(ctx.id);
        System.out.println("=");
        System.out.println("[");
        visit(ctx.numArray);
        System.out.println("]");

    }

    @Override
    public void visit(ASTArrayNumValuesNode ctx) {
        for (ASTNode node : ctx.numValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTArrayStringNode ctx) {
        System.out.println("[");
        System.out.println("string");
        System.out.println("]");
        System.out.println(ctx.id);
        System.out.println("=");
        System.out.println("[");
        visit(ctx.stringArray);
        System.out.println("]");
    }

    @Override
    public void visit(ASTArrayStrValuesNode ctx) {
        for (ASTNode node : ctx.strValues) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTAssignNode ctx) {
        System.out.println(ctx.id);
        System.out.println("=");
        visit(ctx.atypes);
    }

    @Override
    public void visit(ASTBexpr ctx) {

    }

    @Override
    public void visit(ASTBoolDclAssignNode ctx) {
        visit(ctx.boolDcl);
        System.out.println("=");
        visit(ctx.bexpr);
    }

    @Override
    public void visit(ASTBoolDclNode ctx) {
        System.out.println("boolean");
        System.out.println(ctx.id);
    }

    @Override
    public void visit(ASTBoolLitteralNode ctx) {
        System.out.println("boolean");
    }

    @Override
    public void visit(ASTCaseBlockNode ctx) {
        visit(ctx.dclAssignCommand);
        if(ctx.optbreak != null){
            System.out.println(ctx.optbreak);
        }
    }

    @Override
    public void visit(ASTCharDclAssignNode ctx) {
        visit(ctx.charDcl);
        System.out.println("=");
        visit(ctx.charval);
    }

    @Override
    public void visit(ASTCharDclNode ctx) {
        System.out.println("char");
        System.out.println(ctx.id);
    }

    @Override
    public void visit(ASTCharValNode ctx) {
        System.out.println(ctx.value);
    }

    @Override
    public void visit(ASTCommandNode ctx) {
        for (ASTNode node : ctx.nodes) {
            visit(node);
        }
    }

    @Override
    public void visit(ASTDclAssignSemi ctx) {
        for (ASTNode node : ctx.nodes) {
            System.out.println("=");
            visit(node);
            System.out.println(";");
        }
    }

    @Override
    public void visit(ASTDclAssignSemiCommandNode ctx) {

    }

    @Override
    public void visit(ASTDefCaseNode ctx) {
        System.out.println("default:");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(ASTForLoop ctx) {
        System.out.println("for");
        System.out.println("(");
        visit(ctx.forparams);
        System.out.println(")");
        visit(ctx.block);
    }

    @Override
    public void visit(ASTFormalParamsNode ctx) {
        if(ctx.vdcls.size() == 1){
            System.out.println(ctx.vdcls.get(0));
        }else {
            System.out.println(ctx.vdcls.get(0));
            for (int i = 1; i < ctx.vdcls.size();i++) {
                System.out.println(",");
                System.out.println(ctx.vdcls.get(i));
            }
        }
    }

    @Override
    public void visit(ASTForParams ctx) {
        visit(ctx.numdclassign);
        System.out.println(";");
        visit(ctx.bexpr);
        System.out.println(";");
        System.out.println(ctx.id);
        System.out.println("=");
        visit(ctx.aexpr);

        //for(number i = 0; bexpr; i = i + 1)

    }

    @Override
    public void visit(ASTFuncBlockNode ctx) {
        System.out.println("{");
        visit(ctx.dclAssignSemiCommand);
        System.out.println("return");
        visit(ctx.returnValue);
        System.out.println(";");
        System.out.println("}");
    }

    @Override
    public void visit(ASTFuncCalls ctx) {
        System.out.println(ctx.id);
        System.out.println("(");
        if(ctx.callparams != null){
            visit(ctx.callparams);
        }
        System.out.println(")");
    }

    @Override
    public void visit(ASTFuncDcl ctx) {
        visit(ctx.dataytype);
        System.out.println(ctx.id);
        System.out.println("(");
        if(ctx.params != null){
            visit(ctx.params);
        }
        System.out.println(")");
        visit(ctx.funcblock);

    }

    @Override
    public void visit(ASTIfStatementNode ctx) {
        System.out.println("if");
        visit(ctx.iflogic);
        visit(ctx.ifThenBlock);
        if(ctx.elseBlock != null){
            System.out.println("else");
            visit(ctx.elseBlock);
        }
    }

    @Override
    public void visit(ASTNumberLitteralNode ctx) {
        System.out.println("number");
    }

    @Override
    public void visit(ASTNumDclAssignNode ctx) {
        visit(ctx.numdecl);
        System.out.println("=");
        visit(ctx.aexpr);
    }

    @Override
    public void visit(ASTNumDclNode ctx) {
        System.out.println("number");
        System.out.println(ctx.id);
    }

    @Override
    public void visit(ASTOrNode ctx) {
        visit(ctx.leftChild);
        System.out.println(" || ");
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
        System.out.println(ctx.safety);
        visit(ctx.variable);
    }

    @Override
    public void visit(ASTScaseNode ctx) {
        System.out.println("case");
        visit(ctx.vals);
        System.out.println(";");
        visit(ctx.caseblock);
    }

    @Override
    public void visit(ASTStringDclAssignNode ctx) {
        visit(ctx.stringdcl);
        System.out.println("=");
        visit(ctx.stringval);
    }

    @Override
    public void visit(ASTStringDclNode ctx) {
        System.out.println("string");
        System.out.println(ctx.id);
    }

    @Override
    public void visit(ASTStringLitteralNode ctx) {
        System.out.println("string");

    }

    @Override
    public void visit(ASTStringValNode ctx) {
        System.out.println(ctx.value);
    }

    @Override
    public void visit(ASTStructBlockNode ctx) {
        System.out.println("{");
        for (ASTNode node : ctx.safeDclNodes) {
            visit(node);
            System.out.println(";");
        }
        System.out.println("}");
    }

    @Override
    public void visit(ASTStructNode ctx) {
        System.out.println("$");
        System.out.println(ctx.id);
        visit(ctx.structBlock);
    }

    @Override
    public void visit(ASTSwitchStatementNode ctx) {
        System.out.println("switch");
        System.out.println("(");
        System.out.println(ctx.id);
        System.out.println(")");
        System.out.println("{");
        if(ctx.scases != null){
            for (ASTNode node : ctx.scases) {
                visit(node);
            }
        }
        visit(ctx.defcase);
        System.out.println("}");
    }

    @Override
    public void visit(ASTVoidLitteralNode ctx) {
        System.out.println("void");
    }

    @Override
    public void visit(ASTWhileLoop ctx) {
        System.out.println("while");
        System.out.println("(");
        visit(ctx.bexpr);
        System.out.println(")");
        visit(ctx.block);
    }
}
