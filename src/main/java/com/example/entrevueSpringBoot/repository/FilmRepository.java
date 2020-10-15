package com.example.entrevueSpringBoot.repository;

import com.example.entrevueSpringBoot.entity.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository <Film, Long>{

}
