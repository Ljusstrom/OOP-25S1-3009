import java.util.Scanner;

public class VowelOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a character:");
        char character = scanner.nextLine().toLowerCase().charAt(0);

        switch (character) {
            case 'å':
            case 'ä':
            case 'ö':
                System.out.println("The character is a Scandinavian character.");
                // Tarkoituksella koodi valuu tästä alas
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The character is a vowel.");
                break;
            default:
                System.out.println("The character is not a vowel.");
                break;
        }
    }
}