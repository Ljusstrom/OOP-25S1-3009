import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            number = askInteger(scanner);
            if (number > 0) {
                System.out.println("The number is positive.");
            }
            else if (number < 0) {
                System.out.println("The number is not positive.");
            }
        } while (number != 0);
    }

    public static int askInteger(Scanner scanner) {
        int number = 0;
        System.out.println("Give another number:");
        String s = scanner.nextLine();
        if (s.length() > 0)
            number = Integer.parseInt(s);
        else
            System.out.println("String cannot be empty");
        return number;
    }
}