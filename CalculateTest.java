

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import  org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {
	
	@BeforeClass
	public static void greet() {
		System.out.println("Before Everything");
	}

	@Test
	public void test1() {
		
		assertEquals(0 , Calculate.multiply(0, 1));
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		
		assertEquals(1 , Calculate.multiply(1.0, 1.0), .000000005); 
		System.out.println("Test 2");
	}
	@Test
	public void test3() {
		
		assertEquals(2 , Calculate.multiply(2, 1));
		System.out.println("Test 3");
	}
	@Before
	public void Before() {
		System.out.println("Before each test");
	}
	@After 
	public void After() {
		System.out.println("After each test");
	}
	@AfterClass
	public static void Goodbye() {
		System.out.println("Goodbye");
	}
}
