package fibonacci_zahlen;

public class FibonacciZahlen {

	public static void main(String[] args) {
		int n = 25;
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Die ersten 25 Fibonacci-Zahlen:");
        for (int num : fibonacci) {
            System.out.println(num);
        }
	}
}