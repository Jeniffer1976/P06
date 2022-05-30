import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd1() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testAdd2() {
		int a = 454321;
		int b = 6541234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testAdd3() {
		int a = -5;
		int b = -28;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract1() {
		int a = 10;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract2() {
		int a = -1;
		int b = -5;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract3() {
		int a = 437972;
		int b = 747372;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiple1() {
		int a = 5;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 15;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiple2() {
		int a = -1;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiple3() {
		int a = 123245;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide1() {
		int a = 50;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 10;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide2() {
		int a = 50;
		int b = -5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide3() {
		int a = 50;
		int b = 12345;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = -1;
		assertEquals(expected, actual);
	}

}
