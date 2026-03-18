package com.mvc.api.cv.ms.repositories;

import java.util.List;

import com.mvc.api.cv.ms.entities.Certificaciones;

public interface CertificacionesRepository {

	List<Certificaciones> findByProfileId(Long profileId);

}
