package helden;

public class Test {
	public static void main(String[] args) {
		Zauberer zauberer = new Zauberer(1, 2);
		Pirat pirat = new Pirat(3);
		
		printKraft(zauberer);
		printKraft(pirat);
	}
	
	public static void printKraft(Held held) {
		System.out.println("Kraft: " + held.getKraft());
	}
}
