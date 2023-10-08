package programm6;
import java.util.Scanner;

public class MbMiB {
	// Static to make class-level variable, not instance-level
	static double bytes;
	
	public static void abfrage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Speichergröße in Byte eingeben");
		bytes = input.nextDouble();
		input.close();
	}
	
	public static double rechnungMegabyte(double bytes) {
		double megabyte = bytes / 1e+6;
		return megabyte;
	}
	
	public static double rechnungMebibyte(double bytes) {
		double mebibyte = bytes / 1.049e+6;
		return mebibyte;
	}
	
	public static void main(String[] args) {
		abfrage();
		
		// Ausgabe vom Ergebnis
		System.out.println(bytes + " bytes sind " + rechnungMegabyte(bytes) + " MB");
		System.out.println(bytes + " bytes sind " + rechnungMebibyte(bytes) + " MiB");
	}
}