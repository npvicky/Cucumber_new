package maven.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MavenTest {
	@BeforeClass
	public static void testbeforeClass() {
      System.out.println("B4 all test methods");
	}
	@Before
	public void testbefore() {
		System.out.println("Test b4 each test");
	}
	@Test
	public void testmethod1() {
		System.out.println("Test method1");
	}
	@Test
	public void testmethod2() {
		System.out.println("Test method1");
	}
	@Test
	public void testmethod3() {
		System.out.println("Test method1");
	}	
	@After
	public void testafter() {
		System.out.println("Test aft each test");
	}
	@AfterClass
	public static void testafterclass() {
		System.out.println("After all test methods");
    }
}
