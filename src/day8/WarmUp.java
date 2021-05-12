package day8;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(getEvenOdd(2)); // even
		System.out.println(getEvenOdd(6)); // even
		System.out.println(getEvenOdd(10)); // ten
		System.out.println(getEvenOdd(3)); // odd
		System.out.println(getEvenOdd(99)); // odd
	}
	
	// if number is even return "even"
	// except if number is 10 return "ten"
	// otherwise return "odd"
	// 10
	public static String getEvenOdd(int number) {
		if (number == 10) {
			// when method return the value it will exit from the method
			return "ten";		
		} else if (number % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}
}


