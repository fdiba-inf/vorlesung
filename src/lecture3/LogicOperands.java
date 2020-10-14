package lecture3;

import java.util.Scanner;

public class LogicOperands {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a <= 0 || b > 0) {
            System.out.println(a + b);
        } else {
            System.out.println("Fiki");
        }
    }
}
