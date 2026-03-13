package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class ExperienceDTO {

    private Long id;
    private String company;
    private String position;
    private String description;
    @JsonProperty("start_date")
    private LocalDate startDate;
    @JsonProperty("end_date")
    private LocalDate endDate;

    private List<String> activities;
    private List<String> technologies;
}