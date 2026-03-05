package cv_rest_ms.application.usecase;

import cv_rest_ms.application.dto.response.UserProfileResponseDTO;
import cv_rest_ms.application.mapper.UserProfileMapper;
import cv_rest_ms.domain.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserProfileUseCase {

    private final UserProfileRepository repository;
    private final UserProfileMapper mapper;

    public UserProfileResponseDTO execute(Long userId) {

        String json = repository.getCompleteProfile(userId);

        return mapper.toResponse(json);
    }
}