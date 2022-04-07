package old.expr.service;

import old.expr.gen.ExprBaseVisitor;
import old.expr.gen.ExprParser;
import old.expr.nodes.Program;

import java.util.ArrayList;
import java.util.List;

/*
 * source: Jackie Wang, Youtube: https://www.youtube.com/watch?v=zo_oiHzKLqw&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=4
 */

public class AntlrToProgram extends ExprBaseVisitor<Program> {

    public List<String> semanticErrors; //To be accesed by the main application program

    @Override
    public Program visitProgram(ExprParser.ProgramContext ctx) {
        Program prog = new Program();
        semanticErrors = new ArrayList<>();
        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
        // a helper visitor for transforming each subtree into an Expression object
        for(int i = 0; i < ctx.getChildCount(); i++){
            if(i == ctx.getChildCount() - 1) {
                /*
                 * Last child of the start symbol prog is EOF
                 * Do not visit this child and attempt to convert it to and Expression object
                 */
            }else {
                prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
            }
        }
        return prog;
    }
}
