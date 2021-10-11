package lecture5;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {7, -2, 6, 5, 9, 0};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                int next = j + 1;
                if (array[j] > array[next]) {
                    int temp = array[j];
                    array[j] = array[next];
                    array[next] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
