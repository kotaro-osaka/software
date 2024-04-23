import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Kunde {
	private int kundennummer;
	private String nachname;
	private String vorname;
	private Date geburtsdatum;
	private String strasse;
	private int plz;
	private String ort;
	private Date kundeSeit;
	private String geschlecht;
	private String familienstand;
	private short aboTyp;

	public Kunde(int kundennummer, String vorname, String nachname, String strGeburtsdatum, String strasse, int plz, String ort,
			String strKundeSeit, String geschlecht, String familienstand, int aboTyp) {
		super();
		this.kundennummer = kundennummer;
		this.nachname = nachname;
		this.vorname = vorname;
		this.geburtsdatum = stringToDate(strGeburtsdatum);
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.kundeSeit = stringToDate(strKundeSeit);;
		this.geschlecht = geschlecht;
		this.familienstand = familienstand;
		this.aboTyp = (short) aboTyp;
	}

	public static int getAnzahlKunden() {
		return Kundenstamm.getAnzahlKunden();
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public Date getKundeSeit() {
		return kundeSeit;
	}

	public void setKundeSeit(Date kundeSeit) {
		this.kundeSeit = kundeSeit;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public short getAboTyp() {
		return aboTyp;
	}

	public void setAboTyp(short aboTyp) {
		this.aboTyp = aboTyp;
	}

	public String getFamilienstand() {
		return familienstand;
	}

	public void setFamilienstand(String familienstand) {
		this.familienstand = familienstand;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getFullname() {
		return this.getVorname()+ " " + this.getNachname();
	}
	
	
	private  Date stringToDate(String string) {

		Date datum = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

		try {
			datum = simpleDateFormat.parse(string);

		} catch (ParseException pe) {
			System.out.println("Fehler im Datum");
		}

		return datum;
	}
	
}