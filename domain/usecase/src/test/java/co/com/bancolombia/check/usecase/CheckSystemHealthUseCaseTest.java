package co.com.bancolombia.check.usecase;

import co.com.bancolombia.check.model.SystemStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CheckSystemHealthUseCaseTest {

    private final CheckSystemHealthUseCase useCase = new CheckSystemHealthUseCase();

    @Test
    void shouldReturnSystemStatusOk() {
        // Act
        SystemStatus result = useCase.checkHealth();

        // Assert
        assertNotNull(result, "El resultado no debe ser null");
        assertEquals("OK", result.getStatus(), "El estado debe ser 'OK'");
    }
}
