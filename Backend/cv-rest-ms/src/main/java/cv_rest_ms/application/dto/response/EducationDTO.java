package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class EducationDTO {

    private String institutionName;
    private String degreeObtained;
    private LocalDate startDate;
    private LocalDate endDate;
}