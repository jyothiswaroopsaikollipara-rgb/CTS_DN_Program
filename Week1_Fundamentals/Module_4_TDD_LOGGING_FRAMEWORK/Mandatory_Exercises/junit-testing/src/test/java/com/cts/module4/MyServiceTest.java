package com.cts.module4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testMockingAndStubbing() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        // Act
        String result = service.fetchData();

        // Assert
        assertEquals("Mock Data", result);

    }

    @Test
    void testVerifyInteraction() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();

        // Assert
        verify(mockApi).getData();

    }

}