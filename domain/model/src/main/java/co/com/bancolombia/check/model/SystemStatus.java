package co.com.bancolombia.check.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SystemStatus {

    private final String status;

    public SystemStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
