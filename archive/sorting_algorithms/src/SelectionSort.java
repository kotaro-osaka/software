public class SelectionSort {

    public static void main(String[] args) {
        int[] list = { 1, 5, 3, 6, 7, 4, 9, 8, 2 };
        int minIdx, temp;

        for (int item : list) {
            System.out.print(item);
        }
        System.out.println();

        for (int i = 0; i < list.length-1; i++) {
            minIdx = i;

            for (int j = i+1; j < list.length; j++) {
                if (list[j] < list[minIdx]) {
                    minIdx = j;
                }
            }

            temp = list[minIdx];
            list[minIdx] = list[i];
            list[i] = temp;
        }

        for (int item : list) {
            System.out.print(item);
        }
        System.out.println();
    }

}