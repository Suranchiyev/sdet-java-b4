package day22;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num)); // [6, 3, 2, 10, 0, 7, 5]
		
		sortArray(num);
		
		System.out.println(Arrays.toString(num)); // [0, 2, 3, 5, 6, 7, 10]		
	}
	
	// 1. loop
	// 2. inner loop to two swap
    //    - swap
	
	// [6, 3, 2, 10, 0, 7, 5]
	public static void sortArray(int[] num) {
		int swapCount = 0;
		int len = num.length;
		
		do {
			// reset swapCount to 0
			swapCount = 0;
			
			// decrement len 
			len--;
		
			for (int i = 0; i < len; i++) {
				//  check two pairs     
				if (num[i] > num[i + 1]) {					
					// if not in the order, swap
					int tmp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = tmp;
					
					// increase count to see if data ordered or not
					swapCount++;
				}	
			}
		} while (swapCount != 0);
		
	}
	
}
