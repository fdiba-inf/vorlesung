package lecture5;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {7, -2, 6, 5, 9, 0};

        for (int index = 1; index < array.length; index++) {
            int element = array[index];

            int i;
            for (i = index; i > 0 && array[i - 1] > element; i--) {
                array[i] = array[i - 1];
            }

            array[i] = element;
        }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
