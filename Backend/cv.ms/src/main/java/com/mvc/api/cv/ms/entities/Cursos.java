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
@Table(name="courses")
public class Cursos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
	private Long courseId;
	
	@Column(name="course_name")
    private String courseName;
	
    private String provider;
    
    @Column(name="end_date")
    private LocalDate endDate;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private Usuarios usuarios;
}
