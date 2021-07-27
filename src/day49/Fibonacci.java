package day49;

public class Fibonacci {
	public static void main(String[] args) {
		//fib(3);
		//fib(5);
		//fib(6);
		fib(10);
		//fib(100);
	}
	
	// n - number of fibonacci numbers to print
	// Fibonacci is a series of numbers where the next number
	// is sum of the previous two numbers
	// The first two numbers is 0 and 1
	// fib(3)  -> 0 1 1
	// fib(5)  -> 0 1 1 2 3
	// fib(6)  -> 0 1 1 2 3 5
	// fib(10) -> 0 1 1 2 3 5 8 13 21 34
	public static void fib(int n) {
		int numOne = 0;
		int numTwo = 1;
		
		System.out.print(numOne + " ");
		System.out.print(numTwo + " ");
		
		for (int i = 0; i < n - 2 ; i++) {		
			// no - 2 if this option is used
			// System.out.print(numOne + " ");
			
			int sum = numOne + numTwo;			
			System.out.print(sum + " ");
			numOne = numTwo;
			numTwo = sum;
		}
		
	}
}
