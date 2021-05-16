package day10;

public class StrNumber {
	public static void main(String[] args) {
		// byte and Byte
		// short and Short
		// char and Character
		// int and Integer
		// String
		// Enum
		
		printNumericVal("one");   // Number is 1
		printNumericVal("three"); // Number is 3
		printNumericVal("seven"); // Number is seven
		printNumericVal("abc");   // Number is abc
	}
	
	/**
	 * "one"     -> print "Number is 1"
	 * "two"     -> print "Number is 2"
	 * "three"   -> print "Number is 3"
	 * Otherwise -> print "Number is <strNumber>"
	 * 
	 */
	public static void printNumericVal(String strNumber) {
		switch(strNumber) {
		case "one":
			System.out.println("Number is 1");
			break;
		case "two":
			System.out.println("Number is 2");
			break;
		case "three":
			System.out.println("Number is 3");
			break;
		default:
			System.out.println("Number is " + strNumber);
			break;
		}
	}
}
