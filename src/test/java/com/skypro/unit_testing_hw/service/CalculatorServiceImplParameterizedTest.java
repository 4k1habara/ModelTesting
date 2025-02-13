package com.skypro.unit_testing_hw.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(6, 2),
                Arguments.of(100, 25));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void plus(Integer num1, Integer num2) {
        int expected = num1 + num2;
        int actual = calculatorService.plus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void minus(Integer num1, Integer num2) {
        int expected = num1 - num2;
        int actual = calculatorService.minus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void multiply(Integer num1, Integer num2) {
        int expected = num1 * num2;
        int actual = calculatorService.multiply(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void divide(Integer num1, Integer num2) {
        int expected = num1 / num2;
        int actual = calculatorService.divide(num1, num2);
        assertEquals(expected, actual);
    }
}
