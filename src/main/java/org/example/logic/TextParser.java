package org.example.logic;

import org.example.model.Component;
import org.example.model.Composite;

public class TextParser extends AbstractParser {

    public TextParser(Parser successor) {
        super(successor);
    }

    @Override
    public Component parse(String text) {
        Composite composite = new Composite();
        String[] parts = text.split("\n");
        for (String part : parts) {
            Component paragraph = getSuccessor().parse(part);
            composite.add(paragraph);
        }
        return composite;
    }
}