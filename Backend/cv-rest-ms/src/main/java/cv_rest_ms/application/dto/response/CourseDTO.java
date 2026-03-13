package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class CourseDTO {

	@JsonProperty("course_name")
    private String courseName;
    private String provider;
    @JsonProperty("end_date")
    private LocalDate endDate;
}