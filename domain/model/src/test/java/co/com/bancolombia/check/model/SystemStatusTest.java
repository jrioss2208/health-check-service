package co.com.bancolombia.check.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SystemStatusTest {

    @Test
    void shouldCreateSystemStatusWithGivenValue() {
        // Arrange
        String expectedStatus = "OK";

        // Act
        SystemStatus status = new SystemStatus(expectedStatus);

        // Assert
        assertNotNull(status, "El objeto no debe ser nulo");
        assertEquals("OK", status.getStatus(), "El estado debe ser 'OK'");
    }

    @Test
    void shouldReturnCorrectStatusValue() {
        // Arrange
        SystemStatus status = new SystemStatus("DOWN");

        // Act & Assert
        assertEquals("DOWN", status.getStatus(), "Debe retornar el valor 'DOWN'");
    }
}