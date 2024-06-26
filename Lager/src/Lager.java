import java.util.Random;

public class Lager {
    private final int numRegale = 20;
    private final Regal[] regale = new Regal[numRegale];

    public Lager() {
        for (int i = 0; i < numRegale; i++) {
            regale[i] = new Regal(i + 1, new Random().nextInt(7) + 3);
        }
    }

    public void printEmptyBoxes(Lager lager) {
        for (Regal regal : lager.getRegale()) {
            int fachId = 0;
            for (Fach fach : regal.getFaecher()) {
                fachId++;
                for (Box box : fach.getBoxen()) {
                    if (box.getKleidungsstueckeSize() == 0) {
                        System.out.println("Regal " + regal.getNummer());
                        System.out.println("\t" + "Fach " + fachId);
                        System.out.println("\t\t" + "Box: " + box.getFarbe());
                    }
                }
            }
        }
    }

    public Regal[] getRegale() {
        return regale;
    }

    @Override
    public String toString() {
        String result =  "Lager mit " + regale.length + " Regalen";

        for (Regal regal : regale) {
            result += "\n\n" + regal.toString();
        }

        return result;
    }

}