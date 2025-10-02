public class AnonDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Running in Runnable thread");
        new Thread(r).start();
        System.out.println("Running in main thread");
    }
}