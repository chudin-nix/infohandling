package org.example.logic;

import org.example.model.Component;
import org.example.model.Composite;

public class LexemeParser implements Parser{

    @Override
    public Component parse(String text) {
        Composite composite = new Composite();
        String[] parts = text.split("\\s");
        for (String part : parts) {
            Component componentPart = new Composite(part);
            composite.add(componentPart);
        }
        return composite;
    }
}
