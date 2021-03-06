DROP TABLE IF EXISTS acteur, film;

CREATE TABLE film (
  id_film BIGINT PRIMARY KEY AUTO_INCREMENT,
  titre VARCHAR(250) NOT NULL,
  description VARCHAR(3500) NOT NULL
);

CREATE TABLE acteur (
  id_acteur BIGINT PRIMARY KEY AUTO_INCREMENT,
  nom VARCHAR(250) NOT NULL,
  prenom VARCHAR(250) NOT NULL,
  id_film BIGINT
);

ALTER TABLE acteur
ADD CONSTRAINT fk_acteur_film
FOREIGN KEY (id_film) REFERENCES film(id_film);


