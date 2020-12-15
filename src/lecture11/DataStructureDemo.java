package lecture11;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DataStructureDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        Stack<String> students = new Stack<>();
        students.pop();
        students.push("A");
    }
}
