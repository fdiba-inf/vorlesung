package lecture7;

import java.util.Arrays;

public class SideEffect {
    public static void main(String[] args) {
        int[] a = {5, 2, 3};
        Arrays.sort(a);
        System.out.println(a[0]);
    }

    public static void fiki(int[] b) {
        b[0] = 5;
    }
}
