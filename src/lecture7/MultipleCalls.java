package lecture7;

public class MultipleCalls {
    public static void main(String[] args) {



        System.out.println(Math.sqrt(Util.max(9, 2)));

        int maxResult = Util.max(3, 2);

        int a = 3;
        int result = calculate1(a);
        System.out.println(result);
    }

    public static int calculate1(int a) {
        return calculate2(a) + 5;
    }

    public static int calculate2(int a) {
        return a * 10;
    }
}
