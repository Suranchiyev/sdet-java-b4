package day48;

import java.util.Arrays;

public class BigOPractice {
	
	// What's the time complexity of this program?
	// O(1) - constant
	public void m1(String str) {
		
		for (int i = 0; i < 50; i++) {
			System.out.println(str);
		}
		
	}
	
	// What's the time complexity of this program?
	// O(n) - linear
	public String m2(String str) {
		String strRev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev += str.charAt(i);
		}
		
		return strRev;
	}
	
	// What's the time complexity of this program?
	// O(n) - linear
	public void m3(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.println("Hello, World!");
			}			
		}
		
	}
	
	// What's the time complexity of this program?
	// O(n ^ 2) - quadratic
	public void m4(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println("Hello, world!");
			}
		}
	}
	
	// What's the time complexity of this program?
	// O(2n) -> O(n) linear
	public void m5(int[] arr) {
		
		for (int num : arr) {
			System.out.println(num);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// What's the time complexity of this program?
	// O(n / 2) -> O(n) linear
	public void m6(String str) {
		
		for (int i = 0; i < str.length() / 2; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	// What's the time complexity of this program?
	// O(n ^ 3) - cubic time
	public void m7(String[][][] arrStr) {
		for (int i = 0; i < arrStr.length; i++) {
			for (int j = 0; j < arrStr[i].length; j++) {
				for (int k = 0; k < arrStr[i][j].length; k++) {
					System.out.println(arrStr[i][j][k]);
				}
			}
		}
	}
	
	// What's the time complexity of this program?
	// O(log n)
	public int search(String[] arr, String searchKey) {
		int index = Arrays.binarySearch(arr, searchKey);
		return index;
	}
	
	// Why do we need this?
	// - Interviews
	// - To write better code
	
	// Big O N Time complexity - how fast it will get executed
	// Big O N Space complexity - how well program is using memory
}





