package lecture6;

public class Time {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime));
    }
}
