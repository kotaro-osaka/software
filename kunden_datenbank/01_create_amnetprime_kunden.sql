CREATE DATABASE IF NOT EXISTS amnetprime_kunden;
USE amnetprime_kunden;

CREATE TABLE IF NOT EXISTS plz_orte (
	plz INT NOT NULL,
	ort VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY(plz)
) ENGINE=InnoDB CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS kunde (
	kundennummer INT NOT NULL AUTO_INCREMENT,
	vorname VARCHAR(50) DEFAULT NULL,
	nachname VARCHAR(50) DEFAULT NULL,
	geburtsdatum VARCHAR(10) DEFAULT NULL,
	strasse_hausnummer VARCHAR(50) DEFAULT NULL,
	kunde_seit VARCHAR(10) DEFAULT NULL,
	geschlecht VARCHAR(1) DEFAULT NULL,
	familienstand VARCHAR(11) DEFAULT NULL,
	plz INT(5),
	PRIMARY KEY(kundennummer),
	FOREIGN KEY (plz) REFERENCES plz_orte(plz)
) ENGINE=InnoDB CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS abotyp (
	abotyp_id INT NOT NULL AUTO_INCREMENT,
	abotyp VARCHAR(50),
	PRIMARY KEY(abotyp_id)
) ENGINE=InnoDB CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS kunde_abotyp (
	kundennummer INT,
	abotyp_id INT,
	PRIMARY KEY (kundennummer, abotyp_id),
	FOREIGN KEY (kundennummer) REFERENCES kunde(kundennummer),
	FOREIGN KEY (abotyp_id) REFERENCES abotyp(abotyp_id) 
) ENGINE=InnoDB CHARSET=utf8mb4 COLLATE=UTF8MB4_UNICODE_CI;
amnetprime_kunden