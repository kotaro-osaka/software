package test;

import main.Kunde;
import main.Kundenstamm;

import java.util.ArrayList;

public class TestSortArrayList {

    public static void main(String[] args) {
        System.out.println("Sort with modified natural order:");
        sort();

        System.out.print("\n");
        System.out.println("Kundennummer:");
        kundennummer();

        System.out.print("\n");
        System.out.println("Nachname as case sensitive");
        nachnameAsCaseSensitive();

        System.out.print("\n");
        System.out.println("Nachname as case insensitive:");
        nachnameAsCaseInsensitive();

        System.out.print("\n");
        System.out.println("Vorname as case sensitive:");
        vornameAsCaseSensitive();

        System.out.print("\n");
        System.out.println("Vorname as case insensitive:");
        vornameAsCaseInsensitive();

        System.out.print("\n");
        System.out.println("Full Name as case sensitive:");
        fullNameAsCaseSensitive();

        System.out.print("\n");
        System.out.println("Full Name as case insensitive:");
        fullNameAsCaseInsensitive();

        System.out.print("\n");
        System.out.println("Geburtsdatum:");
        geburtsdatum();

        System.out.println("\n");
        System.out.println("Strasse as case sensitive:");
        strasseAsCaseSensitive();

        System.out.println("\n");
        System.out.println("Strasse as case insensitive:");
        strasseAsCaseInsensitive();

        System.out.print("\n");
        System.out.println("PLZ:");
        plz();

        System.out.println("\n");
        System.out.println("Ort as case sensitive:");
        ortAsCaseSensitive();

        System.out.println("\n");
        System.out.println("Ort as case insensitive:");
        ortAsCaseInsensitive();

        System.out.print("\n");
        System.out.println("Kunde Seit:");
        kundeSeit();

        System.out.print("\n");
        System.out.println("Geschlecht:");
        geschlecht();

        System.out.print("\n");
        System.out.println("Familienstand as case sensitive:");
        familienstandAsCaseSensitive();

        System.out.print("\n");
        System.out.println("Abo Typ");
        aboTyp();
    }

    private static void sort() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayList();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getNachname());
        }
    }

    private static void kundennummer() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByKundennummer();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getKundennummer());
        }
    }

    private static void nachnameAsCaseSensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByNachnameAsCaseSensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getNachname());
        }
    }

    private static void nachnameAsCaseInsensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByNachnameAsCaseInsensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getNachname());
        }
    }

    private static void vornameAsCaseSensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByVornameAsCaseSensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getVorname());
        }
    }

    private static void vornameAsCaseInsensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByVornameAsCaseInsensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getVorname());
        }
    }

    private static void fullNameAsCaseSensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByFullNameAsCaseSensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getFullName());
        }
    }

    private static void fullNameAsCaseInsensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByFullNameAsCaseInsensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getFullName());
        }
    }

    private static void geburtsdatum() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByGeburtsdatum();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getGeburtsdatum());
        }
    }

    private static void strasseAsCaseSensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByStrasseAsCaseSensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getStrasse());
        }
    }

    private static void strasseAsCaseInsensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByStrasseAsCaseInsensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getStrasse());
        }
    }

    private static void plz() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByPLZ();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getPlz());
        }
    }

    private static void ortAsCaseSensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByOrtAsCaseSensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getOrt());
        }
    }

    private static void ortAsCaseInsensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByOrtAsCaseInsensitive();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getOrt());
        }
    }

    private static void kundeSeit() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArraylistByKundeSeit();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getKundeSeit());
        }
    }

    private static void geschlecht() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByGeschlecht();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getGeschlecht());
        }
    }

    private static void familienstandAsCaseSensitive() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByFamilienstand();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getFamilienstand());
        }
    }

    private static void aboTyp() {
        ArrayList<Kunde> kunden;

        kunden = Kundenstamm.sortArrayListByAboTyp();

        for (Kunde kunde : kunden) {
            System.out.println(kunde.getAboTyp());
        }
    }

}