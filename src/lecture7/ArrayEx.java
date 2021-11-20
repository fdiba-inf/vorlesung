package lecture7;

public class ArrayEx {
    public static void main(String[] args) {
        int[] a = {5, 6, 7};
        int[] c = a;
        int maxNumber = max(a);
        System.out.println(maxNumber);
    }

    public static int max(int[] b) {
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }
}
