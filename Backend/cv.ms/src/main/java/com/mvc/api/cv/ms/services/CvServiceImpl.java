package com.mvc.api.cv.ms.services;

import org.springframework.stereotype.Service;

import com.mvc.api.cv.ms.dtos.CvResponseDTO;
import com.mvc.api.cv.ms.entities.Usuarios;
import com.mvc.api.cv.ms.repositories.CertificacionesRepository;
import com.mvc.api.cv.ms.repositories.CursosRepository;
import com.mvc.api.cv.ms.repositories.EducacionRepository;
import com.mvc.api.cv.ms.repositories.ExperienciasRepository;
import com.mvc.api.cv.ms.repositories.PerfilesRepository;
import com.mvc.api.cv.ms.repositories.UsuariosRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CvServiceImpl implements CvService{

    private final UsuariosRepository usuariosRepo;
    private final PerfilesRepository perfilesRepo;
	private final ExperienciasRepository experienciasRepo;
	private final EducacionRepository educacionRepo;
	private final CursosRepository cursosRepo;
	private final CertificacionesRepository certificacionesRepo;

    @Override
    public CvResponseDTO getCv( Long profileId) {
    	String fullName = "";

        Usuarios profile = usuariosRepo.findById(profileId)
                .orElseThrow(() -> new RuntimeException("perfil no encontrado"));

        CvResponseDTO response = new CvResponseDTO();
        
        fullName = profile.getNombre()+" "+profile.getApellidoUno()+" "+profile.getApellidoDos();

        response.setId(profile.getUserId());
        response.setFullName(fullName);
        response.setEmail(profile.getEmail());
        response.setPhone(profile.getTelefono());
        
        response.setPerfiles(
        		perfilesRepo.findByProfileId(profileId));
        
        response.setExperiencias(
        		experienciasRepo.findByProfileId(profileId)
        );
        response.setEducacion(
        		educacionRepo.findByProfileId(profileId)
        );
        response.setCursos(
        		cursosRepo.findByProfileId(profileId)
        );
        response.setCertificaciones(
        		certificacionesRepo.findByProfileId(profileId)
        );

        return response;
    }

}