package lecture8.example;

public class Util {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        int number = 5;

        double r = 4;
        double s = PI * r * r;
        System.out.println(s);

        System.out.println(calculateP(r));

        number = 10;

        System.out.println(number);
    }

    public static double calculateP(double r) {
        return PI * 2 * r;
    }
}
