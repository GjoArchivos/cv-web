package cv_rest_ms.domain.model;

import lombok.Builder;
import lombok.Getter;
import java.util.List;

@Getter
@Builder
public class UserProfile {

    private final Long id;
    private final String fullName;
    private final String email;
    private final String phone;
    private final String linkedinUrl;
    private final String githubUrl;
    private final String portfolioUrl;

    private final List<Experience> experiences;
    private final List<Education> education;
    private final List<Course> courses;
    private final List<Certification> certifications;
}