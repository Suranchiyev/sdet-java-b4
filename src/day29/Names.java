package day29;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Names {
	public static void main(String[] args) {
		// Array is collection of data of the same type
		// - fixed size
		// - primitives and object
		
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Bob";
		names[2] = "Alex";
		// names[3] = "Kuba";
		
		String name = names[0];
		System.out.println("Array: " + Arrays.toString(names));
		
		ArrayList<String> listOfNames = new ArrayList<>();
		// add(value) will add value to the back of the list
		listOfNames.add("John");
		listOfNames.add("Bob");
		listOfNames.add("Alex");
		listOfNames.add("Kuba");
		listOfNames.add("Ramesh");
		System.out.println("List: " + listOfNames);
		//   0     1    2    3       4
		// [John, Bob, Alex, Kuba, Ramesh]
		
		// get(index) get single element from list by its index
		String firstName = listOfNames.get(0);
		System.out.println("First element: " + firstName);
		System.out.println("Second element: " + listOfNames.get(1));
		
		// add
		listOfNames.add("Ulises");
		System.out.println(listOfNames);
		
		// add(index, value)
		listOfNames.add(1, "Kemal");
		System.out.println(listOfNames);
		
		// set(index, newValue) - it will set new value fro the elemnt based on index
		listOfNames.set(2, "Tessa");
		System.out.println(listOfNames);
		
		// ArrayList is dynamic sized collection of data
		// - dynamic sized
		// - It can hold only objects
		// - it based on array internally
		
		List<String> colors = new ArrayList<>();
		colors.add("white");
		colors.add("blue");
		colors.add("red");
		
		// [white, blue, red]
		System.out.println(colors);
		
		colors.add(0, "black");
		System.out.println(colors); // [black, white, blue, red]
		
		colors.set(3, "yellow");
		System.out.println(colors); // [black, white, blue, yellow]
		
		List<Integer> nums = new ArrayList<>();
		nums.add(77);
		nums.add(89);
		nums.add(99);
		nums.add(109);
		System.out.println(nums);
		
	}
}
