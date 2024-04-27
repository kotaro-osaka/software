package programm3;
import java.util.Scanner;

public class BarEinkaufsPreis {
	// Static to make class-level variable, not instance-level
	static double preis, rabattProzent, skontoProzent;
	
	public static void abfrage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Listenpreis angeben");
		preis = input.nextDouble();
		System.out.println("Lieferantenrabatt in Prozent angeben");
		rabattProzent = input.nextDouble();
		System.out.println("Skonto des Lieferers in Prozent angeben");
		skontoProzent = input.nextDouble();
		input.close();
	}
	
	public static double rechnung(double preis, double rabattProzent, double skontoProzent) {
		// Prozent in Dezimal umrechnen
		double rabatt = rabattProzent / 100.0;
		double skonto = skontoProzent / 100.0;
		// Bareinkaufspreis
		double bareinkaufspreis = preis - (preis * rabatt) + (preis - (preis * rabatt)) * skonto;
		return bareinkaufspreis;
	}
	
	public static void main(String[] args) {
		abfrage();
		
		// Ausgabe vom Ergebnis
		System.out.println("Der Bareinkaufspreis betraegt: " + rechnung(preis, rabattProzent, skontoProzent));
	}
}