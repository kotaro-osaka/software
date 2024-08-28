import java.util.ArrayList;

public class Fach {
    private final int id;

    private final String[] boxFarben = { "rot", "gruen", "blau", "weiss" };
    private ArrayList<Box> boxen = new ArrayList<>();

    Fach(int id) {
        this.id = id;

        System.out.println("Fach erstellt");

        createBoxen();
    }

    private void createBoxen() {
        for (int i = 0; i < 4; i++) {
            Box box = new Box(i + 1, boxFarben[i]);

            // Append to list boxen
            boxen.add(box);
        }
    }

    @Override
    public String toString() {
        return "Fach{" +
                "id=" + id +
                "}";
    }
}