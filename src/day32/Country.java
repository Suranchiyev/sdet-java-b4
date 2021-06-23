package day32;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Country {
	public static void main(String[] args) {
		// put(K, V) puts new entity to the map
		// get(K) will get value based on the key
		
		Map<String, String> countries = new HashMap<>();
		countries.put("USA", "washington");
		countries.put("Canada", "ottawa");
		countries.put("Brazil", "brasilia");
		countries.put("Kazakhstan", "astana");
		
		
		// keySet() will return all the keys from the map as Set
		Set<String> mapKeys = countries.keySet();
		
		for (String key : mapKeys) {
			System.out.println("Key: " + key + ", " + "Value: " + countries.get(key));
		}
		System.out.println("-------");
		System.out.println(countries);
		// TODO
				
		for (String mapKey : mapKeys) {
			String city = countries.get(mapKey);
			city = city.substring(0, 1).toUpperCase() + city.substring(1);
			countries.put(mapKey, city);
		}
		
		System.out.println(countries);
		System.out.println("==========");
		
		List<String> list = new ArrayList<>();
		list.add("USA");
		list.add("Canada");
		list.add("Russia");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// {Canada=Ottawa, USA=Washington, Brazil=Brasilia, Kazakhstan=Astana}
		Set<String> keys = countries.keySet();
		for (String key : keys) {
			System.out.println(key);
			System.out.println(countries.get(key));
		}
	}
}
