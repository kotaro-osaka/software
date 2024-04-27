package arrays;

public class Arrays {
	
	static int bereich = 20;
	static int anzahlGenZahlen = 10000;
	static int[] zufallszahlen = new int[anzahlGenZahlen];
	static int[] anzahlGezogen = new int[bereich];
	
	public static void zahlenGenerieren() {		
		for (int i = 0; i < anzahlGenZahlen; i++) {
			zufallszahlen[i] = (int) (Math.random() * bereich) + 1;
			anzahlGezogen[zufallszahlen[i] - 1] += 1;
		}
		gezogenAusgeben();
	}
	
	public static void gezogenAusgeben() {
		for (int i = 0; i < bereich; i++) {
			System.out.println(anzahlGezogen[i]);
		}
	}
	
	public static void main(String[] args) {
		zahlenGenerieren();
	}
}