import java.util.ArrayList;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname;
        int age;
        ArrayList<Person> persons = new ArrayList<>();

        do {
            System.out.print("Give firstname: ");
            firstname = scanner.nextLine();
            if (firstname.length() > 0) {
                System.out.print("Give age: ");
                age = Integer.parseInt(scanner.nextLine());
                persons.add(new Person(firstname, age));
            }
        } while (firstname.length() > 0);

        System.out.println("Added " + persons.size() + " persons.");
        System.out.print("Give the index of the person searched for 0.." + (persons.size()-1) +": ");
        System.out.println(persons.get(scanner.nextInt()));

        // Add one additional Person at the beginning of the list
        persons.add(0, new Person("Vilhelm", 90));

        System.out.println("All persons:");
        for (Person person : persons)
            System.out.println(person); // calls Person.toString()
    }
}