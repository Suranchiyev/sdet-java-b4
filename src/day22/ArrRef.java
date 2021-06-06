package day22;

import java.util.Arrays;

public class ArrRef {
	public static void main(String[] args) {
		String[] letters = {"a", "b", "c", "d"};
		String[] letters2 = letters;
		
		System.out.println(letters);
		System.out.println(letters2);
		
		letters2[0] = "e";
		
		System.out.println(Arrays.toString(letters));  // [e, b, c, d]
		System.out.println(Arrays.toString(letters2)); // [e, b, c, d]
		System.out.println("=======");
		
		int[] numbers = {1, 2, 3};
		int[] numbers2 = numbers;
		
		System.out.println(Arrays.toString(numbers));  // 1, 2, 3
		System.out.println(Arrays.toString(numbers2)); // 1, 2, 3
		
		numbers[0] = 100;
		numbers2[1] = 200;
		
		System.out.println(Arrays.toString(numbers)); // 100, 200, 3
		System.out.println(Arrays.toString(numbers2));// 100, 200, 3
		System.out.println("=========");
		
		double[] arr = {4.5, 2.5, 3.3, 0.9};
		System.out.println(Arrays.toString(arr)); // [4.5, 2.5, 3.3, 0.9]
		
		changeArray(arr);
		
		System.out.println(Arrays.toString(arr)); // [99.0, 99.0, 99.0, 99.0]
		System.out.println("=========");
				
		String[] strArr = {"apple", "orange", "kiwi"};
		System.out.println(Arrays.toString(strArr));
		
		changeArray(strArr);		
		System.out.println(Arrays.toString(strArr));
	}
	
	public static void changeArray(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = "banana";
		}
	}
	
	public static void changeArray(double[] dArrNum) {
		for (int i = 0; i < dArrNum.length; i++) {
			dArrNum[i] = 99;
		}
	}
}
