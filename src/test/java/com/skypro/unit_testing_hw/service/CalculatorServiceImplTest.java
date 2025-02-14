package com.skypro.unit_testing_hw.service;

import com.skypro.unit_testing_hw.exceptions.DivideByZeroException;
import com.skypro.unit_testing_hw.exceptions.NotEnoughArgumentsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void plus() {

        Integer num1 = 6;
        Integer num2 = 2;
        Integer num3 = 8;
        Integer num4 = 4;

        int expected = num1 + num2;
        int expected2 = num3 + num4;

        int actual = calculatorService.plus(num1, num2);
        int actual2 = calculatorService.plus(num3, num4);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }

    @Test
    public void minus() {

        Integer num1 = 6;
        Integer num2 = 2;
        Integer num3 = 8;
        Integer num4 = 4;

        int expected = num1 - num2;
        int expected2 = num3 - num4;

        int actual = calculatorService.minus(num1, num2);
        int actual2 = calculatorService.minus(num3, num4);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }

    @Test
    public void multiply() {

        Integer num1 = 6;
        Integer num2 = 2;
        Integer num3 = 8;
        Integer num4 = 4;

        int expected = num1 * num2;
        int expected2 = num3 * num4;

        int actual = calculatorService.multiply(num1, num2);
        int actual2 = calculatorService.multiply(num3, num4);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }

    @Test
    public void divide() {

        Integer num1 = 6;
        Integer num2 = 2;
        Integer num3 = 8;
        Integer num4 = 4;

        int expected = num1 / num2;
        int expected2 = num3 / num4;

        int actual = calculatorService.divide(num1, num2);
        int actual2 = calculatorService.divide(num3, num4);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }

    @Test
    public void divideByZero() {

        Integer num1 = 6;
        Integer num2 = 0;

        assertThrows(DivideByZeroException.class, () -> calculatorService.divide(num1, num2));
    }

    @Test
    public void notEnoughArguments() {

        Integer num1 = 6;
        Integer num2 = null;

        assertThrows(NotEnoughArgumentsException.class, () -> calculatorService.divide(num1, num2));
    }
}
