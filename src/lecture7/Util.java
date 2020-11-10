package lecture7;

public class Util {

    public static void main(String[] args) {
        max(1, 2);
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
