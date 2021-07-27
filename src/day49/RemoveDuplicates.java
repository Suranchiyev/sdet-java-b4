package day49;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println(remDup2("hello")); // helo
		System.out.println(remDup2("abcca")); // abc
		System.out.println(remDup2("aaaaaa"));// a
		System.out.println(remDup2("apple")); // aple
		
		// 1. Using Set, because it does not allow duplicates
		// 2. Logic by using contains method of String
	}
	
	// Time Complexity: O(n) linear
	public static String remDup(String str) {
		// Create set
		Set<Character> set = new LinkedHashSet<>();
		
		// load each char into set to remove duplicates
		for (char letter : str.toCharArray()) {
			set.add(letter);
		}
		
		// pull back data from set and assign to String/StringBuilder
		StringBuilder noDupSb = new StringBuilder();
		for (char l : set) {
			noDupSb.append(l);
		}
		
		// return string without duplicates
		return noDupSb.toString();
	}
	
	// O(n ^ 2) - quadratic
	public static String remDup2(String str) {
		// create empty string
		String noDup = "";
		
		// loop over the str
		for (char l : str.toCharArray()) {
			//  if it does not already contain the char
			if (!noDup.contains(String.valueOf(l))) {
				noDup += l;
			}
		}
		
		return noDup;
	}
}
