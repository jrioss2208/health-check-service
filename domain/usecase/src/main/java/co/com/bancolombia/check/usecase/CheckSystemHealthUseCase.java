package co.com.bancolombia.check.usecase;

import co.com.bancolombia.check.model.SystemStatus;

public class CheckSystemHealthUseCase {

    public SystemStatus checkHealth() {
        return new SystemStatus("OK");
    }
}
