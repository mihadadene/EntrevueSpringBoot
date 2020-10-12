package com.example.entrevueSpringBoot.dao;

import com.example.entrevueSpringBoot.model.Film;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("filmDao")
public class FilmDataAccessService implements FilmDao {

    private static List<Film> films = new ArrayList<>();

    @Override
    public int insertFilm(long id, Film film) {
        films.add(film);
        return 1;
    }

/*    @Override
    public int insertFilm(Film film) {
        films.add(film);
        return 1;
    }*/

    @Override
    public List<Film> selectAllFilm() {
        return films;
    }

    @Override
    public Optional<Film> selectFilmById(long id) {
        return films.stream().filter(film ->
                    film.getId() == id)
                        .findFirst();
    }

    @Override
    public int deleteFilmById(long id) {
        Optional<Film> filmMayBe = selectFilmById(id);
        if(filmMayBe.isEmpty()) {
            return 0;
        }
        films.remove(filmMayBe.get());
        return 1;
    }

    @Override
    public int updateFilmById(long id, Film update) {
        return selectFilmById(id)
                .map(film ->{
                    int indexOdFilmToUpdate = films.indexOf(film);
                    if (indexOdFilmToUpdate >= 0){
                       films.set(indexOdFilmToUpdate, new Film(id, update.getTitre(), update.getDescription(), update.getActeurs()));
                       return 1;
                }
                    return 0;
                })
                .orElse(0);
    }

}
