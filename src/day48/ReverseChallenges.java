package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseChallenges {
	public static void main(String[] args) {
		System.out.println(reverseStr("apple")); // elppa
		System.out.println(reverseStr("hello")); // olleh
		System.out.println(reverseStr("java")); // avaj
		
		int[] arrInput = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arrInput));
		reverseArr(arrInput);
		System.out.println(Arrays.toString(arrInput));
		
		System.out.println(Arrays.toString(reverseArr2(new int[] {1, 2, 3})));
		
		System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
		System.out.println(revWords("Hello World")); // kiwi banana apple
	}
	
	// Time Complexity: O(n) linear
	public static String reverseStr(String str) {
		// StringBuilder sbRev = new StringBuilder();
		// empty string to keep reverse version
		String rev = "";
		
		// start from the back
		for (int i = str.length() - 1; i >= 0; i--) {
			// use charAt to get each char from the back
			rev += str.charAt(i);
			
			// sbRev.append(String.valueOf(str.charAt(i)));
		}
		
		// return rev version of str
		return rev;
		
		// return sbRev.toString();
	}
	
	// reverseArr({1, 2, 3, 4, 5}) -> [5, 4, 3, 2, 1]
	// reverseArr({1}) -> [1]
	// reverseArr({1, 2, 3}) -> [3, 2, 1]
	// Time Complexity: O(n) - linear
	public static void reverseArr(int[] arrNum) {
		// pointer that starts from the back of the array
		int backI = arrNum.length - 1;
		
		// loop that will go till half of the array
		// startI to start from the begging of array
		for (int startI = 0; startI < arrNum.length / 2; startI++) {
			// swap elements of startI and backI
			int tmp = arrNum[startI];
			arrNum[startI] = arrNum[backI];
			arrNum[backI] = tmp;
			
			backI--;
		}
	}
	
	// Time Complexity: O(n) - linear
	public static int[] reverseArr2(int[] arrNum) {
		// new array to keep reverse version
		int[] revArr = new int[arrNum.length];
		// start index to add element to revArr
		int s = 0;
		
		// loop over the arrNum from the back
		for (int e = arrNum.length - 1; e >= 0; e--) {
			revArr[s++] = arrNum[e];
		}
		
		return revArr;
	}
	
	// Time Complexity: O(n) - linear
	public static List<String> reverseList(List<String> list) {
		// create new list for rev version
		List<String> revList = new ArrayList<>();
		
		// iterate from the back of the input list
		for (int i = list.size() - 1; i >= 0; i--) {
			revList.add(list.get(i));
		}
		
		return revList;
	}
	
	// revWords("apple banana kiwi") -> "kiwi banana apple"
	// Time Complexity: O(n) - linear
	public static String revWords(String str) {
		StringBuilder wordsRev = new StringBuilder();
		
		String[] words = str.split(" ");
		
		for (int i = words.length - 1; i >= 0; i--) {
			wordsRev.append(words[i]).append(" ");
		}
		
		return wordsRev.toString().trim();
	}

}
