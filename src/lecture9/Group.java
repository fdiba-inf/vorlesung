package lecture9;

public class Group {
    int id;
    Student leader;
    Student[] students;
    int nextIndex;

    Group(int id, Student leader) {
        this.id = id;
        this.leader = leader;
        students = new Student[4];
        students[0] = leader;
        nextIndex = 1;
    }

    void add(Student s) {
        students[nextIndex] = s;
        nextIndex++;
    }
}
