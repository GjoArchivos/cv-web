package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class CourseDTO {

    private String courseName;
    private String provider;
    private LocalDate endDate;
}