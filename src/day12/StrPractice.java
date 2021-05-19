package day12;

public class StrPractice {
	public static void main(String[] args) {
		System.out.println(getNumberOfChars("java")); // 4
		System.out.println(getNumberOfChars("apple")); // 5
		System.out.println(getNumberOfChars("hello world")); // 11
		System.out.println(getNumberOfChars("hi")); // 2
		System.out.println("---------");
		
		System.out.println(evenLowOddUp("java")); // JAVA
		System.out.println(evenLowOddUp("Apple")); // apple
		System.out.println(evenLowOddUp("Hi")); // HI
		System.out.println(evenLowOddUp("ODD")); // odd
		System.out.println("---------");
		
		System.out.println(getFirstThree("java")); // jav
		System.out.println(getFirstThree("apple")); // app
		System.out.println(getFirstThree("hello world")); // hel
		System.out.println(getFirstThree("hi")); // hi
		System.out.println("---------");
		
		System.out.println(getLastThree("java")); // ava
		System.out.println(getLastThree("apple")); // ple
		System.out.println(getLastThree("hello world")); // rld
		System.out.println(getLastThree("hi")); // hi
		System.out.println("---------");
		
		printFirstAndLast("java"); // ja
		printFirstAndLast("python"); // pn
		printFirstAndLast("php"); // pp
		printFirstAndLast("JavaScript"); // Jt
		printFirstAndLast("a"); // a
	}
	
	/**
	 * return number of characters of argument str
	 * .length() 
	 */
	public static int getNumberOfChars(String str) {
		// int len = str.length();
		return str.length();
	}
	
	/**
	 * if str length is even, return str as upper case string
	 * if str length is odd, return str as lower case string
	 * 
	 */
	public static String evenLowOddUp(String str) {
		int len = str.length();
		String res = len % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
		return res;
	}
	
	/**
	 * Return first 3 chars from str as String
	 * - if str length is less than 3, return str itself
	 */
	public static String getFirstThree(String str) {
		if (str.length() > 3) {
			return str.substring(0, 3);
		}
		
		return str;
	}
	
	/**
	 * Return last 3 chars from str as String
	 * - if str length is less than 3, return str itself
	 * 
	 *  01234
	 * "apple"       -> sub(2)
	 *  5 - 3 = 2
	 * 
	 *  012345678910
	 * "hello world" -> sub(8)
	 *  11 - 3 = 8
	 * 
	 */
	public static String getLastThree(String str) {
		if (str.length() > 3) {
			return str.substring(str.length() - 3);
		}
		return str;
	}
	
	/**
	 * print first and last char of the string
	 * if str length is less than 2, print str
	 * printFirstAndLast("java"); ja
	 * printFirstAndLast("python"); pn
	 * printFirstAndLast("php"); pp
	 * printFirstAndLast("JavaScript"); Jt
	 * printFirstAndLast("a"); a
	 */
	public static void printFirstAndLast(String str) {
		if (str.length() > 2) {                            
			String out = str.charAt(0) + "" + str.charAt(str.length() - 1);
			System.out.println(out);
		} else {
			System.out.println(str);
		}
	}
}









