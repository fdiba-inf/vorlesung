package lecture2;

public class Expressions {
    public static void main(String[] args) {
        double sum = 2.0 + 3 / 4 - 5.0;
        System.out.println(sum);

        System.out.println("Text: " + 5 + 6);

        double a = 1 / 5;
        System.out.println(a);

        int fiki = 900;
        byte azis = (byte) fiki;
        System.out.println(azis);

        int d = Integer.MIN_VALUE - 1;
        System.out.println(d + " " + Integer.MAX_VALUE);
    }
}
