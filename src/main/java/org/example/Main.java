package org.example;

import org.example.logic.LexemeParser;
import org.example.logic.ParagraphParser;
import org.example.logic.Parser;
import org.example.logic.TextParser;

public class Main {
    public static void main(String[] args) {
        String textPath = "It has survived - not only (five) centuries, but also the leap into [13 2 +] electronic typesetting, remaining [3 5 +] essentially [15 3 /] unchanged.\n" +
                "\n" +
                "It was popularised in the [5 * x] with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop\n" +
                "\n" +
                "publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
                "\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using [2 3 * y +] Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here, making it look like readable English.\n" +
                "\n" +
                "It is a [1200 5 /] established fact that a reader will be of a page when looking at its layout.\n" +
                "\n" +
                "Bye.";
        Parser lexemeParser = new LexemeParser();
        lexemeParser.parse(textPath);
        Parser paragraphParser = new ParagraphParser(lexemeParser);
        TextParser textParser = new TextParser(paragraphParser);
    }
}