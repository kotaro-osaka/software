import java.util.ArrayList;
import java.util.Random;

public class Box {
    private int id;
    private String farbe;

    private String[] kleidungsstueckArten = { "Schuhe", "Jacke", "Hemd" };
    private ArrayList<Kleidungsstueck> kleidungsstuecke = new ArrayList<>();

    Box(int id, String farbe) {
        this.id = id;
        this.farbe = farbe;

        System.out.println("Box erstellt");

        createKleidungsstuecke();
    }

    private void createKleidungsstuecke() {
        int numKleidungsstuecke = new Random().nextInt(6);
        for (int i = 0; i < numKleidungsstuecke; i++) {
            String art = kleidungsstueckArten[new Random().nextInt(2)];
            int groesse = new Random().nextInt(10) + 1;
            int zustand = new Random().nextInt(4) + 1;

            Kleidungsstueck kleidungsstueck = new Kleidungsstueck(i + 1, art, groesse, zustand);

            // Append to list kleidungsstuecke
            kleidungsstuecke.add(kleidungsstueck);
        }
    }

    @Override
    public String toString() {
        return "Box}" +
                "id=" + id +
                ", farbe=" + farbe +
                "}";
    }
}
