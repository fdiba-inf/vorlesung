package lecture5;

import java.util.Arrays;

public class TwoElementsSort {
    public static void main(String[] args) {
        int[] array = {4, 2};

        if (array[0] > array[1]) {
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
