package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class CertificationDTO {

    private String issuer;
    private String title;
    private LocalDate endDate;
    private LocalDate expirationDate;
}