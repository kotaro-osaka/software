package verzweigungen;

import java.util.Scanner;

public class Verzweigungen {
	
	public static void AuswahlAufgabe() {
		// Auswahlmoeglichkeiten
		System.out.println("Es stehen 6 Aufgaben zur Verfuegung. Geben Sie eine Zahl ein, um die jeweilige Aufgabe zu starten.");
		System.out.println("1. 5%% Bonus bei Nettoabnahmemenge von mind. 70.000EUR");
		System.out.println("2. Jaehrliche Zinsen bei Anlagebetraegen von bis zu 5.000, 10.000, 50.000, oder ab 50.000EUR berechnen");
		System.out.println("3. Bruttolohn durch angabe von Arbeitsstunden pro Woche und Stundenlohn berechnen");
		System.out.println("4. Nach Eingabe einer Zahl, bestimmen, ob es sich um eine gerade oder ungerade Zahl handelt");
		System.out.println("5. Nach Eingabe dreier Zahlen, bestimmen, welche von ihnen die groesste Zahl ist");
		System.out.println("6. Nach Eingabe einer Jahreszahl, bestimmen, ob es sich um ein Schaltjahr handelt");
		// Scanner
		Scanner scanner = new Scanner(System.in);
		int auswahl = scanner.nextInt();
		scanner.close();
	}
	
	public static void Auswahl(int auswahl) {
		switch (auswahl) {
			case 1: {
				Aufgabe1();
				break;
			}
			case 2: {
				Aufgabe2();
				break;
			}
			case 3: {
				Aufgabe3();
				break;
			}
			case 4: {
				Aufgabe4();
				break;
			}
			case 5: {
				Aufgabe5();
				break;
			}
			case 6: {
				Aufgabe6();
				break;
			}
			default: {
				System.out.println("Ungültige Eingabe.");
				System.out.println("Bitte geben Sie erneut eine Zahl (1-6) ein, um die jeweilige Aufgabe zu starten.");
				AuswahlAufgabe();
			}
		}
	}
	
	public static void Aufgabe1() {
		System.out.println("Sie haben Sich für Aufgabe 1 entschieden.");
		System.out.println("Um ihren Bonus zu berechnen, geben Sie bitte ihre Nettoabnahmemange pro Jahr ein.");
		Scanner scanner1 = new Scanner(System.in);
		double nettoJahr = scanner1.nextDouble();
		scanner1.close();
		if (nettoJahr > 70000.00) {
			double bonus = nettoJahr * 1.05;
			System.out.println("Sie haben Anrecht auf einen Bonus in hoehe von " + bonus + "EUR.");
		} else {
			System.out.println("Die jaehrliche Nettoabnahmemenge muss mind. 70.000EUR betragen, um einen Bonus gewaehrt zu bekommen.");
		}
	}
	
	public static void Aufgabe2() {
		
	}
	
	public static void Aufgabe3() {
		
	}
	
	public static void Aufgabe4() {
		
	}
	
	public static void Aufgabe5() {
		
	}
	
	public static void Aufgabe6() {
		
	}

	public static void main(String[] args) {
		AuswahlAufgabe();
	}

}
