package day49;

public class FizzBuzz {
	public static void main(String[] args) {
		// Print numbers from 1 till 100 inclusive
		// if number is divisible evenly by 3, print "Fizz" instead of number
		// if number is divisible evenly by 5, print "Buzz" instead of number
		// if number is divisible evenly by both 3 and 5, print "FizzBuzz" instead of number
		
		// More specific condition should go first in our case
		// if number is divisible evenly by 3 and 5 should go first
	
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
