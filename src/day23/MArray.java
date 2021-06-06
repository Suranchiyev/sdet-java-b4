package day23;

import java.util.Arrays;

public class MArray {
	public static void main(String[] args) {
		// 0 [[7] [99] [] []]
		// 1 [[] [10] [] []]
		// 2 [[] [] [] [13]]
		int[][] nums = new int[3][4];
		
		nums[0][0] = 7;
		nums[2][3] = 13;
		nums[0][1] = 99;
		nums[1][1] = 10;
		
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
		
		/*
		 *    0  1   2  3
		 * 0 [7, 99, 0, 0]
		 * 1 [0, 10, 0, 0]
		 * 2 [0, 0, 0, 13]
		 */
		System.out.println("Length: " + nums.length);
		//              2 < 3
		for (int i = 0; i < nums.length; i++) {
			int[] innerArr = nums[i];
			System.out.println(Arrays.toString(innerArr));
		}
		
		System.out.println("======");
		int[] myArr = nums[2];
		System.out.println(Arrays.toString(myArr)); // [0, 0, 0, 13]
		
		System.out.println("======");
		// can we use for each loop to print the value of two dimensional array?
		//      []              [][]
		for (int[] innerArr : nums) {
			for (int element : innerArr) {
				System.out.print(element + " ");
			}
			System.out.println("\n---");
		}
		
	}
}
