package cv_rest_ms.domain.model;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDate;

@Getter
@Builder
public class Education {

    private final String institutionName;
    private final String degreeObtained;
    private final LocalDate startDate;
    private final LocalDate endDate;
}