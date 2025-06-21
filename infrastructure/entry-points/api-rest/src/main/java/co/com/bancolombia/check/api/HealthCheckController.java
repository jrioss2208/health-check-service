package co.com.bancolombia.check.api;

import co.com.bancolombia.check.model.SystemStatus;
import co.com.bancolombia.check.usecase.CheckSystemHealthUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private final CheckSystemHealthUseCase healthUseCase;

    // Inyección por constructor
    public HealthCheckController(CheckSystemHealthUseCase healthUseCase) {
        this.healthUseCase = healthUseCase;
    }

    @GetMapping("/health")
    public SystemStatus getHealthStatus() {
        return healthUseCase.checkHealth();
    }
}
