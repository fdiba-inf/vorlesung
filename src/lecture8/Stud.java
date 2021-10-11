package lecture8;

public class Stud {
    private int result;

    Stud(int result) {
        this.result = result;
    }

    public void increment() {
        result = result + 2;
    }

    public static void incr(Stud s) {
        s.result = s.result + 2;
    }
}
