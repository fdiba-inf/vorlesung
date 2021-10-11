package lecture8;

public class Student {
    int id = 3;
    double result;

    Student() {
        id = 1;
        result = 6;
    }

    Student(int id, int result) {
        this.id = id;
        this.result = result;
    }

    Student(Student s) {
        id = s.id;
        result = s.result;
    }
}
