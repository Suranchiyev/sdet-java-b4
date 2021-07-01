package day33;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class City {
	public static void main(String[] args) {
		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		cities.put("Manassas", 451721);
		cities.put("Richmod", 210309);
		cities.put("Alexandria", 147391);
		cities.put("Norfolk", 245782);
		//cities.put("Aktas", 1000000);
		System.out.println(cities);
		
		// TODO print each city(entity) of the map in this format
		// city: <key>, population: <value>
		// city: Arlington, population: 229164
		
		Set<String> keys = cities.keySet();
		for (String key : keys) {
			System.out.println("city: " + key + ", population: " + cities.get(key));
		}
		System.out.println("-------------");
				
		int totalPopulation = 0;
		
		// TODO find out total population of all cities in the map
//		for (String key : cities.keySet()) {
//			totalPopulation += cities.get(key);
//		}
		
		for (Integer population : cities.values()) {
			totalPopulation += population;
		}
		System.out.println("Total population of these cities: " + totalPopulation);
		System.out.println("------------");
		
		// TODO print city names with population more than 300000
		System.out.println("Cities with population more than 300000:");
		for (String key : cities.keySet()) {
			if (cities.get(key) > 300000) {
				System.out.println(key);
			}
		}
		System.out.println("------------");
		
		// TODO find out the city with the biggest population
		int maxPopulation = 0;
		String biggestCity = "";
		
		// code goes here
		for (String city : cities.keySet()) {
			int cityPop = cities.get(city);
			
			if (cityPop > maxPopulation) {
				maxPopulation = cityPop;
				biggestCity = city;
			}
		}
		
		System.out.println("The biggest city is " + biggestCity);
		System.out.println("With population " + maxPopulation);
		
		// TODO increase population of each city on 999
		System.out.println("increase population of each city on 999");
		System.out.println(cities);
		
		for (String key : cities.keySet()) {
			int cityNewPop = cities.get(key) + 999;
			cities.put(key, cityNewPop);
		}
		
		System.out.println(cities);	
	}
}
