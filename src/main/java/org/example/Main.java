package org.example;// Intro to ANTLR+LLVM
// sawickib, 2014-04-26

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.classes.LangXLexer;
import org.example.classes.LangXParser;

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

        ParseTree tree = parser.prog();

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);
    }
}
