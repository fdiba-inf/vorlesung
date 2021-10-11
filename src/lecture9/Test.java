package lecture9;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String name = calculateName();
    }

    static String calculateName() {
        Scanner input = new Scanner(System.in);
        if (System.currentTimeMillis() % 1.3421 == 0) {
            return "EPAM";
        } else {
            throw new IllegalStateException("asdasd");
        }
    }
}
