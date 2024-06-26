import java.util.ArrayList;
import java.util.Random;

public class Box {
    private String farbe;
    private final ArrayList<Kleidungsstueck> kleidungsstuecke = new ArrayList<>();

    public Box(String neueFarbe) {
        farbe = neueFarbe;

        for (int i = 0; i < new Random().nextInt(7); i++) {
            kleidungsstuecke.add(new Kleidungsstueck());
        }
    }

    public ArrayList<Kleidungsstueck> getKleidungsstuecke() {
        return kleidungsstuecke;
    }

    public int getKleidungsstueckeSize() {
        return kleidungsstuecke.size();
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "\t" + "Box: " + getFarbe() + "\t" + "Inhalt: " + kleidungsstuecke.size();
    }

}