package bmi;
import java.util.Scanner;

public class BMI {
	
	public static void bmiRechnung(double gewicht, double groesse) {
		double bmi = gewicht / (groesse * groesse);
		System.out.println("Das BMI beträgt: " + bmi);
	}

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie das Körpergewicht des Patienten in Kilogramm ein.");
		double koerperGewicht = input.nextDouble();
		System.out.println("Geben Sie die Körpergröße des Patienten in Metern ein.");
		double koerperGroesse = input.nextDouble();
		input.close();
		
		bmiRechnung(koerperGewicht, koerperGroesse);
	}
}