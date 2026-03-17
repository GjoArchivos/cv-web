package com.mvc.api.cv.ms.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UsuariosDTO {

	@NotNull(message = "User ID cannot be null")
	private Long userId;
    private String fullName;
    private String email;
    private String phone;
    private String linkedinUrl;
    private String githubUrl;
    private String portfolioUrl;
}
