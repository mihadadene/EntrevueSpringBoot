package com.example.entrevueSpringBoot.dao;

import com.example.entrevueSpringBoot.model.Film;

import java.util.List;
import java.util.Optional;

public interface FilmDao {

    int insertFilm(long id_film, Film film);

    default int insertFilm(Film film){
        return insertFilm(film);
    }
    List<Film> selectAllFilm();
    Optional<Film> selectFilmById(long id_film);
    int deleteFilmById(long id_film);
    int updateFilmById(long id_film, Film film);
}
