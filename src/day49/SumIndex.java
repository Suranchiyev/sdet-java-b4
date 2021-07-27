package day49;

import java.util.Arrays;

public class SumIndex {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sum(new int[] {1, 2, 3, 5}, 4))); // [1, 3]
		System.out.println(Arrays.toString(sum(new int[] {9, 9, 4, 3 ,8}, 7))); // [4, 3]
		System.out.println(Arrays.toString(sum(new int[] {13, 43, 2, 71}, 84))); // [13, 71]
	}
	
	/*
	 * 
	 * sum([1, 2, 3, 5], 4)     -> [1, 3]
	 * sum([9, 9, 4, 3 ,8], 7)  -> [4, 3]
	 * sum([13, 43, 2, 71], 84) -> [13, 71]
	 * Time Complexity: O(n^2) quadratic
	 */
	public static int[] sum(int[] arr, int target) {
		int[] res = new int[2];
		
		// nested loops
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == target) {
					res[0] = arr[i];
					res[1] = arr[j];		
					return res;
				}
			}
		}
		
		return res;
	}
}
