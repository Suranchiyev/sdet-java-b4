package day23;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] nums = {6, 3, 2, 10, 0, 7, 5, 11};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		// Data should be sorted
		//  0  1  2  3  4  5  6   7
		// [0, 2, 3, 5, 6, 7, 10, 11]
				
		System.out.println("index of 7: " + bSearch(nums, 7));
		System.out.println("index of 0: " + bSearch(nums, 0));
		System.out.println("index of 11: " + bSearch(nums, 11));
		System.out.println("index of 5: " + bSearch(nums, 5));
		System.out.println("index of 13: " + bSearch(nums, 13));
		
		String[] names = {"Alex", "Kuba", "Bek", "John", "Smith", "Bob", "Ramesh"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//  0     1    2     3     4     5       6
		// [Alex, Bek, Bob, John, Kuba, Ramesh, Smith]
		int indexOfSearch = Arrays.binarySearch(names, "John");
		System.out.println(indexOfSearch);
		
		System.out.println(Arrays.binarySearch(names, "Milena"));
		
		// For sorting and searching, we can use helper class Arrays to do so
	}
	
	/*
	 * - Repeat until the (sub)array is of size 0 (if start point and end point crossing)
	 * - Calculate middle middle point
	 * - if the target is in the middle, then stop
	 * - otherwise, if the target is less than middle number then look for the left side
	 *   by changing the end point to the middle - 1 of the array
	 * - otherwise, if the target is greater than middle number then look for the right side
	 *   by changing the start point to middle + 1 of the array  
	 *                 
	 *   [0, 2, 3, 5, 6, 7, 10, 11]
	 *   middle = 3   
	 */          
	public static int bSearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int middle = (end + start) / 2;
		
		while (arr[middle] != target) {
			if (start > end) {
				// number not found
				return -middle;
			}
			
			// consider only right side of array
			if (target > arr[middle]) {
				start = middle + 1;
			}
			
			// consider only left side of array
			if (target < arr[middle]) {
				end = middle - 1;
			}
			
			// change middle based on new start and end
			middle = (end + start) / 2;	
		}
		
		return middle;
	}
}
