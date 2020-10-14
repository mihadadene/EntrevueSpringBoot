package com.example.entrevueSpringBoot.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "acteur")
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Acteur {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "id_acteur", nullable = false, updatable = false)
    private long id_acteur;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

}
