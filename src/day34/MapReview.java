package day34;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
	public static void main(String[] args) {
		// Map<K,V> is pair of key value data structure
		// Keys are unique in the map. If we put the existing key, it will override it
		
		Map<String, Integer> teamScore = new HashMap<>(); 
		teamScore.put("Team 1", 300);
		teamScore.put("Team 2", 450);
		teamScore.put("Team 3", 400);
		teamScore.put("Team 4", 400);
		
		// put(K, V) to add new entity/element to the map
		
		System.out.println(teamScore);
		
		// override value of Team 1 key 
		teamScore.put("Team 1", 350);
		
		System.out.println(teamScore);
		
		// How to iterate over the map? 
		for (String key : teamScore.keySet()) {
			// get(K) return the value of that key			
			System.out.println(key + " : " + teamScore.get(key));
		}
		
		// TODO
		// Create a map of String key and String value
		// map will have fruit names as a key and its color as value
		// {apple=red, banana=yellow, kiwi=green}
		// add 5 fruits into your map
		
		Map<String, String> fruits = new HashMap<>();
		fruits.put("apple", "red");
		fruits.put("banana", "yellow");
		fruits.put("kiwi", "green");
		fruits.put("mango", "greenishred");
		fruits.put("dragon fruit", "pink");
		
		for (String fruitName : fruits.keySet()) {
			System.out.println(fruitName + " is " + fruits.get(fruitName));
		}
	
	}
}
