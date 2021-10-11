package lecture3;

public class ForDemo {
    public static void main(String[] args) {
        int i = 1;
        for (; i < 10;) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);

        for (int j = 1; j < 10; j = j + 5) {
            System.out.println(j);
        }

        do {

        } while(true);
    }
}
