package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5, Calculator.doCalc(2, "+", 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, Calculator.doCalc(4, "-", 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, Calculator.doCalc(4, "*", 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, Calculator.doCalc(6, "/", 3));
    }

    @Test
    void testDivisionByZero() {
        assertEquals(0, Calculator.doCalc(6, "/", 0));
    }

    @Test
    void testUnknownOperator() {
        assertEquals(0, Calculator.doCalc(6, "%", 3));
    }
}
