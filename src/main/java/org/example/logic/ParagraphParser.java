package org.example.logic;

import org.example.model.Component;
import org.example.model.Composite;

public class ParagraphParser extends AbstractParser {

    private static final String PARAGRAPH_REGEXP = "\n";
    public ParagraphParser(Parser successor) {
        super(successor);
//        моя старая реализация, надо будет удалить
//        SentenceParser parser = (SentenceParser) successor;
//        this.parse(parser.getText());
    }

    //todo во всех классах парсерах этот код повторяется, поэтому мы нарушаем принцип dry - don't repeat yourself нужно вынести
    //todo нужно вынести в отдельный класс или в отдельный метод сделать на шаблону template метод
    @Override
    public Component parse(String text) {
//        SentenceParser sentenceParser = (SentenceParser) getSuccessor();
//        text = sentenceParser.getText();
        Composite composite = new Composite();
        String[] parts = text.split(PARAGRAPH_REGEXP);
        for (String part : parts) {
            Component componentPart = getSuccessor().parse(part);
            composite.add(componentPart);
        }
        return composite;
    }
}
