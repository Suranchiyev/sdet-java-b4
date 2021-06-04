package day21;

import java.util.Arrays;

public class ArrayRecap {
	public static void main(String[] args) {
		// Fixed sized collection of data of the same type 
		
		
		int[] nums = new int[4];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//  0   1   2   3
		// [ ] [ ] [ ] [ ]
		
		nums[1] = 99;
		nums[0] = 55;
		nums[2] = 14;
		nums[3] = 7;
		
		System.out.println(nums); // [I@1dbd16a6
		System.out.println(Arrays.toString(nums)); // [55, 99, 14, 7]
		
		int[] nums2 = {3, 2, 5 ,7, 8, 9, 11, 43, 21}; // [3, 2, 5, 7, 8, 9, 11, 43, 21]
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = new int[] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(nums3)); // [1, 2, 3, 4, 5]
		//                  0         1           2         3       4
		String[] cities = {"Aldie", "Arlington", "Tysons", "DC", "Gainesville"};
		System.out.println(Arrays.toString(cities));
		
		System.out.println("Number of elements: " + cities.length);
		
		String lastCity = cities[cities.length - 1];
		System.out.println("Last city: " + lastCity);
		
		for (int i = cities.length - 1; i >= 0; i--) {
			System.out.println("City: " + cities[i]);
		}
	}
}







