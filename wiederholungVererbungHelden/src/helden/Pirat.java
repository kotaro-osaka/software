package helden;

public class Pirat extends Held {
	private int kraft;
	private int anzahlSchwerter;
	
	public Pirat(int kraft) {
		super(kraft);
		this.anzahlSchwerter = 100;
	}
	
	public int getAnzahlSchwerter() {
		return anzahlSchwerter;
	}
	
	public void setAnzahlSchwerter(int anzahlSchwerter) {
		this.anzahlSchwerter = anzahlSchwerter;
	}
}
