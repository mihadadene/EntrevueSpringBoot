package com.example.entrevueSpringBoot.entity;

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
    private long idActeur;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

}
