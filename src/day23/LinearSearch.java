package day23;

public class LinearSearch {
	public static void main(String[] args) {
		int[] nums = {6, 4, 5, 3, 7, 8, 99, 100, 43, 50, 89};
		System.out.println("index of 7: " + lSearch(nums, 7));
		System.out.println("index of 101: " + lSearch(nums, 101));
		System.out.println("index of 100: " + lSearch(nums, 100));
		
		int myNumberIndex = lSearch(nums, 5);
		if (myNumberIndex >= 0) {
			System.out.println(nums[myNumberIndex]);
		} else {
			System.out.println("Number is not there");
		}
		// Break till 10:10 AM EST
		
		
	}
	
	/*
	 * if target is in the array return index of it otherwise return -1
	 */
	public static int lSearch(int[] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
}
