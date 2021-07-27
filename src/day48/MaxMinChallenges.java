package day48;

import java.util.Arrays;

public class MaxMinChallenges {
	public static void main(String[] args) {
		int[] input = {4, 64, 24, 122, 999};
		System.out.println(max(input));
		
		System.out.println(maxBruteForce(input));
		System.out.println(maxSecond(input));
		
		input = new int[] {4, 64, 24, 122, 999, 1000, 34234};
		System.out.println(maxSecond2(input));
		
	}
	
	/*
	 * max([4, 64, 24, 122, 999]) -> 999
	 * O(n) - linear
	 */
	public static int max(int[] arrNum) {
		// assume first one is max
		int max = arrNum[0];
		
		// check assumption by looping over the array
		for (int num : arrNum) {
			
			// if element was bigger then max, reassign the max
			if (max < num) {
				max = num;
			}
		}
		
		return max;
	}
	
	/*
	 * max([4, 64, 24, 122, 999]) -> 999
	 * Brute Force
	 * O(n ^ 2) - quadratic
	 */
	public static int maxBruteForce(int[] arrNum) {
		for (int i = 0; i < arrNum.length; i++) {
			boolean isMax = true;
			
			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] < arrNum[j]) {
					isMax = false;
					break;
				}
			}
			
			if (isMax) {
				return arrNum[i];
			}
		}
		
		return 0;
	}
	
	/*
	 * max([4, 122, 64, 24, 999]) -> 122
	 */
	public static int maxSecond(int[] arrNum) {
		Arrays.sort(arrNum);
		return arrNum[arrNum.length - 2];
	}
	
	/*
	 * Time Complexity: O(2n) -> O(n)
	 */
	public static int maxSecond2(int[] arrNum) {
		int max = arrNum[0];
		
		for (int num : arrNum) {
			if (max < num) {
				max = num;
			}
		}
		
		int sMax = arrNum[0];	
		for (int num : arrNum) {
			if (sMax < num && num != max) {
				sMax = num;
			}
		}
		
		return sMax;
	}
	
	
	public static int min(int[] arrNum) {
		int min = arrNum[0];
		
		for (int num : arrNum) {
			if (min > num) {
				min = num;
			}
		}
		
		return min;
	}
} 
