import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        HashSet<Integer> treeSet = new HashSet<>();

        // Adding elements
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(34);

        // Printing the sorted elements
        for (int num : treeSet) {
            System.out.println(num);
        }
    }
}