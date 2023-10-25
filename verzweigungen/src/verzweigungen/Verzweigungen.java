package verzweigungen;

import java.util.Scanner;

public class Verzweigungen {
	
	public static void AuswahlAufgabe() {
		System.out.println("Es stehen 6 Aufgaben zur Verfuegung. Geben Sie eine Zahl ein, um die jeweilige Aufgabe zu starten.");
		System.out.println("1. 5%% Bonus bei Nettoabnahmemenge von mind. 70.000EUR");
		System.out.println("2. Jaehrliche Zinsen bei Anlagebetraegen von bis zu 5.000, 10.000, 50.000, oder ab 50.000EUR berechnen");
		System.out.println("3. Bruttolohn durch angabe von Arbeitsstunden pro Woche und Stundenlohn berechnen");
		System.out.println("4. Nach Eingabe einer Zahl, bestimmen, ob es sich um eine gerade oder ungerade Zahl handelt");
		System.out.println("5. Nach Eingabe dreier Zahlen, bestimmen, welche von ihnen die groesste Zahl ist");
		System.out.println("6. Nach Eingabe einer Jahreszahl, bestimmen, ob es sich um ein Schaltjahr handelt");
		
		Scanner scanner = new Scanner(System.in);
		int auswahl = scanner.nextInt();
		
		scanner.close();
		
		Auswahl(auswahl);
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
		System.out.println("Um Ihren Bonus zu berechnen, geben Sie bitte ihre Nettoabnahmemange pro Jahr ein.");
		
		Scanner scanner1 = new Scanner(System.in);
		double nettoJahr = scanner1.nextDouble();
		
		scanner1.close();
		
		if (nettoJahr >= 70000.00) {
			double bonus = nettoJahr * 0.05;
			System.out.println("Sie haben Anrecht auf einen Bonus in hoehe von " + bonus + "EUR.");
		} else {
			System.out.println("Die jaehrliche Nettoabnahmemenge muss mind. 70.000EUR betragen, um einen Bonus gewaehrt zu bekommen.");
		}
	}
	
	public static void Aufgabe2() {
		System.out.println("Sie haben Sich für Aufgabe 2 entschieden.");
		System.out.println("Um Ihre Zinsen zu berechnen, geben Sie bitte Ihren Kontostand ein.");
		
		Scanner scanner2 = new Scanner(System.in);
		double kontoStand = scanner2.nextDouble();
		
		scanner2.close();
		
		double zinsen;
		if (kontoStand <= 5000.00) {
			zinsen = kontoStand * 0.02;
			System.out.println("Sie haben Anrecht auf jaehrliche Zinsen in hoehe von " + zinsen + "EUR. (2%%)");
		} else if (kontoStand <= 10000.00) {
			zinsen = kontoStand * 0.225;
			System.out.println("Sie haben Anrecht auf jaehrliche Zinsen in hoehe von " + zinsen + "EUR. (2,25%%)");
		} else if (kontoStand <= 50000.00) {
			zinsen = kontoStand * 0.25;
			System.out.println("Sie haben Anrecht auf jaehrliche Zinsen in hoehe von " + zinsen + "EUR. (2,5%%)");
		} else {
			zinsen = kontoStand * 0.275;
			System.out.println("Sie haben Anrecht auf jaehrliche Zinsen in hoehe von " + zinsen + "EUR. (2,75%%)");
		}
	}
	
	public static void Aufgabe3() {
		System.out.println("Sie haben Sich für Aufgabe 2 entschieden.");
		System.out.println("Um Ihren Bruttolohn zu berechnen, geben Sie bitte Ihre geleisteten Arbeitsstunden pro Woche an.");
		
		Scanner scanner3 = new Scanner(System.in);
		double wochenStunden = scanner3.nextDouble();
		
		System.out.println("Um Ihren Bruttolohn zu berechnen, geben Sie bitte Ihren Stundenlohn an.");
		double stundenLohn = scanner3.nextDouble();
		
		scanner3.close();
		
		double bruttoLohn = 0, ueberStunden, ueberStundenLohn;
		if (wochenStunden > 80.00) {
			System.out.println("Ihr Bruttolohn konnte leider, aufgrund zu vieler Wochenstunden, nicht berechnet werden.");
		} else if (stundenLohn > 50.00) {
			System.out.println("Ihr Bruttolohn konnte leider, aufgrund eines zu hohen Stundenlohns, nicht berechnet werden.");
		} else {
			if (wochenStunden - 35 != 0.00) {
				ueberStunden = wochenStunden - 35;
				System.out.println("An wievielen ihrer " + ueberStunden + " Ueberstunden haben Sie an Sonn- oder Feiertagen gearbeitet?");
				
				Scanner scannerSonnFeierTagStunden = new Scanner(System.in);
				
				double sonnFeierTagStunden = scannerSonnFeierTagStunden.nextDouble();
				
				scannerSonnFeierTagStunden.close();
				
				ueberStunden -= sonnFeierTagStunden;
				bruttoLohn = (35 * stundenLohn) + (ueberStunden * (stundenLohn * 1.50)) + (sonnFeierTagStunden * (stundenLohn * 1.75));
			} else {
				bruttoLohn = wochenStunden * stundenLohn;
			}
		}
		System.out.println("Ihr Bruttolohn betraegt " + bruttoLohn + "EUR.");
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
