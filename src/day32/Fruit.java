package day32;

import java.util.HashMap;
import java.util.Map;

public class Fruit {
	public static void main(String[] args) {
		// Map - key value pair data structure
		// Keys are always unique in the map
		//    K   , V
		Map<String, Double> fruit = new HashMap<>();
		
		// put(K, V) put new entity into the map
		fruit.put("Orange", 1.05);
		fruit.put("Mango", 0.50);
		fruit.put("Apple", 0.76);
		fruit.put("Lemon", 1.47);
		
		System.out.println(fruit);
		
		// get(K) to get the value by key
		double priceOfOrange = fruit.get("Orange");
		System.out.println("Price of orange: " + priceOfOrange);
		
		System.out.println("Price of mango: " + fruit.get("Mango"));
		
		// if key is not in the map get(K) method will return null
		System.out.println("Price of kiwi: " + fruit.get("Kiwi"));
		
		System.out.println(fruit);
		// Keys are always unique in the map
		// put(K, V) if you have already the entity with this key, it will override it
		fruit.put("Apple", 1.5);
		System.out.println(fruit);
		
		int size = fruit.size();
		System.out.println("Size: " + size);
		
		// containsKey(K) returns true if key is there, otherwise false
		if (fruit.containsKey("Kiwi")) {
			System.out.println("Kiwi is part of the map");
		} else {
			System.out.println("Kiwi is not part of the map");
		}
		
		boolean isInTheMap = fruit.containsKey("Orange");
		System.out.println("Orange is in the map: " + isInTheMap);
		
		// containsValue(V)
		System.out.println(fruit.containsValue(1.5));
		
		// remove(K) remove entity(element) by key
		System.out.println(fruit);
		fruit.remove("Orange");
		System.out.println(fruit);
	}
}
