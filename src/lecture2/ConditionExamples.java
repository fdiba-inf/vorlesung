package lecture2;

public class ConditionExamples {

    public static void main(String[] args) {
        boolean accepted = true;
        if (accepted) {
            System.out.println("Homework accepted!");
        }

        boolean numbersEqual = 20 == 10;
        if (numbersEqual) {
            System.out.println("Same numbers!");
        } else {
            System.out.println("Different numbers!");
        }

        int number = 26;
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        double a = 3.2;
        double b = 5.7;
        double c = -4.8;
        double maxNumber;
        if (a > b) {
            if (a > c) {
                maxNumber = a;
            } else {
                maxNumber = c;
            }
        } else {
            if (b > c) {
                maxNumber = b;
            } else {
                maxNumber = c;
            }
        }
        System.out.println("Max number is: " + maxNumber);
    }

}
