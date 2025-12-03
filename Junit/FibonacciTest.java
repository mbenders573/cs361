package cs361.Junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
    // 9 tests total: -57, -1, 0, 1, 16, 44, 45, 46, 100

	// -57
	@Test
	void testFibNeg57() {
		try {
			Fibonacci.fib(-57);
            fail("We cannot compute fib(-57)");
		} catch (Exception e) {
			if (e instanceof IllegalArgumentException) {
                assertTrue(true);
            } else {
                fail("Not the correct exception");
            }
		}
	}

	// -1
	@Test
	void testFibNeg1() {
		try {
			Fibonacci.fib(-1);
            fail("We cannot compute fib(-1)");
		} catch (Exception e) {
			if (e instanceof IllegalArgumentException) {
                assertTrue(true);
            } else {
                fail("Not the correct exception");
            }
		}
	}

	// Edge case 0
    @Test
	void testFib0() {
		try {
			assertEquals(0, Fibonacci.fib(0));
		} catch (Exception e) {
			fail("Exception generated for fib(0)");
		}
	}

	// 1
	@Test
	void testFib1() {
		try {
			assertEquals(1, Fibonacci.fib(1));
		} catch (Exception e) {
			fail("Exception generated for fib(1)");
		}
	}

	// 16
	@Test
	void testFib16() {
		try {
			assertEquals(987, Fibonacci.fib(16));
		} catch (Exception e) {
			fail("Exception generated for fib(16)");
		}
	}

	// 44
	@Test
	void testFib44() {
		try {
			assertEquals(701408733, Fibonacci.fib(44));
		} catch (Exception e) {
			fail("Exception generated for fib(44)");
		}
	}

    // Edge case 45
    @Test
	void testFib45() {
		try {
			assertEquals(1134903170, Fibonacci.fib(45));
		} catch (Exception e) {
			fail("Exception generated for fib(45)");
		}
	}

	// 46
	@Test
	void testFib46() {
		try {
			Fibonacci.fib(46);
            fail("We cannot compute fib(46)");
		} catch (Exception e) {
			if (e instanceof IllegalArgumentException) {
                assertTrue(true);
            } else {
                fail("Not the correct exception");
            }
		}
	}

	// 100
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
}
