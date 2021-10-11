package lecture11;

public class ArrayFikiList implements FikiList {
    private String[] items = new String[10];
    private int nextIndex = 0;

    @Override
    public void add(String data) {
        if (nextIndex + 1 == items.length) {
            System.out.println("Error");
        } else {
            items[nextIndex] = data;
            nextIndex++;
        }
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
