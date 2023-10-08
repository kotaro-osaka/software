package programm2;
import java.util.Scanner;

public class DivisionRest {
	// Static to make class-level variable, not instance-level
	static int dividend, divisor;
	
	public static void abfrage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Dividend angeben");
		dividend = input.nextInt();
		System.out.println("Divisor angeben");
		divisor = input.nextInt();
		input.close();
	}
	
	public static double rechnung(int dividend, int divisor) {
		double rest = dividend % divisor;
		return rest;
	}
	
	public static void main(String[] args) {
		abfrage();
		
		// Ausgabe vom Ergebnis
		System.out.println("Der ganzzahlige Rest betraegt: " + rechnung(dividend, divisor));
	}
}