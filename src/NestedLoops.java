
public class NestedLoops {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int product = i * j;
                System.out.print(i + "*" + j + "=" + product + " ");
                if (product % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            }
        }
    }
}