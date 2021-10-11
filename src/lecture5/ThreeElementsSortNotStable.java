package lecture5;

import java.util.Arrays;

public class ThreeElementsSortNotStable {
    public static void main(String[] args) {
        int[] array = {2, 2, 1};

        if (array[0] > array[1]) {
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }

        if (array[0] > array[2]) {
            int temp = array[0];
            array[0] = array[2];
            array[2] = temp;
        }

        if (array[1] > array[2]) {
            int temp = array[1];
            array[1] = array[2];
            array[2] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
