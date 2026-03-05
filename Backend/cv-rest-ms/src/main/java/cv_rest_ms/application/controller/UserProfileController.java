package cv_rest_ms.application.controller;

import cv_rest_ms.application.dto.response.UserProfileResponseDTO;
import cv_rest_ms.application.usecase.GetUserProfileUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserProfileController {

    private final GetUserProfileUseCase useCase;

    @GetMapping("/{id}/profile")
    public ResponseEntity<UserProfileResponseDTO> getProfile(@PathVariable Long id) {

        return ResponseEntity.ok(useCase.execute(id));

    }
}
