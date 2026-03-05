package cv_rest_ms.application.controller;

import cv_rest_ms.application.usecase.GetUserProfileUseCase;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserProfileController {

    private final GetUserProfileUseCase useCase;

    @GetMapping("/{id}/profile")
    public ResponseEntity<JsonNode> getCompleteProfile(
            @PathVariable("id") Long userId) {

        return ResponseEntity.ok(useCase.execute(userId));
    }
}
