package berichtigung_klassenarbeit_3;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		int[] tipp = { 4, 9, 23, 24, 46, 49 };
		int[] gewinnzahlen = { 32, 9, 23, 49, 4, 1 };
		int[] quoten = { 0, 0, 0, 10, 53, 4610, 584453 };
		int anzahlTreffer = 0;
		
		for (int i = 0; i < tipp.length; i++) {
			for (int j = 0; j < gewinnzahlen.length; j++) {
				if (tipp[i] == gewinnzahlen[j]) {
					anzahlTreffer++;
				}
			}
		}
		System.out.println("Anzahl der richtig erratenen Zahlen: " + anzahlTreffer);
		System.out.println("Erzielter Gewinn: " + quoten[anzahlTreffer]);
	}
}