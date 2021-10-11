package lecture10;

public class MetalUser extends User {
    int screamCount;

    MetalUser(String name) {
        super(name);
        screamCount = 0;
    }

    @Override
    void say() {
        System.out.println(name + ": Ulqlq");
    }

    void scream(int screams) {
        screamCount += screams;
        System.out.println(name + " screams " + screams + " times!");
    }
}
