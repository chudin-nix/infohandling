package org.example.model;

public class Lexeme implements Component {
    private String value;
    private LexemeType type;

    public Lexeme(String value, LexemeType type) {
        this.value = value;
        this.type = type;
    }

    public static Lexeme word(String value) {
        return new Lexeme(value, LexemeType.WORD);
    }

    public static Lexeme expression(String value) {
        return new Lexeme(value, LexemeType.EXPRESSION);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public Object getChild(int index) {
        return null;
    }

    @Override
    public void operation() {

    }

    @Override
    public void remove(Component component) {

    }
}
