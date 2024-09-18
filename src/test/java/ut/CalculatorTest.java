package ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator;

public class CalculatorTest {

	static Calculator cl;

	@BeforeClass
	public static void setUp() {
		cl = new Calculator();
	}

	@AfterClass
	public static void tearDown() {
		System.gc();
	}

	@Test
	public void testAdd() {

		assertTrue(cl.doAdd(1, 2) == 3);
	}

	@Test
	public void testSub() {
		assertTrue(cl.doSub(1, 1) == 90); //changes the code to fail the test cases
	}
	
//	@Test
//	public void testSub2() {
//		assertTrue(cl.doSub(-1,0) == -1);
//	}

	@Test
	public void testMul() {
		assertTrue(cl.doMul(9, 2) == 18);
	}

	@Test
	public void testDiv() {
		assertTrue(cl.doDiv(8, 2) == 4);
	}
	
	@Test
	public void testDiv2()
	{
		assertEquals(9.0,cl.doDiv(18, 2),.001);
	}
	
	@Test
	public void testDiv3()
	{
		assertEquals(36.00,cl.doMul(18, 2),0.00);
	}
	
	@Test
	public void testAdd2() {
		assertNotEquals(35,cl.doAdd(20, 8));
	}
	

}
