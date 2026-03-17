package com.mvc.api.cv.ms.dtos;

import java.util.List;

import lombok.Data;

@Data
public class CvResponseDTO {

	private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String linkedinUrl;
    private String githubUrl;
    private String portfolioUrl;

    private List<ExperienciasDTO> experiences;
    private List<EducacionDTO> education;
    private List<CursosDTO> courses;
    private List<CertificacionesDTO> certifications;
}
