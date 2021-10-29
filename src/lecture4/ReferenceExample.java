package lecture4;

public class ReferenceExample {
    public static void main(String[] args) {
        int[] a = new int[]{6, 2, 3};
        int[] b = new int[]{6, 2, 3};
        int[] c = a;
        a = null;

        System.out.println(b == c);

        String name = "FDIBA";
        char[] letters = {'F', 'D', 'I', 'B', 'A'};


    }
}
