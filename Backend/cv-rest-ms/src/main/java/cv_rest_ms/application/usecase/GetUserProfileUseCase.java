package cv_rest_ms.application.usecase;

import cv_rest_ms.domain.repository.UserProfileRepository;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserProfileUseCase {

    private final UserProfileRepository repository;

    public JsonNode execute(Long userId) {
        return repository.getCompleteProfile(userId);
    }
}