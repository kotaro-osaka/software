package datenbank;

public class Kunde {
	private int kundennummer;
	private String vorname;
	private String nachname;
	// private LocalDate geburtsdatum;
	// private String strasse;
	// private LoalDate kundeSeit;
	// private short plz;
	// private String geschlecht;
	// private String familienstand;
	// private short abotyp;
	
	public Kunde(int kundennummer, String vorname, String nachname) {
		super();
		this.kundennummer = kundennummer;
		this.vorname = vorname;
		this.nachname = nachname;
		// this.geburtsdatum = geburtsdatum;
		// this.strasse = strasse;
		// this.kundeSeit = kundeSeit;
		// this.plz = plz;
		// this.geschlecht = geschlecht;
		// this.familienstand = familienstand;
		// this.abotyp = abotyp;
	}
	
	// getters
	
	@SuppressWarnings("unused")
	public int getKundennummer() {
		return kundennummer;
	}
	
	@SuppressWarnings("unused")
	public String getVorname() {
		return vorname;
	}
	
	@SuppressWarnings("unused")
	public String getNachname() {
		return nachname;
	}
	
	// setters
	
	@SuppressWarnings("unused")
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
	
	@SuppressWarnings("unused")
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	@SuppressWarnings("unused")
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
}
