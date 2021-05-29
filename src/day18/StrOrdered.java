package day18;

public class StrOrdered {
	public static void main(String[] args) {
		System.out.println(isOrderedStr("abcdxz"));
		System.out.println(isOrderedStr("xza"));
	}
	
	/*
	 * Return true if str alphabetically ordered otherwise return false
	 * isOrderedStr("abc"); -> true
	 * isOrderedStr("dabc"); -> false
	 * 
	 * str.compareTo(String)
	 */
	public static boolean isOrderedStr(String str) {
		// compareTo will return positive or negative or zero
		// based on order in alphabet of two strings
		
		for (int i = 0; i < str.length() - 1; i++) {
			char letter = str.charAt(i);
			char letter2 = str.charAt(i + 1);
			String letStr = String.valueOf(letter);
			String letStr2 = String.valueOf(letter2);
		
			if (letStr2.compareTo(letStr) <= 0) {
				return false;
			}
		}
		
		return true;
	}
}
