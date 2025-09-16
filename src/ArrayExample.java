import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        char[][] chessboard = {
                { 'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { 'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r' }
        };

        for (char[] row : chessboard) {
            for (char piece : row) {
                System.out.print(piece);
            }
            System.out.println();
        }
    }
}