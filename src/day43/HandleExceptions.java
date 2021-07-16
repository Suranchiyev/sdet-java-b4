package day43;

public class HandleExceptions {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println("Length: " + str.length());
			System.out.println("After the length");
			
		} catch (NullPointerException e) {
			// System.out.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("Catch null pointer exception");
			
			// we can have multiple catch blocks
			// the smaller exception should always go first
		} catch (RuntimeException e) {
			System.out.println("Catch arithmetic exception");
		}
		
		System.out.println("Hello, world!");
	}
}
