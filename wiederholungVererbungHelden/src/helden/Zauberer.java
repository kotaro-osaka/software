package helden;

public class Zauberer extends Held {
	@SuppressWarnings("unused")
	private int kraft;
	private int anzahlZaubersprueche;
	
	public Zauberer(int kraft, int anzahlZaubersprueche) {
		super(kraft);
		this.anzahlZaubersprueche = anzahlZaubersprueche;
	}
	
	public int getAnzahlZaubersprueche() {
		return anzahlZaubersprueche;
	}
	
	public void setAnzahlZaubersprueche(int anzahlZaubersprueche) {
		this.anzahlZaubersprueche = anzahlZaubersprueche;
	}
}
