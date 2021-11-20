package lecture7;

public class Example {
    public static void main(String[] args) {
        int year = 2021;
        printYears(year, 10);
        printYears(2023, 11);
        printYears(year, 12);
    }

    public static void printYears(int year, int month) {
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
    }
}
