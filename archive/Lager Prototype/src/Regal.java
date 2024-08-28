import java.util.ArrayList;
import java.util.Random;

public class Regal {
    private int id;

    private ArrayList<Fach> faecher = new ArrayList<>();

    Regal(int id) {
        this.id = id;

        System.out.println("Regal erstellt");

        createFaecher();
    }

    private void createFaecher() {
        int numFaecher = new Random().nextInt(3) + 3;
        for (int i = 0; i < numFaecher; i++) {
            Fach fach = new Fach(i + 1);

            // Append to list faecher
            faecher.add(fach);
        }
    }

    public ArrayList<Fach> getFaecher() {

        return faecher;
    }

    @Override
    public String toString() {
        return "Regal{" +
                "id=" + id +
                "}";
    }
}