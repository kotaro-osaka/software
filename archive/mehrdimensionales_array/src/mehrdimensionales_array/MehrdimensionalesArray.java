package mehrdimensionales_array;

public class MehrdimensionalesArray {
	
	public static void matrixEinmalEins(int zeilen, int spalten) {
		int matrix[][] = new int[zeilen][spalten];
		
		for (int i = 1; i < zeilen; i++) {
			for (int j = 1; j < spalten; j++) {
				matrix[i][j] = (i * j);
			}
		}
	}

	public static void main(String[] args) {
		matrixEinmalEins(20, 20);
	}
}