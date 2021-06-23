package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsPractice {
	// 1. Lambda - undefined function
	// 2. Streams
	// 3. Streams with a list
	public static void main(String[] args) {
		// forEach operation
		List<String> colors = new ArrayList<>(Arrays.asList("red", "blue", "white", "black", "yellow"));
		colors.forEach(n -> System.out.println(n));
		
		// removeIf operation
//		colors.removeIf(
//				(String el) -> {
//					if (el.length() <= 4) {
//						return true;
//					}
//					return false;
//				}
//				);
		
		colors.removeIf(el -> el.length() <= 4);		
		System.out.println(colors);
	}
}
