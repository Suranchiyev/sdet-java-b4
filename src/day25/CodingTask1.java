package day25;

import java.util.Arrays;

public class CodingTask1 {
	public static void main(String[] args) {
		String[] res = reverseArr(new String[] {"a", "b", "c", "e"});
		System.out.println(Arrays.toString(res)); // ["c", "b", "a"]
		
		res = reverseArr(new String[] {"java", "python", "js"});
		System.out.println(Arrays.toString(res)); // ["js", "python", "java"]
		System.out.println("-------------");
		
		String[] arr = {"e", "b", "c", "a"};
		System.out.println(Arrays.toString(arr)); // ["e", "b", "c", "a"]
		swap(0, 3, arr);
		System.out.println(Arrays.toString(arr)); // ["a", "b", "c", "e"]
		System.out.println("-------------");
		
		String[] colors = {"red", "black", "white", "green", "yellow"};
		System.out.println(Arrays.toString(colors));
		reverse(colors);
		System.out.println(Arrays.toString(colors));
	}
	
	public static void reverse(String[] arr) {
		int rightIndex = arr.length - 1;
		
		for (int leftIndex = 0; leftIndex < arr.length / 2; leftIndex++) {  
			String tmp = arr[leftIndex];
			arr[leftIndex] = arr[rightIndex];
			arr[rightIndex] = tmp;
			
			rightIndex--;
		}		
	}
	
	
	/*
	 * swap(0, 3, ["a", "b", "c", "e"]) -> ["e", "b", "c", "a"]
	 * swap(0, 1, ["a", "b", "c", "e"]) -> ["b", "a", "c", "e"]
	 * swap(2, 1, ["a", "b", "c", "e"]) -> ["a", "c", "b", "e"]
	 */
	public static void swap(int i, int i2, String[] arr) {
		String tmp = arr[i];
		arr[i] = arr[i2];
		arr[i2] = tmp;
	}
	
	/*
	 * return reverse version of arr 
	 * reverseArr(["a", "b", "c", "e"]) -> ["c", "b", "a", "e"]
	 * reverseArr(["java", "python", "js"]) -> "js", "python", "java"
	 * 
	 */
	public static String[] reverseArr(String[] arr) {
		// 1. Create empty array with same size
		String[] resArr = new String[arr.length]; 
		
		// 2. Create index to add array from the left
		int j = 0;
		
		// 3. Loop to start looping over arr from the back
		for (int i = arr.length - 1; i >= 0; i--) {
			resArr[j] = arr[i];
			j++;
		}
				
		return resArr;
	}
}
