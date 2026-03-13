package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class EducationDTO {

	@JsonProperty("institution_name")
    private String institutionName;
	@JsonProperty("degree_obtained")
    private String degreeObtained;
    @JsonProperty("start_date")
    private LocalDate startDate;
    @JsonProperty("end_date")
    private LocalDate endDate;
}