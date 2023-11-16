package s_226;

public class Aufgabe1 {
	public static void zaehlen(int min, int max) {
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		zaehlen(0, 20);
	}
}