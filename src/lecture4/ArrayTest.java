package lecture4;

public class ArrayTest {

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 15};

        for (int index = 0; index < a.length; index++) {
            System.out.println(a[index]);
        }

        for (int number : a) {
            System.out.println(number);
        }
    }

}
