import gen.*;
import ast.abstracts.Node;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import service.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("     _______.     ___       _______  _______   ______ \n" +
                "    /       |    /   \\     |   ____||   ____| /      |\n" +
                "   |   (----`   /  ^  \\    |  |__   |  |__   |  ,----'\n" +
                "    \\   \\      /  /_\\  \\   |   __|  |   __|  |  |     \n" +
                ".----)   |    /  _____  \\  |  |     |  |____ |  `----.\n" +
                "|_______/    /__/     \\__\\ |__|     |_______| \\______|\n");





        System.out.println("Do you want to Generate Assembler(1) or Generate C (2)?");
        System.out.print("> ");
        int choice = scanner.nextInt();

        //Assembler Generator
        if(choice == 1){
            //LEXER
            CharStream charStream = CharStreams.fromFileName("input/assemblertest.txt");
            SafeCLexer SafeCLexer = new SafeCLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

            //PARSER
            SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
            ParseTree parseTree = SafeCParser.aexpr();

            //FROM CST TO AST
            CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
            Node ASTTree = cstToASTVisitor.visit(parseTree);

            //PRETTY PRINT
            //ASTTree.accept(new PrettyPrint());

            //SYMBOL TABLE FILLING
            SymbolTable symbolTable = new SymbolTable();
            ASTTree.accept(new SymbolTableFill(symbolTable));

            CodeGenAssembler codeGen = new CodeGenAssembler();
            codeGen.setup();
            ASTTree.accept(codeGen);

            /*codeGen.setupMain(codeGen.main);
            System.out.println(codeGen.getlibs());
            System.out.println(codeGen.main.toString());
            System.out.println(codeGen.codeGen.toString());*/
            codeGen.printFinalCode();

        //C Generator
        }else if(choice == 2){
            //LEXER
            CharStream charStream = CharStreams.fromFileName("input/example.txt");
            SafeCLexer SafeCLexer = new SafeCLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

            //PARSER
            SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
            ParseTree parseTree = SafeCParser.prog();

            //FROM CST TO AST
            CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
            Node ASTTree = cstToASTVisitor.visit(parseTree);

            //PRETTY PRINT
            //ASTTree.accept(new PrettyPrint());

            //SYMBOL TABLE FILLING
            SymbolTable symbolTable = new SymbolTable();
            ASTTree.accept(new SymbolTableFill(symbolTable));

            StringBuilder gatherAllBuilds = new StringBuilder();
            CodeGenC codeGen = new CodeGenC();

            ASTTree.accept(codeGen);
            codeGen.setupMain(codeGen.main);

            //Combine all builds
            gatherAllBuilds.append(codeGen.getlibs());
            gatherAllBuilds.append(codeGen.struct);
            gatherAllBuilds.append(codeGen.codeGen);
            gatherAllBuilds.append(codeGen.main);

            //Write to file
            try {
                FileWriter myWriter = new FileWriter("output/output.txt");
                myWriter.write(String.valueOf(gatherAllBuilds));
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            //System.out.println(gatherAllBuilds);

            /*
            System.out.println(codeGen.struct.toString());
            System.out.println(String.valueOf(codeGen.getlibs()));
            System.out.println(codeGen.main.toString());
            System.out.println(codeGen.codeGen.toString());
            */

            //System.out.println(symbolTable.symbolTable);
            System.out.println("C file can be found in output folder");
        }else {
            System.out.println("incorrect input");
        }




    }
}
