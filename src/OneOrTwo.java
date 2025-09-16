import java.util.Scanner;

public class OneOrTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());

        if (number == 1 || number == 3 || number == 5 || number == 7) {
            doSomething();
        }
        else if (number == 2) {
            System.out.println("The number is two.");
        }
        else {
            System.out.println("The number is neither one nor two.");
        }
        /*
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
                doSomething();
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            default:
                System.out.println("The number is neither one nor two.");
                break;
        }*/
    }

    public static void doSomething() {
        System.out.println("The number is one, three, five or seven.");
    }
}