public class Regal {
    private int nummer;
    private final Fach[] faecher;

    public Regal(int neueNummer, int anzahlFaecher) {
        nummer = neueNummer;
        faecher = new Fach[anzahlFaecher];

        for (int i = 0; i < anzahlFaecher; i++) {
            faecher[i] = new Fach();
        }
    }

    public Fach[] getFaecher() {
        return faecher;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        String result = "Regal Nummer: " + getNummer();

        for (Fach fach : faecher) {
            result += "\t" + "\n" + fach.toString();
        }

        return result;
    }

}