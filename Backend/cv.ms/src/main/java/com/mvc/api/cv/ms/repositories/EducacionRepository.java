package com.mvc.api.cv.ms.repositories;

import java.util.List;

import com.mvc.api.cv.ms.dtos.EducacionDTO;

public interface EducacionRepository {

	List<EducacionDTO> findByProfileId(Long profileId);

}
