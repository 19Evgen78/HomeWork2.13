package pro.sky.java.course2.springCalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorParameterizedTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("ArgumentsPlus")
    public void ArgumentsPlus(int num1, int num2) {
        int expected = num1 + num2;

        Integer actual = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> ArgumentsPlus() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(-5, 5),
                Arguments.of(0, 0),
                Arguments.of(-5, -5)
        );
    }

    @ParameterizedTest
    @MethodSource("ArgumentsMinus")
    public void minus(int num1, int num2) {
        int expected = num1 - num2;

        Integer actual = calculatorService.minus(num1, num2);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> ArgumentsMinus() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(-5, 5),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("ArgumentsMultiply")
    public void multiply(int num1, int num2) {
        int expected = num1 * num2;

        Integer actual = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> ArgumentsMultiply() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(-5, 5),
                Arguments.of(0, 0),
                Arguments.of(-5, -5)
        );
    }

    @ParameterizedTest
    @MethodSource("ArgumentsDivide")
    public void divide(int num1, int num2) {
        int expected = num1 / num2;

        double actual = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> ArgumentsDivide() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(-5, 5),
                //Arguments.of(0, 0),
                Arguments.of(-5, -5)
        );
    }
}
