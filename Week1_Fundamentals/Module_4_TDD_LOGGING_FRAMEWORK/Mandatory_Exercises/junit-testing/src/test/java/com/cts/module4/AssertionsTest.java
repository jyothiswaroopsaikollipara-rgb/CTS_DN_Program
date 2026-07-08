package com.cts.module4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testAssertions() {

        // Equals
        assertEquals(5,2+3);

        // True
        assertTrue(5>3);

        // False
        assertFalse(5<3);

        // Null
        assertNull(null);

        // Not Null
        assertNotNull(new Object());

    }
}