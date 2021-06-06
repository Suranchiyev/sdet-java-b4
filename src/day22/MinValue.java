package day22;

public class MinValue {
	public static void main(String[] args) {
		int[] nums = {10, 43, 235, 3, 2, 7, 8};
		
		int min = nums[0];

//		for (int i = 0; i < nums.length; i++) {
//			if (min > nums[i]) {
//				min = nums[i];
//			}
//		}
		
		for (int num : nums) {
			if (min > num) {
				min = num;
		    }
		}
		
		System.out.println("Min: " + min);
		
		System.out.println("Inndex of smallest: " + getIndexOfMin(nums));
	}
	
	/*
	 *  0   1    2   3  4
	 * [10, 43, 235, 3, 2, 7, 8] -> 4
	 */
	public static int getIndexOfMin(int[] nums) {
		// assume first element is smallest
		int min = nums[0];
		int index = 0;
		
		// check assumption
		for (int i = 0; i < nums.length; i++) {
			
			if (min > nums[i]) {
				min = nums[i];
				// keep min index as well
				index = i;
			}
		}
		
		return index;
	}
}
