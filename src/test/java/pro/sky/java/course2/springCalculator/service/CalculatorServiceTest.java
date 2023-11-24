package pro.sky.java.course2.springCalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plus() {
        int num1 = 5;
        int num2 = 5;
        int expected = num1 + num2;

        Integer actual = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minus() {
        int num1 = 5;
        int num2 = 5;
        int expected = num1 - num2;

        Integer actual = calculatorService.minus(num1, num2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiply() {
        int num1 = 5;
        int num2 = 5;
        int expected = num1 * num2;

        Integer actual = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide() throws IllegalArgumentException {
        int num1 = 5;
        int num2 = 5;
        int expected = num1 / num2;

        double actual = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideByZero() throws IllegalArgumentException {
        int num1 = 5;
        int num2 = 0;

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    calculatorService.divide(num1, num2);
                }
        );
    }
}