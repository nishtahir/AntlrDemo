package com.company;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        csvLexer lexer = new csvLexer(new ANTLRFileStream("test.txt"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        csvParser parser = new csvParser(tokenStream);
        ParserRuleContext tree =  parser.parse();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        csvListener extractor = new csvListener() {
            @Override
            public void enterParse(csvParser.ParseContext ctx) {

            }

            @Override
            public void exitParse(csvParser.ParseContext ctx) {

            }

            @Override
            public void enterLine(csvParser.LineContext ctx) {
                //Everything in the line as is
                System.out.println(ctx.getText());

                //List of TEXT in the line
                List<TerminalNode> content = ctx.TEXT();
                for(TerminalNode node : content){
                    System.out.println(node.getText());
                }
            }

            @Override
            public void exitLine(csvParser.LineContext ctx) {

            }

            @Override
            public void visitTerminal(TerminalNode terminalNode) {

            }

            @Override
            public void visitErrorNode(ErrorNode errorNode) {

            }

            @Override
            public void enterEveryRule(ParserRuleContext parserRuleContext) {

            }

            @Override
            public void exitEveryRule(ParserRuleContext parserRuleContext) {

            }
        };

        parseTreeWalker.walk(extractor, tree);
    }
}
