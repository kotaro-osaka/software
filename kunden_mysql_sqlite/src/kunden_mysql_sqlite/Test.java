package kunden_mysql_sqlite;

public class Test {

	public static void main(String[] args) {
		Kunde[] kunden = Kundenstamm.liesKundenFromDb(Kundenstamm.MYSQL_IDX, "SELECT * FROM kunde");
		
		for (Kunde kunde : kunden) {
			System.out.println(kunde.getKundennummer() + kunde.getVorname() + kunde.getNachname());
		}
	}

}
