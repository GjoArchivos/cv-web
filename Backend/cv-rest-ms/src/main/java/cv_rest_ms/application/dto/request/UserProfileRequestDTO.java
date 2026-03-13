package cv_rest_ms.application.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserProfileRequestDTO {

    @NotNull(message = "User ID cannot be null")
    private Long userId;
}