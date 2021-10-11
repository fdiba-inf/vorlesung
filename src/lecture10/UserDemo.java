package lecture10;

public class UserDemo {
    public static void main(String[] args) {
        ChalgaUser fiki = new ChalgaUser("Fiki");
        fiki.drinkBeer();
        fiki.add(1, 2);

        MetalUser lindemann = new MetalUser("Lindemann");
        lindemann.drinkMenta();
    }
}
