// Kotaro Osaka

package liste;

public class Main {
	public static void main(String[] args) {
		Ort[] orte = Datenbank.liesOrte();
		
		for (Ort ort : orte) {
			if (ort.getPLZ().toString() == "44359") {
				System.out.println(ort.getOrt());
				break;
			}
		}
		
		Datenbank.liesOrteEinmalig();
	}
}