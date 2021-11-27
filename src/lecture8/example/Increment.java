package lecture8.example;

public class Increment {
    public static void main(String[] args) {
        int x = 5;
        increment(x);
        System.out.println(x);
    }

    public static void increment(int x) {
        x++;
    }
}
