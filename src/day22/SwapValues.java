package day22;

import java.util.Arrays;

public class SwapValues {
	public static void main(String[] args) {
		//                 0           1        2        3           4         5
		String[] city = {"Adlie", "Arlington", "DC", "Chantilly", "Tysons", "Fairfox"};
		
		// [Adlie, Arlington, DC, Chantilly, Tysons, Fairfox]
		System.out.println(Arrays.toString(city)); 
		
		String tmp = city[0];
		city[0] = city[city.length - 1];
		city[city.length - 1] = tmp;
				
		// [Fairfox, Arlington, DC, Chantilly, Tysons, Adlie]
		System.out.println(Arrays.toString(city));
		System.out.println("=====");
		
		String[] arr = {"1", "2", "3", "4", "5"};
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
		
		swap(arr, 1, 3);                                         
		System.out.println(Arrays.toString(arr)); // [1, 4, 3, 2, 5]
		
		swap(arr, 2, 4);	
		System.out.println(Arrays.toString(arr)); // [1, 4, 5, 2, 3]
		
	}
	
	/*
	 *       0  1  2  3  4
	 * swap([1, 2, 3, 4, 5], 1, 3) -> [1, 4, 3, 2, 5]
	 */
	public static void swap(String[] strArr, int i, int i2) {
		String tmp = strArr[i];
		strArr[i] = strArr[i2];
		strArr[i2] = tmp;
	}
}
