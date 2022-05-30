import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		int a = -1;
		int b = -5;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiple() {
		int a = 5;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 15;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		int a = 50;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 10;
		assertEquals(expected, actual);
	}

}
