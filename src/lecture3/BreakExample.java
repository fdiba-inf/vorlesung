package lecture3;

public class BreakExample {
    public static void main(String[] args) {
        int i = 1;

        while(i < 5) {
            i++;
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("ABC: "+i);
    }
}
