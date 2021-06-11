package day25;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(rev("abc")); // cba
		System.out.println(rev("hello")); // olleh
		System.out.println(rev("apple")); // elppa
	}
	
	/*
	 * return reverse version of str
	 * rev("abc") -> "cba"
	 * rev("hello") -> "olleh"
	 * rev("apple") -> "elppa"
	 */
	public static String rev(String  str) {
		String revStr = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		
		return revStr;
	}
}
