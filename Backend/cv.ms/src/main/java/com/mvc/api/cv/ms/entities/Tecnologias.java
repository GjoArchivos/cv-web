package com.mvc.api.cv.ms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "technologies")
public class Tecnologias {

	@Id
	@Column(name="technology_id")
	private Long technologyId;
	private String name;
}
