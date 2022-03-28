package expr.app;

import expr.gen.ExprLexer;
import expr.gen.ExprParser;
import expr.service.ExpressionProcessor;
import expr.service.AntlrToProgram;
import expr.nodes.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/*
 * Source: Jackie Wang Youtube: https://www.youtube.com/watch?v=6uF1Nxo2xjk&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=5
 */

public class ExpressionApp {
    public static void main(String[] args) {
        if(args.length != 1){
            System.err.println("Usage: file name");
        }else {
            String fileName = args[0];
            ExprParser parser = getParser(fileName);

            //Tell ANTLR to build a parse tree
            //Parse from the start symbol 'prog'
             ParseTree antlrAST = parser.prog();
             //Create a visitor for converting the parse tree into Expression object
            AntlrToProgram progVisitor = new AntlrToProgram();
            Program prog = progVisitor.visit(antlrAST);

            if (progVisitor.semanticErrors.isEmpty()) {
                ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
                for(String evaluation : ep.getEvaluationResults()) {
                    System.out.println(evaluation);
                }
            }else {
                for(String err : progVisitor.semanticErrors){
                    System.out.println(err);
                }
            }
        }
    }
    //parser will be of type from grammar Expr.g4
    private static ExprParser getParser(String fileName){
        ExprParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new ExprParser(tokens);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}
