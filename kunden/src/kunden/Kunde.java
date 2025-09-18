package kunden;

import java.time.LocalDate;

public class Kunde {
	private int kundennummer;
	private String vorname;
	private String nachname;
	private LocalDate geburtsdatum;
	private String strasse;
	private LocalDate kundeSeit;
	private int plz;
	private String ort;
	private String geschlecht;
	private String familienstand;
	private String abotyp;
	
	public Kunde(int kundennummer, String vorname, String nachname, LocalDate geburtsdatum, String strasse, LocalDate kundeSeit, int plz, String ort, String geschlecht, String familienstand, String abotyp) {
		super();
		this.kundennummer = kundennummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.strasse = strasse;
		this.kundeSeit = kundeSeit;
		this.plz = plz;
		this.ort = ort;
		this.geschlecht = geschlecht;
		this.familienstand = familienstand;
		this.abotyp = abotyp;
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
	
	@SuppressWarnings("unused")
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}
	
	@SuppressWarnings("unused")
	public String getStrasse() {
		return strasse;
	}
	
	@SuppressWarnings("unused")
	public LocalDate getKundeSeit() {
		return kundeSeit;
	}
	
	@SuppressWarnings("unused")
	public int getPlz() {
		return plz;
	}
	
	@SuppressWarnings("unused")
	public String getOrt() {
		return ort;
	}
	
	@SuppressWarnings("unused")
	public String getGeschlecht() {
		return geschlecht;
	}
	
	@SuppressWarnings("unused")
	public String getFamilienstand() {
		return familienstand;
	}
	
	@SuppressWarnings("unused")
	public String getAbotyp() {
		return abotyp;
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
	
	@SuppressWarnings("unused")
	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
	@SuppressWarnings("unused")
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	@SuppressWarnings("unused")
	public void setKundeSeit(LocalDate kundeSeit) {
		this.kundeSeit = kundeSeit;
	}
	
	@SuppressWarnings("unused")
	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	@SuppressWarnings("unused")
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	@SuppressWarnings("unused")
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	@SuppressWarnings("unused")
	public void setFamilienstand(String familienstand) {
		this.familienstand = familienstand;
	}
	
	@SuppressWarnings("unused")
	public void setAbotyp(String abotyp) {
		this.abotyp = abotyp;
	}
}
