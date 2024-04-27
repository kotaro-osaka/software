package fibonacci_zahlen;

public class FibonacciZahlenRekursiv {
    public static void main(String[] args) {
        int n = 25;

        System.out.println("Die ersten 25 Fibonacci-Zahlen:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}