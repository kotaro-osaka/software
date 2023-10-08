package programm8;
import java.util.Scanner;

public class SpeicherBedarf {
	// Static to make class-level variable, not instance-level
	static double laenge, breite, speicherProPixel, anzahlBilder;
	
	public static void abfrage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bildlaenge in Pixeln eingeben");
		laenge = input.nextDouble();
		System.out.println("Bildbreite in Pixeln eingeben");
		breite = input.nextDouble();
		System.out.println("Speicherbedarf pro Pixel in Byte eingeben");
		speicherProPixel = input.nextDouble();
		System.out.println("Anzahl der zu speichernden Bilder eingeben");
		anzahlBilder = input.nextDouble();
		input.close();
	}
	
	public static double rechnung(double laenge, double breite, double speicherProPixel, double anzahlBilder) {
		// Rechnung Anzahl der Pixel
		double anzahlPixel = laenge * breite;
		// Rechnung Speicherbedarf pro Bild in Byte
		double speicherProBild = anzahlPixel * speicherProPixel;
		// Rechnung Gesamtspeicherbedarf in Byte
		double gesamtspeicherbedarfByte = speicherProBild * anzahlBilder;
		// Rechnung Gesamtspeicherbedarf in Gibibyte
		double gesamtspeicherbedarfGiB = gesamtspeicherbedarfByte / 1.074e+9;
		return gesamtspeicherbedarfGiB;
	}
	
	public static void main(String[] args) {
		abfrage();
		
		// Ausgabe vom Ergebnis
		System.out.println("Der Speicherplatzbefarf betraegt " + rechnung(laenge, breite, speicherProPixel, anzahlBilder) + " GiB");
	}
}