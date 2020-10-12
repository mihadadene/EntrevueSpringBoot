package com.example.entrevueSpringBoot.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Optional;

public class Film {
    private long id;
    private String titre;
    private String description;
    private ArrayList<Acteur> acteurs;


    public Film(@JsonProperty("id") long id,
                @JsonProperty("titre") String titre,
                @JsonProperty("description") String description,
                @JsonProperty("acteurs") ArrayList<Acteur> acteurs )
    {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.acteurs = acteurs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Optional<Acteur> getActeursById_acteur(long id_acteur){
      return acteurs.stream().filter(acteur ->
              acteur.getId() == id_acteur)
              .findFirst();
    }

 /*   public Optional<Acteur> getActeursById_film(long id_film){
        return acteurs.stream().filter(acteur ->
                acteur.getId_film() == id_film)
                .findFirst();
    }*/

     public int insertActeur(Acteur acteur) {
          acteurs.add(new Acteur(acteur.getId(), acteur.getNom(), acteur.getPrenom(), acteur.getId_film()));
         return 1;
    }

    public boolean addActeur(Acteur acteur) {
        return acteurs.add(acteur);
    }

    public ArrayList<Acteur> getActeurs(){
        return acteurs;
    }

}
