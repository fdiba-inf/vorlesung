package lecture7;

public class RecursionExample {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (n == 1) {
            return 1; // Endbedingung
        } else {
            return n * fact(n - 1);
        }
    }
}
