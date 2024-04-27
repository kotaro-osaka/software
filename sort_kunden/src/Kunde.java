import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Kunde {
    private int kundennummer;
    private String nachname;
    private String vorname;
    private LocalDate geburtsdatum;
    private String strasse;
    private int plz;
    private String ort;
    private LocalDate kundeSeit;
    private String geschlecht;
    private String familienstand;
    private short aboTyp;

    public Kunde(int kundennummer, String vorname, String nachname, String strGeburtsdatum, String strasse, int plz, String ort,
                 String strKundeSeit, String geschlecht, String familienstand, int aboTyp) {
        super();
        this.kundennummer = kundennummer;
        this.nachname = nachname;
        this.vorname = vorname;
        this.geburtsdatum = stringToLocalDate(strGeburtsdatum);
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.kundeSeit = stringToLocalDate(strKundeSeit);
        this.geschlecht = geschlecht;
        this.familienstand = familienstand;
        this.aboTyp = (short) aboTyp;
    }

    @SuppressWarnings("unused")
    public static int getAnzahlKunden() {
        return Kundenstamm.getAnzahlKunden();
    }

    @SuppressWarnings("unused")
    public String getNachname() {
        return nachname;
    }

    @SuppressWarnings("unused")
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @SuppressWarnings("unused")
    public String getVorname() {
        return vorname;
    }

    @SuppressWarnings("unused")
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @SuppressWarnings("unused")
    public int getKundennummer() {
        return kundennummer;
    }

    @SuppressWarnings("unused")
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    @SuppressWarnings("unused")
    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    @SuppressWarnings("unused")
    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @SuppressWarnings("unused")
    public String getStrasse() {
        return strasse;
    }

    @SuppressWarnings("unused")
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    @SuppressWarnings("unused")
    public int getPlz() {
        return plz;
    }

    @SuppressWarnings("unused")
    public void setPlz(int plz) {
        this.plz = plz;
    }

    @SuppressWarnings("unused")
    public LocalDate getKundeSeit() {
        return kundeSeit;
    }

    @SuppressWarnings("unused")
    public void setKundeSeit(LocalDate kundeSeit) {
        this.kundeSeit = kundeSeit;
    }

    @SuppressWarnings("unused")
    public String getGeschlecht() {
        return geschlecht;
    }

    @SuppressWarnings("unused")
    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    @SuppressWarnings("unused")
    public short getAboTyp() {
        return aboTyp;
    }

    @SuppressWarnings("unused")
    public void setAboTyp(short aboTyp) {
        this.aboTyp = aboTyp;
    }

    @SuppressWarnings("unused")
    public String getFamilienstand() {
        return familienstand;
    }

    @SuppressWarnings("unused")
    public void setFamilienstand(String familienstand) {
        this.familienstand = familienstand;
    }

    @SuppressWarnings("unused")
    public String getOrt() {
        return ort;
    }

    @SuppressWarnings("unused")
    public void setOrt(String ort) {
        this.ort = ort;
    }

    @SuppressWarnings("unused")
    public String getFullName() {
        return this.getVorname() + " " + this.getNachname();
    }

    @SuppressWarnings("unused")
    private LocalDate stringToLocalDate(String string) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate datum;

        try {
            datum = LocalDate.parse(string, formatter);
        } catch (DateTimeParseException pe) {
            System.out.println("Fehler im Datum");
			datum = null;
        }
        return datum;
    }

}