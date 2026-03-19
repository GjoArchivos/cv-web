package com.mvc.api.cv.ms.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class Usuarios {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;
    private String nombre;
	@Column(name="last_name_one")
	private String apellidoUno;
	@Column(name="last_name_two")
	private String apellidoDos;
	private String email;
	@Column(name="phone")
	private String telefono;
	@Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    // 1:1 Profile
    @OneToOne(mappedBy = "usuarios", cascade = CascadeType.ALL)
    private Perfiles profile;

    // 🔥 1:N
    @OneToMany(mappedBy = "usuarios")
    private List<Experiencias> experiencias;

    @OneToMany(mappedBy = "usuarios")
    private List<Educacion> educacion;

    @OneToMany(mappedBy = "usuarios")
    private List<Cursos> cursos;

    @OneToMany(mappedBy = "usuarios")
    private List<Certificaciones> certificaciones;
}
