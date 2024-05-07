import java.util.ArrayList;
import java.util.Arrays;

public class KundenArrayList {

    static int anzahlKunden = Kundenstamm.getAnzahlKunden();

    static Kunde[] createKunden() {
        return Kundenstamm.liesKunden();
    }

    public static void main(String[] args) {
        ArrayList<Kunde> kundenArrayList = toArrayList(createKunden());

        // Test print
        for (Kunde kunde : kundenArrayList) {
            System.out.println(kunde.getVorname());
        }
    }

    public static ArrayList<Kunde> toArrayList(Kunde[] kundenArray) {
        ArrayList<Kunde> kundenArrayList = new ArrayList<>();

//        // Variant 1
//        for (int i = 0; i < anzahlKunden; i++) {
//            kundenArrayList.add(kundenArray[i]);
//        }

        // Variant 2
        for (Kunde kunde : kundenArray) {
            kundenArrayList.add(kunde);
        }

//        // Variant 3
//        kundenArrayList.addAll(Arrays.asList(kundenArray));

        return kundenArrayList;
    }

}