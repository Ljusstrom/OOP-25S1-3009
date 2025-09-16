public class RandomNumber {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            int luku = (int) (Math.random() * 10) + 1;
            System.out.println("Satunnaisluku 1...10: " + luku);
        }
    }
}
