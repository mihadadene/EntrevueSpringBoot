DROP TABLE IF EXISTS acteur, film;

CREATE TABLE film (
  idFilm bigint auto_increment PRIMARY KEY,
  titre VARCHAR(250) NOT NULL,
  description VARCHAR(3500) NOT NULL
);

CREATE TABLE acteur (
  idActeur bigint auto_increment PRIMARY KEY,
  nom VARCHAR(250) NOT NULL,
  prenom VARCHAR(250) NOT NULL,
  idFilm BIGINT
);

ALTER TABLE acteur
ADD CONSTRAINT FK_ActeurFilm
FOREIGN KEY (idFilm) REFERENCES film(idFilm);


