package day11;

public class StrMethods {
	public static void main(String[] args) {
		// String is immutable object
		// immutable - not changeable
		
		String str = "apple";
		String str2 = new String("orange");
		
		// length() -> number of chars in the String
		int len = str.length();
		System.out.println("Number of characters: " + len);
		
		str = "hello world";
		// space is also will be counted
		System.out.println(str.length());
		
		
		// toUpperCase() it will return upper case version of string
		// toLowerCase() it will return lower case version of string
		String word = "book";
		System.out.println(word); // book
		System.out.println(word.toUpperCase()); // BOOK
		
		System.out.println(word); // book
		
		word = word.toUpperCase();
		System.out.println(word); // BOOK
		
		String word2 = "APPLE";
		System.out.println(word2);
		System.out.println(word2.toLowerCase());
	}
}



