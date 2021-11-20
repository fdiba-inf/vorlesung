package lecture7;

public class TestVisibility {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        int result = Max.findMax(a, b);

        double v = Math.sqrt(12);

        System.out.println(result);
    }
}
