package com.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        JsonLexer lexer = new JsonLexer(CharStreams.fromString("{\n" +
                "  name : true}"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JsonParser parser = new JsonParser(tokenStream);
        parser.json();
    }
}
