package day14;

public class StrPractice {
	public static void main(String[] args) {
		 isThere("Amazon Web Services", "Web"); // Yes, it's there
		 isThere("Amazon Wev Services", "Cloud"); // No, it's not there
		 isThere("Hello", "ell"); // Yes, it's there
		 
		 System.out.println(startsOrEnds("AAHello", "AA")); // true
		 System.out.println(startsOrEnds("HelloAA", "AA")); // true
		 System.out.println(startsOrEnds("HelAAlo", "AA")); // false
		 System.out.println(startsOrEnds("Hello", "T")); // false
		 System.out.println(startsOrEnds("apple", "xx")); // false
		 
		 System.out.println(getAroundStr("Hi John Doe! How are you?", "John Doe")); // Hi ! How are you?
		 System.out.println(getAroundStr("abc", "b")); // ac
		 System.out.println(getAroundStr("hello", "ll")); // heo
		 System.out.println(getAroundStr("apple", "xx")); // apple
		 System.out.println("==========");
		 
		 System.out.println(getAroundStr2("Hi John Doe! How are you?", "John Doe")); // Hi ! How are you?
		 System.out.println(getAroundStr2("abc", "b")); // ac
		 System.out.println(getAroundStr2("hello", "ll")); // heo
		 System.out.println(getAroundStr2("apple", "xx")); // apple
		 System.out.println("==========");
		 
		 System.out.println(isUpperCase("APPLE")); // true
		 System.out.println(isUpperCase("Apple")); // false
		 System.out.println(isUpperCase("KIWI"));  // true
		 System.out.println(isUpperCase("kiwi"));  // false
	}
	
	/**
	 * - if string str is in all upper cases, return true
	 *   otherwise, return false
	 */
	public static boolean isUpperCase(String str) {
		String str2 = str.toUpperCase();
		return str.equals(str2);
	}
	
	/**
	 * getAroundStr("Hi John Doe! How are you?", "John Doe") -> "Hi ! How are you?"
	 * getAroundStr("abc", "b") -> ac
	 * getAroundStr("hello", "ll") -> heo
	 * getAroundStr("apple", "xx") -> apple
	 */
	public static String getAroundStr(String content, String str) {
		return content.replace(str, "");
	}
	
	public static String getAroundStr2(String content, String str) {
		if (!content.contains(str)) {
			return content;
		}
		
		int startStrIndex = content.indexOf(str);
		int endStrIndex = startStrIndex + str.length();
		String firstPart = content.substring(0, startStrIndex); 
		String secondPart = content.substring(endStrIndex);
		return firstPart + secondPart;
	}
	
	/**
	 * - return true if content starts or ends with str
	 */
	public static boolean startsOrEnds(String content, String str) {
		if (content.startsWith(str) || content.endsWith(str)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * - if content string contains str, print "Yes, it's there"
	 *   otherwise print "No, it's not there"
	 *    
	 *   Can void methods have return statement? 
	 *   Yes, they can have empty return statement  
	 */
	public static void isThere(String content, String str) {
		if (content.contains(str)) {
			System.out.println("Yes, it's there");
			
			return; // it will exit from the method
			
		} else {
			System.out.println("No, it's not there");
		}
	}	
}
