package org.example.logic;

import org.example.model.TerminalDevideExpression;
import org.example.model.TerminalMinusExpression;
import org.example.model.TerminalMultiplyExpression;
import org.example.model.TerminalPlusExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpressionCalculator {
    private final List<MathExpression> mathExpressionList = new ArrayList<>();
    private static final String SPACE_REGEXP = " ";
    public Integer calculate(String expression) {
        mathExpressionList.clear();
        for (String lexeme : expression.split(SPACE_REGEXP)) {
            if (lexeme.isEmpty()) {
                continue;
            }
            switch (lexeme.charAt(0)) {
                case '+':
                    mathExpressionList.add(new TerminalPlusExpression());
                    break;
                case '-':
                    mathExpressionList.add(new TerminalMinusExpression());
                    break;
                case '*':
                    mathExpressionList.add(new TerminalMultiplyExpression());
                    break;
                case '/':
                    mathExpressionList.add(new TerminalDevideExpression());
                    break;
                default:
                    Scanner scanner = new Scanner(lexeme);
                    if (scanner.hasNextInt()) {
                        mathExpressionList.add(new NonTerminalExpression(scanner.nextInt()));
                    }
            }
        }
        return finalizeCalculation();
        throw new UnsupportedOperationException();
    }
    private Integer finaliseCalculation() {
        Context context = new Context();
        for (MathExpression expression: mathExpressionList) {

        }
    }
}
