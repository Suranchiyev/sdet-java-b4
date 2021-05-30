package day19;

public class Alphabet {
	public static void main(String[] args) {
		String alphabet = "";
		
		for (char letter = 'a'; letter <= 'z'; letter++) {
			alphabet += letter + " ";
		}
		System.out.println(alphabet);
		// How many String object got created?
		// 27 String objects were created
		
		System.out.println("=========");
		
		
		StringBuilder sbAlphabet = new StringBuilder();
		for (char l = 'a'; l <= 'z'; l++) {
			sbAlphabet.append(l).append(" ");
		}
		// How many StringBuilder objects got created?
		// Only 1
		System.out.println(sbAlphabet); // a b c d e ..
	}
}
