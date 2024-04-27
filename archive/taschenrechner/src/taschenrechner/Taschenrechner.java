package taschenrechner;

public class Taschenrechner {

	public static void main(String[] args) {
		int zahl1, zahl2, summe, produkt, differenz;
		double quotient;
		
		zahl1 = 456;
		zahl2 = 123;
		summe = zahl1 + zahl2;
		produkt = zahl1 * zahl2;
		quotient = (double)zahl1 / (double)zahl2;
		differenz = zahl1 - zahl2;
		
		System.out.println("Die Summe von " + zahl1 + " und " + zahl2 + " ist " + summe);
		System.out.println("Das Produkt von " + zahl1 + " und " + zahl2 + " ist " + produkt);
		System.out.println("Der Quotient von " + zahl1 + " und " + zahl2 + " ist " + quotient);
		System.out.println("Die Differenz von " + zahl1 + " und " + zahl2 + " ist " + differenz);
	}
}

//A
// Zahl = 0
// Error:
//Exception in thread "main" java.lang.ArithmeticException: / by zero at Start.main(Start.java:16)
// Es darf nicht durch 0 dividiert werden.

//B
// Sehr hohe Zahlen:
// Unresolved compilation problem: 
// The literal 12132342342 of type int is out of range
// int reicht nur von -2.147.483.648 bis 2147.483.647