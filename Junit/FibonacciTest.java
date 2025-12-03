package cs361.Junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
    // 9 tests total: -57, -1, 0, 1, 16, 44, 45, 46, 125

    // Edge case
    @Test
	void testFib0() {
		try {
			assertEquals(0, Fibonacci.fib(0));
		} catch (Exception e) {
			fail("Exception generated for fib(0)");
		}
	}

    @Test
	void testFib100() {
		try {
			Fibonacci.fib(100);
            fail("We cannot compute fib(100)");
		} catch (Exception e) {
			if (e instanceof IllegalArgumentException) {
                assertTrue(true);
            } else {
                fail("Not the correct exception");
            }
		}
	}

    // Edge case
    @Test
	void testFib45() {
		try {
			assertEquals(1134903170, Fibonacci.fib(45));
		} catch (Exception e) {
			fail("Exception generated for fib(45)");
		}
	}
}
