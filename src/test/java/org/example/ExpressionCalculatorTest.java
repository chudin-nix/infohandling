package org.example;

import org.example.logic.ExpressionCalculator;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionCalculatorTest {

    private static final String FIRST_VALID_EXPRESSION = "[ 2 2 + 2 ]"; // (2+2)*2
    private static final Integer ANSWER_TO_FIRST_VALID_EXPRESSION = 8;
    private static final String SECOND_VALID_EXPRESSION = "[ 8 8 5 * + 1 3 2 * + 4 - /]"; // ((8+2)*5)/(1+3*2-4)
    private static final Integer ANSWER_TO_SECOND_VALID_EXPRESSION = 6;

    private final ExpressionCalculator expressionCalculator = new ExpressionCalculator();
    @Test
    public void testCalculateShouldCalculateExpressionWhenTheFirstValidExpressionPassed() {
        //given

        //when
        Integer actualAnswer = expressionCalculator.calculate(FIRST_VALID_EXPRESSION);

        //then
        Assert.assertEquals(ANSWER_TO_FIRST_VALID_EXPRESSION, actualAnswer);
    }

    @Test
    public void testCalculateShouldCalculateExpressionWhenTheSecondValidExpressionPassed() {
        //given

        //when
        Integer actualAnswer = expressionCalculator.calculate(SECOND_VALID_EXPRESSION);

        //then
        Assert.assertEquals(ANSWER_TO_SECOND_VALID_EXPRESSION, actualAnswer);
    }
}
