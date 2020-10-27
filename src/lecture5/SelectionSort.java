package lecture5;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {7, -2, 6, 5, 9, 0};

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
