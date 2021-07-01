package day34;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterview {
	public static void main(String[] args) {
		System.out.println(countLetters("hello")); // {h=1, e=1, l=2, o=1}
		System.out.println(countLetters("apple")); // {a=1, p=2, l=1, e=1}
		System.out.println(countLetters("aaa"));   // {a=3}
		System.out.println(countLetters("abcaa")); // {a=3, b=1, c=1}	
		System.out.println("=================");
		
		System.out.println(countLettersStr("hello")); // h1e1l2o1
		System.out.println(countLettersStr("apple")); // a1p2l1e1
		System.out.println(countLettersStr("aaa"));   // a3
		System.out.println(countLettersStr("abcaa")); // a3b1c1	
		
		// {apple = 3, banana = 1, kiwi = 1, orange = 1}
		System.out.println(countWords("apple banana apple kiwi orange apple"));
		
		// {I = 2, am = 1, Java = 2, programmer = 1, do = 1, like = 1}
		System.out.println(countWords("I am Java programmer I do like Java"));
		
		// Lunch break till 1 PM EST
	}
	
	/*
	 * 
	 */
	public static Map<String, Integer> countWords(String str) {	
		// to get array of words
		String[] words = str.split(" ");
		
		Map<String, Integer> countWord = new LinkedHashMap<>();
		
		for (String word : words) { 
			if (countWord.containsKey(word)) {
				int oldValue = countWord.get(word);
				countWord.put(word, oldValue + 1);
			} else {      
				countWord.put(word, 1);
			}
		}
		
		return countWord;
	}
	
	public static String countLettersStr(String str) {
		// 1. count of letter
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (char letter : str.toCharArray()) {
			if (map.containsKey(letter)) {
				int oldCount = map.get(letter);
				map.put(letter, oldCount + 1);		
			} else {
				map.put(letter, 1);
			}
		}
		
		// 2. Convert to the String in given format
		String countStr = "";
		for (char keyLetter : map.keySet()) {
			countStr += keyLetter + "" + map.get(keyLetter);		
		}
		
		return countStr;
	}
	
	public static Map<Character, Integer>  countLetters(String str) {                    
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char letter : str.toCharArray()) {
			if (map.containsKey(letter)) {
				map.put(letter, map.get(letter) + 1);
			} else {
				map.put(letter, 1);
			}
			
		}		
		return map;
	}
}
