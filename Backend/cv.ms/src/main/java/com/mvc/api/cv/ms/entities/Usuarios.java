package com.mvc.api.cv.ms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class Usuarios {

	@Id
	@NotNull
	@Column(name="user_id")
	private Long userId;
	@Column(name="name")
    private String nombre;
	@Column(name="last_name_one")
	private String apellidoUno;
	@Column(name="last_name_two")
	private String apellidoDos;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String telefono;
    
}
