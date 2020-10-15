package com.example.entrevueSpringBoot.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "film")
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Film {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long idFilm;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_film", referencedColumnName="idFilm")
    private List<Acteur> acteurs = new ArrayList<>();

}
