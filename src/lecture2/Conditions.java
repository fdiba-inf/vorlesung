package lecture2;

public class Conditions {
    public static void main(String[] args) {
        int a = 10;
        if (a < 2) {
            System.out.println("A");
        } else {
            if (a < 5) {
                System.out.println(5);
            }
        }

        if (a < 2) {
            System.out.println("A");
        } else if (a < 5) {
            System.out.println(5);
        }
    }
}
