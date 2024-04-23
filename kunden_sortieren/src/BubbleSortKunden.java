public class BubbleSortKunden {

    static int anzahlKunden = Kundenstamm.getAnzahlKunden();

    static Kunde[] createKunden() {
        return Kundenstamm.liesKunden();
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

    public static void main(String[] args) {
        Kunde[] kunden = createKunden();

        nachname(kunden);
        vorname(kunden);
        plz(kunden);
    }
}