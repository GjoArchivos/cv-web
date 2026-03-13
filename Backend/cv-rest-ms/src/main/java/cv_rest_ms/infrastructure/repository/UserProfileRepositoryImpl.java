package cv_rest_ms.infrastructure.repository;


import cv_rest_ms.domain.exception.UserNotFoundException;
import cv_rest_ms.domain.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserProfileRepositoryImpl implements UserProfileRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public String getCompleteProfile(Long userId) {

        String sql = "SELECT get_user_complete_profiles(?)";

        String result = jdbcTemplate.queryForObject(
                sql,
                new Object[]{userId},
                String.class
        );

        if (result == null) {
            throw new UserNotFoundException(userId);
        }

        return result;
    }
}
