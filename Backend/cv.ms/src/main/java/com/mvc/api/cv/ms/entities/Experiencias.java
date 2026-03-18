package com.mvc.api.cv.ms.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="experiences")
public class Experiencias {
	@Id
	@Column(name="experience_id")
	private Long experienceId;
	@Column(name="company")
    private String company;
	@Column(name="position")
    private String position;
	@Column(name="description")
    private String description;
    @Column(name="start_Date")
    private LocalDate startDate;
    @Column(name="end_date")
    private LocalDate endDate;

    private List<String> activities;
    private List<String> technologies;
}
