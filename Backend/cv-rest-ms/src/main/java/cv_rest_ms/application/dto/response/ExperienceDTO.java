package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class ExperienceDTO {

    private Long id;
    private String company;
    private String position;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    private List<String> activities;
    private List<String> technologies;
}