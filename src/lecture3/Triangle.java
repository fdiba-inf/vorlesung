package lecture3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double a;
        double b;
        double c;
        do {
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
            boolean correct = a > 0 && a < b + c;
            if (correct) {
                if (a == b || b == c) {

                }
            }

        } while(a > 0 && b > 0 && c > 0);
    }
}
