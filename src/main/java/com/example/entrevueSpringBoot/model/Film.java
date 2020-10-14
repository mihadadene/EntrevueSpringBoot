package com.example.entrevueSpringBoot.model;

import lombok.*;

import javax.persistence.*;
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
    @Column(name = "id_film", nullable = false, updatable = false)
    private long id_film;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_acteur")
    private List<Acteur> acteurs;


}
