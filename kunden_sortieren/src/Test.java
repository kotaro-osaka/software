public class Test {

	public static void main(String[] args) {

		Kunde[] kundenliste = Kundenstamm.liesKunden();
		int anzahl = Kundenstamm.getAnzahlKunden();
		for (int i = 0; i < anzahl ; i++) {
			System.out.println(kundenliste[i].getFullname());

		}

	}
}
