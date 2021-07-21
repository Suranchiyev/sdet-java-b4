package day45;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
	public static void main(String[] args) {
		// There is file with name article.txt under day45	
		
		int countOfWords = howManyWords("src/day45/article.txt");
		System.out.println(countOfWords);
		
		Map<String, Integer> eachWordCount = countWords("src/day45/article.txt");
		System.out.println(eachWordCount); // {File = 2, ...}
	}
	
	public static int howManyWords(String path) {
		// TODO
		// Find out programmatically how many words in its content.
		// 1. Read file, get as a string
		// 2. Split by " "
		// 3. Get count -> loop over and trim and see if its not empty
		
		int count = 0;
		
		try (BufferedReader r = new BufferedReader(new FileReader(path))) {
			
			String line;
			while((line = r.readLine()) != null) {
				
				String[] words = line.trim().split(" ");
				
//				for (String word : words) {
//					if (!word.isEmpty()) {
//						count++;
//					}
//				}
				count += words.length;
				
			};
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public static Map<String, Integer> countWords(String path) {
		// TODO
		// {File = 5, hello=3, I=10}
		// 1. Read file, get as a string
		// 2. Split by " " -> loop over and trim and see if its not empty
		// 3. Loop over the words then use map with containsKey 
		// 4. Return map
		
		Map<String, Integer> map = new HashMap<>();
		
		try(BufferedReader r = new BufferedReader(new FileReader(path))) {
			
			r.lines().forEach(line -> {
				String[] words = line.split(" ");
				for (String word : words) {
					if (map.containsKey(word)) {
						int oldCount = map.get(word);
						map.put(word, oldCount + 1);
					} else {
						map.put(word, 1);
					}
				}
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return map;
	}
}
