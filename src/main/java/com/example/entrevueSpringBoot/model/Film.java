package com.example.entrevueSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "film")
@Data
@Builder
@Entity
public class Film {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "idFilm", nullable = false, updatable = false)
    private long idFilm;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idActeur")
    private List<Acteur> acteurs;

    public Film(@JsonProperty("idFilm") long idFilm,
                @JsonProperty("titre") String titre,
                @JsonProperty("description") String description,
                @JsonProperty("acteurs") List<Acteur> acteurs )
    {
        this.idFilm = idFilm;
        this.titre = titre;
        this.description = description;
        this.acteurs = acteurs;
    }

    public long getIdFilm() {
        return idFilm;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public void setIdFilm(long idFilm) {
        this.idFilm = idFilm;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

    public List<Acteur> getActeurs() {
      return acteurs;
   }
}
