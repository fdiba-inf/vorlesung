package lecture4;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter count: ");
        int count = input.nextInt();

        double[] numbers = new double[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
    }
}
