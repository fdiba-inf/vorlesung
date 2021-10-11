package lecture3;

public class Visibility {
    public static void main(String[] args) {
        int a = 5;
        int c = 0;
        if (a < 3 & c > 5) {
            a++;
            int b = 8;
            System.out.println(b + a);
        }

        int b = 5;
        System.out.println(b + a);

        System.out.println(1 & 1);
    }
}
