package day17;

public class ForLoop4 {
	public static void main(String[] args) {
		printLetters("wooden spoon");
		System.out.println("=====");
		printLetters("Java");
		System.out.println("=====");
		printInReverse("Java");
		/*
		 * a
		 * v
		 * a
		 * J
		 */
		
		System.out.println(reverseStr("apple"));  // elppa
		System.out.println(reverseStr("java"));   // avaJ
		System.out.println(reverseStr("1234567")); // 7654321
	}
	
	/*
	 * print each letter of str argument in the new line
	 */
	public static void printLetters(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	/*
	 * print each letter of str in reverse order
	 */
	public static void printInReverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
	
	/*
	 * write a method that will return reverse version of str
	 * reverseStr("apple");    -> elppa
	 * reverseStr("java");     -> avaJ
	 * reverseStr("1234567");  -> 7654321
	 */
	public static String reverseStr(String str) {
		String revStr = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		
		return revStr;		
	}
}
