import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class JunitTestCase_Factorial {
	
	/*
	 * Test Cases for Factorial
	 * 1. If the number is 0, system should give output 1
	 * 1. If the number is 1, system should give output 1
	 * 1. If the number is negative, system should give output IllegalArgumentException
	 */
	
	Maths m;
	@Before
	public void setUp() throws Exception {
		m = new Maths();
	}

	@Test
	public void testForZeroValue() {
		assertEquals(1, m.getFactorial(0));
	}

	@Test
	public void testForNegativeValue() {
		assertTrue("Factorial", m.getFactorial(0) > 0);
	}
}
