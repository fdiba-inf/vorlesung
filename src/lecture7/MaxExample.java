package lecture7;

import java.util.Scanner;

public class MaxExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // 2
        int b = input.nextInt(); // 3

        int maxNumber = max(a, b);

        System.out.println(maxNumber);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
