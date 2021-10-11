package lecture5;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 9, 11, 12, 17, 18, 19, 20, 23, 24, 25, 26};
        int element = 20;

        int elementIndex = -1;
        int index = 0;
        do {
            if (element == array[index]) {
                elementIndex = index;
                break;
            }

            index++;
        } while (index < array.length);

        System.out.println("Element index: " + elementIndex);
    }
}
