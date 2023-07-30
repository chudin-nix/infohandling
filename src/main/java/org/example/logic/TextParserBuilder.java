package org.example.logic;

public class TextParserBuilder {

    //пока написал так, это заглушка скопировал из chainbulder
    public Parser build () {
        return new ParagraphParser(new SentenceParser(new LexemeParser()));
    }
}
