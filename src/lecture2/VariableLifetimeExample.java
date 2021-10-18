package lecture2;

import java.util.Scanner;

public class VariableLifetimeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int number = input.nextInt();
        System.out.println(number);

        if (number > 20) {
            double average = number * 10.0;
            int age = 22;
            System.out.println(average);
        } else {
            double average = number * 20.0;
            System.out.println(average);
        }

        double average = 10;
        int age = 30;
    }
}
