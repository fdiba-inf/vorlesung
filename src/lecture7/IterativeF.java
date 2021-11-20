package lecture7;

public class IterativeF {
    public static void main(String[] args) {
        System.out.println(calculateN(5));
        System.out.println(calculateNRecursive(5));
    }

    public static int calculateN(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int calculateNRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calculateNRecursive(n - 1);
        }
    }
}
