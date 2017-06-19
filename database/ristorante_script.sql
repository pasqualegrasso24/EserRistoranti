DROP DATABASE IF EXISTS Ristorazione;

CREATE DATABASE IF NOT EXISTS Ristorazione 
			DEFAULT CHARACTER SET utf8
	DEFAULT COLLATE utf8_unicode_ci;
    
USE Ristorazione;

#Table structure for table 'Ristorante'

DROP TABLE IF EXISTS Ristorante;

CREATE TABLE IF NOT EXISTS Ristorante(
	idRistorante INT NOT NULL auto_increment,
	nome VARCHAR(20) NOT NULL,    
    indirizzo VARCHAR(40) NOT NULL,
    telefono VARCHAR(20) NOT NULL,    
    CONSTRAINT pk_idRistorante PRIMARY KEY(idRistorante)     
)ENGINE=InnoDB;

#Table structure for table 'Menu'

DROP TABLE IF EXISTS Menu;

CREATE TABLE IF NOT EXISTS Menu(
	idMenu INT NOT NULL auto_increment,
	descrizione VARCHAR(64) NOT NULL,
    prezzo float NOT NULL default '0',
	idRistorante int NOT NULL,	
    CONSTRAINT pk_idMenu PRIMARY KEY(idMenu),
    CONSTRAINT fk_idRistorante FOREIGN KEY(idRistorante) REFERENCES Ristorante(idRistorante) 
)ENGINE=InnoDB;

#Table structure for table 'Piatto'

DROP TABLE IF EXISTS Piatto;

CREATE TABLE Piatto(
	idPiatto INT NOT NULL AUTO_INCREMENT,
	descrizione VARCHAR(64) NOT NULL,
	tipo VARCHAR(64) NOT NULL,
    portata VARCHAR(15) NOT NULL,
    idMenu INT NOT NULL,
    CONSTRAINT pk_idPiatto PRIMARY KEY(idPiatto),
    CONSTRAINT fk_idMenu FOREIGN KEY(idMenu) REFERENCES Menu(idMenu)
    )ENGINE=InnoDB;
    
DROP TABLE IF EXISTS Users;

CREATE TABLE Users(
	username VARCHAR(64) NOT NULL,
    password VARCHAR(64) NOT NULL,
    privilegi CHAR(1) NOT NULL,
    CONSTRAINT pk_username PRIMARY KEY(username)
    );