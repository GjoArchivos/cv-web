package com.mvc.api.cv.ms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mvc.api.cv.ms.entities.Perfiles;

public interface PerfilesRepository extends JpaRepository<Perfiles, Long>{

	@Query(value = "SELECT p FROM profiles WHERE p.user_id = :userId")
	List<Perfiles> findByProfileId(@Param("userId") Long profileId);

}
