public class BubbleSortKunden {

    static int anzahlKunden = Kundenstamm.getAnzahlKunden();

    static Kunde[] createKunden() {
        return Kundenstamm.liesKunden();
    }

    public static void main(String[] args) {
        Kunde[] kunden = createKunden();

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

    static void nachname(Kunde[] kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden[j].getNachname().toCharArray()[0] > kunden[j+1].getNachname().toCharArray()[0]) {
                    temp = kunden[j];
                    kunden[j] = kunden[j+1];
                    kunden[j+1] = temp;
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getNachname());
        }
    }

    static void vorname(Kunde[] kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden[j].getVorname().toCharArray()[0] > kunden[j+1].getVorname().toCharArray()[0]) {
                    temp = kunden[j];
                    kunden[j] = kunden[j+1];
                    kunden[j+1] = temp;
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getVorname());
        }
    }


    static void vornameNachname(Kunde[] kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden[j].getFullName().toCharArray()[0] > kunden[j+1].getFullName().toCharArray()[0]) {
                    temp = kunden[j];
                    kunden[j] = kunden[j+1];
                    kunden[j+1] = temp;
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getFullName());
        }
    }


    static void geburtsjahr(Kunde[] kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden[j].getGeburtsdatum().getYear() > kunden[j+1].getGeburtsdatum().getYear()) {
                    temp = kunden[j];
                    kunden[j] = kunden[j+1];
                    kunden[j+1] = temp;
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getGeburtsdatum().getYear());
        }
    }


    static void plz(Kunde[] kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden[j].getPlz() > kunden[j+1].getPlz()) {
                    temp = kunden[j];
                    kunden[j] = kunden[j+1];
                    kunden[j+1] = temp;
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getPlz());
        }
    }


    static void familienstand(Kunde[] kunden) {
        Kunde temp;

        for (int i = 0; i < anzahlKunden; i++) {
            for (int j = 0; j < anzahlKunden-i-1; j++) {
                if (kunden[j].getFamilienstand().toCharArray()[0] > kunden[j+1].getFamilienstand().toCharArray()[0]) {
                    temp = kunden[j];
                    kunden[j] = kunden[j+1];
                    kunden[j+1] = temp;
                }
            }
        }

        for (Kunde item : kunden) {
            System.out.println(item.getFamilienstand());
        }
    }

}