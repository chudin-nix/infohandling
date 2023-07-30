package org.example.logic;

import org.example.model.Component;
import org.example.model.Composite;

public class SentenceParser extends AbstractParser {

    private static final String SENTENCE_REGEXP = "(?<=[\\.\\?\\!(\\.\\.\\.)])\\w";

    public SentenceParser(Parser successor) {
        super(successor);
    }


    //todo логика написана не верно, нужно переделать под парсинг предложения
    @Override
    public Component parse(String text) {
        Composite composite = new Composite();
        String[] parts = text.split(SENTENCE_REGEXP);
        for (String part : parts) {
            Component paragraph = getSuccessor().parse(part);
            composite.add(paragraph);
        }
        return composite;
    }
}
