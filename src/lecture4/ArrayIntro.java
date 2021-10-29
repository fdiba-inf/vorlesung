package lecture4;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        double[] results = new double[size];

        for (int index = 0; index < results.length; index++) {
            System.out.print("Enter element " + index + ": ");
            results[index] = input.nextDouble();
        }

        double sum = 0;
        for (int index = 0; index < results.length; index += 2) {
            sum = sum + results[index];
        }

        // for each
        for (double fiki : results) {
          sum = sum + fiki;
        }

        System.out.println("Sum of elements: " + sum);
    }
}
