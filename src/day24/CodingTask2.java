package day24;

public class CodingTask2 {
	public static void main(String[] args) {
		System.out.println(getMaxValue(new int[] {1, 0, 4, 9, 5})); // 9
		System.out.println(getMaxValue(new int[] {89, 3, 123, 2, 1})); // 123
		System.out.println(getMaxValue(new int[] {7, 8, 3, 2, 6, 10})); // 10
		System.out.println(getMinValue(new int[] {1, 0, 4, 9, 5}));    // 0
		System.out.println(getMinValue(new int[] {89, 3, 123, 2, 1})); // 1
		System.out.println(getMinValue(new int[] {7, 8, 3, 2, 6, 10})); // 2
		
		System.out.println(getSecondMaxValue(new int[] {11, 2, 9, 7})); // 2
		System.out.println(getSecondMaxValue(new int[] {-11, -2, -9, -7})); // -7
		System.out.println(getSecondMaxValue(new int[] {1, 0, 4, 9, 5}));    // 5
		System.out.println(getSecondMaxValue(new int[] {89, 3, 123, 2, 1})); // 89
		System.out.println(getSecondMaxValue(new int[] {7, 8, 3, 2, 6, 10})); // 8
		
	}
	
	/*
	 * return max value from argument array nums
	 * getMaxValue([1, 0, 4, 9, 5]);    -> 9
	 * getMaxValue([89, 3, 123, 2, 1]); -> 123
	 * getMaxValue([7, 8, 3, 2, 6, 10]); -> 10
	 */
	public static int getMaxValue(int[] nums) {
		// assume first element is max
		int max = nums[0];
		
		// loop over the array
		for (int num : nums) {
			
			// check our assumption if wrong, reassign
			if (num > max) {
				max = num;
			}
		}
		
		return max;
	}
	
	/*
	 * return min value from argument array nums
	 * getMinValue([1, 0, 4, 9, 5]);     -> 0
	 * getMinValue([89, 3, 123, 2, 1]);  -> 1
	 * getMinValue([7, 8, 3, 2, 6, 10]); -> 2
	 */
	public static int getMinValue(int[] nums) {
		int min = nums[0];
		
		for (int num : nums) {
			if (num < min) {
				min = num;
			}
		}
		
		return min;
	}
	
	/*
	 * return second max value from argument array nums
	 * getSecondMaxValue([1, 0, 4, 9, 5]);     -> 5
	 * getSecondMaxValue([89, 3, 123, 2, 1]);  -> 89
	 * getSecondMaxValue([7, 8, 3, 2, 6, 10]); -> 8
	 * getSecondMaxValue([11, 2, 9, 7]); -> 9
	 */
	public static int getSecondMaxValue(int[] nums) {
		// [89, 3, 123, 2, 1]
		
		int max = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		
		// max = 123;
		// hold smallest possible value
		int secondMax = Integer.MIN_VALUE;
		
		// [89, 3, 123, 2, 1]
		for (int num : nums) {
			//  1 > 89        && 1 < 123
			if (num > secondMax && num < max) {
				//89
				secondMax = num;
			}
		}
		
		return secondMax;
	}
	
	
}





