package programm1;
import java.util.Scanner;

public class DurchschnittsVerbrauch {
	// Static to make class-level variable, not instance-level
	static double km, tank;
	
	public static void abfrage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Gefahrene Distanz in Kilometer angeben");
		km = input.nextDouble();
		System.out.println("Getankte Menge in Liter angeben");
		tank = input.nextDouble();
		input.close();
	}
	
	public static double rechnung(double km, double tank) {
		double verbrauch = (tank / km) * 100.0;		// Durchschnittsverbrauch auf 100 km
		return verbrauch;
	}
	
	public static void main(String[] args) {
		abfrage();
		
		// Ausgabe vom Ergebnis
		System.out.println("Pro 100km wurden " + rechnung(km, tank) + "l verbraucht");
	}
}