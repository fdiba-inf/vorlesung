package lecture6;

public class ParallelExecution {
    public static void main(String[] args) {
        for (int j = 0; j <= 1000; j++) {
            System.out.println("Thread 2: " + j);
        }

        new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("Thread 1: " + i);
            }
        }).start();

        new Thread(() -> {
            for (int j = 0; j <= 1000; j++) {
                System.out.println("Thread 2: " + j);
            }
        }).start();
    }
}
