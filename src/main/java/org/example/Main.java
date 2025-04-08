package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.classes.LangXLexer;
import org.example.classes.LangXParser;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.err.println("Provide input file!");
            System.exit(1);
        }

        CharStream input = CharStreams.fromFileName(args[0]);

        LangXLexer lexer = new LangXLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangXParser parser = new LangXParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());

        ParseTree tree = parser.program();

        //System.out.println(tree.toStringTree(parser));

        LLVMActions actions = new LLVMActions();
        actions.generator.startModule();
        actions.visit(tree);
        actions.generator.endModule();


        String llvmCode = actions.getLLVM();
        System.out.println(llvmCode);

        try (PrintWriter writer = new PrintWriter("wolacz.ll")) {
            writer.write(llvmCode);
        }
    }
}
