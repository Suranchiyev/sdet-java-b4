package day33;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapReview {
	public static void main(String[] args) {
		// Map is key value data structure
		// Keys are unique
		
		//     Key, Value
		Map<String, Double> students = new HashMap<>();
		
		// put(K, V) to add entity to the map
		students.put("John", 95.5);
		students.put("Smith", 60.0);
		students.put("Alex", 75.0);
		students.put("Misha", 100.0);
		
		System.out.println(students);
		
		// get(K) - it will return value of that key
		Double score = students.get("Alex");
		System.out.println("Score of Alex: " + score);
		
		// if key is not there get(K) will return null
		score = students.get("Bek");
		System.out.println("Score of Bek: " + score); // Score of Bek: null
		
		System.out.println("Size of map: " + students.size());
		
		// remove(K) it will remove entity by key
		students.remove("Smith");
		System.out.println(students);
		System.out.println("Size of map: " + students.size());
		
		String key = "Misha";
		if (students.containsKey(key)) {
			System.out.println("Yes, map has " + key + " key");
			System.out.println("With value: " + students.get(key));
		} else {
			System.out.println("No, it does not have " + key + " key");
		}
		System.out.println("-------------");
		// TODO how do we loop over the map?
		// get all the keys from the map as Set 
		Set<String> keys = students.keySet();
		
		// loop over the keys
		for (String k : keys) {
			// get the value based on the key
			Double v = students.get(k);
			System.out.println(k + " : " + v);			
		}
		System.out.println("-------------");
		
		Collection<Double> values = students.values();
		System.out.println(values);
		
		double scoreSum = 0;
		for (Double eachScore : values) {
			scoreSum += eachScore;
		}
		System.out.println("Sum: " + scoreSum);
		System.out.println("Average: " + (scoreSum / students.size()));
	}
}
