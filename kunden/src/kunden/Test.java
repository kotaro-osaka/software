package kunden;

public class Test {
	public static void main(String[] args) {
		// Datenbank.printKundenstamm();
		// Datenbank.insertKunde(5000, "test", "test", LocalDate.of(2001, 1, 01), "test", LocalDate.of(2001, 1, 01), 0, 0, 0, 0);
		Kunde[] kunden = Datenbank.getKunden("SELECT kunde.kundennummer, kunde.vorname, kunde.nachname, kunde.gebDatum, kunde.straße, kunde.kundeSeit, plz.plzBez, ort.ortBezeichnung, geschlecht.geschBEZ, familienstand.Bezeichnung, abotyp.aboBez FROM kunde"
				+ " LEFT JOIN plz ON kunde.plzID = plz.plzID"
				+ " LEFT JOIN ort ON plz.ORTID = ort.OrtID"
				+ " LEFT JOIN geschlecht ON kunde.geschID = geschlecht.geschID"
				+ " LEFT JOIN familienstand ON kunde.famStaID = familienstand.famStaID"
				+ " LEFT JOIN abotyp ON kunde.aboID = abotyp.aboID");
		
		for (Kunde kunde : kunden) {
			System.out.println(kunde.getKundennummer() + "    " + kunde.getVorname() + "    " + kunde.getNachname() + "    " + kunde.getGeburtsdatum() + "    " + kunde.getStrasse() + "    " + kunde.getKundeSeit() + "    " + kunde.getPlz() + "    " + kunde.getOrt() + "    " + kunde.getGeschlecht() + "    " + kunde.getFamilienstand() + "    " + kunde.getAbotyp());
		}
	}
}

// newest