package com.cts.module4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {

        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);

    }
}