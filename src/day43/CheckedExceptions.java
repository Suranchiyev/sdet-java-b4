package day43;

public class CheckedExceptions {
	public static void main(String[] args) {
		// Runtime Exceptions
		// Every exception that extends RuntimeException is runtime exception.
		// We got this exceptions during the runtime of the program and 
		// we are not required to handle it.
		
		// Checked Exceptions
		// Every exception that extends Exception (except RuntimeException) is checked
		// exception. We must handle or declare checked exceptions.
		
		// Errors
		// they thrown by JVM. We don't handle them, we don't throw them.
		
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			// Unhandled InteraptedException  
			
			try {
				// it throws checked exception so must handle it
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Excpetion was here while wating");
			}
		}
	}
}
