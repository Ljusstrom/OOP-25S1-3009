import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private static Calculator c;

    @BeforeAll
    static void setupBeforeClass() throws Exception {
        c = new Calculator();   // same object in every test
    }
    @BeforeEach
    void setUp() {
        c.clear();              // clear the calculator before every test
    }
    @Test
    void testClear() {
        System.out.println("Clear");
        c.clear();
        assertEquals(0, c.giveResult(), "Clearing was not successful");
    }

    @Test
    void testAdd() {
        System.out.println("Add");
        c.add(2);
        assertEquals(2, c.giveResult(), "Addition was not succesful");
        c.add(2);
        assertEquals(4, c.giveResult(), "Addition was not succesful");
        c.add(96);
        assertEquals(100, c.giveResult(), "Addition was not succesful");
        c.add(0);
        assertEquals(100, c.giveResult(), "Addition was not succesful");
        c.add(-1000);
        assertEquals(-900, c.giveResult(), "Addition was not succesful");
        c.add(-1000);
        assertEquals(-1900, c.giveResult(), "Addition was not succesful");
    }

    @Test
    void testAddIntOverflow() {
        System.out.println("testAddIntOverflow");

        assertEquals(0, c.giveResult(), "Clear was not succesful");
        c.add(Integer.MAX_VALUE - 1);
        assertEquals(Integer.MAX_VALUE - 1, c.giveResult(), "Addition was not succesful");
        c.add(1);
        assertEquals(Integer.MAX_VALUE, c.giveResult(), "Addition was not succesful");
        assertThrows(IntegerOverflowException.class, () -> c.add(1), "Addition did not generate an exception");
    }

    @Test
    void testSub() {
        System.out.println("Sub");
        c.sub(3);
        assertEquals(-3, c.giveResult(), "Subtraction was not succesful");
        c.sub(3);
        assertEquals(-6, c.giveResult(), "Subtraction was not succesful");
        c.sub(94);
        assertEquals(-100, c.giveResult(), "Subtraction was not succesful");
        c.sub(0);
        assertEquals(-100, c.giveResult(), "Subtraction was not succesful");
        c.sub(-1000);
        assertEquals(900, c.giveResult(), "Subtraction was not succesful");
        c.sub(-1000);
        assertEquals(1900, c.giveResult(), "Subtraction was not succesful");
    }

    @Test
    void testSubIntOverflow() {
        System.out.println("testSubIntOverflow");

        assertEquals(0, c.giveResult(), "Clear was not succesful");
        c.sub(Integer.MIN_VALUE - 1);
        assertEquals(Integer.MIN_VALUE + 1, c.giveResult(), "Subtraction was not succesful");
        c.sub(1);
        assertEquals(Integer.MIN_VALUE, c.giveResult(), "Subtraction was not succesful");
        assertThrows(IntegerOverflowException.class, () -> c.sub(1), "Subtraction did not generate an exception");
    }

    @Test
    void testMul() {
        System.out.println("Mul");
        c.mul(3);
        assertEquals(0, c.giveResult(), "Multiplication was not succesful");
        c.add(1);
        c.mul(3);
        assertEquals(3, c.giveResult(), "Multiplication was not succesful");
    }

    @Test
    void testMulIntOverflow() {
        System.out.println("testMulIntOverflow");

        assertEquals(0, c.giveResult(), "Clear was not succesful");
        c.add(1);
        c.mul((Integer.MAX_VALUE/2));
        assertEquals((Integer.MAX_VALUE/2), c.giveResult(), "Multiplication was not succesful");
        c.mul(2);
        assertEquals(Integer.MAX_VALUE-1, c.giveResult(), "Multiplication was not succesful");
        assertThrows(IntegerOverflowException.class, () -> c.mul(2), "Multiplication did not generate an exception");
    }

    @Test
    void testDiv() {
        System.out.println("Div");
        c.div(3);
        assertEquals(0, c.giveResult(), "Division was not succesful");
        c.add(100);
        c.div(10);
        assertEquals(10, c.giveResult(), "Division was not succesful");
        c.div(0);
        assertEquals(10, c.giveResult(), "Division was not succesful");
    }

    @Test
    void testGetResult() {
        assertEquals(0, c.giveResult(), "giveResult() failed");
        c.add(123);
        assertEquals(123, c.giveResult(), "giveResult() failed");
    }
}