package cv_rest_ms.domain.repository;

import com.fasterxml.jackson.databind.JsonNode;

public interface UserProfileRepository {

    JsonNode getCompleteProfile(Long userId);
}
