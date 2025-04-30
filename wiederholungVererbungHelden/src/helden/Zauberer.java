package helden;

public class Zauberer extends Held {
	private int kraft;
	private int anzahlZaubersprueche;
	
	public Zauberer(int kraft) {
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
