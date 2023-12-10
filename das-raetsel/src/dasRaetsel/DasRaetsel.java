package dasRaetsel;

public class DasRaetsel {
	
	static hatKeineNullen(int num) {
		
	}
	
	public static void main(String[] args) {
		for (int num = 1000001; num <= 9999999; num++) {
			if (hatKeineNullen(num) && !isPalindrom(num) && isVielfachesUmkehrung(num)) {
				System.out.println("Gesuchte Zahl: " + num);
			}
		}
	}

}

// Die Arbeitsschritte sollen so in Funktionen aufgeteilt sein, dass diese jeweils von einem eigenem Team bearbeitet werden können.