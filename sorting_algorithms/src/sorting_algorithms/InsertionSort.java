package sorting_algorithms;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] list = { 1, 5, 3, 6, 4, 7, 9, 8, 2 };
		int key, temp;
		
		for (int item : list) {
			System.out.print(item);
		}
		System.out.println();
		
		for (int i = 1; i < list.length; i++) {
			key = list[i];
			temp = i - 1;
			
			
			while (temp >= 0 && list[temp] > key) {
				list[temp + 1] = list[temp];
				temp = temp-1;
			}
			list[temp + 1] = key;
		}
		
		for (int item : list) {
			System.out.print(item);
		}
		System.out.println();
	}
	
}
