package com.mvc.api.cv.ms.repositories;

import java.util.List;

import com.mvc.api.cv.ms.entities.Cursos;

public interface CursosRepository {

	List<Cursos> findByProfileId(Long profileId);

}
