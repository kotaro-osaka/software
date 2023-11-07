package privateRente1;

import java.util.Scanner;
import java.util.ArrayList;

public class PrivateRente1 {
	static float anlageBetrag, restKapital, jahresRente, jahresZinssatzProzent, jahresZinssatzDezimal;
	static int vertragsDauerJahre;
	static ArrayList<Float> arrayRestKapital = new ArrayList<>();
	
	public static void abfragen() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Anlagebetrag: ");
		anlageBetrag = scanner.nextFloat();
		restKapital = anlageBetrag;
		
		System.out.println("Jahresrente: ");
		jahresRente = scanner.nextFloat();
		
		System.out.println("Jahreszinssatz in Prozent: ");
		jahresZinssatzProzent = scanner.nextFloat();
		
		scanner.close();
		
		// Prozent in Dezimal umrechnen
		jahresZinssatzDezimal = jahresZinssatzProzent / 100;
	}
	
	public static void rechnungVertragsDauerJahre() {
		vertragsDauerJahre = (int) (Math.log(jahresRente / (jahresRente - jahresZinssatzDezimal * anlageBetrag)) / Math.log(1 + jahresZinssatzDezimal));
	}
	
	public static void rechnungRestKapital() {
		rechnungVertragsDauerJahre();
		for (int i = vertragsDauerJahre; i > 0; i--) {
			restKapital = (restKapital - jahresRente) + (restKapital * jahresZinssatzDezimal);
			arrayRestKapital.add(restKapital);		
		}
	}
	
	public static void outputAngebot() {
		System.out.println("Anlagebetrag: " + anlageBetrag + ", Jahresrente: " + jahresRente + ", Zinssatz: " + jahresZinssatzProzent + "%");
		System.out.println("Verlauf: ");
		
		int j = 1;
		for (int i = 0; i < arrayRestKapital.size(); i++) {
			System.out.println("Jahr: " + j + " Auszahlung: " + jahresRente + " RestKapital: " + Math.round(arrayRestKapital.get(i) * Math.pow(10, 2)) / Math.pow(10, 2));
			j++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Wilkommen zu Private Rente 1.0!");
		
		abfragen();
		rechnungRestKapital();
		outputAngebot();
	}
}