package day47;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import org.junit.Assert;

//import static org.junit.Assert.*;

public class MethodsTest {
	// We use hooks when we need to prepare the data(input) 
	// and to clean up the data.

	@BeforeAll
	public static void setAllUp() {
		System.out.println("--- UNIT TESTING IS STARTED ---");
	}
	
	@AfterAll
	public static void tearAllDown() {
		System.out.println("--- UNIT TESTING IS DONE ---");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Test case is starting..");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After each test case..");
	}
	
	@Test
	public void sumTest() {
		Methods obj = new Methods();
		
		int actual = obj.sum(2, 2);
		int expected = 4;
		
		// assertions 
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void sumTest2() {
		Methods obj = new Methods();
		
		int actual = obj.sum(-5, 10);
		int expected = 5;
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void reverseTest() {
		Methods obj = new Methods();
		
		String actual = obj.reverse("java");
		String expected = "avaj";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void reverseTest2() {
		Methods obj = new Methods();
		
		String input = "12345";
		String actual = obj.reverse(input);
		String expected = "54321";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isEvenTest() {
		Methods obj = new Methods();
		
		boolean actual = obj.isEven(122);
		// boolean expected = true;
		// Assert.assertEquals(expected, actual);
		
		Assert.assertTrue(actual);
	}
	
	@Test
	public void isEvenTest2() {
		Methods obj = new Methods();
		
		boolean actual = obj.isEven(7);
		Assert.assertFalse(actual);
	}
	
	@Test
	public void isOddTest() {
		Methods obj = new Methods();
		Assert.assertTrue(obj.isOdd(5));
	}
	
	@Test
	public void isOddTest2() {
		Methods obj = new Methods();
		boolean actual = obj.isOdd(100);
		Assert.assertFalse(actual);
	}
	
	@Test
	public void revArrTest() {
		int[] input = {1, 2, 3, 4, 5};
		System.out.println("before: " + Arrays.toString(input));
		
		Methods obj = new Methods();
		obj.revArr(input);
		System.out.println("after: " + Arrays.toString(input));
		
		int[] expected = {5, 4, 3, 2, 1};
		
		// input(actual) vs expected
		Assert.assertArrayEquals(expected, input);
	}
	
	@Test
	public void firstLastTest() {
		int[] input = {1, 2, 3, 4};
		
		Methods obj = new Methods();
		obj.fisrtLast(input);
		
		int[] expected = {4, 2, 3, 1};
		Assert.assertArrayEquals(expected, input);
	}
	
	@Test
	public void firstLastTest2() {
		
		int[] input = {7 ,5 ,3};
		
		Methods obj = new Methods();
		obj.fisrtLast(input);
		
		int[] expected = {3, 5, 7};
		Assert.assertArrayEquals(expected, input);
	}
}
