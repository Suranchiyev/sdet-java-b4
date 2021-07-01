package day33;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(strRev("apple")); // elppa
		System.out.println(strRev("hello")); // olleh
		System.out.println(strRev("hi")); // ih
	}
	
	/*
	 * return str in reverse order
	 * 
	 */
	public static String strRev(String str) {
		// empty String to store reverse version of str
		String revStr = "";
		
		// loop over from the back by using index
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		
		
		return revStr;
	}
}
