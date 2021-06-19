package day30;

import java.util.ArrayList;
import java.util.List;

public class SumOfEven {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(1);
		numbers.add(8);
		numbers.add(6);
		numbers.add(10);
		
		// getSumEven(List<Integer> nList)
		// TOOD make it compile
		// Find out sum of even numbers from its argument
		
		int sumOfEvenNumbers = getSumEven(numbers);
		System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
	}
	
	public static int getSumEven(List<Integer> list) {
		int sumOfEven = 0;
		
		for (int num : list) {
			if (num % 2 == 0) {
				sumOfEven += num;
			}
		}
		
		return sumOfEven;
	}
}
