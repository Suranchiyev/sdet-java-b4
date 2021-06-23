package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>(Arrays.asList("red", "blue", "white", "black", "yellow"));
		System.out.println(colors);
		
		// filter
		
		// regular way
		List<String> bColors = new ArrayList<>();
		for (String c : colors) {
			if (c.toLowerCase().startsWith("b")) {
				bColors.add(c);
			}
		}
		System.out.println("Regular way: " + bColors);
		
		// streams and filter
		List<String> bColors2 = 
				colors.stream()
				.filter(color -> color.toLowerCase().startsWith("b"))
				.collect(Collectors.toList());
		
		System.out.println("Streams filter way: " + bColors2);
		
		// TODO create new list and put all colors that has even length
		// regular way
		List<String> evenLColors = new ArrayList<>();
		for (String color : colors) {
			if (color.length() % 2 == 0) {
				evenLColors.add(color);
			}
		}
		System.out.println(evenLColors);
		
		// Can you do it with streams and filter operator?
		List<String> evenLColors2 = 
				colors.stream()
				.filter((String color) -> 
						{
							return color.length() % 2 == 0;
						}
				).collect(Collectors.toList());	
		System.out.println(evenLColors2);
		
		String str = null;
		System.out.println(str);
		// System.out.println(str.toLowerCase());
		// When reference is null and we try to use methods or properties of this object, we get NullPointerException
		
		
		List<String> strs = new ArrayList<>(Arrays.asList("abc", "", "hi", "", "xyz", null, "apple", "kiwi", null));
		System.out.println(strs);
		// strs.removeIf(el -> el == null);
		
		List<String> strsRes = strs.stream().filter(el -> el != null && el.length() > 0).collect(Collectors.toList());
		System.out.println(strsRes);
		
		long count = strsRes.stream().filter(el -> el.length() % 2 == 1).count();
		System.out.println("Odd str length elements in strsRes: " + count);	
	}
}
