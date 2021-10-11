package lecture4;

public class Memory {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        b = 8;
        int[] numbers = new int[3];
        int[] c = numbers;

        numbers[0] = 2;
        System.out.println(c[0]);

        numbers = new int[4];

        numbers[0] = 6;
        System.out.println(c[0]);
        c = numbers;
    }
}
