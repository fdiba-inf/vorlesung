package lecture2;

public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = a + 4;
        System.out.println(b);

        boolean result = a != b;
        System.out.println(result);

        String name = "FDIBA" + 6 + 1;
        System.out.println(name);

        String otherName = 6 + 1 + "FDIBA";
        System.out.println(otherName);
    }
}
