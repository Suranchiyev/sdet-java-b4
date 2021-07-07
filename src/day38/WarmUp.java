package day38;

import java.util.LinkedHashMap;
import java.util.Map;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(countLetters("hello")); // h1e1l2o1
		System.out.println(countLetters("Axxeee")); // A1x2e3
		System.out.println(countLetters("hihi")); // h2i2
		
	}
	
	public static String countLetters(String str) {
		// TODO
		// 1. we will create a map with LinkedHashMap implementation
		//    Map<Character, Integer>
		
		// 2. iterate over str string and we will put each letter as key to our map
		//    check if map contains the key 
		//    if yes -> override with new value(old value + 1)
		//    if no -> put new entity with initial value 1
		
		// 3. Create empty string and put back from the map in the given format
		
		// 4. return string from step 3
	
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (char letter : str.toCharArray()) {      
			if (map.containsKey(letter)) {  
				int oldValue = map.get(letter);
				map.put(letter, oldValue + 1);
			} else {      
				map.put(letter, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder(); 
		for (Character key : map.keySet()) {
			sb.append(key);
			sb.append(map.get(key));
		}
		
		return sb.toString();
	}
}
