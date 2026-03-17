package com.mvc.api.cv.ms.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.api.cv.ms.dtos.UsuariosDTO;

public interface UsuariosRepository extends JpaRepository<UsuariosDTO, Long> {


}
