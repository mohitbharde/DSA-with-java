package Recursion;

public class FibonacciRecusion {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
