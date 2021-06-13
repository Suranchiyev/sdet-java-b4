package day27;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
		// array is collection of data of the same type
		// array is fixed size
		// array has random access
		// array uses indexes for elements
		
		int[] nums = new int[4];
		nums[0] = 99;
		nums[1] = 89;
		nums[2] = 45;
		nums[3] = 55;
		
		// nums[4] = 100; // ArrayIndexOutOfBound Exception
		
		String[] fruit = {"Apple", "Banana", "Orange", "Kiwi"};
		System.out.println("Size: " + fruit.length);
		
		System.out.println(fruit); // [Ljava.lang.String;@1dbd16a6
		
		String[] fruit2 = fruit;
		
		fruit2[0] = "Abc";
		
		System.out.println(Arrays.toString(fruit));
		System.out.println(Arrays.toString(fruit2));
		
		changeArray(fruit);
		
		System.out.println(Arrays.toString(fruit));
		System.out.println(Arrays.toString(fruit2));
		
		// java.util.Arrays.java is helper util class to work with array
		// toString() - to see array values as string
		// sort()     - we can sort array
		// binarySearch() - we can search
		// equals()    - we can compare two arrays
		
		Arrays.sort(fruit);
		System.out.println(Arrays.toString(fruit));
		
		System.out.println("=====");
		
		int[] numbers = {1, 5, 6, 7};
		int[] numbers2 = {1, 5, 6, 7};
		
		System.out.println(Arrays.equals(numbers, numbers2));
	}
	
	public static void changeArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "JAVA";
		}
	}
}




