package programm7;
import java.util.Scanner;

public class Durchschnitt {
	// Static to make class-level variable, not instance-level
	static double zahl1, zahl2, zahl3, zahl4;
	
	public static void abfrage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Gebe 4 Zahlen ein");
		zahl1 = input.nextDouble();
		zahl2 = input.nextDouble();
		zahl3 = input.nextDouble();
		zahl4 = input.nextDouble();
		input.close();
	}
	
	public static double rechnung(double zahl1, double zahl2, double zahl3, double zahl4) {
		double durchschnitt = (zahl1 + zahl2 + zahl3 + zahl4) / 4;
		return durchschnitt;
	}
	
	public static void main(String[] args) {
		abfrage();
		
		// Ausgabe vom Ergebnis
		System.out.println("Der Durchschnitt der Zahlen " + zahl1 + ", " + zahl2 + ", " + zahl3 + " und " + zahl4 + " betraegt " + rechnung(zahl1, zahl2, zahl3, zahl4));
	}
}
