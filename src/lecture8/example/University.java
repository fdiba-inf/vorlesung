package lecture8.example;

public class University {
    public static void main(String[] args) {
        Student malina = new Student();
        Student fiki = new Student(2);

        System.out.println(malina);
        System.out.println(fiki);
    }

    public static void print(Student s) {
        System.out.println("Number: " + s.facultyNumber);
        System.out.println("Result: " + s.result);
    }

    public static void increase(Student s) {
        s.result++;
    }

    public static void add(Student s1, Student s2) {
        s1.result = s1.result + s2.result;
    }

    public static Student copy(Student other) {
        Student s = new Student();
        s.facultyNumber = other.facultyNumber + 1;
        s.result = 2;
        return s;
    }
}
