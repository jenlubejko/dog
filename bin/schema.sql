drop table if exists DOG;

CREATE TABLE DOG(
  ID int NOT NULL AUTO_INCREMENT,
  NAME varchar(25) NOT NULL,
  IDENTIFICATION varchar(25) NOT NULL,
  BREED varchar(25),
  ORIGIN varchar(25),
  WEIGHT int,
  AGE double,
  INTAKE date NOT NULL,
  REPRODUCTIVE boolean NOT NULL,
  DESCRIPTION varchar(500) NOT NULL
);