USE amnetprime_kunden;

-- Fill plz_orte
INSERT INTO plz_orte (plz, ort)
SELECT DISTINCT plz, ort
FROM kunde_imported
ON DUPLICATE KEY UPDATE ort = VALUES(ort);

DELETE FROM plz_orte
WHERE plz = 0 AND ort IS NULL;

-- Fill kunde
INSERT INTO kunde (kundennummer, vorname, nachname, geburtsdatum, strasse_hausnummer, kunde_seit, geschlecht, familienstand, plz)
SELECT
   k.kundennummer,
   k.vorname,
   k.nachname,
   k.geburtsdatum,
   k.strasse_hausnummer,
   k.kunde_seit,
   k.geschlecht,
   k.familienstand,
   p.plz
FROM kunde_imported k
INNER JOIN plz_orte p ON k.plz = p.plz;

-- Fill abotyp
INSERT INTO abotyp (abotyp_id)
SELECT DISTINCT abotyp_id
FROM kunde_imported;

-- Fill kunde_abotyp
INSERT INTO kunde_abotyp (kundennummer, abotyp_id)
SELECT kunde.kundennummer, abotyp.abotyp_id
FROM kunde
CROSS JOIN abotyp;