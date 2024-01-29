package amnetprime_kundendaten;

public class Kundendaten {
	
	// Nachname, Vorname, Wohnort
	public static void aufgabe1a(Kunde[] kundenliste) {
		Kunde[] kunden = kundenliste;
		String[][] liste1 = new String[kundenliste.length - 1][3];
		
		for (int i = 0; i < kundenliste.length; i++) {
    liste1[i][0] = kundenliste[i].getNachname();
    liste1[i][1] 
		}
	}
	
	public static void main(String[] args) {
		Kunde[] kundenliste = Kundenstamm.liesKunden();
		
		aufgabe1a(kundenliste);
	}
}
