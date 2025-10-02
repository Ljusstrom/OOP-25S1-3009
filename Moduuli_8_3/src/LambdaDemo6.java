import java.util.*;
import java.util.function.Predicate;

class LambdaDemo6 {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Geek", "G-Man", "g1", "QA", "GeeksQuiz");

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("G");

        // Iterate through the list
        for (String st : names) {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
    }
}