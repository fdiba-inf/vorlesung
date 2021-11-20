package lecture7;

public class MultiCall {
    public static void main(String[] args) {
        int result = calculate(3, 5);
        System.out.println(result);
    }

    public static int calculate(int x, int y) {
        int result = 2 * findMax(x, y);
        return result;
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
