package lecture10.example;

public class Demo {
    public static void main(String[] args) {
        Fitness user1 = new ChalgaUser("Azis");
        Fitness user2 = new MetalUser("Lindemann");

        user1.doFitness();
        user2.doFitness();
    }
}
