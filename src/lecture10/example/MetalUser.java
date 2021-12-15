package lecture10.example;

public class MetalUser extends User {
    private int screamCount;

    MetalUser(String name) {
        super(name);
        this.screamCount = 0;
    }

    void scream(int screams) {
        screamCount += screams;
        System.out.println(name + " screamed " + screams + " times out of " + screamCount);
    }

    @Override
    void say() {
        System.out.println(name + ": Seek and destroy!");
    }

    @Override
    String getDrink() {
        return "Beer";
    }

    @Override
    public void doFitness() {
        System.out.println("No!");
    }
}
