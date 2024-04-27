package s_226;

import java.util.Scanner;

public class Aufgabe2 {
	static int userZahl;
	
	public static void userAbfrage() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie eine ganze Zahl ein.");
		userZahl = scanner.nextInt();
		
		scanner.close();
		
		ausgabeZahlen(userZahl);
	}
	
	public static void ausgabeZahlen(int userZahl) {
		for (int i = userZahl; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		userAbfrage();
	}
}
