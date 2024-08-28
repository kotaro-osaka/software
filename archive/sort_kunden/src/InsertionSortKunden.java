public class InsertionSortKunden {

    static int anzahlKunden = Kundenstamm.getAnzahlKunden();

    static Kunde[] createKunden() { return Kundenstamm.liesKunden(); }

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
        Kunde  key;
        int  temp;

        for (Kunde item : kunden) {
            System.out.println(item.getNachname());
        }

        for (int i = 1; i < anzahlKunden; i++) {
            key = kunden[i];
            temp = i - 1;

            while (temp >= 0 && kunden[temp].getNachname().toCharArray()[0] > key.getNachname().toCharArray()[0]) {
                kunden[temp + 1] = kunden[temp];
                temp = temp - 1;
            }
            kunden[temp + 1] = key;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getNachname());
        }
    }

    static void vorname(Kunde[] kunden) {
        Kunde  key;
        int  temp;

        for (Kunde item : kunden) {
            System.out.println(item.getVorname());
        }

        for (int i = 1; i < anzahlKunden; i++) {
            key = kunden[i];
            temp = i - 1;

            while (temp >= 0 && kunden[temp].getVorname().toCharArray()[0] > key.getVorname().toCharArray()[0]) {
                kunden[temp + 1] = kunden[temp];
                temp = temp - 1;
            }
            kunden[temp + 1] = key;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getVorname());
        }
    }

    static void vornameNachname(Kunde[] kunden) {
        Kunde  key;
        int  temp;

        for (Kunde item : kunden) {
            System.out.println(item.getFullName());
        }

        for (int i = 1; i < anzahlKunden; i++) {
            key = kunden[i];
            temp = i - 1;

            while (temp >= 0 && kunden[temp].getFullName().toCharArray()[0] > key.getFullName().toCharArray()[0]) {
                kunden[temp + 1] = kunden[temp];
                temp = temp - 1;
            }
            kunden[temp + 1] = key;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getFullName());
        }
    }

    static void geburtsjahr(Kunde[] kunden) {
        Kunde  key;
        int  temp;

        for (Kunde item : kunden) {
            System.out.println(item.getGeburtsdatum().getYear());
        }

        for (int i = 1; i < anzahlKunden; i++) {
            key = kunden[i];
            temp = i - 1;

            while (temp >= 0 && kunden[temp].getGeburtsdatum().getYear() > key.getGeburtsdatum().getYear()) {
                kunden[temp + 1] = kunden[temp];
                temp = temp - 1;
            }
            kunden[temp + 1] = key;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getGeburtsdatum().getYear());
        }
    }

    static void plz(Kunde[] kunden) {
        Kunde  key;
        int  temp;

        for (Kunde item : kunden) {
            System.out.println(item.getPlz());
        }

        for (int i = 1; i < anzahlKunden; i++) {
            key = kunden[i];
            temp = i - 1;

            while (temp >= 0 && kunden[temp].getPlz() > key.getPlz()) {
                kunden[temp + 1] = kunden[temp];
                temp = temp - 1;
            }
            kunden[temp + 1] = key;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getPlz());
        }
    }

    static void familienstand(Kunde[] kunden) {
        Kunde  key;
        int  temp;

        for (Kunde item : kunden) {
            System.out.println(item.getFamilienstand());
        }

        for (int i = 1; i < anzahlKunden; i++) {
            key = kunden[i];
            temp = i - 1;

            while (temp >= 0 && kunden[temp].getFamilienstand().toCharArray()[0] > key.getFamilienstand().toCharArray()[0]) {
                kunden[temp + 1] = kunden[temp];
                temp = temp - 1;
            }
            kunden[temp + 1] = key;
        }

        for (Kunde item : kunden) {
            System.out.println(item.getFamilienstand());
        }
    }

}