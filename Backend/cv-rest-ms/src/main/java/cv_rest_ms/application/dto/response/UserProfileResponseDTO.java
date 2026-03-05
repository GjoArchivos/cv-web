package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


@Data
public class UserProfileResponseDTO {

    private Long id;
    @JsonProperty("full_name")
    private String fullName;
    private String email;
    private String phone;
    @JsonProperty("linkedin_url")
    private String linkedinUrl;
    @JsonProperty("github_url")
    private String githubUrl;
    @JsonProperty("portfolio_url")
    private String portfolioUrl;

    private List<ExperienceDTO> experiences;
    private List<EducationDTO> education;
    private List<CourseDTO> courses;
    private List<CertificationDTO> certifications;
}