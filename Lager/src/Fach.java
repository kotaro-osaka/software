import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fach {
    private final Box[] boxen = new Box[4];
    private final ArrayList<String> boxFarben = new ArrayList<>(Arrays.asList("blau", "gelb", "gruen", "rot"));

    Fach() {
        Collections.shuffle(boxFarben);

        for (int i = 0; i < 4; i++) {
            boxen[i] = new Box(boxFarben.get(i));
        }
    }

    public Box[] getBoxen() {
        return boxen;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Fach");

        for (Box box : boxen) {
            result.append("\t" + "\n").append(box.toString());
        }

        return result.toString();
    }

}