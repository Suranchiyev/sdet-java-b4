package day27;

public class ForLoopReview2 {
	public static void main(String[] args) {
		// Vowels: A, E, I, O, U, a, e, i, o, u
		
		// TODO create a void method that accepts one String argument
		//      method should print only vowels from that string
		
		// printVowelLetters("hello");
		// e
		// o
		
		printVowelLetters("Apple");
		// A
		// e
	}
	
	public static void printVowelLetters(String str) {   
		String strCopy = str;
		
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(strCopy.charAt(i));
			}
		}
	}	
}
