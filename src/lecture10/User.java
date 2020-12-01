package lecture10;

public abstract class User implements Drink {
    protected String name;

    User(String name) {
        this.name = name;
    }

    abstract void say();

    int add(int x, int y) {
        return x + y;
    }

    @Override
    public void drinkBeer() {
        System.out.println("Beer");
    }

    @Override
    public void drinkMenta() {
        System.out.println("Menta");
    }
}
