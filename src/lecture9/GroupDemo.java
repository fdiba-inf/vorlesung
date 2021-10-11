package lecture9;

public class GroupDemo {
    public static void main(String[] args) {
        Student fiki = new Student(1, 4);
        Group planeta = new Group(4, fiki);

        Student malina = new Student(2, 5);
        Student azis = new Student(3, 6);

        planeta.add(malina);
        planeta.add(azis);
    }
}
