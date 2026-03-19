package com.mvc.api.cv.ms.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "technologies")
public class Tecnologias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="technology_id")
	private Long technologyId;
	
	private String name;
	
	 // Relación inversa (opcional)
    @ManyToMany(mappedBy = "tecnologias")
    private List<Experiencias> experiencias;
}
