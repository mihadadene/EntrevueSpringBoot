package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Acteur;
import com.example.entrevueSpringBoot.repository.ActeurRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ActeurService {
    private final ActeurRepository acteurRepository;

    public ActeurService(ActeurRepository acteurRepository) {
        this.acteurRepository = acteurRepository; 
    }

    public List<Acteur> getAllActeur(){
        return (List<Acteur>) acteurRepository.findAll();
    }

    public int insertActeur(Acteur acteur) {
        acteurRepository.save(acteur);
        return 1;
    }

    public int insertActeurs(List<Acteur> acteurs){
        acteurRepository.saveAll(acteurs);
        return 1;
    }
}
