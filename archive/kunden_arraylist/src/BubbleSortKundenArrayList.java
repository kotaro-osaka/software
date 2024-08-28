import java.util.ArrayList;

public class BubbleSortKundenArrayList {

    static int anzahlKunden = Kundenstamm.getAnzahlKundenArrayList();

    public static void main(String[] args) {
        ArrayList<Kunde> kunden = Kundenstamm.liesKundenAsArrayList();

        nachname(kunden);
        System.out.println();
        vorname(kunden);
        System.out.println();
        vornameNachname(kunden);
        System.out.println();
        geburtsjahr(kunden);
        System.out.println();
        plz(kunden);
        System.out.println();
        familienstand(kunden);
    }

    static void nachname(ArrayList<Kunde> kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden.get(j).getNachname().toCharArray()[0] > kunden.get(j+1).getNachname().toCharArray()[0]) {
                    temp = kunden.get(j);
                    kunden.set(j, kunden.get(j + 1));
                    kunden.set(j + 1, temp);
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getNachname());
        }
    }

    static void vorname(ArrayList<Kunde> kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden.get(j).getVorname().toCharArray()[0] > kunden.get(j + 1).getVorname().toCharArray()[0]) {
                    temp = kunden.get(j);
                    kunden.set(j, kunden.get(j + 1));
                    kunden.set(j + 1, temp);
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getVorname());
        }
    }


    static void vornameNachname(ArrayList<Kunde> kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden.get(j).getFullName().toCharArray()[0] > kunden.get(j + 1).getFullName().toCharArray()[0]) {
                    temp = kunden.get(j);
                    kunden.set(j, kunden.get(j + 1));
                    kunden.set(j + 1, temp);
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getFullName());
        }
    }


    static void geburtsjahr(ArrayList<Kunde> kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden.get(j).getGeburtsdatum().getYear() > kunden.get(j + 1).getGeburtsdatum().getYear()) {
                    temp = kunden.get(j);
                    kunden.set(j, kunden.get(j + 1));
                    kunden.set(j + 1, temp);
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getGeburtsdatum().getYear());
        }
    }


    static void plz(ArrayList<Kunde> kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden.get(j).getPlz() > kunden.get(j + 1).getPlz()) {
                    temp = kunden.get(j);
                    kunden.set(j, kunden.get(j + 1));
                    kunden.set(j + 1, temp);
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getPlz());
        }
    }


    static void familienstand(ArrayList<Kunde> kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden.get(j).getFamilienstand().toCharArray()[0] > kunden.get(j + 1).getFamilienstand().toCharArray()[0]) {
                    temp = kunden.get(j);
                    kunden.set(j, kunden.get(j + 1));
                    kunden.set(j + 1, temp);
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getFamilienstand());
        }
    }

}