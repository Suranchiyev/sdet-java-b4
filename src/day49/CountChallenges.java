package day49;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountChallenges {
	public static void main(String[] args) {
		System.out.println(countL("hello")); // {h=1, e=1, l=2, o=1}
		System.out.println(countL("aauuuuchhh")); // {a=2, u=4, c=1, h=3}
		System.out.println(countL("abca")); // {a=2, b=1, c=1}
		System.out.println("---------------");
		
		System.out.println(countLStr("hello")); // h1e1l2o1
		System.out.println(countLStr("aauuuuchhh")); // a2u4c1h3
		System.out.println(countLStr("abca")); // a2b1c1
		System.out.println("---------------");
		
		System.out.println(countWord("I", "I love coding and I love running")); // 2
		System.out.println(countWord("love", "I love coding and I love running")); // 2
		System.out.println(countWord("coding", "I love coding and I love running")); // 1
	}
	
	/*
	 * countL("hello") -> {h=1, e=1, l=2, o=1}
	 * countL("aauuuuchhh") -> {a=2, u=4, c=1, h=3}
	 * countL("abca") -> {a=2, b=1, c=1}
	 */
	public static Map<Character, Integer> countL(String str) {
		//  Map<Letter, Count>
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		// loop over the str
		for (char ch : str.toCharArray()) {
			// if map already contains the letter as key
			if (map.containsKey(ch)) {
				
				// override this key with new count where old count + 1
				int oldValue = map.get(ch);
				map.put(ch, oldValue + 1);
			} else {
				// if map does not contain letter as a key then put it with count 1
				map.put(ch, 1);
			}
		}
		
		return map;
	}
	
	/*
	 * countLStr("hello") -> h1e1l2o1
	 * countLStr("aauuuuchhh") -> a2u4c1h3
	 * countLStr("abca") -> a2b1c1
	 */
	public static String countLStr(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (char letter : str.toCharArray()) {
			if (map.containsKey(letter)) {
				int oldCount = map.get(letter);
				map.put(letter, oldCount + 1);
			} else {
				map.put(letter, 1);
			}
		}
		
		// convert back to the String in given format
		StringBuilder sb = new StringBuilder();	
		for (char key : map.keySet()) {
			sb.append(key).append(map.get(key));
		}
		
		return sb.toString();
	}
	
	/*
	 * countWord("I", "I love coding and I love running") -> 2
	 * countWord("love", "I love coding and I love running") -> 2
	 * countWord("coding", "I love coding and I love running") -> 1
	 */
	public static int countWord(String word, String txt) {
		int count = 0;
		String[] words = txt.split(" ");
		
		for (String eachWord : words) {
			if (eachWord.equals(word)) {
				count++;
			}
		}
		
		return count;
	}
	
}
