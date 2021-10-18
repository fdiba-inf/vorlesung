package lecture2;

import java.util.Scanner;

public class SwitchExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch (number) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("Prime number");
                break;
            case 0:
            case 4:
            case 6:
            case 8:
            case 9:
                System.out.println("Not prime");
                break;
            default:
                System.out.println("Fiki does not like this number!");
        }

        if (number == 0) {
            System.out.println("Not prime");
        } else if (number == 1) {
            System.out.println("Prime number");
        } else if (number == 2) {
            System.out.println("Prime number");
        } else if (number == 3) {
            System.out.println("Prime number");
        } else if (number == 4) {
            System.out.println("Not prime");
        } else if (number == 5) {
            System.out.println("Prime number");
        } else if (number == 6) {
            System.out.println("Not prime");
        } else if (number == 7) {
            System.out.println("Prime number");
        } else if (number == 8) {
            System.out.println("Not prime");
        } else if (number == 9) {
            System.out.println("Not prime");
        } else {
            System.out.println("Fiki does not like this number!");
        }
    }
}
