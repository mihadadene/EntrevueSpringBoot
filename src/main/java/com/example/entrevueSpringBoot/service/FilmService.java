package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.dao.FilmDao;
import com.example.entrevueSpringBoot.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    private final FilmDao filmDao;

    @Autowired
    public FilmService(@Qualifier("filmDao") FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    public int addFilm(Film film){
        return filmDao.insertFilm(film);
    }

    public List<Film> getAllFilm(){
        return filmDao.selectAllFilm();
    }

    public Optional<Film> getFilmById(long id){
        return filmDao.selectFilmById(id);
    }

    public int deleteFilm(long id){
        return filmDao.deleteFilmById(id);
    }

    public int updateFilm(long id, Film newFilm){
        return filmDao.updateFilmById(id, newFilm);
    }
}
