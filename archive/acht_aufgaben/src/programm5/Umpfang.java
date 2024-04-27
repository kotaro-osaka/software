package programm5;
import java.util.Scanner;

public class Umpfang {
	// Static to make class-level variable, not instance-level
	static double laenge, breite;
	
	public static void abfrage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Länge in cm eingeben");
		laenge = input.nextDouble();
		System.out.println("Breite in cm eingeben");
		breite = input.nextDouble();
		input.close();
	}
	
	public static double rechnungUmpfang(double laenge, double breite) {
		double umpfang = (2 * laenge) + (2 * breite);
		return umpfang;
	}
	
	public static double rechnungFlaecheninhalt(double laenge, double breite) {
		double flaecheninhalt = laenge * breite;
		return flaecheninhalt;
	}
	
	public static double rechnungDiagonale(double laenge, double breite) {
		double diagonale = Math.sqrt(Math.pow(laenge, 2) + Math.pow(breite, 2)); // Wurzel aus laenge^2 + breite
		return diagonale;
	}

	public static void main(String[] args) {
		abfrage();
		
		// Ausgabe vom Ergebnis
		System.out.println("Der Umpfang betraegt: " + rechnungUmpfang(laenge, breite) + "cm");
		System.out.println("Der Flächeninhalt betraegt: " + rechnungFlaecheninhalt(laenge, breite) + "cm^2");
		System.out.println("Die Diagonale betraegt: " + rechnungDiagonale(laenge, breite) + "cm");
	}
}