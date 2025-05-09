package helden;

public class Pirat extends Held {
	@SuppressWarnings("unused")
	private int kraft;
	private int anzahlSchwerter;
	
	public Pirat(int kraft) {
		super(kraft);
		this.anzahlSchwerter = 100;
	}
	
	@Override
	public int getKraft() {
		return this.kraft;
	}	
	
	public int getAnzahlSchwerter() {
		return this.anzahlSchwerter;
	}
	
	public void setAnzahlSchwerter(int anzahlSchwerter) {
		this.anzahlSchwerter = anzahlSchwerter;
	}
}
