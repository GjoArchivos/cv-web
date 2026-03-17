package com.mvc.api.cv.ms.services;

import org.springframework.stereotype.Service;

import com.mvc.api.cv.ms.dtos.CvResponseDTO;
import com.mvc.api.cv.ms.dtos.UsuariosDTO;
import com.mvc.api.cv.ms.repositories.CertificacionesRepository;
import com.mvc.api.cv.ms.repositories.CursosRepository;
import com.mvc.api.cv.ms.repositories.EducacionRepository;
import com.mvc.api.cv.ms.repositories.ExperienciasRepository;
import com.mvc.api.cv.ms.repositories.UsuariosRepository;

@Service
public class CvServiceImpl implements CvService{

    private final UsuariosRepository usuariosRepo;
    private final ExperienciasRepository experienciasRepo;
    private final EducacionRepository educacionRepo;
    private final CursosRepository cursosRepo;
    private final CertificacionesRepository certificacionesRepo;

    @Override
    public CvResponseDTO getCv( Long profileId) {


        UsuariosDTO profile = usuariosRepo.findById(profileId)
                .orElseThrow(() -> new RuntimeException("Profile not found"));

        CvResponseDTO response = new CvResponseDTO();

        response.setId(profile.getId());
        response.setFullName(profile.getFullName());
        response.setEmail(profile.getEmail());
        response.setPhone(profile.getPhone());
        response.setLinkedinUrl(profile.getLinkedinUrl());
        response.setGithubUrl(profile.getGithubUrl());
        response.setPortfolioUrl(profile.getPortfolioUrl());

        response.setExperiences(
                experienceRepository.findByProfileId(profileId)
        );

        response.setEducation(
                educationRepository.findByProfileId(profileId)
        );

        response.setCourses(
                courseRepository.findByProfileId(profileId)
        );

        response.setCertifications(
                certificationRepository.findByProfileId(profileId)
        );

        return response;
    }

}