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
@Table(name="courses")
public class Cursos {

	@Id
	@Column(name="course_id")
	private Long courseId;
	@Column(name="course_name")
    private String courseName;
    private String provider;
    @Column(name="end_date")
    private LocalDate endDate;
}
