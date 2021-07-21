package day44;

import java.io.IOException;

public class CheckedExceptions {
	public static void main(String[] args) throws Exception {
		System.out.println("Start!");
		
		Thread.sleep(1000);
		
		
		// wait(5);
		try {
			m1(5);
		} catch (Exception e) {
			System.out.println("Excpetion, i will try diff input");		
		}
		
		System.out.println("After 5 seconds");
	}
	
	// throws Exception 
	public static void wait(int sec) throws Exception {
		Thread.sleep(sec * 1000);
	}
	
	public static void m1(int i) throws Exception {
		if (i % 2 == 1) {
			// that's how throw exceptions
			throw new IOException("Test excpetion");
			
		} else {
			System.out.println("Even num");
		}
	}
	
	
}
