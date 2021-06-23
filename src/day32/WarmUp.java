package day32;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WarmUp {
	public static void main(String[] args) {
		// list
		List<Integer> numbers = new ArrayList<>();
		numbers.add(6);
		numbers.add(7);
		numbers.add(9);
		
		System.out.println(numbers); // [6, 7, 9]
		
		int num = numbers.get(0);
		System.out.println("First element: " + num);
		
		int sizeOfList = numbers.size();
		System.out.println("Number of elements in the list: " + sizeOfList);
		
		// iterate over with regular loop
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + ",");
		}
		System.out.println();
		
		// Iterator
		Iterator<Integer> iterator = numbers.iterator();
		// next() it will return current element and move cursor to the next element
		// hasNext() it will check if the next element is there or not
		// remove() it will remove current element	
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ",");
		}
		System.out.println();
		
		// for each loop
		for (int myNum : numbers) {
			System.out.print(myNum + ",");
		}
		System.out.println();
		
		// streams
		// forEach
		numbers.forEach(e -> System.out.print(e + ","));
		System.out.println();
		
		// remove by index 
		numbers.remove(0);
		System.out.println(numbers);
		
		// remove by value
		numbers.remove(new Integer(7));
		System.out.println(numbers);
		
		numbers.add(7);
		numbers.add(6);
		System.out.println(numbers);
		
		numbers.removeIf(e -> e % 2 == 1);
		System.out.println(numbers);
		
		// filter
		// map
		// collect
		
		List<String> list = new ArrayList(Arrays.asList("java", "python", "js", "php"));
		System.out.println(list);
		
		List<String> listJLang = list.stream()
				.filter(e -> e.startsWith("j"))
				.collect(Collectors.toList());		
		System.out.println(listJLang);
		
		List<String> listUpper = list.stream()
				.map(e -> e.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(listUpper);
		
		String str = list.stream()
				.map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
				.collect(Collectors.joining(", "));
		
		System.out.println(str);
		
	}
}






