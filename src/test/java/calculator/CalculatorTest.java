package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        // Проверка сложения
        assertEquals(5, Calculator.doCalc(2, "+", 3));
    }

    @Test
    void testSubtraction() {
        // Проверка вычитания
        assertEquals(1, Calculator.doCalc(4, "-", 3));
    }

    @Test
    void testMultiplication() {
        // Проверка умножения
        assertEquals(12, Calculator.doCalc(4, "*", 3));
    }

    @Test
    void testDivision() {
        // Проверка деления
        assertEquals(2, Calculator.doCalc(6, "/", 3));
    }

    @Test
    void testDivisionByZero() {
        // Проверка деления на 0
        assertEquals(0, Calculator.doCalc(6, "/", 0));
    }

    @Test
    void testUnknownOperator() {
        // Проверка неизвестного оператора
        assertEquals(0, Calculator.doCalc(6, "%", 3));
    }
}
