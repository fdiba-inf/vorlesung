package lecture7;

public class Max {
    public static void main(String[] args) {
        int result1 = findMax(4, 6);
        System.out.println(result1);

        double result2 = findMax(4.0, 5.9);
        System.out.println(result2);

        double result3 = findMax(3, (int) 5.3);
        System.out.println(result1);
    }

    public static int findMax(int a, int b) {
        System.out.println("Fiki");
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double findMax(double a, double b) {
        System.out.println("Malina");
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
