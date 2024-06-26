import java.util.Random;

public class Kleidungsstueck {
    private static final String[] arten = { "Schuhe", "Hose", "Hemd", "Jacke" };
    private static final String[] groessen = { "S", "M", "L", "XL", "XXL" };
    private static final String[] schuhgroessen = { "39", "38", "40", "42", "43", "44", "45", "46" };

    private String art;
    private String groesse;
    private int zustand;

    public Kleidungsstueck() {
        String groesse;
        Random random = new Random();

        int artindex = random.nextInt(4);
        String art = arten[artindex];

        if (artindex > 0) {
            groesse = groessen[random.nextInt(5)];

        } else {
            groesse = schuhgroessen[random.nextInt(7)];
        }

        this.art = art;
        this.groesse = groesse;
        this.zustand = random.nextInt(5) + 1;

    }

    public Kleidungsstueck(String art, String groesse, int zustand) {
        this.art = art;
        this.groesse = groesse;
        this.zustand = zustand;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public int getZustand() {
        return zustand;
    }

    public void setZustand(int zustand) {
        this.zustand = zustand;
    }

    @Override
    public String toString() {
        return getArt() + " " + getGroesse() + " " + getZustand();
    }

}