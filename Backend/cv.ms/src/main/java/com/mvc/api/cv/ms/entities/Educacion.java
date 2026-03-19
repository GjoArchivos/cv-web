package com.mvc.api.cv.ms.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="education")
public class Educacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="education_id")
	private Long educationId;
	
	@Column(name="institution_name")
    private String institutionName;
	
	@Column(name="degree_obtained")
    private String degreeObtained;
	
	@Column(name="start_date")
    private LocalDate startDate;
	@Column(name="end_date")
    private LocalDate endDate;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private Usuarios usuarios;
}
