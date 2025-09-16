import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Anna", 21));
        persons.add(new Person("John", 27));
        persons.add(new Person("Tina", 19));

        persons.sort(new PersonAgeComparator()); // käyttää Comparator-rajapintaa
        for (Person p : persons) {
            System.out.println(p);
        }

        Person[] parray = persons.toArray(new Person[0]); //kikkakutonen
        Arrays.sort(parray);  // käyttää Comparable rajapintaa

        Collections.sort(persons);  // käyttää Comparable rajapintaa
        for (Person p : parray) {
            System.out.println(p);
        }
    }
}
