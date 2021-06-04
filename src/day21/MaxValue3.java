package day21;

import java.util.Arrays;

public class MaxValue3 {
	public static void main(String[] args) {
		// Find biggest value
		int[] arr = {100, 43, 235, 3, 500, 23, 23, 700, 234};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Max: "+ arr[arr.length - 1]);
	}
}
