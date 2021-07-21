package day44;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		// break till 11:32 AM EST
		
		Scanner scanner = null;
		
		try {
			System.out.println("Start");
			scanner = new Scanner(System.in);
			System.out.println("Provide number:");
			
			int num = scanner.nextInt();
			
			if (num == 7 || num == 99) {
				System.out.println("Lucky number");
			} else {
				System.out.println("Regular number");
			}
			
			//System.out.println("Closing scanner");
			//scanner.close();
			
		} catch (RuntimeException e) {
			System.out.println("there was an exception: " + e);
		} finally {
			// finally block will always run does matter if there is an exception
			// or not.
			// Usually we use finally block to close our resources.
			System.out.println("Inside finally block");
			System.out.println("Closing scanner");
			scanner.close();
		}
		
		// What are the final, finally, and finalize keywords in Java?
		// final
		// - if variable is final the value cannot be changed.
		// - if class is final, you cannot extend it.
		// - if method is final, you cannot override it.
		
		// finally
		// - it's part of the try catch and it does execute always. Usually we close resources in the finally block
		
		// finalize
		// - It used to be the way we suggest for GC to come and clean.	
		
		
	}
}
