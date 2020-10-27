package lecture5;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 9, 11, 12, 17, 18, 19, 20, 23, 24, 25, 26};
        int element = 20;

        int elementIndex = -1;
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int middleIndex;
        do {
            middleIndex = (leftIndex + rightIndex) / 2;
            int middleElement = array[middleIndex];

            if (element == middleElement) {
                elementIndex = middleIndex;
                break;
            }

            if (element < middleElement) {
                rightIndex = middleIndex - 1;
            } else {
                leftIndex = middleIndex + 1;
            }
        } while (leftIndex <= rightIndex);

        System.out.println("Element index: " + elementIndex);
    }
}
