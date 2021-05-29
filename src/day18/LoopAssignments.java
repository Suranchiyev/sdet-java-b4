package day18;

public class LoopAssignments {
	public static void main(String[] args) {
		printOnlyEvenNumbers(10); // 2 4 6 8 10	
		System.out.println();
		printOnlyEvenNumbers(20); // 2 4 6 8 10 12 14 16 18 20
		System.out.println();
		
		int sum = sumOfAllNums(5);
		System.out.println(sum); // 15
		
		System.out.println(sumOfAllNums(10)); // 55
		System.out.println(sumOfAllNums(100)); // 5050
		
		System.out.println(sumOfAllOddNums(5));  // 9
		System.out.println(sumOfAllOddNums(10)); // 25
		System.out.println(sumOfAllOddNums(15)); // 64
		
		System.out.println(getNumberOfVowelLetters("apple")); // 2
		System.out.println(getNumberOfVowelLetters("hello")); // 2
		System.out.println(getNumberOfVowelLetters("Beknazar")); // 3
		System.out.println(getNumberOfVowelLetters("Aaoouutt")); // 6
	}
	
	/*
	 * A, E, I, O, U and a, e, i, o, u
	 * return number of vowel letters in the str argument
	 * getNumberOfVowelLetters("apple"); -> 2
	 * getNumberOfVowelLetters("hello"); -> 2
	 * getNumberOfVowelLetters("Beknazar"); -> 3
	 * getNumberOfVowelLetters("Aaoouutt"); -> 6
	 * 
	 * 0. Create an int variable that will store the vowel count
	 * 1. Loop over the str by getting each char with charAt()
	 * 2. Check if char is vowel or not(comparing with vowel letters)
	 * 3. If it's vowel, increase vowel count variable by 1
	 * 4. After the loop return vowel count variable
	 * 
	 */
	public static int getNumberOfVowelLetters(String str) {
		int numberOfVowelLetters = 0;
		str = str.toLowerCase();
		
		
		for (int i = 0; i < str.length(); i++) {
			//    'e'      =     'e' 4 
			char letter = str.charAt(i);
			
			if (letter == 'a' || letter == 'e' || letter == 'i' ||
				letter == 'o' || letter == 'u') {
				
				numberOfVowelLetters++; // 2
			}
		}
		
		return numberOfVowelLetters;
	}
	
	/*
	 * method returns sum of all odd numbers from 1 to num argument
	 * sumOfAllOddNums(5);  -> 9
	 * 1, 3, 5
	 * 
	 * sumOfAllOddNums(10); -> 25
	 * 1, 3, 5, 7, 9
	 * 
	 * sumOfAllOddNums(15); -> 64
	 * 1, 3, 5, 7, 9, 11, 13, 15
	 */  
	public static int sumOfAllOddNums(int num) {
		int sumOfOddNums = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				sumOfOddNums = sumOfOddNums + i;
			}
		}
		
		return sumOfOddNums;
	}
	
	/*
	 * print all even numbers from 1 till num argument number
	 * assume num will only positive numbers
	 */
	public static void printOnlyEvenNumbers(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	/*
	 * method returns sum of all numbers from 1 to num argument
	 * sumOfAllNums(5);  -> 15
	 * sumOfAllNums(10); -> 55
	 */                             
	public static int sumOfAllNums(int num) {
		int res = 0;
		
		for (int i = 1; i <= num; i++) {
			res += i;
		}
		
		return res;
	}
}
