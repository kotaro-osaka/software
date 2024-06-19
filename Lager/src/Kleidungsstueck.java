public class Kleidungsstueck {
    private int id;
    private String art;
    private int groesse;
    private int zustand;

    Kleidungsstueck(int id, String art, int groesse, int zustand) {
        this.id = id;
        this.art = art;
        this.groesse = groesse;
        this.zustand = zustand;

        System.out.println("Kleidungsstueck erstellt");
    }

    @Override
    public String toString() {
        return "Kleidungsstueck{id=" + id +
                ", art=" + art +
                ", groesse=" + groesse +
                ", zustand=" + zustand +
                "}";
    }
}