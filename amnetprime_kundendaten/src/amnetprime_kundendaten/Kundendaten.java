package amnetprime_kundendaten;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Kundendaten {

	// Nachname, Vorname, Wohnort
	public static String[][] aufgabe1a(Kunde[] kundenliste, boolean consoleOut) {
		Kunde[] kunden = kundenliste;
		String[][] listeNVW = new String[kunden.length][3];
		
		for (int i = 0; i < kunden.length; i++) {
			listeNVW[i][0] = kunden[i].getNachname();
			listeNVW[i][1] = kunden[i].getVorname();
			listeNVW[i][2] = kunden[i].getOrt();
		}
		
		// Output Konsole wenn gewuenscht
		if (consoleOut == true) {
			for (int j = 0; j < listeNVW.length; j++) {
				for (int k = 0; k < 2; k++) {
					System.out.print(listeNVW[j][k] + " - ");
				}
				System.out.println(listeNVW[j][2]);
				System.out.println("\n"); // Zeilensprung
			}
		}
		return listeNVW;
	}
	
	// Kundennummer, Nachname, Geburtsdatum
	public static ArrayList<ArrayList<Object>> aufgabe1b(Kunde[] kundenliste, boolean consoleOut) { // Return verschachtelte ArrayList, Typ 'Object'
		Kunde[] kunden = kundenliste;
		ArrayList<ArrayList<Object>> listeKNG = new ArrayList<>();
		
		// Innere ArrayList erstellen
		for (int i = 0; i < kunden.length; i++) {
	        ArrayList<Object> innereListeKNG = new ArrayList<>();
	        innereListeKNG.add(kunden[i].getKundennummer());
	        innereListeKNG.add(kunden[i].getNachname());
	        innereListeKNG.add(kunden[i].getFormattedGeburtsdatum()); // Eigene Methode ergaenzt

	        listeKNG.add(innereListeKNG); // Innere ArrayList der 'listeKNG' ArrayList hinzufuegen
	    }
		
		// Output Konsole
		if (consoleOut == true) {
			for (ArrayList<Object> innereListeKNG : listeKNG) { // Fuer jedes Objekt der inneren Liste aus der Liste 'listeKNG'...
				for (int j = 0; j < innereListeKNG.size(); j++) {
					System.out.print(innereListeKNG.get(j));
					
					if (j < innereListeKNG.size() - 1) { // '-' trennt ausgegebene Werte solange ein naechster darauf folgt
						System.out.print(" - ");
					}
				}
				System.out.println(); // Zeilensprung
			}
		}
		return listeKNG;
	}
	
	// Name(Vorname, Nachname), Anschrift(Strasse, PLZ, Ort); cond: 'familienstand == "unverheiratet"', 'geschlecht == "m"'
	public static ArrayList<ArrayList<Object>> aufgabe2(Kunde[] kundenliste, boolean consoleOut) { // Return verschachtelte ArrayList, Typ 'Object'
		Kunde[] kunden = kundenliste;
		ArrayList<ArrayList<Object>> listeVNSPO = new ArrayList<>();
		
		// Innere ArrayList erstellen
		for (int i = 0; i < kunden.length; i++) {
			if (kunden[i].getFamilienstand() != "verheiratet" && kunden[i].getGeschlecht() == "m") {
				ArrayList<Object> innereListeVNSPO = new ArrayList<>();
				innereListeVNSPO.add(kunden[i].getVorname());
				innereListeVNSPO.add(kunden[i].getNachname());
				innereListeVNSPO.add(kunden[i].getStrasse());
				innereListeVNSPO.add(kunden[i].getPlz());
				innereListeVNSPO.add(kunden[i].getOrt());
				
				listeVNSPO.add(innereListeVNSPO); // Innere ArrayList der 'listeKNG' ArrayList hinzufuegen
			}
		}
		
		// Output Konsole
		if (consoleOut == true) {
			for (ArrayList<Object> innereListeVNSPO : listeVNSPO) { // Fuer jedes Objekt der inneren Liste aus der Liste 'listeVNSPO'...
				for (int j = 0; j < innereListeVNSPO.size(); j++) {
					System.out.print(innereListeVNSPO.get(j));
					
					if (j < innereListeVNSPO.size() - 1) { // '-' trennt ausgegebene Werte solange ein naechster darauf folgt
						System.out.print(" - ");
					}
				}
				System.out.println(); // Zeilensprung
			}
		}
		return listeVNSPO;
	}
	
	// Kunde #4060
	public static ArrayList<Object> aufgabe3(Kunde[] kundenliste, boolean consoleOut) { // Return ArrayList, Typ 'Object'
		Kunde[] kunden = kundenliste;
		ArrayList<Object> liste4060 = new ArrayList<>();
		
		// Kunde #4060 suchen
		for (int i = 0; i < kunden.length; i++) {
			if (kunden[i].getKundennummer() == 4060) {
				// Kunde #4060 in separate ArrayList uebertragen
				liste4060.add(kunden[i].getKundennummer());
				liste4060.add(kunden[i].getNachname());
				liste4060.add(kunden[i].getVorname());
				liste4060.add(kunden[i].getFormattedGeburtsdatum());
				liste4060.add(kunden[i].getStrasse());
				liste4060.add(kunden[i].getPlz());
				liste4060.add(kunden[i].getOrt());
				liste4060.add(kunden[i].getGeschlecht());
				liste4060.add(kunden[i].getFormattedKundeSeit());
				liste4060.add(kunden[i].getFamilienstand());
				liste4060.add(kunden[i].getAboTyp());
				
				break;
			}
		}
		
		if (consoleOut == true) {
			for (Object element : liste4060) {
				System.out.println(element);
			}
		}
		
		return liste4060;
	}
	
	// Kunden, die diesen Monat Geburtstag haben
	public static ArrayList<ArrayList<Object>> aufgabe4(Kunde[] kundenliste, boolean consoleOut) { // Return verschachtelte ArrayList, Typ 'Object'
		Kunde[] kunden = kundenliste;
		ArrayList<ArrayList<Object>> listeGeb = new ArrayList<>();
		
		// Innere ArrayList erstellen
		for (int i = 0; i < kunden.length; i++) {
			LocalDate gebDatum = LocalDate.parse(kunden[i].getFormattedGeburtsdatum(), DateTimeFormatter.ofPattern("dd-MM-yyyy")); // Datum in Typ 'Date' umwandeln, um mit aktuellem Datum vergleichen zu koennen
			
			if (gebDatum.getMonth() == LocalDate.now().getMonth()) {
				// Innere ArrayList erstellen
				ArrayList<Object> innereListeGeb = new ArrayList<>();
				
				innereListeGeb.add(kunden[i].getKundennummer());
				innereListeGeb.add(kunden[i].getNachname());
				innereListeGeb.add(kunden[i].getVorname());
				innereListeGeb.add(kunden[i].getFormattedGeburtsdatum());
				innereListeGeb.add(kunden[i].getStrasse());
				innereListeGeb.add(kunden[i].getPlz());
				innereListeGeb.add(kunden[i].getOrt());
				innereListeGeb.add(kunden[i].getGeschlecht());
				innereListeGeb.add(kunden[i].getFormattedKundeSeit());
				innereListeGeb.add(kunden[i].getFamilienstand());
				innereListeGeb.add(kunden[i].getAboTyp());
						
				listeGeb.add(innereListeGeb); // Innere ArrayList der 'listeKNG' ArrayList hinzufuegen
			}
		}		
		
		// Output Konsole
		if (consoleOut == true) {
			for (ArrayList<Object> innereListeGeb : listeGeb) { // Fuer jedes Objekt der inneren Liste aus der Liste 'listeGeb'...
				for (int j = 0; j < innereListeGeb.size(); j++) {
					System.out.print(innereListeGeb.get(j));
					
					if (j < innereListeGeb.size() - 1) { // '-' trennt ausgegebene Werte solange ein naechster darauf folgt
						System.out.print(" - ");
					}
				}
				System.out.println(); // Zeilensprung
			}
		}
		
		return listeGeb;
	}
	
	// Kunden 60+
	public static ArrayList<ArrayList<Object>> aufgabe5(Kunde[] kundenliste, boolean consoleOut) { // Return verschachtelte ArrayList, Typ 'Object'
		Kunde[] kunden = kundenliste;
		ArrayList<ArrayList<Object>> liste60p = new ArrayList<>();
		
		for (int i = 0; i < kunden.length; i++) {
			LocalDate gebDatum = LocalDate.parse(kunden[i].getFormattedGeburtsdatum(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));// Datum in Typ 'Date' umwandeln, um mit aktuellem Datum vergleichen zu koennen
			LocalDate heute = LocalDate.now();
			
			if (Period.between(gebDatum, heute).getYears() >= 60) {
				// Innere ArrayList erstellen
				ArrayList<Object> innereListe60p = new ArrayList<>();
				
				innereListe60p.add(kunden[i].getKundennummer());
				innereListe60p.add(kunden[i].getNachname());
				innereListe60p.add(kunden[i].getVorname());
				innereListe60p.add(kunden[i].getFormattedGeburtsdatum());
				innereListe60p.add(kunden[i].getStrasse());
				innereListe60p.add(kunden[i].getPlz());
				innereListe60p.add(kunden[i].getOrt());
				innereListe60p.add(kunden[i].getGeschlecht());
				innereListe60p.add(kunden[i].getFormattedKundeSeit());
				innereListe60p.add(kunden[i].getFamilienstand());
				innereListe60p.add(kunden[i].getAboTyp());
				
				liste60p.add(innereListe60p); // Innere ArrayList der 'listeKNG' ArrayList hinzufuegen
			}
		}
		
		// Output Konsole
				if (consoleOut == true) {
					for (ArrayList<Object> innereListe60p : liste60p) { // Fuer jedes Objekt der inneren Liste aus der Liste 'liste60p'...
						for (int j = 0; j < innereListe60p.size(); j++) {
							System.out.print(innereListe60p.get(j));
							
							if (j < innereListe60p.size() - 1) { // '-' trennt ausgegebene Werte solange ein naechster darauf folgt
								System.out.print(" - ");
							}
						}
						System.out.println(); // Zeilensprung
					}
				}
		
		return liste60p;
	}
	
	
	// Wichtig: Bei gewuenschter Konsolenausgabe zweites Argument auf true setzen ('consoleOut = true')
	// ArrayList, da verschiedene Datentypen nicht in einem Array gespeichert werden koennen - Typ Object macht es mit ArrayList moeglich
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Kunde[] kundenliste = Kundenstamm.liesKunden();
		
		// Aufgabe 1
		String[][] kundenliste1a = aufgabe1a(kundenliste, false);
		ArrayList<ArrayList<Object>> kundenliste1b = aufgabe1b(kundenliste, false);
		// Aufgabe 2
		ArrayList<ArrayList<Object>> kundenliste2 = aufgabe2(kundenliste, false);
		// Aufgabe 3
		ArrayList<Object> kunde4060 = aufgabe3(kundenliste, false);
		// Aufgabe 4
		ArrayList<ArrayList<Object>> kundenliste4 = aufgabe4(kundenliste, false);
		// Aufgabe 5
		ArrayList<ArrayList<Object>> kundenliste5 = aufgabe5(kundenliste, true);
	}
}