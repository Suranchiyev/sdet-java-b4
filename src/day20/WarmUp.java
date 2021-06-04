package day20;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(revStr("apple"));  // elppa
		System.out.println(revStr("orange")); // egnaro
		System.out.println(revStr("kiwi"));   // iwik
		
	}
	
	/*
	 * return reverse version of str
	 * 1. Create empty String to store reverse version of str
	 * 2. Loop over str from the back by using length() - 1
	 * 3. Keep adding each char from the back of str by using charAt(i)
	 * 4. After the loop return reverse version string
	 */
	public static String revStr(String str) {
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		return revStr;
	}
}
