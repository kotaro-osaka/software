package sorting_algorithms;

public class ShakerSort {

	public static void main(String[] args) {
		int[] list = { 1, 5, 3, 6, 7, 4, 9, 8, 2 };
		boolean swapped;
		int min = 0;
		int max = list.length-1;
		int temp;
		
		for (int item : list) {
			System.out.print(item);
		}
		System.out.println();
		
		while (min < max) {
			// Forward
			swapped = false;
			
			for (int i = min; i < max; i++) {
				if (list[i] > list[i+1]) {
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					swapped = true;
				}
			}
			if (!swapped) break;
			max--;
			
			// Backward
			swapped = false;
			for (int i = max; i > min; i--) {
				if (list[i] < list[i-1]) {
					temp = list[i];
					list[i] = list[i-1];
					list[i-1] = temp;
					swapped = true;
				}
			}
			if (!swapped) break;
			min++;
		}
		
		for (int item : list) {
			System.out.print(item);
		}
		System.out.println();
		
	}
	
}
