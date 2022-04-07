package old.expr.service;

import expr.nodes.*;
import old.expr.gen.ExprBaseVisitor;
import old.expr.gen.ExprParser;
import old.expr.nodes.*;
import old.expr.nodes.Number;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/*
 * Source inspiration: Jackie Wang, youtube: https://www.youtube.com/watch?v=zo_oiHzKLqw&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=4
 */

public class AntlrToExpression extends ExprBaseVisitor<Expression> { //extends BaseVisitor
    /*
     * Given that all visit_* Method are called in a top-down fashion,
     * we can be sure that the order in witch we add declared variables in the 'vars' is
     * identical to how they are declared in the input program.
     */

    private List<String> vars; //Stores all the variables declared in the program so far
    private List<String> semanticErrors; //1. duplicate declaration 2. reference to undeclared variable
    //Note that semantic errors are different from syntax errors.

    public AntlrToExpression(List<String> semanticErrors){
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    //Generated visitors to override
    @Override
    public Expression visitDeclaration(ExprParser.DeclarationContext ctx) {
        //ID() is a method generated to correspond with token ID in the source grammar.
        Token idToken = ctx.ID().getSymbol(); // equivalent to: ctx.getChild(0).getSymbol
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        //Maintaining the vars list for semantic error reporting
        String id = ctx.getChild(0).getText();
        if(vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " allready declared(" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        String type = ctx.getChild(2).getText();
        int value = Integer.parseInt(ctx.NUM().getText()); //Alternative to getting by type 'NUM'
        return new VariableDeclaration(id, type, value);

    }

    @Override
    public Expression visitMultiplication(ExprParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0)); //recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override
    public Expression visitAddition(ExprParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0)); //recursively visit the left subtree of the current Multiplication node
        Expression right = visit(ctx.getChild(2));
        return new Addition(left, right);
    }

    @Override
    public Expression visitVariable(ExprParser.VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine(); //Duplication (we can factor this out)
        int column = idToken.getCharPositionInLine() + 1; //Duplication (we can factor this out)

        String id = ctx.getChild(0).getText();
        if(!vars.contains(id)){
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }
        return new Variable(id);
    }

    @Override
    public Expression visitNumber(ExprParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText(); //Gets the text from the ctx child of index 0
        int num = Integer.parseInt(numText); //converts the string text into int
        return new Number(num); //returns the number as type Number (from our model class)
    }
}
