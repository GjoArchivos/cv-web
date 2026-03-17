package com.mvc.api.cv.ms.repositories;

import java.util.List;

import com.mvc.api.cv.ms.dtos.CertificacionesDTO;

public interface CertificacionesRepository {

	List<CertificacionesDTO> findByProfileId(Long profileId);

}
