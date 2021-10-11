package lecture7;

public class MethodExample {
    public static void main(String[] args) {
        // Argumente Liste
        fiki(2020, "Nov");
        fiki(2030, "Dec");
    }

    // Parametern Liste
    public static void fiki(int year, String month) {
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
    }
}
