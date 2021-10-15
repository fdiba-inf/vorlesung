package lecture2;

public class Increment {
    public static void main(String[] args) {
        int number = 5;

        System.out.println("Number is " + number);

        //number = number + 1;
        number++; // Incrementation
        //number = number - 1;
        number--; // Decrementation

        number = number + 6;
        number += 6;
        number = number - 6;
        number -= 6;
        number /= 6;
        number *= 6;
        number %= 6;

        System.out.println("Number is " + number);
    }
}
