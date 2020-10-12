package com.example.entrevueSpringBoot.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Acteur {

    private long id;
    private String nom;
    private String prenom;
    private long id_film;

    public Acteur(@JsonProperty("id") long id,
                  @JsonProperty("nom") String nom,
                  @JsonProperty("prenom") String prenom,
                  @JsonProperty("id_film") long id_film)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.id_film = id_film;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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

    public long getId_film() {
        return id_film;
    }

    public void setId_film(long id_film) {
        this.id_film = id_film;
    }
}
