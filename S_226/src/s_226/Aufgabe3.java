package s_226;

import java.util.Scanner;

public class Aufgabe3 {
	static int userZahl;
	
	public static void userAbfrage() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie eine ganze Zahl ein.");
		userZahl = scanner.nextInt();
		
		scanner.close();
		
		ausgabeSumme(userZahl);
	}
	
	public static void ausgabeSumme(int userZahl) {
		for (int i = userZahl; i > 0; i--) {
			if (i != userZahl) {
				userZahl += i;
			}
		}
		System.out.println(userZahl);
	}
	
	public static void main(String[] args) {
		userAbfrage();
	}
}
