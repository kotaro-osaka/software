package kunden;

public class Test {
	public static void main(String[] args) {
		// Datenbank.printKundenstamm();
		// Datenbank.insertKunde(5000, "test", "test", LocalDate.of(2001, 1, 01), "test", LocalDate.of(2001, 1, 01), 0, 0, 0, 0);
		Kunde[] kunden = Datenbank.getKunden("SELECT * FROM kunde");
		
		for (Kunde kunde : kunden) {
			System.out.println(kunde.getKundennummer() + "    " + kunde.getVorname() + "    " + kunde.getNachname());
		}
	}
}