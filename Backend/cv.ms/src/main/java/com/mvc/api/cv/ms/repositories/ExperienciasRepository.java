package com.mvc.api.cv.ms.repositories;

import java.util.List;

import com.mvc.api.cv.ms.dtos.ExperienciasDTO;

public interface ExperienciasRepository {

	List<ExperienciasDTO> findByProfileId(Long profileId);

}
