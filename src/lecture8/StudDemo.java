package lecture8;

public class StudDemo {
    public static void main(String[] args) {
        Stud s1 = new Stud(4);
        s1.increment();
        Stud.incr(s1);
        Stud s2 = new Stud(6);
        s2.increment();
    }
}
