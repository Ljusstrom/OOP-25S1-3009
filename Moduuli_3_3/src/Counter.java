public class Counter extends ParentClass {
    private static int count = 0; // static variable
    private int uniqueId = 0;

    public Counter() {
        count++; // Increment count each time a new instance is created
        uniqueId = count;
    }

    public static void teeJotain() {
        System.out.println("Counter: jotain");
    }

    public static int getCount() { return count; }
}