package lecture8.example;

public class Student {
    int facultyNumber;
    double result = 6;

    public Student() {
        facultyNumber = 1;
    }

    public Student(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public Student(int facultyNumber, double result) {
        this.facultyNumber = facultyNumber;
        this.result = result;
    }

    public Student(Student otherStudent) {
        facultyNumber = otherStudent.facultyNumber;
        result = otherStudent.result;
    }

    public void printMe() {
        System.out.println("Number: " + facultyNumber);
        System.out.println("Result: " + result);
    }

    public void increaseResult(int n) {
        result = result + n;
    }

    public void add(Student other) {
        result = result + other.result;
    }

    public Student copy() {
        Student s = new Student();
        s.facultyNumber = facultyNumber + 1;
        s.result = 2;
        return s;
    }

    public String toString() {
        return "Student: " + facultyNumber + ", " + result;
    }
}
