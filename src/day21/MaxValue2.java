package day21;

public class MaxValue2 {
	public static void main(String[] args) {
		// Find biggest value
		int[] arr = {100, 43, 235, 3, 500, 23, 23, 700, 234};
		
		// assume first element of array is max value
		int max = arr[0];
		
		// [100, 43, 235, 3, 500, 23, 23, 700, 234]
		for (int num : arr) {
			//  700 < 234
			if (max < num) {
			//  700
				max = num;
			}
		}
		
		System.out.println("Max: " + max);
	}
}
