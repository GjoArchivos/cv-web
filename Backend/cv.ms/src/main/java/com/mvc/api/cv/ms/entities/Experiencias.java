package com.mvc.api.cv.ms.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="experiences")
public class Experiencias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="experience_id")
	private Long experienceId;
    private String company;
    private String position;
    private String description;
    @Column(name="start_Date")
    private LocalDate startDate;
    @Column(name="end_date")
    private LocalDate endDate;

    // ManyToOne → Usuarios
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Usuarios usuarios;
    
    // OneToMany → Actividades
    @OneToMany(mappedBy = "experiencias", cascade = CascadeType.ALL)
    private List<Actividades> actividades;
    
    // ManyToMany → Tecnologias
    @ManyToMany
    @JoinTable(
        name = "experience_technologies",
        joinColumns = @JoinColumn(name = "experience_id"),
        inverseJoinColumns = @JoinColumn(name = "technology_id")
    )
    private List<Tecnologias> tecnologias;
    
}
