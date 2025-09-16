import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person p1 = new Person("Matti", 123);
        persons.add(p1);
        persons.add(new Person("Siiri", 26));
        persons.add(new Person("Ahmed", 22));
        persons.add(new Person("Miriam", 43));

        for (Person p : persons) {
            System.out.println(p);
        }

        persons.remove(0);
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
