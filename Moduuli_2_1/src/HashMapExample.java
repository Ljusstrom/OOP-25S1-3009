import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> scores = new HashMap<>();

        // Add key-value pairs
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);
        scores.put("MAtti", 93);
        scores.put("MAtti V.", 92);

        // Retrieve values
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Check if a key exists
        boolean hasCharlie = scores.containsKey("Charlie");
        System.out.println("Does Charlie exist? " + hasCharlie);

        // Iterate over the key-value pairs
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + "'s score: " + score);
        }

        // Remove a key-value pair
        scores.remove("Bob");

        System.out.println("We have " + new HashSet<Integer>(scores.values()).size() + " different values");

    }
}