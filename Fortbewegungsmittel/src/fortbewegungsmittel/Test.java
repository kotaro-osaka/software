package fortbewegungsmittel;

public class Test {
	public static void main(String[] args) {
		Auto auto = new Auto();
		Flugzeug flugzeug = new Flugzeug();
		Longboard longboard = new Longboard();
		
		fortbewegen(auto);
		fortbewegen(flugzeug);
		fortbewegen(longboard);
	}
	
	public static void fortbewegen(Fortbewegungsmittel fortbewegungsmittel) {
		fortbewegungsmittel.fortbewegen();
	}
}
