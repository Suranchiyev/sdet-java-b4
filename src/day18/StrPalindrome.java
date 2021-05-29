package day18;

public class StrPalindrome {
	public static void main(String[] args) {
		System.out.println(revStr("apple")); // elppa
		System.out.println(revStr("John"));  // nhoJ
		
		System.out.println(isPalStr2("Anna")); // true
		System.out.println(isPalStr2("civic")); // true
		System.out.println(isPalStr2("level")); // true
		System.out.println(isPalStr2("apple")); // false
		System.out.println(isPalStr2("hello")); // false
	}
	
	/*
	 * String is palindrome if reading from left to right will be same as 
	 * reading from right to left
	 * isPalStr("anna");  -> true
	 * isPalStr("civic"); -> true
	 * isPalStr("level"); -> true
	 * isPalStr("apple"); -> false
	 * isPalStr("hello"); -> false
	 * 
	 *  1. Store reverse version of str in some variable
	 *	2. Compare it with original version
	 *	3. If they are same it's palindrome otherwise it's not
	 */
	public static boolean isPalStr(String str) {
		// str = str.toLowerCase();
		String revStr = ""; 
		
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		
		return revStr.equalsIgnoreCase(str);
	}
	
	public static boolean isPalStr2(String str) {
		str = str.toLowerCase();
		int endIndex = str.length() - 1;
		
		for (int startIndex = 0; startIndex < str.length() / 2; startIndex++) {
			if (str.charAt(startIndex) != str.charAt(endIndex)) {
				return false;
			}
			
			endIndex--;
		}
		
		return true;
	}
	
	/*
	 * return reverse of str
	 */
	public static String revStr(String str) {
		// it will store reverse version of str
		String revStr = "";
		
		// we need to iterate from the back of str                   
		for (int i = str.length() - 1; i >= 0; i--) {
			// add each char to revStr  
			revStr = revStr + str.charAt(i);
		}
		
		// return reverse version
		return revStr;
	}
}
