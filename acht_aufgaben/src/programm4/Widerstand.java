package programm4;
import java.util.Scanner;

public class Widerstand {
	// Static to make class-level variable, not instance-level
	static double spannung, stromstaerke;
	
	public static void abfrage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Elektrische Spannung (U) eingeben");
		spannung = input.nextDouble();
		System.out.println("Stromstärke (A) eingeben");
		stromstaerke = input.nextDouble();
		input.close();
	}
	
	public static double rechnung(double spannung, double stromstaerke) {
		double widerstand = spannung / stromstaerke;
		return widerstand;
	}
	
	public static void main(String[] args) {
		abfrage();
		
		// Ausgabe vom Ergebnis
		System.out.println("Der Bareinkaufspreis betraegt: " + rechnung(spannung, stromstaerke));
	}
}