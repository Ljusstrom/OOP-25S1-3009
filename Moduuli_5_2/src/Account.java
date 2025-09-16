import java.math.BigInteger;

class Account {
    private BigInteger credit;
    private static int count = 0;

    public Account() {
        credit = BigInteger.ZERO;       // 0 to credit
        count++;
    }

    public void deposit(BigInteger amount) {
        synchronized(this) {
            credit = credit.add(amount);
        }
        //System.out.println("deposited");
    }

    public synchronized boolean withdraw(BigInteger amount) {
        BigInteger result = credit.subtract(amount);

        if (result.signum() == -1) {    // test whether the result is negative
            return false;
        } else {
            credit = result;
            return true;
        }
    }

    public BigInteger getSaldo() {
        return credit;
    }

    public synchronized static int getCount() {
        return count;
    }
}