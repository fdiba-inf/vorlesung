package lecture6;

import java.util.Scanner;

public class AssertExample {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int number = input.nextInt();

        assert number > 0 : "Fiki";

        System.out.println("Number: " + number);

        assert number++ > 3;
    }
}
