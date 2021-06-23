package day31;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(0);
		System.out.println(list);
		System.out.println("First element: " + list.get(0));
		
		// Set does not allow duplicates
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
		numbers.add(0);
		
		System.out.println(numbers); // [0, 1, 2, 3, 4]
		// HashSet does not follow insertion order
		// There is not get(index) method for Set
		
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println("---------");
		
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Alex");
		names.add("Kuba");
		names.add("John");
		
		System.out.println(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		names.remove("John");
		System.out.println(names);
		System.out.println("-----------");
		
		// LinkedHashSet will maintain insertion order
		Set<String> colors = new LinkedHashSet<>();
		colors.add("red");
		colors.add("green");
		colors.add("pink");
		colors.add("black");
		colors.add("red"); // this is duplicate
		
		System.out.println(colors);
		System.out.println("------------");
		
		// TreeSet stores data in the sorted manner
		Set<Integer> nums = new TreeSet<>();
		nums.add(3);
		nums.add(4);
		nums.add(3); 
		nums.add(2);
		nums.add(1);
		nums.add(2);
		nums.add(0);
		
		// does not allow duplicates
		// it will keep data sorted
		System.out.println(nums); // [0, 1, 2, 3, 4]
		
		Set<String> names2 = new TreeSet<>();
		names2.add("John");
		names2.add("Alex");
		names2.add("Aika");
		names2.add("Bek");
		System.out.println(names2);
		
		// Set - does not allow duplicates
		//     - cannot get single element
		
		// HashSet - does not maintain insertion order
		// LinkedHashSet - does maintain insertion order
		// TreeSet - it will keep data sorted
	}
}
