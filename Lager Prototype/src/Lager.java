import java.util.ArrayList;

public class Lager {
    private ArrayList<Regal> lager = new ArrayList<>();

    Lager() {
        System.out.println("Lager erstellt");

        createRegale();
    }

    private void createRegale() {
        for (int i = 0; i < 20; i++) {
            Regal regal = new Regal(i + 1);

            // Append to list regale
            lager.add(regal);
        }
    }

    public ArrayList<Regal> getLager() {


        return lager;
    }
}