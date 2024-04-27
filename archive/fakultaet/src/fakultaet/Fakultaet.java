package fakultaet;

public class Fakultaet {
    
    static int[] erstelleFakultaetenArray(int groesse) {
        int[] array = new int[groesse];
        
        for (int i = 0; i < groesse; i++) {
            array[i] = berechneFakultaet(i);
        }
        return array;
    }
    
    static int berechneFakultaet(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * berechneFakultaet(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] liste = erstelleFakultaetenArray(20);
        
        System.out.println("Wert an Index 2: " + liste[2]);
    }
}