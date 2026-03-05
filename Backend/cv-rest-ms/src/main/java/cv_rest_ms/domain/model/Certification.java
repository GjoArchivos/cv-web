package cv_rest_ms.domain.model;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDate;

@Getter
@Builder
public class Certification {

    private final String issuer;
    private final String title;
    private final LocalDate endDate;
    private final LocalDate expirationDate;
}