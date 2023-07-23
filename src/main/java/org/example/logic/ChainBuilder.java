package org.example.logic;

import org.example.logic.ParagraphParser;
import org.example.logic.Parser;
import org.example.logic.TextParser;

public class ChainBuilder {
    public Parser build() {
        return new TextParser(new ParagraphParser(null));
    }
}
