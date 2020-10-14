package com.example.entrevueSpringBoot.api;
import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.service.FilmService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value="api/film")
@RestController
public class FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping
    public void addFilm(@Validated @NonNull @RequestBody Film film){
        filmService.insertFilm(film);
    }

    @GetMapping
    public List<Film> getAllFilm(){
        return filmService.getAllfilm();
    }

    @GetMapping(path="{id}")
    public Film getFilmById(@PathVariable("id") long id){
        return filmService.getFilmById(id).orElse(null);
    }

/*    @DeleteMapping(path="{id}")
    public void deleteFilmById(@PathVariable("id") long id){
        filmService.deleteFilm(id);
    }

    @PutMapping(path="{id}")
    public void updateFilm(@PathVariable("id") long id, @Validated @NonNull @RequestBody Film filmToUpdate){
        filmService.updateFilm(id, filmToUpdate);
    }*/
}
