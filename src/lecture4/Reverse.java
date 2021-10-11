package lecture4;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] a = {1, 5, 6, 8};
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

        System.out.println(Arrays.toString(b));
    }

}
