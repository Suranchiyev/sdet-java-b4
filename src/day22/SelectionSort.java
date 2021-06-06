package day22;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num)); // [6, 3, 2, 10, 0, 7, 5]
		
		sortArray(num);
		
		System.out.println(Arrays.toString(num)); // [0, 2, 3, 5, 6, 7, 10]		
	}
	
	//      0  1  2  3   4  5  6
	//     [6, 3, 2, 10, 0, 7, 5]	
	// 1 - [0, 3, 2, 10, 6, 7, 5]
	// 2 - [0, 2, 3, 10, 6, 7, 5]
	// 3 - [0, 2, 3, 10, 6, 7, 5]
	// 4 - [0, 2, 3, 5,  6, 7, 10]
	// 5 - [0, 2, 3, 5,  6, 7, 10]
	// 6 - [0, 2, 3, 5,  6, 7, 10]
	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = getIndexOfMin(arr, i);
			swapElements(arr, i, minIndex);
		}
	}
	
	public static int getIndexOfMin(int[] arr, int startIndex) {
		int min = arr[startIndex];
		int smallestIndex = startIndex;
	
		for (int i = startIndex; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				smallestIndex = i;
			}
		}
		
		return smallestIndex;
	}
	
	public static void swapElements(int[] arr, int i, int i2) {
		int tmp = arr[i];
		arr[i] = arr[i2];
		arr[i2] = tmp;
	}
}
