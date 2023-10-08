package temperatur;
import java.util.Scanner;

public class Temperatur {
	
	public static void tempRechnung(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit + " Fahrenheit sind " + celsius + " Celsius.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie eine Temperatur in Fahrenheit an.");
		double fahrenheit = input.nextDouble();
		input.close();
		
		tempRechnung(fahrenheit);
	}

}
