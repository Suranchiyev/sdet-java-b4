package day49;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent")); // true
		System.out.println(isAnagram("abc", "ccb")); // false
		System.out.println(isAnagram("triangle", "integral")); // true
		System.out.println(isAnagram("abc", "bca")); // true
		
	}
	
	public static boolean isAnagram(String str, String str1) {
		// 1. Convert both to char array
		// 2. Sort them 
		// 3. Compare them
		
		char[] strArr = str.toCharArray();
		char[] str1Arr = str1.toCharArray();
		
		if (strArr.length != str1Arr.length) {
			return false;
		}
		
		// what's sorting based on?
		// alphabetical
		Arrays.sort(strArr);
		Arrays.sort(str1Arr);
		
		// return Arrays.equals(strArr, str1Arr);
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != str1Arr[i]) {
				return false;
			}
		}
		
		return true;
	}
}
