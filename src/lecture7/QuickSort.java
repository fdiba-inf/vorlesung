package lecture7;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 3, 5, 7, 1, 6, 4, 2, 8, 1 };
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] numbers, int low, int high) {
        int i = low, j = high;
        int pivot = numbers[i];

        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }

            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quicksort(numbers, low, j);
        }

        if (i < high) {
            quicksort(numbers, i, high);
        }
    }
}
