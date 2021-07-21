package day44;

public class ExceptionsReview {
	public static void main(String[] args) {
		// What type of exceptions we have in Java?
		
		// RuntimeExceptions
		// - NullPointerException, ArrayIndexOutOfBoundException,
		// - We don't require to handle them. We will get to know about exception during the runtime
		// - Every exception that extends RuntimeException is runtime exception in Java.
		
		// CheckedExceptions
		// - We must handle or declare checked exceptions
		// - Every exception except RuntimeException that extends Exception is checked exception.
		
		// Error 
		// - we don't handle errors or we don't throw them.
		
		// How do you handle exceptions in Java?
		// By using try catch statement.
		
		try {
			// some code that can throw exception
			
		} catch (RuntimeException e) {
			// 1. If we put parent exception in catch block it can catch all child exceptions 
			//     as well.
			
			// What should we do when we handle exception?
			// It's always based on scenario/requirement
			
			// RuntimeException e - will have info about the exception.
		}
		
		// ------------
		
		// RuntimeExcpetions - not required to handle 
		// CheckedExcpetions - must handle
		
		try {
			String str = "hello";
			char ch = str.charAt(10);
		} catch (RuntimeException e) {
			
			System.out.println("something went wrong");
		}
		
		// ----
		try {
			System.out.println("Before wait");
			Thread.sleep(1000);
			
			System.out.println("After wait");
		} catch (Exception e) {
			System.out.println("something went wrong in checked excpetion");
		}
	}
	
	// throws ExceptionType - this is how we declare exceptions
	public static void wait(int sec) throws Exception {
		Thread.sleep(sec * 1000);
	}
}




