package day41;

import java.util.HashMap;
import java.util.Map;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(countNumberOfDup2("hello")); // 1
		System.out.println(countNumberOfDup2("arrray")); // 2
		System.out.println(countNumberOfDup2("bek")); // 0
		System.out.println(countNumberOfDup2("eiopioppe")); // 4
	}
	
	
	public static int countNumberOfDup2(String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (char letter : str.toCharArray()) {
			if (map.containsKey(letter)) {
				map.put(letter, map.get(letter) + 1);
			} else {
				map.put(letter, 1);
			}
		}
		
		int count = 0;
		for (char key : map.keySet()) {
			if (map.get(key) > 1) {
				count++;
			}
		}
		
		return count;
	}

	public static int countNumberOfDup(String str) {
		int count = 0;
		String dup = "";

		for (int i = 0; i < str.length() - 1; i++) {
			char outer = str.charAt(i);
			
			for (int j = i + 1; j < str.length(); j++) {
				char inner = str.charAt(j);		
				
				if (outer == inner && !dup.contains(String.valueOf(outer))) {
					dup += outer;
					count++;
					break;
				}
			}
		}
		
		return count;
	}
}
