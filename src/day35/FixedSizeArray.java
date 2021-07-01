package day35;

import java.util.Arrays;

public class FixedSizeArray {
	public static void main(String[] args) {
		int[] nums = new int[3];
		
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		int[] numsCopy = new int[4];
		for (int i = 0; i < nums.length; i++) {
			numsCopy[i] = nums[i];
		}
		nums = numsCopy;
		
		nums[3] = 4;
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(nums[3]);
	}
}
