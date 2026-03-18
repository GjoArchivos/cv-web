package com.mvc.api.cv.ms.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mvc.api.cv.ms.entities.Certificaciones;
import com.mvc.api.cv.ms.entities.Cursos;
import com.mvc.api.cv.ms.entities.Educacion;
import com.mvc.api.cv.ms.entities.Experiencias;
import com.mvc.api.cv.ms.entities.Perfiles;
import com.mvc.api.cv.ms.entities.Usuarios;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class CvResponseDTO {

	private Long id;
	@JsonProperty("full_name")
    private String fullName;
    private String email;
    private String phone;
    
    private List<Perfiles> perfiles;
	private List<Usuarios> usuarios;
    private List<Experiencias> experiencias;
    private List<Educacion> educacion;
    private List<Cursos> cursos;
    private List<Certificaciones> certificaciones;
}
