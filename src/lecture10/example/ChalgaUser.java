package lecture10.example;

public class ChalgaUser extends User {
    int paperCount;

    ChalgaUser(String name) {
        super(name);
        this.paperCount = 0;
    }

    void throwPapers(int papers) {
        paperCount += papers;
        System.out.println(name + " thrown " + papers + " papers out of " + paperCount);
    }

    @Override
    void say() {
        System.out.println(name + ": Tell me like man to man!");
    }

    @Override
    String getDrink() {
        return "Vodka";
    }

    @Override
    public void doFitness() {
        System.out.println("Nacepin!");
    }
}
