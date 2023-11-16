package s_226;

import java.util.Scanner;

public class Aufgabe4 {
	static int userZahl;
	
	public static void userAbfrage() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie eine ganze Zahl ein.");
		userZahl = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(berechneFakultaet(userZahl));
	}
	
	static int berechneFakultaet(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * berechneFakultaet(n - 1);
        }
    }

	
	public static void main(String[] args) {
		userAbfrage();
	}
}