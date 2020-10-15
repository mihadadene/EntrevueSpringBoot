package com.example.entrevueSpringBoot.api;
import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> getAllFilms(){
        return filmService.getAllfilm();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public int createFilm(@RequestBody Film film){
        return filmService.insertFilm(film);
    }

    @GetMapping(path="{id}")
    public Film getFilmById(@PathVariable("id") long id){
        return filmService.getFilmById(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deleteFilmById(@PathVariable("id") long id){
        filmService.deleteFilmById(id);
    }

}
