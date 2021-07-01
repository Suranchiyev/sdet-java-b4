package day35;

import java.util.Arrays;
import java.util.List;

public class WarmUp {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(averNum(input)); // 3 
		
		input = Arrays.asList(2, 2, 2, 2);
		System.out.println(averNum(input)); // 2
		
		input = Arrays.asList(7, 8, 3, 1);
		System.out.println(averNum(input)); // 4
		
		input = Arrays.asList(9, 8, 10);
		System.out.println(averNum(input)); // 9
	}
	
	/*
	 * Implement averNum method
	 * It will find out average value of element from nums and return it
	 */
	public static int averNum(List<Integer> nums) {
		int sum = 0;
		
		for (Integer num : nums) {
			sum += num;
		}
		
		return sum / nums.size();
	}
}








