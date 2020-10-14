package lecture3;

public class Increment {
    public static void main(String[] args) {
        int a = 5;
        int sum = a++ + 5;
        System.out.println(sum);
        System.out.println(a);

        int b = 5;
        b %= 2;
    }
}
