package day13;

public class StrMethods {
	public static void main(String[] args) {
		System.out.println(allEquals("kiwi", "kiwi", "kiwi")); // true
		System.out.println(allEquals("kiwi", "kiwi", "orange")); // false
		System.out.println(allEquals("a", "A", "A")); // false
		System.out.println(allEquals("a", "a", "a")); // true
		System.out.println("========");
		System.out.println(isEqual2("Apple", "apple", false)); // true
		System.out.println(isEqual2("Apple", "apple", true));  // false
		System.out.println(isEqual2("orange", "apple", false)); // false
		System.out.println(isEqual2("apple", "apple", true));  // true
	}
	
	/**
	 * return true if all parameters/arguments are the same
	 * otherwise return false
	 */
	public static boolean allEquals(String a, String b, String c) {
		return a.equals(b) && b.equals(c);
	}
	
	/**
	 * return true if str equals to str1
	 * - if isCS is false, you can ignore the case sensitivity
	 * - otherwise comparison should be case sensitive
	 */
	public static boolean isEqual2(String str, String str1, boolean isCS) {
		// isCS => true => case sensitive
		// isCS => false => none
		
		if (!isCS) {
			// .equalsIgnoreCase() it will ignore cases
			return str.equalsIgnoreCase(str1);
		}
		
		return str.equals(str1);
	}
}
