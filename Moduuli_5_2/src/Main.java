public class Main {
    static final int N = 1000;
    static final int M = 10;

    public static void main(String[] args) {
        for (int i = 0; i < M; i++) {
            Account account = new Account();

            Thread william = new Thread(new Depositor(account, N));
            Thread jeff = new Thread(new Depositor(account, N));

            // depositors start their work
            william.start(); jeff.start();

            // here we wait for them to be ready
            try {
                william.join(); jeff.join();
            } catch (InterruptedException e) {
            }

            System.out.println("Account balance is: " + account.getSaldo());
        }
    }
}