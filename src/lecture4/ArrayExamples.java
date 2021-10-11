package lecture4;

public class ArrayExamples {

    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[3];
        numbers[0] = 26;
        numbers[2] = -12;
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        double[] results = new double[2];
        results[0] = 4.2;
        results[1] = 5.8;
        double sum = results[0] + results[1];
        System.out.println(sum);

        char[] name1 = {'F', 'D', 'I', 'B', 'A'};
        char[] name2 = name1;
        name2[1] = 'W';
        System.out.println(name1[1]);
    }

}
