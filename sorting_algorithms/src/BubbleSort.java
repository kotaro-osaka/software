public class BubbleSort {

    public static void main(String[] args) {
        int[] list = { 1, 5, 3, 6, 7, 4, 9, 8, 2 };
        int temp;

        for (int item : list) {
            System.out.print(item);
        }
        System.out.println();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length-i-1; j++) {
                if (list[j] > list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        for (int item : list) {
            System.out.print(item);
        }
        System.out.println();
    }

}