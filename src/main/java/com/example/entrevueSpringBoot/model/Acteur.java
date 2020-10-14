package com.example.entrevueSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Table(name = "acteur")
@Data
@Builder
@Entity
public class Acteur {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "idActeur", nullable = false, updatable = false)
    private long idActeur;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    public Acteur(@JsonProperty("idActeur") long idActeur,
                  @JsonProperty("nom") String nom,
                  @JsonProperty("prenom") String prenom)

    {
        this.idActeur = idActeur;
        this.nom = nom;
        this.prenom = prenom;
    }

    public long getIdActeur() {
        return idActeur;
    }

    public void setIdActeur(long idActeur) {
        this.idActeur = idActeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
