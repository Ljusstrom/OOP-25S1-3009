import java.util.function.Supplier;

public class Calculator {
    private int result;

    private void checkForOverflow(Supplier<Long> oper) {
        if (oper.get() < Integer.MIN_VALUE ||
            oper.get() > Integer.MAX_VALUE) throw new IntegerOverflowException("Integer would've overflowed");
    }

    public void clear() {
        result = 0;
    }
    public void add(int n) {
        checkForOverflow(() -> (long)result + n);
        result += n;
    }
    public void sub(int n) {
        checkForOverflow(() -> (long)result - n);
        result -= n;
    }
    public void mul(int n) {
        /** @note This will overflow if n is too big -> refactor with BigInteger */
        checkForOverflow(() -> (long)result * n);
        result *= n;
    }
    public void div(int n) {
        if (n == 0) {
            System.out.println("Division by zero not allowed.");
            return;
        }
        result /= n;
    }
    public int giveResult() {
        return result;
    }
}