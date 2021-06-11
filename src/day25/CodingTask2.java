package day25;

import java.util.Arrays;

public class CodingTask2 {
	public static void main(String[] args) {
		System.out.println(isAnagram("abc", "bca"));
		System.out.println("-----------");
		
		int[] res = sumOfTwo(new int[] {1, 2, 3, 4, 5}, 9);
		System.out.println(Arrays.toString(res)); // [4, 5]
		
		res = sumOfTwo(new int[] {1, 2, 3, 4, 5}, 4);
		System.out.println(Arrays.toString(res)); // [1, 3]
		
		res = sumOfTwo(new int[] {7, 7, 4, 3, 8}, 7);
		System.out.println(Arrays.toString(res)); // [4, 3]
		
		res = sumOfTwo(new int[] {13, 43, 2, 71}, 84);
		System.out.println(Arrays.toString(res)); // [13, 71]
	}
	
	/*
	 * Return as array two pairs of numbers in the array that their 
	 * sum will be equal to target number 
	 * 
	 * sumOfTwo([1, 2, 3, 4, 5], 4)  -> [1, 3]
	 * sumOfTwo([7, 7, 4, 3, 8], 7)  -> [4, 3]
	 * sumOfTwo([13, 43, 2, 71], 84) -> [13, 71]
	 */
	public static int[] sumOfTwo(int[] numArr, int target) {
		int[] res = new int[2];
		
		myOuterLabel:
		for (int i = 0; i < numArr.length; i++) {
			
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] + numArr[j] == target) {
					res[0] = numArr[i];
					res[1] = numArr[j];
					return res;
					// break myOuterLabel;
				}
			}
		}
		
		return res;
	}
	
	
	/*
	 * We can say two strings are anagram when all the letter in one string exist 
	 * in the another one and opposite.
	 * 
	 * isAnagram("abc", "bca"); -> true
	 * isAnagram("abc", "cba"); -> true
	 * isAnagram("abc", "dba"); -> false
	 * isAnagram("abc", "bcae"); -> false
	 */
	public static boolean isAnagram(String str, String str1) {
		if (str.length() != str1.length()) {
			return false;
		}
		
		char[] strChArr = str.toCharArray();
		char[] str1ChArr = str1.toCharArray();
		
//		System.out.println(Arrays.toString(strChArr));
//		System.out.println(Arrays.toString(str1ChArr));
		
		Arrays.sort(strChArr);
		Arrays.sort(str1ChArr);
		
//		System.out.println(Arrays.toString(strChArr));
//		System.out.println(Arrays.toString(str1ChArr));
		

//		for (int i = 0; i < strChArr.length; i++) {
//			if(strChArr[i] != str1ChArr[i]) {
//				return false;
//			}
//		}
		
//		return true;
		
		return Arrays.equals(strChArr, str1ChArr);
	}
}
