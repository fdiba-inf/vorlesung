package lecture3;

public class BreakExample {
    public static void main(String[] args) {
        int index = 0;

        while (index < 10) {
            index++;

            if (index == 7) {
                continue;
            }

            System.out.println(index);
        }

        System.out.println("End");
    }
}
