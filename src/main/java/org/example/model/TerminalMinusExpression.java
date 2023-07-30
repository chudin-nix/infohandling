package org.example.model;

import org.example.logic.Context;
import org.example.logic.MathExpression;

public class TerminalMinusExpression implements MathExpression {

    @Override
    public void interpret(Context context) {
        context.push(-context.pop() + context.pop());
    }
}
