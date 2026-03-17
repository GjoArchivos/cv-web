package com.mvc.api.cv.ms.repositories;

import java.util.List;

import com.mvc.api.cv.ms.dtos.CursosDTO;

public interface CursosRepository {

	List<CursosDTO> findByProfileId(Long profileId);

}
