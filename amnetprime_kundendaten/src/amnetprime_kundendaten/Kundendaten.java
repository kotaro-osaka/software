package amnetprime_kundendaten;

import java.util.ArrayList;

public class Kundendaten {
	
	// Nachname, Vorname, Wohnort
	public static void aufgabe1a(Kunde kundenliste[]) {
		Kunde[] kunden = kundenliste;
		String[][] listeNVW = new String[kunden.length][3];
		
		for (int i = 0; i < kunden.length; i++) {
			listeNVW[i][0] = kunden[i].getNachname();
			listeNVW[i][1] = kunden[i].getVorname();
			listeNVW[i][2] = kunden[i].getOrt();
		}
		
		// Output Konsole
		for (int j = 0; j < listeNVW.length; j++) {
			for (int k = 0; k < 3; k++) {
				// add if to remove "- " from last iteration
				System.out.print(listeNVW[j][k] + " - ");
			}
			System.out.println("\n");
		}
	}
	
	// Kundennummer, Nachname, Geburtsdatum
	public static void aufgabe1b(Kunde kundenliste[]) {
		Kunde[] kunden = kundenliste;
		ArrayList<ArrayList<Object>> listeKNG = new ArrayList<>();
		
		for (int i = 0; i < kunden.length; i++) {
	        ArrayList<Object> innereListeKNG = new ArrayList<>();
	        innereListeKNG.add(kunden[i].getKundennummer());
	        innereListeKNG.add(kunden[i].getNachname());
	        innereListeKNG.add(kunden[i].getGeburtsdatum());

	        listeKNG.add(innereListeKNG);
	    }
		
		// Output Konsole
		for (ArrayList<Object> innereListeKNG : listeKNG) {
			for (int j = 0; j < innereListeKNG.size(); j++) {
				System.out.print(innereListeKNG.get(j));
				
				if (j < innereListeKNG.size() - 1) {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Kunde[] kundenliste = Kundenstamm.liesKunden();
		
		aufgabe1b(kundenliste);
	}
}
