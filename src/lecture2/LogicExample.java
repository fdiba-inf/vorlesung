package lecture2;

import java.util.Scanner;

public class LogicExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char color = input.nextLine().charAt(0);
        int age = input.nextInt();

        boolean matchFound = color == 'r' && age > 200;

        System.out.println("Match found: " + matchFound);
    }
}
