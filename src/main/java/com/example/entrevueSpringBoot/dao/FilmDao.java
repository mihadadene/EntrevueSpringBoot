package com.example.entrevueSpringBoot.dao;

import com.example.entrevueSpringBoot.model.Acteur;
import com.example.entrevueSpringBoot.model.Film;

import java.util.List;
import java.util.Optional;

public interface FilmDao {

    int insertFilm(long id, Film film);

    default int insertFilm(Film film){
        return insertFilm(film);
    }
    List<Film> selectAllFilm();
    Optional<Film> selectFilmById(long id);
    int deleteFilmById(long id);
    int updateFilmById(long id, Film film);
}
