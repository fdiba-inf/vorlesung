package lecture6;

// O(1), O(n), O(log n), O(n log n), O(n2), O(n3)
public class Test {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("i");
                }
            }
        }
    }
}
