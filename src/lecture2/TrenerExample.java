package lecture2;

import java.util.Scanner;

public class TrenerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int type = number > 0 ? 1 + 2 + 3 : 4 + 5 + 6;

        System.out.println("Number type: " + type);
    }
}
