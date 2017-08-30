package com.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) {
        jsonLexer lexer = new jsonLexer(CharStreams.fromString("{\n" +
                "  name : true,}"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        jsonParser parser = new jsonParser(tokenStream);
        parser.file();
    }
}
