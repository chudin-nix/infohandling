package org.example.logic;

import org.example.model.Composite;

import java.util.Map;

public class TextLogic {
    public Composite parse(String text) {
        TextParserBuilder builder = new TextParserBuilder();
        Parser parser = builder.build();
        //тут надо разобраться что не так, в видео такой проблемы нет
        return parser.parse(text);
        throw new UnsupportedOperationException();
    }

    //пересмотреть этот класс на 15 минуте видео, все методы нужно переписать
    public Composite calculate(Composite text, Map<String, Double> parameters) {

        throw new UnsupportedOperationException();
    }
    public Composite reverse(Composite text) {
        throw new UnsupportedOperationException();
    }
    public String restore(Composite text) {
        throw new UnsupportedOperationException();
    }
}
