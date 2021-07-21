package day46;

import java.util.Arrays;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal animal = 
				new Animal("Tiger", 3, Arrays.asList("deer", "pig", "goat"));
		
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.getFood());
		
		// Immutable Object pattern
		// We want to make sure once object is created with initial values
		// it's not changeable.
		
		String str = "hello";
		str = str.toUpperCase();
		System.out.println(str);
		
		// 1. make all properties private and final.
		// 2. Provide getters only (do not provide setters).
		// 3. Provide constructor to assign values when object is created.
	}
}
