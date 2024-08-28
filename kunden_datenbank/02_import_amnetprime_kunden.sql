USE amnetprime_kunden;

-- Create import table
CREATE TABLE IF NOT EXISTS kunde_imported (
	kundennummer INT NOT NULL,
   vorname VARCHAR(50),
   nachname VARCHAR(50),
   geburtsdatum VARCHAR(10),
   strasse_hausnummer VARCHAR(50),
   plz INT(5) NOT NULL,
   ort VARCHAR(50),
   kunde_seit VARCHAR(10),
   geschlecht VARCHAR(1),
   familienstand VARCHAR(11),
   abotyp_id INT NOT NULL
) ENGINE=INNODB CHARSET=UTF8MB4 COLLATE=UTF8MB4_UNICODE_CI;

-- Load data into table
LOAD DATA INFILE 'E:/kundenstamm.csv'
INTO TABLE kunde_imported
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 LINES
(kundennummer, vorname, nachname, geburtsdatum, strasse_hausnummer, plz, ort, kunde_seit, geschlecht, familienstand, abotyp_id);
