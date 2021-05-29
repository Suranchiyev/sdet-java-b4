package day18;

public class FizzBuzz {
	public static void main(String[] args) {
		// Write a code that will print numbers from 1 to 100
		// except:
		// - if number is divisible by 5 evenly then print "Java"
		// - if number is divisible by 7 evenly then print "Cool"
		// - if number is divisible by 5 and 7 evenly then print "Java is Cool"
		
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("Java is Cool");
				
			} else if (i % 7 == 0) {
				System.out.println("Cool");

			} else if (i % 5 == 0) {
				System.out.println("Java");
				
			} else {
				System.out.println(i);	
			}	
		}
	}
}
