package day22;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num)); // [6, 3, 2, 10, 0, 7, 5]
		
		// Arrays sort method use merge sort algorithm
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num)); 
		
		String[] names = {"Boris", "Akyl", "Frank", "Selvin"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}
}
