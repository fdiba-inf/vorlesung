package lecture3;

public class WhileDemo {
    public static void main(String[] args) {
        int index = 1;
        int sum = 0;
        while(index <= 10) {
            sum = sum + index;
            index++;
        }

        System.out.println(sum);
    }
}
