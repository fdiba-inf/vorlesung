package lecture7;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fib(200));
    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
