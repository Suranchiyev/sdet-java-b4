package day29;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
	public static void main(String[] args) {
		// Create a list fruits of type String
		// Add any 4 fruits(elements)
		// print each element in the new line
		
		// add(value) to add new value to the list
		// get(index) get value by index
		// size() get number of element in the list
		
		List<String> fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("papaya");
		fruits.add("dragon fruit");
		
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		System.out.println("-------");
		
		for (String fruit : fruits) {
			System.out.println(fruit);		
			// Concurrent modification exception
			// We cannot loop over and modify the size when used with for each loop
			// fruits.add("kiwi");
			// fruits.remove(0);
		}
		System.out.println("-------");
		
		// [mango, apple, papaya, dragon fruit]
		System.out.println(fruits);
		
		// set(index, newValue) - it will put new value based on it's index
		
		// TODO replace each element value of fruits list with upper case versions
		// String val = fruits.get(0).toUpperCase();
		// fruits.set(0, val);
		
		for (int i = 0; i < fruits.size(); i++) {
			String upperCaseEl = fruits.get(i).toUpperCase();
			fruits.set(i, upperCaseEl);
		}
			
		System.out.println(fruits); // [MANGO, APPLE, PAPAYA, DRAGON FRUIT]
	}
}