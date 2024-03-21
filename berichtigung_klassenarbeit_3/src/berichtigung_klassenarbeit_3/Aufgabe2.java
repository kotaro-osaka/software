package berichtigung_klassenarbeit_3;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		int zahl = 123456789;
		int[] ziffern = new int[9];
		
		for (int i = 0; i < 9; i++) {
			ziffern[i] = zahl % 10;
			zahl = zahl / 10;
		}
		System.out.println(ziffern);
	}
}