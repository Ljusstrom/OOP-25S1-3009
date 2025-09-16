import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class CollectionInterfaceExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}