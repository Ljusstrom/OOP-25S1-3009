class Car {
    private String make;
    private String regNo;

    public Car(String m, String r) {
        make = m;
        regNo = r;
    }

    @Override
    public String toString() {
        return "Car is " + make + ", register number: " + regNo;
    }
}

public class GenericsMain {
    public static void main(String[] args) {
        // Class with Integer
        GenericsTest<Integer> g = new GenericsTest<>();
        g.doSomething(123);

        // Class with String
        GenericsTest<String> g1 = new GenericsTest<>();
        g1.doSomething("jotain");

        // Class with Car
        GenericsTest<Car> g2 = new GenericsTest<>();
        g2.doSomething(new Car("Toyota", "ABC-123"));
    }
}
