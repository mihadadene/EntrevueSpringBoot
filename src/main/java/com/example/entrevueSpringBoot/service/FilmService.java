package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.repository.ActeurRepository;
import com.example.entrevueSpringBoot.repository.FilmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class FilmService {

    private FilmRepository filmRepository;

    @Autowired
    public FilmService(ActeurRepository acteurRepository, FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Optional<Film> getFilmById(Long idFilm){
        return filmRepository.findById(idFilm);
    }

    public List<Film> getAllfilm(){
        return (List<Film>) filmRepository.findAll();
    }

    public int insertFilm(Film film){
        filmRepository.save(film);
        return 1;
    }

    public int deleteFilmById(long id){
        filmRepository.deleteById(id);
        return 1;
    }

}
