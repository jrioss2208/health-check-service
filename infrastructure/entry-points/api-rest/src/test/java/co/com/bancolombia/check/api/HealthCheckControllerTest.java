package co.com.bancolombia.check.api;

import co.com.bancolombia.check.model.SystemStatus;
import co.com.bancolombia.check.usecase.CheckSystemHealthUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class HealthCheckControllerTest {

    private CheckSystemHealthUseCase healthUseCase;
    private HealthCheckController controller;

    @BeforeEach
    void setUp() {
        healthUseCase = mock(CheckSystemHealthUseCase.class);
        controller = new HealthCheckController(healthUseCase);
    }

    @Test
    void shouldReturnSystemStatusOk() {
        // Arrange
        SystemStatus expectedStatus = new SystemStatus("OK");
        when(healthUseCase.checkHealth()).thenReturn(expectedStatus);

        // Act
        SystemStatus result = controller.getHealthStatus();

        // Assert
        assertNotNull(result, "El resultado no debe ser nulo");
        assertEquals("OK", result.getStatus(), "El estado debe ser OK");

        // Verify
        verify(healthUseCase, times(1)).checkHealth();
    }

    @Test
    void shouldCallUseCaseOnce() {
        // Arrange
        when(healthUseCase.checkHealth()).thenReturn(new SystemStatus("UP"));

        // Act
        controller.getHealthStatus();

        // Assert
        verify(healthUseCase, times(1)).checkHealth();
        verifyNoMoreInteractions(healthUseCase);
    }
}