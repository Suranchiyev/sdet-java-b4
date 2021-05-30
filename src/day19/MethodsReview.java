package day19;

public class MethodsReview {
	public static void main(String[] args) {
		String var = "hello";
		print(var);
		
		print("good morning!");
		
		String res = revStr("apple");
		System.out.println(res);
		
		System.out.println(luckyNumbersMsg(5));
		System.out.println(luckyNumbersMsg(7));
		System.out.println(luckyNumbersMsg(99));
	}
	
	/*
	 * - if number is divisible by 5 return "lucky five"
	 * - if number is divisible by 7 return "my favorite number"
	 * - if number is divisible by 13 return "special number"
	 * - otherwise return "regular number"
	 */
	public static String luckyNumbersMsg(int num) {
		if (num % 5 == 0) {
			return "lucky five";
			
		} else if (num % 7 == 0) {
			return "my favorite number";
			
		} else if (num % 13 == 0) {
			return "special number";
			
		} else {
			return "regular number";
		}
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static String revStr(String abc) {
		return new StringBuilder(abc).reverse().toString();
	}
}
