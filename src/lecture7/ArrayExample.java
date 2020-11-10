package lecture7;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 4, 5};
        swap(a, b);
        System.out.println(a[0]);
    }

    public static void swap(int[] n, int[] m) {
        int[] temp = n;
        n = m;
        m = temp; // Side effect, Nebenwirkung
    }
}
