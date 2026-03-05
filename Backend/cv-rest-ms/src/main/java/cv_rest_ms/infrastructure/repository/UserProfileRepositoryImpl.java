package cv_rest_ms.infrastructure.repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import cv_rest_ms.domain.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserProfileRepositoryImpl implements UserProfileRepository {

    private final JdbcTemplate jdbcTemplate;
    private final ObjectMapper objectMapper;

    @Override
    public JsonNode getCompleteProfile(Long userId) {

        String sql = "SELECT get_user_complete_profiles(?)";

        String jsonResult = jdbcTemplate.queryForObject(
                sql,
                new Object[]{userId},
                String.class
        );

        try {
            return objectMapper.readTree(jsonResult);
        } catch (Exception e) {
            throw new RuntimeException("Error parsing JSON", e);
        }
    }
}
