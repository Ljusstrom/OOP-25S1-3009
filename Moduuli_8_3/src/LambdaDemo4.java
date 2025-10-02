@FunctionalInterface
interface StringFunction {
    String run(String str);
}

public class LambdaDemo4 {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        printFormatted("Hello", (s) -> s + " fellow user!");
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}