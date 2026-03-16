package com.mvc.api.cv.ms.dtos;

import jakarta.validation.constraints.NotNull;

public class UsuariosDTO {

	@NotNull(message = "User ID cannot be null")
    private Long userId;
}
