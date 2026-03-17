package com.mvc.api.cv.ms.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.api.cv.ms.dtos.CvResponseDTO;
import com.mvc.api.cv.ms.services.CvService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/cv")
@RequiredArgsConstructor
@Tag(name = "CV", description = "Servicio para obtener información del CV")
public class UserProfileController {

    private final CvService cvService;

    @Operation(summary = "Obtiene toda la información del CV")
    @GetMapping("/usuario/{id}")
    public ResponseEntity<CvResponseDTO> getCv(@PathVariable Long id) {

        return ResponseEntity.ok(cvService.getCv(id));

    }
}
