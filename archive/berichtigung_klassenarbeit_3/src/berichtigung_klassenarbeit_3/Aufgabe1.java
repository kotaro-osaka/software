package berichtigung_klassenarbeit_3;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		int[] anstoesse = new int[101];
		
		for (int i = 0; i <= 100; i++) {
			anstoesse[i] = (i*(i-1))/2;
		}
	}
}
