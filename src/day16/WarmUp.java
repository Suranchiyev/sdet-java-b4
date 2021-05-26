package day16;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(isOddLength("apple")); // true
		System.out.println(isOddLength("kiwi"));  // false
		System.out.println(isOddLength("john"));  // false
	}
	
	/*
	 * getFirstAndLast("apple"); -> ae
	 * getFirstAndLast("hello"); -> ho
	 * getFirstAndLast("kiwi");  -> ki
	 * 
	 * substring()
	 */
	public static String getFirstAndLast(String str) {
		//      a
		String fL = str.substring(0, 1);
		//      e
		String lL = str.substring(str.length() - 1);
		
		return fL + lL;
	}
	
	/*
	 * if the length of argument a is odd return true
	 * otherwise, return false
	 */
	public static boolean isOddLength(String a) {
//		if (a.length() % 2 == 1) {
//			return true;
//		}
//		
//		return false;
		
		return a.length() % 2 == 1;
	}
}
