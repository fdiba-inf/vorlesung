package lecture3;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        do {
            number = input.nextInt();
            if (number > 0) {
                positiveNumbers++;
            } else {
                negativeNumbers++;
            }

        } while(number != 0);
    }
}
