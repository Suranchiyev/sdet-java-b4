package day27;

import java.util.Arrays;

public class ArrayReview3 {
	public static void main(String[] args) {
		String[] colors = {"black", "white", "red", "yellow"};
		System.out.println(Arrays.toString(colors)); // [black, white, red, yellow]
		
		reverse(colors);
		
		System.out.println(Arrays.toString(colors)); // [yellow, red, white, black]
		
	}
	
	/*
	 * reverse arr array
	 */
	public static void reverse(String[] arr) {
		int eIndex = arr.length - 1;
		
		for (int sIndex = 0; sIndex < arr.length / 2; sIndex++) {
			String tmp = arr[sIndex];
			arr[sIndex] = arr[eIndex];
			arr[eIndex] = tmp;
			
			eIndex--;
		}
	}
}
