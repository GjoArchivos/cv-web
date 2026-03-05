package cv_rest_ms.application.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import cv_rest_ms.application.dto.response.UserProfileResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserProfileMapper {

    private final ObjectMapper objectMapper;

    public UserProfileResponseDTO toResponse(String json) {
        try {
            return objectMapper.readValue(json, UserProfileResponseDTO.class);
        } catch (Exception e) {
            throw new RuntimeException("Error mapping JSON to DTO", e);
        }
    }
}