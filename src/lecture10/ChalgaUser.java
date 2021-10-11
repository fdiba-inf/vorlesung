package lecture10;

public class ChalgaUser extends User {
    int paperCount;

    ChalgaUser(String name) {
        super(name);
        paperCount = 0;
    }

    @Override
    void say() {
        System.out.println(name + ": Opa");
    }

    void throwPapers(int papers) {
        paperCount += papers;
        System.out.println(name + " throws " + papers + " papers!");
    }
}
