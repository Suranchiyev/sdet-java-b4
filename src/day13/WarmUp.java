package day13;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(removeSpaces(" ap ple")); // apple
		System.out.println(removeSpaces("    ap p le")); // apple
		System.out.println(removeSpaces("ki wi")); // kiwi
	}
	
	/**
	 * return a argument str without spaces
	 */
	public static String removeSpaces(String str) {		
		return str.replace(" ", "");
	}
}
