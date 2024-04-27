package s_226;

import java.util.Scanner;

public class Aufgabe7 {
	static long anlageBetrag, zinsSatz;
	
	public static void userAbfrage() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie einen Anlagebetrag ein.");
		anlageBetrag = scanner.nextLong();
		
		System.out.println("Geben Sie einen Zinssatz ein.");
		zinsSatz = scanner.nextLong();
		
		scanner.close();
		
		rechnungJahreBisMil(anlageBetrag, zinsSatz);
	}
	
	public static void rechnungJahreBisMil(long anlageBetrag, long zinsSatz) { // Ausgabe in Jahren
		int jahreBisMil = 0;
		for (long i = anlageBetrag; i < 1000000; i += zinsSatz) {
			jahreBisMil++;
		}
		System.out.println("Sie muessen " + jahreBisMil + " Jahr(e) das Geld anlegen, um eine Million zu erhalten.");
	}
	
	public static void main(String[] args) {
		userAbfrage();
	}
}