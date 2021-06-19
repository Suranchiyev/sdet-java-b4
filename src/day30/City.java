package day30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("Aldie");
		cities.add("Chantilly");
		cities.add("Arlington");
		cities.add("Hyannis");
		
		System.out.println(cities);
		
		// Collections is helper class for all collections. 
		// List(ArrayList) is part if the collection framework
		
		Collections.reverse(cities);
		System.out.println(cities);
		
		Collections.sort(cities);
		System.out.println(cities);
		
		int index = Collections.binarySearch(cities, "Hyannis");
		System.out.println("Index of Hyannis: " + index);
		
		// if cities list has "Tysons" as of part it
		if (cities.contains("Tysons")) {
			System.out.println("Yes, it is there");
		} else {
			System.out.println("No, it is not there");
		}
	}
}
