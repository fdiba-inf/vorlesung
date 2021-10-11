package lecture11;

public class LinkedFikiList implements FikiList {
    private Node headNode;
    private Node lastNode;

    @Override
    public void add(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            headNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
            lastNode = newNode;
        }
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null;
    }
}
