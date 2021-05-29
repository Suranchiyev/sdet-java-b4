package day17;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		
		do {
			System.out.println("Hello, World!");
			i++;
		} while (i < 10);
		
		// What's the difference between 'while' loop and 'do while' loop?
		// The body of the loop get's executed first in the do while loop 
		// and then the condition part. For while loop its opposite.
		// 'do while' loop will have at least one iteration
		// 'while' loop can have 0 iterations
	}
}
