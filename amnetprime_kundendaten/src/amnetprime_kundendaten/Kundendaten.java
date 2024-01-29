package amnetprime_kundendaten;

public class Kundendaten {
	
	// Nachname, Vorname, Wohnort
	public static void aufgabe1a(Kunde[] kundenliste) {
		Kunde[] kunden = kundenliste;
		String[][] liste1 = new String[59][3];
		
		for (int i = 0; i < kundenliste.length; i++) {
			
		}
	}
	
	public static void main(String[] args) {
		Kunde[] kundenliste = Kundenstamm.liesKunden();
		
		aufgabe1a(kundenliste);
	}
}
