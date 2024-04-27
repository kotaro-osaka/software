package s_226;

import java.util.Scanner;

public class Aufgabe8 {
	static int rows;
	
	public static void userAbfrage() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie ein, wieviele Reihen die Figur haben soll");
		rows = scanner.nextInt();
		
		scanner.close();
	}
	
	public static void ausgabeFigur() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * (rows - i) - 1; k++) {
	                System.out.print("*");
			}
	        System.out.println();
	        }
	}
	
	public static void main(String[] args) {
		userAbfrage();
		ausgabeFigur();
	}
}