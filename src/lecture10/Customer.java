package lecture10;

public class Customer extends User implements User1, User2 {
    Customer(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("A");
    }
}
