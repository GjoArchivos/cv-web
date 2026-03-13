package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class CertificationDTO {

    private String issuer;
    private String title;
    @JsonProperty("end_date")
    private LocalDate endDate;
    @JsonProperty("expiration_date")
    private LocalDate expirationDate;
}