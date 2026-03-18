package com.mvc.api.cv.ms.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="education")
public class Educacion {
	@Id
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
}
