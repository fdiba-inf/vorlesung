package lecture3;

public class Operators {
    public static void main(String[] args) {
        String type;
        int number = 8;
        if (number % 2 == 0) {
            type = "even";
        } else {
            type = "odd";
        }
        System.out.println(type);

        String newType = number % 2 == 0 ? "even" : "odd";
        System.out.println(newType);
    }
}
