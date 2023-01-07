create database if not exists dbexam;
use dbexam;

create table Rue
(
  code_rue int primary key auto_increment,
  nom_rue varchar(30)
);

create table Immeuble
(
  num_immeuble int primary key auto_increment,
  nb_etage_total int,
 code_rue int,
  FOREIGN KEY (code_rue) REFERENCES Rue(code_rue)
);
create table Etage
(
  num_etage int primary key auto_increment,
  nb_appartement_tot int,
 num_immeuble int,
  FOREIGN KEY (num_immeuble) REFERENCES Immeuble(num_immeuble)
);
create table Appartement
(
  lettre_appartement varchar(90) primary key,
  nb_pieces_total int,
 num_etage int,
  FOREIGN KEY (num_etage) REFERENCES Etage(num_etage)
);
