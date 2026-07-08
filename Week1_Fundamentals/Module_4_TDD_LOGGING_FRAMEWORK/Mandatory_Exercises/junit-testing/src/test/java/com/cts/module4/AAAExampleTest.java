package com.cts.module4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AAAExampleTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {

        calculator = new Calculator();

        System.out.println("Setup");

    }

    @AfterEach
    void tearDown() {

        System.out.println("Teardown");

    }

    @Test
    void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a,b);

        // Assert
        assertEquals(30,result);

    }
}