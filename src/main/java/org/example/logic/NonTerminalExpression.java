package org.example.logic;

public class NonTerminalExpression implements MathExpression{
    private int number;

    public NonTerminalExpression(int number) {
        this.number = number;
    }
    @Override
    public void interpret(Context context) {
        context.push(number);
    }
}
