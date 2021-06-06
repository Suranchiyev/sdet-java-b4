package day22;

import java.util.Arrays;

public class StrSplit {
	public static void main(String[] args) {
		// split
		
		String str = "Java 101 for SDET 2021 TLA";
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		for (String word : words) {
			System.out.println(word);
		}
		
		str = "apple, orange, kiwi, banana, blueberries, cherries";
		
		String[] fruits = str.split(", ");
		System.out.println(Arrays.toString(fruits));
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println("========");
		
		String str2 = "John is programmer and he is a java guru";
		String[] arrStr2 = str2.split("is");
		System.out.println("size: " + arrStr2.length); // size: 3
		System.out.println(Arrays.toString(arrStr2)); 
		// [John , programmer and he, a java guru]
		
		// TODO
		// trim()
		
		for (int i = 0; i < arrStr2.length; i++) {
			arrStr2[i] = arrStr2[i].trim();
		}
		
		System.out.println(Arrays.toString(arrStr2));
		
		// toCharArray()  -> returns char[] from the string where each char is element
		// split(pattern) -> it will split string value by pattern and return String[]
		
	}
}
