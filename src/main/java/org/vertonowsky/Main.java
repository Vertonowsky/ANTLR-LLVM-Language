package org.vertonowsky;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.vertonowsky.gen.WolaczLexer;
import org.vertonowsky.gen.WolaczParser;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Provide input file!");
            System.exit(1);
        }

        CharStream input = CharStreams.fromFileName(args[0]);

        WolaczLexer lexer = new WolaczLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WolaczParser parser = new WolaczParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());

        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

        String llvmCode = LLVMGenerator.generate(LLVMActions.consts);
        System.out.println(llvmCode);

        try (PrintWriter writer = new PrintWriter("wolacz.ll")) {
            writer.write(llvmCode);
        }
    }

}
