package day40;

public class WarmUp {
	public static void main(String[] args) {
		// TODO FizzBuzz
		// print numbers from 1 to 100 in new lines
		// but
		// if number is divisible by 3, print "Java"
		// if number is divisible by 5, print "Cool"
		// if number is divisible by 3 and 5, print "Java is cool"
		// %
		
		for (int i = 1; i <= 100; i++) {		
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Java is cool");
				
			} else if (i % 3 == 0) {
				System.out.println("Java");
				
			} else if (i % 5 == 0) {
				System.out.println("Cool");
				
			} else {
				System.out.println(i);
			}		
		}
	}
}
