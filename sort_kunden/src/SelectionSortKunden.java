public class SelectionSortKunden {

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
        int minIdx;
        Kunde temp;

        for (Kunde item : kunden) {
            System.out.println(item.getNachname());
        }
        System.out.println();

        for (int i = 0; i < anzahlKunden-1; i++) {
            minIdx = i;

            for (int j = i+1; j < anzahlKunden; j++) {
                if (kunden[j].getNachname().toCharArray()[0] < kunden[minIdx].getNachname().toCharArray()[0]) {
                    minIdx = j;
                }
            }

            temp = kunden[minIdx];
            kunden[minIdx] = kunden[i];
            kunden[i] = temp;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getNachname());
        }
    }


    static void vorname(Kunde[] kunden) {
        int minIdx;
        Kunde temp;

        for (Kunde item : kunden) {
            System.out.println(item.getVorname());
        }
        System.out.println();

        for (int i = 0; i < anzahlKunden-1; i++) {
            minIdx = i;

            for (int j = i+1; j < anzahlKunden; j++) {
                if (kunden[j].getVorname().toCharArray()[0] < kunden[minIdx].getVorname().toCharArray()[0]) {
                    minIdx = j;
                }
            }

            temp = kunden[minIdx];
            kunden[minIdx] = kunden[i];
            kunden[i] = temp;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getVorname());
        }
    }


    static void vornameNachname(Kunde[] kunden) {
        int minIdx;
        Kunde temp;

        for (Kunde item : kunden) {
            System.out.println(item.getFullName());
        }
        System.out.println();

        for (int i = 0; i < anzahlKunden-1; i++) {
            minIdx = i;

            for (int j = i+1; j < anzahlKunden; j++) {
                if (kunden[j].getFullName().toCharArray()[0] < kunden[minIdx].getFullName().toCharArray()[0]) {
                    minIdx = j;
                }
            }

            temp = kunden[minIdx];
            kunden[minIdx] = kunden[i];
            kunden[i] = temp;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getFullName());
        }
    }


    static void geburtsjahr(Kunde[] kunden) {
        int minIdx;
        Kunde temp;

        for (Kunde item : kunden) {
            System.out.println(item.getGeburtsdatum().getYear());
        }
        System.out.println();

        for (int i = 0; i < anzahlKunden-1; i++) {
            minIdx = i;

            for (int j = i+1; j < anzahlKunden; j++) {
                if (kunden[j].getGeburtsdatum().getYear() < kunden[minIdx].getGeburtsdatum().getYear()) {
                    minIdx = j;
                }
            }

            temp = kunden[minIdx];
            kunden[minIdx] = kunden[i];
            kunden[i] = temp;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getGeburtsdatum().getYear());
        }
    }


    static void plz(Kunde[] kunden) {
        int minIdx;
        Kunde temp;

        for (Kunde item : kunden) {
            System.out.println(item.getPlz());
        }
        System.out.println();

        for (int i = 0; i < anzahlKunden-1; i++) {
            minIdx = i;

            for (int j = i+1; j < anzahlKunden; j++) {
                if (kunden[j].getPlz() < kunden[minIdx].getPlz()) {
                    minIdx = j;
                }
            }

            temp = kunden[minIdx];
            kunden[minIdx] = kunden[i];
            kunden[i] = temp;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getPlz());
        }
    }


    static void familienstand(Kunde[] kunden) {
        int minIdx;
        Kunde temp;

        for (Kunde item : kunden) {
            System.out.println(item.getFamilienstand());
        }
        System.out.println();

        for (int i = 0; i < anzahlKunden-1; i++) {
            minIdx = i;

            for (int j = i+1; j < anzahlKunden; j++) {
                if (kunden[j].getFamilienstand().toCharArray()[0] < kunden[minIdx].getFamilienstand().toCharArray()[0]) {
                    minIdx = j;
                }
            }

            temp = kunden[minIdx];
            kunden[minIdx] = kunden[i];
            kunden[i] = temp;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getFamilienstand());
        }
    }

}