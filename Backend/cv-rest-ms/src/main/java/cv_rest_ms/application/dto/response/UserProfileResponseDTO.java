package cv_rest_ms.application.dto.response;

import lombok.Data;
import java.util.List;

@Data
public class UserProfileResponseDTO {

    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String linkedinUrl;
    private String githubUrl;
    private String portfolioUrl;

    private List<ExperienceDTO> experiences;
    private List<EducationDTO> education;
    private List<CourseDTO> courses;
    private List<CertificationDTO> certifications;
}