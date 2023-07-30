package org.example.logic;

import org.example.model.Component;
import org.example.model.Composite;
import org.example.model.Lexeme;
import org.example.model.LexemeType;

public class LexemeParser implements Parser{

    private final static String LEXEME_REGEXP = "\\[.+\\]";


    @Override
    public Component parse(String text) {
        Composite composite = new Composite();
        String[] parts = text.split(LEXEME_REGEXP);
        for (String part : parts) {
            Component componentPart = new Lexeme(part, LexemeType.EXPRESSION);
            composite.add(componentPart);
            //If part matches pattern \[\.+\] then create Lexeme with expression type
            //else create word Lexeme
        }
        return composite;
    }
}
