package com.example.entrevueSpringBoot.dao;

import com.example.entrevueSpringBoot.model.Acteur;

public interface ActeurDao {

     int insertActeur(long id, Acteur acteur);

    default int insertActeur(Acteur acteur){
        return insertActeur(acteur);
    }
}
