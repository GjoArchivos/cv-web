package cv_rest_ms.domain.model;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDate;

@Getter
@Builder
public class Course {

    private final String courseName;
    private final String provider;
    private final LocalDate endDate;
}