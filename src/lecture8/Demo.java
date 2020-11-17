package lecture8;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 203;
        s1.result = 5;

        Student s2 = new Student(204, 7);

        Student s3 = new Student(s1);
    }
}
