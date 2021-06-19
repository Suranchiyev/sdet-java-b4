package day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfList {
	public static void main(String[] args) {
		List<List<Integer>> numbers = new ArrayList<>();
		
		List<Integer> n1 = Arrays.asList(1, 3, 4, 5, 1, 3, 5);
		numbers.add(n1);
		
		numbers.add(Arrays.asList(6, 3, 7, 99, 11, 43, 532));
		numbers.add(Arrays.asList(9, 6, 1, 9, 7, 22, 32));
		numbers.add(Arrays.asList(46, 53, 67, 199, 611, 443, 53862));
		
		System.out.println(numbers);
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(i + " - " + numbers.get(i));
		}
		
		// TODO print each element of numbers
		// TODO find out total sum of numbers
		
	}
}
