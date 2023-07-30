package org.example.model;

import org.example.logic.Context;
import org.example.logic.MathExpression;

public class TerminalDevideExpression implements MathExpression {

    @Override
    public void interpret(Context context) {
        Integer secondMember = context.pop();
        Integer firstMember = context.pop();
        context.push(firstMember/secondMember);
    }
}
