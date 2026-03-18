package com.mvc.api.cv.ms.repositories;

import java.util.List;

import com.mvc.api.cv.ms.entities.Experiencias;

public interface ExperienciasRepository {

	List<Experiencias> findByProfileId(Long profileId);

}
