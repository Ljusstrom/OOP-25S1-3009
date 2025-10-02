public class Calculator {
    private int result;

    public void clear() {
        result = 0;
    }
    public void add(int n) {
        if (((long)result + n) > Integer.MAX_VALUE) throw new IntegerOverflowException("Integer would've overflowed");
        result += n;
    }
    public void sub(int n) {
        if (((long)result - n) < Integer.MIN_VALUE) throw new IntegerOverflowException("Integer would've overflowed");
        result -= n;
    }
    public void mul(int n) {
        /** @note This will overflow if n is too big -> refactor with BigInteger */
        if (((long)result * n) > Integer.MAX_VALUE) throw new IntegerOverflowException("Integer would've overflowed");
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