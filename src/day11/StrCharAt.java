package day11;

public class StrCharAt {
	public static void main(String[] args) {
		/**
		 * .charAt(index) -> returns single char based on its index
		 */
		
		//            01234
		String str = "home";
		char ch = str.charAt(1);
		System.out.println(ch); // o
		
		//     012345
		str = "Public";
		char ch2 = str.charAt(5);
		System.out.println(ch2); // c
		
		
		System.out.println(getLastChar("hello")); // o
		System.out.println(getLastChar("hi"));    // i
		System.out.println(getLastChar("John Doe")); // e
		System.out.println(getLastChar("Alex"));    // x
	}
	
	public static char getLastChar(String str) {
		int len = str.length();
		char ch = str.charAt(len - 1);
		return ch;
	}
}
