package com.skypro.unit_testing_hw.service;

import com.skypro.unit_testing_hw.exceptions.DivideByZeroException;
import com.skypro.unit_testing_hw.exceptions.NotEnoughArgumentsException;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgumentsException("Введите оба значения!");
        }
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgumentsException("Введите оба значения!");
        }
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgumentsException("Введите оба значения!");
        }
        return num1 * num2;
    }

    @Override
    public int divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgumentsException("Введите оба значения!");
        }
        if (num2 == 0) {
            throw new DivideByZeroException("Деление на ноль невозможно!");
        }
        return num1 / num2;
    }
}
