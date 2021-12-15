package lecture10.example;

public abstract class User implements Fitness {
    String name;

    public User(String name) {
        this.name = name;
    }

    void say() {
        System.out.println(name + ": Hi!");
    }

    abstract String getDrink();
}
