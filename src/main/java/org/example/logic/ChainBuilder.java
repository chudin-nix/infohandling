package org.example.logic;

public class ChainBuilder {

    public Parser build() {
        //тут в сентенсе парсер передается null
        return new ParagraphParser(new SentenceParser(new LexemeParser()));
    }
}