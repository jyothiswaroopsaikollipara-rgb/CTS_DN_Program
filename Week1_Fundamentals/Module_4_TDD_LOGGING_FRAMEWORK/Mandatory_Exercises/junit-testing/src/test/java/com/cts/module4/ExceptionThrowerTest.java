package com.cts.module4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testException() {

        assertThrows(
                ArithmeticException.class,
                () -> {

                    ExceptionThrower exceptionThrower =
                            new ExceptionThrower();

                    exceptionThrower.throwException();

                }
        );

    }

}