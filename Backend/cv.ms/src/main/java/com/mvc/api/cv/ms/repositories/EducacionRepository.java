package com.mvc.api.cv.ms.repositories;

import java.util.List;

import com.mvc.api.cv.ms.entities.Educacion;

public interface EducacionRepository {

	List<Educacion> findByProfileId(Long profileId);

}
